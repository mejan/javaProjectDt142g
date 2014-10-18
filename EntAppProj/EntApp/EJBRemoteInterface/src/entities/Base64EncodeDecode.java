/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import ejb.Base64EncodeDecodeRemote;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.imageio.ImageIO;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.xml.bind.annotation.XmlRootElement;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author antondahlin
 */
@Stateless
@Named
public class Base64EncodeDecode implements Base64EncodeDecodeRemote,Serializable{
    @PersistenceContext(unitName = "EntAppEJB-ejbPU")
    private EntityManager em;
    /**
     * Decode string to image
     * @param imageString The string to decode
     * @return decoded image
     */
    @Override
    public BufferedImage decodeToImage(String imageString) {

        BufferedImage image = null;
        byte[] imageByte;
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            imageByte = decoder.decodeBuffer(imageString);
            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
            image = ImageIO.read(bis);
            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }

    /**
     * Encode image to string
     * @param image The image to encode
     * @param type jpeg, bmp, ...
     * @return encoded string
     */
    @Override
    public String encodeToString(BufferedImage image, String type) {
        String imageString = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try {
            ImageIO.write(image, type, bos);
            byte[] imageBytes = bos.toByteArray();

            BASE64Encoder encoder = new BASE64Encoder();
            imageString = encoder.encode(imageBytes);

            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageString;
    }

    /*public static void main (String args[]) throws IOException {
        // Test image to string and string to image start
        BufferedImage img = ImageIO.read(new File("/Users/antondahlin/desktop/LocalImages/alarm.jpg"));
        BufferedImage newImg;
        String imgstr;
        imgstr = encodeToString(img, "jpg");
        System.out.println(imgstr);
        newImg = decodeToImage(imgstr);
        ImageIO.write(newImg, "jpg", new File("/Users/antondahlin/desktop/RemoteImages/CopyOfalarm.jpg"));
        // Test image to string and string to image finish
    }*/

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
