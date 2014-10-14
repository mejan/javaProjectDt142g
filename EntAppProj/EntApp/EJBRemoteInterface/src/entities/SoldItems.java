/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author antondahlin
 */
@Entity
@Table(name = "SoldItems")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SoldItems.findAll", query = "SELECT s FROM SoldItems s"),
    @NamedQuery(name = "SoldItems.findBySoldID", query = "SELECT s FROM SoldItems s WHERE s.soldID = :soldID"),
    @NamedQuery(name = "SoldItems.findByItemName", query = "SELECT s FROM SoldItems s WHERE s.itemName = :itemName"),
    @NamedQuery(name = "SoldItems.findByDateOfSale", query = "SELECT s FROM SoldItems s WHERE s.dateOfSale = :dateOfSale"),
    @NamedQuery(name = "SoldItems.findByPrice", query = "SELECT s FROM SoldItems s WHERE s.price = :price")})
public class SoldItems implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "soldID")
    private Integer soldID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "itemName")
    private String itemName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateOfSale")
    @Temporal(TemporalType.DATE)
    private Date dateOfSale;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private double price;

    public SoldItems() {
    }

    public SoldItems(Integer soldID) {
        this.soldID = soldID;
    }

    public SoldItems(Integer soldID, String itemName, Date dateOfSale, double price) {
        this.soldID = soldID;
        this.itemName = itemName;
        this.dateOfSale = dateOfSale;
        this.price = price;
    }

    public Integer getSoldID() {
        return soldID;
    }

    public void setSoldID(Integer soldID) {
        this.soldID = soldID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (soldID != null ? soldID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SoldItems)) {
            return false;
        }
        SoldItems other = (SoldItems) object;
        if ((this.soldID == null && other.soldID != null) || (this.soldID != null && !this.soldID.equals(other.soldID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.SoldItems[ soldID=" + soldID + " ]";
    }
    
}
