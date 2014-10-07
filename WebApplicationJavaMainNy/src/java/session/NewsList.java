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
import se.miun.projectjava.entitys.News;

/**
 *
 * @author Henke
 */
@Stateless
@Named
public class NewsList {

    @PersistenceContext(unitName = "WebApplicationJavaMainPU")
    private EntityManager em;
    
        public List<News> getNews(){
        TypedQuery<News> newsQuery = 
            em.createNamedQuery("News.findLatest", News.class);
        return newsQuery.setMaxResults(3).getResultList();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
