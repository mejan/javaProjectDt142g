/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entities.Customer;
import java.util.Date;
import javax.ejb.Remote;

/**
 *
 * @author antondahlin
 */
@Remote
public interface NewReparationsRemote {
    
    //void add();
    void add(Customer customerID, int hoursWorked, String imagePath, Date recieved, Date done);
    //void setCustomerID(Customer customerID);
    
}
