/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import ejb.ConsultationListRemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author antondahlin
 */
@Stateless
public class ConsultationList implements ConsultationListRemote {
    @PersistenceContext(unitName = "EntAppEJB-ejbPU")
    private EntityManager em;
    
    @Override
    public List<Consultation> getConsultationByAccepted(boolean accepted){
        return em.createNamedQuery("Consultation.findByAccepted", Consultation.class).setParameter("accepted", accepted).getResultList();
    }
    
    @Override
    public void removeConsultation(Consultation consultation){
        consultation = em.merge(consultation);
        em.remove(consultation);
    }
    
    @Override
    public void updateConsultation(Consultation consultation){
      
        em.merge(consultation);
      
    }
    
    private String desc;
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
