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
import se.miun.projectjava.entitys.Guitars;


/**
 *
 * @author Robin
 */
@Stateless
@Named
public class GuitarList {
    @PersistenceContext(unitName = "WebApplicationJavaMainPU")
    private EntityManager em;
    
    public List<Guitars> getGuitars(){
        return em.createNamedQuery("Guitars.findAll", Guitars.class).getResultList();
    }
    public List<Guitars> getGuitarsByName(String name){
        return em.createNamedQuery("Guitars.findByName", Guitars.class).setParameter("name", name).getResultList();
    }
    public List<Guitars> getGuitarsBySold(boolean sold){
        return em.createNamedQuery("Guitars.findBySold", Guitars.class).setParameter("sold", sold).getResultList();
    }
    public List<Guitars> getGuitarsByGuitarrID(int id){
        return em.createNamedQuery("Guitars.findByGuitarrID", Guitars.class).setParameter("guitarrID", id).getResultList();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
