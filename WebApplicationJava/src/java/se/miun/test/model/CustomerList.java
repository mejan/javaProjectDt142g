/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.miun.test.model;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author antondahlin
 */
@Named
@Stateless
public class CustomerList {
    @PersistenceContext(unitName = "WebApplicationJavaPU")
    private EntityManager em;
    
    public List<Customer_1> getCustomers(){
        TypedQuery<Customer_1> customersQuery = 
            em.createNamedQuery("Customer_1.findAll", Customer_1.class);
        return customersQuery.getResultList();
    }
    
    /*public  Customer_1 getFirstName(String name){
        TypedQuery<Customer_1> customerByNameQuery = 
            em.createNamedQuery("Customer_1.findByName", Customer_1.class);
        //return customersQuery.getResultList();
        return customerByNameQuery.setParameter("name", name).getSingleResult();
    }*/
}
