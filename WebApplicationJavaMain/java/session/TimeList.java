/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import se.miun.projectjava.entitys.Time;

/**
 *
 * @author Max
 */
@Stateless
@Named
public class TimeList {
        @PersistenceContext(unitName = "WebApplicationJavaMainPU")
    private EntityManager em;
        
    private String updateDay;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public String getUpdateDay() {
        return updateDay;
    }

    public void setUpdateDay(String updateDay) {
        this.updateDay = updateDay;
    }
        public void addDay(){
        
        Time time = new Time();
        time.setDayTime(updateDay);
        em.persist(time);
        em.flush();
    }
}
