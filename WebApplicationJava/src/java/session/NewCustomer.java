/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Named;
import se.miun.test.model.Customer;

/**
 *
 * @author antondahlin
 */
@Stateless
@Named

public class NewCustomer {
    
    @EJB
    private CustomerList customerList;
    
    private String cuID;
    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;

    
    public void add(){
        Customer customer = new Customer();
        customer.setName(name);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customer.setPhoneNumber(phoneNumber);
        customerList.addCustomer(customer);
        reset();
    }

    public void find(){
        Customer customer = new Customer();
        customer.setName(name);
        customerList.getCustomersByName(name);
    }
    private void reset(){
        cuID = "";
        name = "";
        lastName = "";
        email = "";
        phoneNumber = "";
    }

    public String getCuID() {
        return cuID;
    }

    public void setCuID(String cuID) {
        this.cuID = cuID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
