/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import ejb.NewReparationsRemote;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.RollbackException;

/**
 *
 * @author antondahlin
 */
@Stateless
@Named
public class NewReparations implements NewReparationsRemote {
    @EJB private ReparationsList reparationsList;
    @EJB private CustomerList customerList;
    
    //private int customerID;
    private Customer customerID;
    private int hoursWorked;
    private String imagePath;
    private Date recieved;
    private Date done;
    
    @Override
    public void add(Customer customerID, int hoursWorked, String imagePath, Date recieved, Date done) throws RollbackException{
        
        Reparations reparations = new Reparations();
        reparations.setHoursWorked(hoursWorked);
        reparations.setDone(done);
        reparations.setRecieved(recieved);
        reparations.setCustomerID(customerID);
        reparationsList.addReparations(reparations);
        
        
        try{
         
            
        }catch(RollbackException e){
            System.err.println("RollBackException: " + e.getMessage());
        }
        
        
    }
    /*@Override
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }*/
    
    
    public Customer getCustomerID() {
        return customerID;
    }
    
    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Date getRecieved() {
        return recieved;
    }

    public void setRecieved(Date recieved) {
        this.recieved = recieved;
    }

    public Date getDone() {
        return done;
    }

    public void setDone(Date done) {
        this.done = done;
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
