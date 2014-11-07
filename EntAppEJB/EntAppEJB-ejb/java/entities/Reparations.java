/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "reparations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reparations.findAll", query = "SELECT r FROM Reparations r"),
    @NamedQuery(name = "Reparations.findByRepairID", query = "SELECT r FROM Reparations r WHERE r.repairID = :repairID"),
    @NamedQuery(name = "Reparations.findByCustomerID", query = "SELECT r FROM Reparations r WHERE r.customerID = :customerID"),
    @NamedQuery(name = "Reparations.findByHoursWorked", query = "SELECT r FROM Reparations r WHERE r.hoursWorked = :hoursWorked"),
    @NamedQuery(name = "Reparations.findByImagePath", query = "SELECT r FROM Reparations r WHERE r.imagePath = :imagePath"),
    @NamedQuery(name = "Reparations.findByDescription", query = "SELECT r FROM Reparations r WHERE r.description = :description"),
    @NamedQuery(name = "Reparations.findByRecieved", query = "SELECT r FROM Reparations r WHERE r.recieved = :recieved"),
    @NamedQuery(name = "Reparations.findByDone", query = "SELECT r FROM Reparations r WHERE r.done = :done"),
    @NamedQuery(name = "Reparations.findByIsFinished", query = "SELECT r FROM Reparations r WHERE r.isFinished = :isFinished")})
public class Reparations implements Serializable {
    @OneToMany(cascade=CascadeType.ALL, mappedBy="repairID")
    private List<ReparationPictures> reparationPicturesList;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "repairID")
    private Integer repairID;
    /*@Basic(optional = false)
    @NotNull
    @Column(name = "customerID")
    private int customerID;*/
    @Basic(optional = false)
    @NotNull
    @Column(name = "hoursWorked")
    private int hoursWorked;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "imagePath")
    private String imagePath;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "description")
    private String description;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "isFinished")
    private boolean isFinished;
    @JoinColumn(name="customerID", referencedColumnName="customerID")
    @ManyToOne(optional=false)
    private Customer customerID;

    public Reparations() {
    }

    public Reparations(Integer repairID) {
        this.repairID = repairID;
    }

    public Reparations(Integer repairID, int customerID, int hoursWorked, String imagePath, String description, Date recieved, Date done, boolean isFinished) {
        this.repairID = repairID;
        this.hoursWorked = hoursWorked;
        this.imagePath = imagePath;
        this.description = description;
        this.recieved = recieved;
        this.done = done;
        this.isFinished = isFinished;
    }

    public Integer getRepairID() {
        return repairID;
    }

    public void setRepairID(Integer repairID) {
        this.repairID = repairID;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }


    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public boolean isIsFinished() {
        return isFinished;
    }

    public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
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
        return "entities.Reparations[ repairID=" + repairID + " ]";
    }
    
}
