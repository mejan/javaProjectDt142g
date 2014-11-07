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

    private String updateName;
    private String updateCity;
    private String updateAddress;
    private String updateAreaCode;
    private String updatePhone;
    private String updateEmail;
    
    public void clear(){
        updateName ="";
        updateCity="";
        updateAddress="";
        updateAreaCode="";
        updatePhone="";
        updateEmail="";
    }
    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public String getUpdateCity() {
        return updateCity;
    }

    public void setUpdateCity(String updateCity) {
        this.updateCity = updateCity;
    }

    public String getUpdateAddress() {
        return updateAddress;
    }

    public void setUpdateAddress(String updateAddress) {
        this.updateAddress = updateAddress;
    }

    public String getUpdateAreaCode() {
        return updateAreaCode;
    }

    public void setUpdateAreaCode(String updateAreaCode) {
        this.updateAreaCode = updateAreaCode;
    }

    public String getUpdatePhone() {
        return updatePhone;
    }

    public void setUpdatePhone(String updatePhone) {
        this.updatePhone = updatePhone;
    }

    public String getUpdateEmail() {
        return updateEmail;
    }

    public void setUpdateEmail(String updateEmail) {
        this.updateEmail = updateEmail;
    }
    
    
    public List<Company> getCompany(){
        TypedQuery<Company> companyQuery = 
            em.createNamedQuery("Company.findAll", Company.class);
        return companyQuery.getResultList();
    }
       public Company getCompanyById(int id){
        return em.createNamedQuery("Company.findById", Company.class).setParameter("id", id).getSingleResult();
    }
        public void updateCompany(Company company){
            company.setName(updateName);
            company.setCity(updateCity);
            company.setAddress(updateAddress);
            company.setAreaCode(updateAreaCode);
            company.setPhone(updatePhone);
            company.setEmail(updateEmail);
            em.merge(company);  
            clear();
        }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
