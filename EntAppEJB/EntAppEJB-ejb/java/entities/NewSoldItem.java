/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import ejb.NewSoldItemRemote;
import ejb.SoldItemsListRemote;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.RollbackException;

/**
 *
 * @author antondahlin
 */
@Stateless
public class NewSoldItem implements NewSoldItemRemote {
    @EJB
    private SoldItemsListRemote soldItemsListRemote;
    
    private String itemName;
    private Date dateOfSale;
    private double price;
    

    
    @Override
    public void add() throws RollbackException {
    
        try{
            
            SoldItems soldItems = new SoldItems();
            
            soldItems.setItemName(itemName);
            soldItems.setPrice(price);
            soldItems.setDateOfSale(dateOfSale);
            
            soldItemsListRemote.addSoldItems(soldItems);
        
        
        }catch(RollbackException e){
            System.err.println("RollBackException: " + e.getMessage());
        }
    
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
    public String getItemName() {
        return itemName;
    }
    
    @Override
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }
    
    @Override
    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public double getPrice() {
        return price;
    }
    
    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
