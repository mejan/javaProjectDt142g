/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.Date;
import javax.ejb.Remote;

/**
 *
 * @author antondahlin
 */
@Remote
public interface NewSoldItemRemote {
    
    void add();
    
    void setItemName(String itemName);
    
    void setDateOfSale(Date dateOfSale);
    
    void setPrice(double price);
    
}
