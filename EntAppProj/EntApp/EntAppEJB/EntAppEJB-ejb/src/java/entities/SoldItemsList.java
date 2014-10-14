/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import ejb.SoldItemsListRemote;
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
    
    @Override
    public void addSoldItems(SoldItems soldItems){
        em.persist(soldItems);
        em.flush();
        //em.clear();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
