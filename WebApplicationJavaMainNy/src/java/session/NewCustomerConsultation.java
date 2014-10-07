/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.RollbackException;
import javax.persistence.Temporal;
import se.miun.projectjava.entitys.Consultation;
import se.miun.projectjava.entitys.Customer;

/**
 *
 * @author antondahlin
 */
@Stateless
@Named
public class NewCustomerConsultation {
    
    //Customer variables
    @EJB
    private CustomerList customerList;
    
    //private int cuID;
    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;
    
    
    @EJB
    private ConsultationList consultationList;
    
    private int consultationID;
    //private int customerID;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    private String description;
    private boolean accepted;
    
    public void add() throws RollbackException{
        
        Customer customer = new Customer();
        Consultation consultation = new Consultation();
        Date datee = new Date();
        
        customer.setName(name);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customer.setPhoneNumber(phoneNumber);
        
        consultation.setCustomerID(customer);
        consultation.setDate(datee);
        consultation.setTime(datee);
        consultation.setDescription(description);
        consultation.setAccepted(false);
        
      try{  
            if(customerList.getCustomersByEmail(email).isEmpty())
                customerList.addCustomer(customer);
            else
                consultation.setCustomerID(customerList.getCustomersByEmail(email).get(0));

            consultationList.addConsultation(consultation);
      }catch(RollbackException e){
         System.err.println("RollBackException: " + e.getMessage());
      }
    }
    
    public CustomerList getCustomerList() {
        return customerList;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ConsultationList getConsultationList() {
        return consultationList;
    }

    public int getConsultationID() {
        return consultationID;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAccepted() {
        return accepted;
    }
    
    
    
    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public void setCustomerList(CustomerList customerList) {
        this.customerList = customerList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setConsultationList(ConsultationList consultationList) {
        this.consultationList = consultationList;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
}
