/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.miun.test.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "SpareParts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SpareParts.findAll", query = "SELECT s FROM SpareParts s"),
    @NamedQuery(name = "SpareParts.findBySpareID", query = "SELECT s FROM SpareParts s WHERE s.spareID = :spareID"),
    @NamedQuery(name = "SpareParts.findByName", query = "SELECT s FROM SpareParts s WHERE s.name = :name"),
    @NamedQuery(name = "SpareParts.findByPrice", query = "SELECT s FROM SpareParts s WHERE s.price = :price")})
public class SpareParts implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "spareID")
    private String spareID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private int price;

    public SpareParts() {
    }

    public SpareParts(String spareID) {
        this.spareID = spareID;
    }

    public SpareParts(String spareID, String name, int price) {
        this.spareID = spareID;
        this.name = name;
        this.price = price;
    }

    public String getSpareID() {
        return spareID;
    }

    public void setSpareID(String spareID) {
        this.spareID = spareID;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (spareID != null ? spareID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SpareParts)) {
            return false;
        }
        SpareParts other = (SpareParts) object;
        if ((this.spareID == null && other.spareID != null) || (this.spareID != null && !this.spareID.equals(other.spareID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "se.miun.test.model.SpareParts[ spareID=" + spareID + " ]";
    }
    
}
