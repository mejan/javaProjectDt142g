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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Max
 */
@Entity
@Table(name = "Guitars")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Guitars.findAll", query = "SELECT g FROM Guitars g"),
    @NamedQuery(name = "Guitars.findByGuitarrID", query = "SELECT g FROM Guitars g WHERE g.guitarrID = :guitarrID"),
    @NamedQuery(name = "Guitars.findByName", query = "SELECT g FROM Guitars g WHERE g.name = :name"),
    @NamedQuery(name = "Guitars.findByPrice", query = "SELECT g FROM Guitars g WHERE g.price = :price"),
    @NamedQuery(name = "Guitars.findByDescription", query = "SELECT g FROM Guitars g WHERE g.description = :description"),
    @NamedQuery(name = "Guitars.findBySold", query = "SELECT g FROM Guitars g WHERE g.sold = :sold"),
    @NamedQuery(name = "Guitars.findByImagePath", query = "SELECT g FROM Guitars g WHERE g.imagePath = :imagePath")})
public class Guitars implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "guitarrID")
    private Integer guitarrID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private int price;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sold")
    private boolean sold;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "imagePath")
    private String imagePath;
/*    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "image")
    private byte[] image;*/

    public Guitars() {
    }

    public Guitars(Integer guitarrID) {
        this.guitarrID = guitarrID;
    }

    public Guitars(Integer guitarrID, String name, int price, String description, boolean sold, String imagePath, byte[] image) {
        this.guitarrID = guitarrID;
        this.name = name;
        this.price = price;
        this.description = description;
        this.sold = sold;
        this.imagePath = imagePath;
        //this.image = image;
    }

    public Integer getGuitarrID() {
        return guitarrID;
    }

    public void setGuitarrID(Integer guitarrID) {
        this.guitarrID = guitarrID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    /*public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }*/

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
        return "se.miun.projectjava.entitys.Guitars[ guitarrID=" + guitarrID + " ]";
    }
    
    public String isSold(){
        if(this.sold)
            return "Såld";
        return "";
    }
    
}
