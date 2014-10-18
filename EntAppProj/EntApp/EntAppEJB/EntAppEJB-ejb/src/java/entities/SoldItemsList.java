/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import ejb.SoldItemsListRemote;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author antondahlin
 */
@Stateless
public class SoldItemsList implements SoldItemsListRemote {
    
    @PersistenceContext(unitName = "EntAppEJB-ejbPU")
    private EntityManager em;
    
    @Override
    public List<SoldItems> getSoldItems(){
        return em.createNamedQuery("SoldItems.findAll", SoldItems.class).getResultList();
    }
    
    @Override public List<SoldItems> getSoldItemsByInterval(Date dateLower, Date dateUpper){ 
        return em.createNamedQuery("SoldItems.findByDateInterval", SoldItems.class).setParameter("dateLower", dateLower).setParameter("dateUpper", dateUpper).getResultList();
    }
    
    @Override
    public void addSoldItems(SoldItems soldItems){
        em.persist(soldItems);
        em.flush();
        //em.merge(soldItems);
        //em.clear();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
