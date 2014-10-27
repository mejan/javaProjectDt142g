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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "guitars")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Guitars.findAll", query = "SELECT g FROM Guitars g"),
    @NamedQuery(name = "Guitars.findByGuitarrID", query = "SELECT g FROM Guitars g WHERE g.guitarrID = :guitarrID"),
    @NamedQuery(name = "Guitars.findByDescription", query = "SELECT g FROM Guitars g WHERE g.description = :description"),
    @NamedQuery(name = "Guitars.findByImagePath", query = "SELECT g FROM Guitars g WHERE g.imagePath = :imagePath"),
    @NamedQuery(name = "Guitars.findByName", query = "SELECT g FROM Guitars g WHERE g.name = :name"),
    @NamedQuery(name = "Guitars.findByPrice", query = "SELECT g FROM Guitars g WHERE g.price = :price"),
    @NamedQuery(name = "Guitars.findBySold", query = "SELECT g FROM Guitars g WHERE g.sold = :sold")})
public class Guitars implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "guitarrID")
    private Integer guitarrID;
    @Size(max = 255)
    @Column(name = "description")
    private String description;
    @Size(max = 255)
    @Column(name = "imagePath")
    private String imagePath;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "image")
    private byte[] image;
    @Size(max = 255)
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Integer price;
    @Column(name = "sold")
    private Boolean sold;

    public Guitars() {
    }

    public Guitars(Integer guitarrID) {
        this.guitarrID = guitarrID;
    }

    public Guitars(Integer guitarrID, byte[] image) {
        this.guitarrID = guitarrID;
        this.image = image;
    }

    public Integer getGuitarrID() {
        return guitarrID;
    }

    public void setGuitarrID(Integer guitarrID) {
        this.guitarrID = guitarrID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean getSold() {
        return sold;
    }

    public void setSold(Boolean sold) {
        this.sold = sold;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (guitarrID != null ? guitarrID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Guitars)) {
            return false;
        }
        Guitars other = (Guitars) object;
        if ((this.guitarrID == null && other.guitarrID != null) || (this.guitarrID != null && !this.guitarrID.equals(other.guitarrID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Guitars[ guitarrID=" + guitarrID + " ]";
    }
    
}
