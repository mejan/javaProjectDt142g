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
@Table(name = "Reparations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reparations.findAll", query = "SELECT r FROM Reparations r"),
    @NamedQuery(name = "Reparations.findByRepairID", query = "SELECT r FROM Reparations r WHERE r.repairID = :repairID"),
    @NamedQuery(name = "Reparations.findByCuID", query = "SELECT r FROM Reparations r WHERE r.cuID = :cuID"),
    @NamedQuery(name = "Reparations.findByHoursWorked", query = "SELECT r FROM Reparations r WHERE r.hoursWorked = :hoursWorked"),
    @NamedQuery(name = "Reparations.findByRecieved", query = "SELECT r FROM Reparations r WHERE r.recieved = :recieved"),
    @NamedQuery(name = "Reparations.findByDone", query = "SELECT r FROM Reparations r WHERE r.done = :done")})
public class Reparations implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "repairID")
    private String repairID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "cuID")
    private String cuID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hoursWorked")
    private int hoursWorked;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recieved")
    @Temporal(TemporalType.DATE)
    private Date recieved;
    @Basic(optional = false)
    @NotNull
    @Column(name = "done")
    @Temporal(TemporalType.DATE)
    private Date done;

    public Reparations() {
    }

    public Reparations(String repairID) {
        this.repairID = repairID;
    }

    public Reparations(String repairID, String cuID, int hoursWorked, Date recieved, Date done) {
        this.repairID = repairID;
        this.cuID = cuID;
        this.hoursWorked = hoursWorked;
        this.recieved = recieved;
        this.done = done;
    }

    public String getRepairID() {
        return repairID;
    }

    public void setRepairID(String repairID) {
        this.repairID = repairID;
    }

    public String getCuID() {
        return cuID;
    }

    public void setCuID(String cuID) {
        this.cuID = cuID;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Date getRecieved() {
        return recieved;
    }

    public void setRecieved(Date recieved) {
        this.recieved = recieved;
    }

    public Date getDone() {
        return done;
    }

    public void setDone(Date done) {
        this.done = done;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (repairID != null ? repairID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reparations)) {
            return false;
        }
        Reparations other = (Reparations) object;
        if ((this.repairID == null && other.repairID != null) || (this.repairID != null && !this.repairID.equals(other.repairID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "se.miun.test.model.Reparations[ repairID=" + repairID + " ]";
    }
    
}
