/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3.db;

import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
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

/**
 *
 * @author bartender
 */
@Entity
@Table(name = "orders")
@NamedQueries({
    @NamedQuery(name = "Orders.findAll", query = "SELECT o FROM Orders o"),
    @NamedQuery(name = "Orders.findByIdOrders", query = "SELECT o FROM Orders o WHERE o.idOrders = :idOrders")})
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idOrders")
    private String idOrders;
    @JoinColumn(name = "Coffee_NameCoffee", referencedColumnName = "NameCoffee")
    @ManyToOne(optional = false)
    private Coffee coffeeNameCoffee;
    @JoinColumn(name = "Customers_NameCustomer", referencedColumnName = "NameCustomer")
    @ManyToOne(optional = false)
    private Customers customersNameCustomer;

    public Orders() {
    }

    public Orders(String idOrders) {
        this.idOrders = idOrders;
    }

    public String getIdOrders() {
        return idOrders;
    }

    public void setIdOrders(String idOrders) {
        this.idOrders = idOrders;
    }

    public Coffee getCoffeeNameCoffee() {
        return coffeeNameCoffee;
    }

    public void setCoffeeNameCoffee(Coffee coffeeNameCoffee) {
        this.coffeeNameCoffee = coffeeNameCoffee;
    }

    public Customers getCustomersNameCustomer() {
        return customersNameCustomer;
    }

    public void setCustomersNameCustomer(Customers customersNameCustomer) {
        this.customersNameCustomer = customersNameCustomer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrders != null ? idOrders.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.idOrders == null && other.idOrders != null) || (this.idOrders != null && !this.idOrders.equals(other.idOrders))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject3.db.Orders[ idOrders=" + idOrders + " ]";
    }
    
}
