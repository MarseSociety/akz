/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3.db;

import com.mycompany.mavenproject3.db.Orders;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author bartender
 */
@Entity
@Table(name = "coffee")
@NamedQueries({
    @NamedQuery(name = "Coffee.findAll", query = "SELECT f FROM Coffee f"),
    @NamedQuery(name = "Coffee.findByNameCoffee", query = "SELECT f FROM Coffee f WHERE f.nameCoffee = :nameCoffee"),
    @NamedQuery(name = "Coffee.findByDetails", query = "SELECT f FROM Coffee f WHERE f.details = :details")})
public class Coffee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NameCoffee")
    private String nameCoffee;
    @Basic(optional = false)
    @Column(name = "details")
    private String details;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "coffeeNameCoffee")
    private Collection<Orders> ordersCollection;

    public Coffee() {
    }

    public Coffee(String nameCoffee) {
        this.nameCoffee = nameCoffee;
    }

    public Coffee(String nameCoffee, String details) {
        this.nameCoffee = nameCoffee;
        this.details = details;
    }

    public String getNameCoffee() {
        return nameCoffee;
    }

    public void setNameCoffee(String nameCoffee) {
        this.nameCoffee = nameCoffee;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Collection<Orders> getOrdersCollection() {
        return ordersCollection;
    }

    public void setOrdersCollection(Collection<Orders> ordersCollection) {
        this.ordersCollection = ordersCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nameCoffee != null ? nameCoffee.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coffee)) {
            return false;
        }
        Coffee other = (Coffee) object;
        if ((this.nameCoffee == null && other.nameCoffee != null) || (this.nameCoffee != null && !this.nameCoffee.equals(other.nameCoffee))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nameCoffee;
    }
    
}
