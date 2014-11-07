/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webAdminPage;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Admin
 */
public class FileUtils {
    
    public static BufferedImage decodeToImage(String imageString){
        BufferedImage image=null;
        byte[] imageByte;
        try{
            BASE64Decoder decoder = new BASE64Decoder();
            imageByte = decoder.decodeBuffer(imageString);
            ByteArrayInputStream bis=new ByteArrayInputStream(imageByte);
            image= ImageIO.read(bis);
            bis.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return image;
    }

    public static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }
    public static String encodeToString(BufferedImage image, String type){
        String imageString = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try{
            ImageIO.write(image,type,bos);
            byte[] imageBytes = bos.toByteArray();
            BASE64Encoder encoder =new BASE64Encoder();
            imageString = encoder.encode(imageBytes);
        }catch(IOException e){
            e.printStackTrace();
        }
        return imageString;
    }
}