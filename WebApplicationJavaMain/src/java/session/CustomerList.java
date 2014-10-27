/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import java.util.List;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import se.miun.projectjava.entitys.Customer;

/**
 *
 * @author antondahlin
 */
@Stateless
@Named
public class CustomerList {
    
    @PersistenceContext(unitName = "WebApplicationJavaMainPU")
    private EntityManager em;
    
    public List<Customer> getCustomers(){
        TypedQuery<Customer> customersQuery = 
            em.createNamedQuery("Customer.findAll", Customer.class);
        return customersQuery.getResultList();
    }
    
    public List<Customer> getCustomersByName(String name){
        return em.createNamedQuery("Customer.findByName", Customer.class).setParameter("name", name).getResultList();
    }
    
    public List<Customer> getCustomersByEmail(String email){
        return em.createNamedQuery("Customer.findByEmail", Customer.class).setParameter("email", email).getResultList();
    }
    
    
    public void addCustomer(Customer customer){
        em.persist(customer);
        em.flush();
        //em.clear();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
