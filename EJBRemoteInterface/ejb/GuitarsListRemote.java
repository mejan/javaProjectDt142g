/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entities.Guitars;
import java.io.IOException;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author antondahlin
 */
@Remote
public interface GuitarsListRemote {
    List<Guitars> getGuitars();
   
    void updateGuitar(Guitars guitars) throws IOException;
    
    void addGuitar(Guitars guitars) throws IOException;
    
    List<Guitars> getGuitarsForDesktop();
    
    void removeGuitars(Guitars guitars);
    
    

}
