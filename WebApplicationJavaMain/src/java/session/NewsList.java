/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.mail.Part;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
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
    
    private String addTitle;
    private String addImage;
    private String addText;
    
    private String updateString;
    private String updateName;
    private Integer updateID;
    
    @EJB UploadBean uploadBean;

    public String getAddTitle() {
        return addTitle;
    }

    public void setAddTitle(String addTitle) {
        this.addTitle = addTitle;
    }

    public String getAddImage() {
        return addImage;
    }

    public void setAddImage(String addImage) {
        this.addImage = addImage;
    }

    public String getAddText() {
        return addText;
    }

    public void setAddText(String addText) {
        this.addText = addText;
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public Integer getUpdateID() {
        return updateID;
    }

    public void setUpdateID(Integer updateID) {
        this.updateID = updateID;
    }

    public void setUpdate(News news){
        news.setNewsText(updateString);
        news.setNewsName(updateName);
        news.setNewsID(updateID);
    }
    public void setAdd(News news){
        news.setNewsImage(uploadBean.getImageFileName());
        news.setNewsName(addTitle);
        news.setNewsText(addText);
    }
    public String getUpdateString() {
        return updateString;
    }

    public void setUpdateString(String updateString) {
        this.updateString = updateString;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }
    
    public void clear(){
        updateName="";
        updateString="";
        updateID=null;
        
        addTitle="";
        addText="";
        uploadBean.setImageFileName("");
    }
    
    public List<News> getNews(){
        TypedQuery<News> newsQuery = 
            em.createNamedQuery("News.findLatest", News.class);
        return newsQuery.setMaxResults(4).getResultList();
    }
    
    public News getNewsById(int id){
        return em.createNamedQuery("News.findById", News.class).setParameter("id", id).getSingleResult();
    }
        
    public String removeNews(News news){
        news = em.merge(news);
        em.remove(news);
        return "adminArticle.xhtml?faces-redirect=true";
    }

        public void handleException(Exception e){
                        
        String errorMessage = "Filformatet stöds ej, välj en bild";
        FacesMessage facesMessage = new FacesMessage(errorMessage);
        FacesContext.getCurrentInstance().addMessage("addArticle:addImage",  facesMessage);
    }
    public String addNews() throws Exception{
        try {    
            uploadBean.upload();
            News news = new News();
            setAdd(news);
            em.persist(news);
            em.flush();
            clear();
            
        } catch (Exception e) {
            handleException(e);
            return null;
        }
        
//return null;        
        return "adminArticle.xhtml?faces-redirect=true";
    }
    public void handleException2(Exception e){
        String errorMessage = "Ogiltligt nyhetsID";
        FacesMessage facesMessage = new FacesMessage(errorMessage);
        FacesContext.getCurrentInstance().addMessage("editArticle:updateId",  facesMessage);
    }
    public String updateNews(Integer id){
        try {
            News news = em.find(News.class, id);
            setUpdate(news);
            em.merge(news);
            clear();
        } catch (Exception e) {
            handleException2(e);
            return null;
        }
        return "adminArticle.xhtml?faces-redirect=true";
    }
}
