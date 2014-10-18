/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.awt.image.BufferedImage;
import java.io.Serializable;
import javax.ejb.Remote;

/**
 *
 * @author antondahlin
 */
@Remote
public interface Base64EncodeDecodeRemote {
    BufferedImage decodeToImage(String imageString);
    
    String encodeToString(BufferedImage image, String type);
}
