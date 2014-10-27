/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entities.SoldItems;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author antondahlin
 */
@Remote
public interface SoldItemsListRemote {
    
    List<SoldItems> getSoldItems();
    
    void addSoldItems(SoldItems soldItems);
    
    List<SoldItems> getSoldItemsByInterval(Date dateLower, Date dateUpper);
}
