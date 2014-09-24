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
    public List<Customer> getMenuItems(){
        TypedQuery<Customer> menuItemQuery = 
            em.createNamedQuery("Customer.findAll", Customer.class);
        return menuItemQuery.getResultList();
    }
    public String getHello(){
        return "HELLO!";
    }
}
