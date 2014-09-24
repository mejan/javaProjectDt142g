/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.miun.test.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "Consultation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consultation.findAll", query = "SELECT c FROM Consultation c"),
    @NamedQuery(name = "Consultation.findByCID", query = "SELECT c FROM Consultation c WHERE c.cID = :cID"),
    @NamedQuery(name = "Consultation.findByCuID", query = "SELECT c FROM Consultation c WHERE c.cuID = :cuID"),
    @NamedQuery(name = "Consultation.findByDate", query = "SELECT c FROM Consultation c WHERE c.date = :date"),
    @NamedQuery(name = "Consultation.findByDescription", query = "SELECT c FROM Consultation c WHERE c.description = :description"),
    @NamedQuery(name = "Consultation.findByAccepted", query = "SELECT c FROM Consultation c WHERE c.accepted = :accepted")})
public class Consultation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "cID")
    private String cID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "cuID")
    private String cuID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "accepted")
    private boolean accepted;

    public Consultation() {
    }

    public Consultation(String cID) {
        this.cID = cID;
    }

    public Consultation(String cID, String cuID, Date date, String description, boolean accepted) {
        this.cID = cID;
        this.cuID = cuID;
        this.date = date;
        this.description = description;
        this.accepted = accepted;
    }

    public String getCID() {
        return cID;
    }

    public void setCID(String cID) {
        this.cID = cID;
    }

    public String getCuID() {
        return cuID;
    }

    public void setCuID(String cuID) {
        this.cuID = cuID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cID != null ? cID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consultation)) {
            return false;
        }
        Consultation other = (Consultation) object;
        if ((this.cID == null && other.cID != null) || (this.cID != null && !this.cID.equals(other.cID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "se.miun.test.model.Consultation[ cID=" + cID + " ]";
    }
    
}
