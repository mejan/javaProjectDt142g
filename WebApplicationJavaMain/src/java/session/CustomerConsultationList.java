/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import java.util.Date;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Temporal;

/**
 *
 * @author antondahlin
 */
@Stateless
@Named
public class CustomerConsultationList {
    @PersistenceContext(unitName = "WebApplicationJavaMainPU")
    private EntityManager em;
    
    //Customer variables
    private int customerID;
    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;
    
    //Consultation Variables
    private int consultationID;
    //private int customerID;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    private String description;
    private boolean accepted;

    
    /*public void getCustomerConsultations(){
        em.createNamedQuery("Customer.findByName", Customer.class, Consultation.class).setParameter("name", name).getResultList();
    }*/
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
