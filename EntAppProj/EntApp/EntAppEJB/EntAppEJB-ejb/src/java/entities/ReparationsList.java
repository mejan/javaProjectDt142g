/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import ejb.ReparationsListRemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author antondahlin
 */
@Stateless
@Named
public class ReparationsList implements ReparationsListRemote {
    @PersistenceContext(unitName = "EntAppEJB-ejbPU")
    private EntityManager em;
    
    @Override
    public List<Reparations> getReparations(){
        return em.createNamedQuery("Customer.findAll", Reparations.class).getResultList();
    }
    
    @Override
    public void addReparations(Reparations reparations){
        em.persist(reparations);
        em.flush();
        //em.clear();
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
