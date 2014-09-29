/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import se.miun.test.model.Consultation;

/**
 *
 * @author antondahlin
 */
@Stateless
@Named
public class ConsultationList {
    @PersistenceContext(unitName = "WebApplicationJavaPU")
    private EntityManager em;
    /*@EJB
    private Customer customer;*/
    
    
    public List<Consultation> getConsultations(){
        TypedQuery<Consultation> customersQuery = 
            em.createNamedQuery("Consultation.findAll", Consultation.class);
        return customersQuery.getResultList();
    }
}
