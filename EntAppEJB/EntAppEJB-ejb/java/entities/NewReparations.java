/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import ejb.NewReparationsRemote;
import ejb.ReparationsListRemote;
import java.util.Date;
import javax.ejb.EJB;
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

    
    @EJB 
    private ReparationsListRemote reparationsListRemote;
    
    //@EJB
    //private ReparationsList reparationsList;
    

    private Customer customerID;
    private int hoursWorked;
    private String imagePath;
    private Date recieved;
    private Date done;
    private String description;
    
    @Override    
    public void add() throws RollbackException{
        
            Reparations reparations = new Reparations();
            reparations.setHoursWorked(hoursWorked);
            reparations.setDone(done);
            reparations.setRecieved(recieved);
            reparations.setCustomerID(customerID);
            reparations.setImagePath(imagePath);
            reparations.setDescription(description);
        
        try{
         
            reparationsListRemote.addReparations(reparations);

        }catch(RollbackException e){
            System.err.println("RollBackException: " + e.getMessage());
        }
        
        
    }

        
    @Override
    public Customer getCustomerID() {
        return customerID;
    }
    
    @Override
    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }
    
    @Override
    public int getHoursWorked() {
        return hoursWorked;
        //return 1337;
    }
    
    @Override
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public String getImagePath() {
        return imagePath;
    }
    
    @Override
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    
    @Override
    public String getDescription() {
        return description;
    }
    
    @Override
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    @Override
    public Date getRecieved() {
        return recieved;
    }
    
    @Override
    public void setRecieved(Date recieved) {
        System.out.println("recieved: " + recieved);
        this.recieved = recieved;
    }
    
    @Override
    public Date getDone() {
        return done;
    }
    
    @Override
    public void setDone(Date done) {
        this.done = done;
    }
    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    /*@Override
    public boolean isIsFinished() {
        return isFinished;
    }
    
    @Override
    public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }*/
}
