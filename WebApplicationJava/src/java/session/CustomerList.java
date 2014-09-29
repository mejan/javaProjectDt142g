/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import se.miun.test.model.Customer;

/**
 *
 * @author antondahlin
 */
@Named
@Stateless
public class CustomerList {
    
    
    @PersistenceContext(unitName = "WebApplicationJavaPU")
    private EntityManager em;

    
    public List<Customer> getCustomers(){
        TypedQuery<Customer> customersQuery = 
            em.createNamedQuery("Customer.findAll", Customer.class);
        return customersQuery.getResultList();
    }
    
    public List<Customer> getCustomersByName(String name){
        TypedQuery<Customer> customerByNameQuery =
                em.createNamedQuery("Customer.findByName", Customer.class);
        return customerByNameQuery.setParameter("name", name).getResultList();
    }
    
    public void addCustomer(Customer customer){
        em.persist(customer);
        em.flush();
        em.clear();
    }
    /*public void persist(Customer customer) {
        em.persist(customer);
    }*/

    
    /*public void add(){
    
        //customer = new Customer();
        
        
        
    public  Customer getFirstName(String name){
        TypedQuery<Customer_1> customerByNameQuery = 
            em.createNamedQuery("Customer.findByName", Customer.class);
        //return customersQuery.getResultList();
        return customerByNameQuery.setParameter("name", name).getSingleResult();
    }
    }*/
}
