/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entities.Guitars;
import java.awt.image.BufferedImage;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author antondahlin
 */
@Remote
public interface GuitarsListRemote {
    List<Guitars> getGuitars();
   
    void updateGuitar(Guitars guitar);
    

}
