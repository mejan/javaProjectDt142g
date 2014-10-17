/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import ejb.GuitarsListRemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author antondahlin
 */
@Stateless
public class GuitarsList implements GuitarsListRemote {
    
    @PersistenceContext(unitName = "EntAppEJB-ejbPU")
    private EntityManager em;

    @Override
    public List<Guitars> getGuitars(){
        return em.createNamedQuery("Guitars.findAll", Guitars.class).getResultList();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public void updateGuitar(Guitars guitar){
        em.merge(guitar);
    }
}
