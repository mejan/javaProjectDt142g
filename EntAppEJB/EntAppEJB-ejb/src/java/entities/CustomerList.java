/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import ejb.CustomerListRemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import entities.Customer;

/**
 *
 * @author antondahlin
 */
@Stateless
public class CustomerList implements CustomerListRemote {

    @PersistenceContext(unitName = "EntAppEJB-ejbPU")
    private EntityManager em;
    
    @Override
    public List<Customer> getCustomers(){
        return em.createNamedQuery("Customer.findAll", Customer.class).getResultList();
    }
    
    
    @Override
    public String getTest() {
        return "Testing remote access to entity";
    }
    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
