/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.miun.projectjava.entitys;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Max
 */
@Entity
@Table(name = "Consultation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consultation.findAll", query = "SELECT c FROM Consultation c"),
    @NamedQuery(name = "Consultation.findByConsultationID", query = "SELECT c FROM Consultation c WHERE c.consultationID = :consultationID"),
    @NamedQuery(name = "Consultation.findByDate", query = "SELECT c FROM Consultation c WHERE c.date = :date"),
    @NamedQuery(name = "Consultation.findByTime", query = "SELECT c FROM Consultation c WHERE c.time = :time"),
    @NamedQuery(name = "Consultation.findByDescription", query = "SELECT c FROM Consultation c WHERE c.description = :description"),
    @NamedQuery(name = "Consultation.findByAccepted", query = "SELECT c FROM Consultation c WHERE c.accepted = :accepted"),
    @NamedQuery(name = "Consultation.findByDay", query = "SELECT c FROM Consultation c WHERE c.day = :day"),
    @NamedQuery(name = "Consultation.findByTimeInterval", query = "SELECT c FROM Consultation c WHERE c.timeInterval = :timeInterval")})
public class Consultation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "consultationID")
    private Integer consultationID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Column(name = "time")
    @Temporal(TemporalType.TIME)
    private Date time;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "accepted")
    private boolean accepted;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "day")
    private String day;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "timeInterval")
    private String timeInterval;
    @JoinColumn(name = "customerID", referencedColumnName = "customerID")
    @ManyToOne(optional = false)
    private Customer customerID;

    public Consultation() {
    }

    public Consultation(Integer consultationID) {
        this.consultationID = consultationID;
    }

    public Consultation(Integer consultationID, Date date, Date time, String description, boolean accepted, String day, String timeInterval) {
        this.consultationID = consultationID;
        this.date = date;
        this.time = time;
        this.description = description;
        this.accepted = accepted;
        this.day = day;
        this.timeInterval = timeInterval;
    }

    public Integer getConsultationID() {
        return consultationID;
    }

    public void setConsultationID(Integer consultationID) {
        this.consultationID = consultationID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (consultationID != null ? consultationID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consultation)) {
            return false;
        }
        Consultation other = (Consultation) object;
        if ((this.consultationID == null && other.consultationID != null) || (this.consultationID != null && !this.consultationID.equals(other.consultationID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "se.miun.projectjava.entitys.Consultation[ consultationID=" + consultationID + " ]";
    }
    
}
