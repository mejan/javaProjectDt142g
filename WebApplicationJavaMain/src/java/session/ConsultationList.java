/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import se.miun.projectjava.entitys.Consultation;

/**
 *
 * @author antondahlin
 */

@Stateless
@Named
public class ConsultationList {
    
    @PersistenceContext(unitName = "WebApplicationJavaMainPU")
    private EntityManager em;
      
    
    public List<Consultation> getConsultations(){
        TypedQuery<Consultation> customersQuery = 
            em.createNamedQuery("Consultation.findAll", Consultation.class);
        return customersQuery.getResultList();
    }
    
    public List<Consultation> getConsultationByAccepted(boolean accepted){
        TypedQuery<Consultation> customerByAcceptedQuery =
                em.createNamedQuery("Consultation.findByAccepted", Consultation.class);
        return customerByAcceptedQuery.setParameter("accepted", accepted).getResultList();
    }
    
    public void addConsultation(Consultation consultation){
        em.persist(consultation);
        em.flush();
        //em.clear();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
