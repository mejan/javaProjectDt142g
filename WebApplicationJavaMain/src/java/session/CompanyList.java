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
import se.miun.projectjava.entitys.Company;

/**
 *
 * @author Max
 */
@Named
@Stateless
public class CompanyList {
@PersistenceContext(unitName = "WebApplicationJavaMainPU")
    private EntityManager em;
    
        public List<Company> getCompany(){
        TypedQuery<Company> companyQuery = 
            em.createNamedQuery("Company.findAll", Company.class);
        return companyQuery.getResultList();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
