/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import static com.sun.xml.rpc.processor.schema.Symbol.named;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import se.miun.projectjava.entitys.About;

/**
 *
 * @author Max
 */
@Named
@Stateless
public class AboutList {
    @PersistenceContext(unitName = "WebApplicationJavaMainPU")
    private EntityManager em;
    
        public List<About> getAbout(){
        TypedQuery<About> aboutQuery = 
            em.createNamedQuery("About.findAll", About.class);
        return aboutQuery.getResultList();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
