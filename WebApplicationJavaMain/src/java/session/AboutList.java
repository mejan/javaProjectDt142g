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
    private String aboutString;

    
    public void clear(){
        aboutString="";
    }
    public String getAboutString() {
        return aboutString;
    }

    public void setAboutString(String about) {
        this.aboutString = about;
    }
    
        public List<About> getAbout(){
        TypedQuery<About> aboutQuery = 
            em.createNamedQuery("About.findAll", About.class);
        return aboutQuery.getResultList();
    }
         public About getAboutById(int id){
        return em.createNamedQuery("About.findById", About.class).setParameter("id", id).getSingleResult();
    }
    
    public void updateAbout(About about){
            about.setAbout(aboutString);
            em.merge(about);  
            clear();
        }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
