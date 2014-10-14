/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.miun.projectjava.entitys;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Henke
 */
@Entity
@Table(name = "news")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "News.findAll", query = "SELECT n FROM News n"),
    @NamedQuery(name = "News.findByNewsID", query = "SELECT n FROM News n WHERE n.newsID = :newsID"),
    @NamedQuery(name = "News.findLatest", query = "SELECT n FROM News n ORDER BY n.newsID DESC"),
    @NamedQuery(name = "News.findByNewsText", query = "SELECT n FROM News n WHERE n.newsText = :newsText"),
    @NamedQuery(name = "News.findByNewsImage", query = "SELECT n FROM News n WHERE n.newsImage = :newsImage"),
    @NamedQuery(name = "News.findByNewsName", query = "SELECT n FROM News n WHERE n.newsName = :newsName")})
public class News implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "newsID")
    private Integer newsID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "newsText")
    private String newsText;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "newsImage")
    private String newsImage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "newsName")
    private String newsName;

    public News() {
    }

    public News(Integer newsID) {
        this.newsID = newsID;
    }

    public News(Integer newsID, String newsText, String newsImage, String newsName) {
        this.newsID = newsID;
        this.newsText = newsText;
        this.newsImage = newsImage;
        this.newsName = newsName;
    }

    public Integer getNewsID() {
        return newsID;
    }

    public void setNewsID(Integer newsID) {
        this.newsID = newsID;
    }

    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText;
    }

    public String getNewsImage() {
        return newsImage;
    }

    public void setNewsImage(String newsImage) {
        this.newsImage = newsImage;
    }

    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (newsID != null ? newsID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof News)) {
            return false;
        }
        News other = (News) object;
        if ((this.newsID == null && other.newsID != null) || (this.newsID != null && !this.newsID.equals(other.newsID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "se.miun.projectjava.entitys.News[ newsID=" + newsID + " ]";
    }
    
}
