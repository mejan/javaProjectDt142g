/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author antondahlin
 */
@Entity
@Table(name = "ReparationPictures")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReparationPictures.findAll", query = "SELECT r FROM ReparationPictures r"),
    @NamedQuery(name = "ReparationPictures.findByPictureID", query = "SELECT r FROM ReparationPictures r WHERE r.pictureID = :pictureID"),
    @NamedQuery(name = "ReparationPictures.findByRepairID", query = "SELECT r FROM ReparationPictures r WHERE r.repairID = :repairID"),
    @NamedQuery(name = "ReparationPictures.findByImagePath", query = "SELECT r FROM ReparationPictures r WHERE r.imagePath = :imagePath")})
public class ReparationPictures implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "imagePath")
    private String imagePath;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pictureID")
    private Integer pictureID;
    /*@Basic(optional = false)
    @NotNull
    @Column(name = "repairID")
    private int repairID;*/
    @JoinColumn(name = "repairID", referencedColumnName = "repairID")
    @ManyToOne(optional = false)
    private Reparations repairID;

    public Reparations getRepairID() {
        return repairID;
    }

    public void setRepairID(Reparations repairID) {
        this.repairID = repairID;
    }

    public ReparationPictures() {
    }

    public ReparationPictures(Integer pictureID) {
        this.pictureID = pictureID;
    }

    public ReparationPictures(Integer pictureID/*, int repairID*/, String imagePath) {
        this.pictureID = pictureID;
        //this.repairID = repairID;
        this.imagePath = imagePath;
    }

    public Integer getPictureID() {
        return pictureID;
    }

    public void setPictureID(Integer pictureID) {
        this.pictureID = pictureID;
    }

    /*public int getRepairID() {
        return repairID;
    }

    public void setRepairID(int repairID) {
        this.repairID = repairID;
    }*/


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pictureID != null ? pictureID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReparationPictures)) {
            return false;
        }
        ReparationPictures other = (ReparationPictures) object;
        if ((this.pictureID == null && other.pictureID != null) || (this.pictureID != null && !this.pictureID.equals(other.pictureID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.ReparationPictures[ pictureID=" + pictureID + " ]";
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    
}
