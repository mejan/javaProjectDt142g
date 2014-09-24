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
@Table(name = "Customer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer_1.findAll", query = "SELECT c FROM Customer_1 c"),
    @NamedQuery(name = "Customer_1.findByCuID", query = "SELECT c FROM Customer_1 c WHERE c.cuID = :cuID"),
    @NamedQuery(name = "Customer_1.findByName", query = "SELECT c FROM Customer_1 c WHERE c.name = :name"),
    @NamedQuery(name = "Customer_1.findByLastName", query = "SELECT c FROM Customer_1 c WHERE c.lastName = :lastName"),
    @NamedQuery(name = "Customer_1.findByEmail", query = "SELECT c FROM Customer_1 c WHERE c.email = :email"),
    @NamedQuery(name = "Customer_1.findByPhoneNumber", query = "SELECT c FROM Customer_1 c WHERE c.phoneNumber = :phoneNumber")})
public class Customer_1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "cuID")
    private String cuID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "lastName")
    private String lastName;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "phoneNumber")
    private String phoneNumber;

    public Customer_1() {
    }

    public Customer_1(String cuID) {
        this.cuID = cuID;
    }

    public Customer_1(String cuID, String name, String lastName, String email, String phoneNumber) {
        this.cuID = cuID;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getCuID() {
        return cuID;
    }

    public void setCuID(String cuID) {
        this.cuID = cuID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cuID != null ? cuID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer_1)) {
            return false;
        }
        Customer_1 other = (Customer_1) object;
        if ((this.cuID == null && other.cuID != null) || (this.cuID != null && !this.cuID.equals(other.cuID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "se.miun.test.model.Customer_1[ cuID=" + cuID + " ]";
    }
    
}
