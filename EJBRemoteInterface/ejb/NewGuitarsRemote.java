/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.io.IOException;
import javax.ejb.Remote;
import javax.persistence.RollbackException;

/**
 *
 * @author antondahlin
 */
@Remote
public interface NewGuitarsRemote {
    
    void add() throws IOException, RollbackException;
    
    void setName(String name);
    
    void setDescription(String description);
    
    void setImage(byte[] image);
    
    void setImagePath(String imagePath);
    
    void setPrice(int price);
    
    void setSold(boolean sold);
    
}
