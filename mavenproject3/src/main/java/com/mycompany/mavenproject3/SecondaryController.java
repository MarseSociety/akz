package com.mycompany.mavenproject3;

import java.io.IOException;
import java.util.List;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import com.mycompany.mavenproject3.db.Customers;
import com.mycompany.mavenproject3.db.Coffee;
import com.mycompany.mavenproject3.db.Orders;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SecondaryController {

    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
    public static EntityManager em = emf.createEntityManager();
    public TableView table;
    public TableColumn columnOrders;
    public TableColumn columnCoffee;
    public Button secondaryButton;
    public TableColumn columnCustomer;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

//    @FXML
//    public void initialize() {
//
//        Query q = em.createNamedQuery("Orders.findAll");
//        List<Orders> ordersList = q.getResultList();
//
//        columnCustomers.setCellValueFactory((TableColumn.CellDataFeatures<Orders, String> cd) -> {
//            return new SimpleStringProperty(cd.getValue().getCustomersNameCustomer().toString());
//        });
//
//        columnCoffee.setCellValueFactory((TableColumn.CellDataFeatures<Orders, String> cd) -> {
//            return new SimpleStringProperty(cd.getValue().getCoffeeNameCoffee().toString());
//        });
//
//        columnOrders.setCellValueFactory((TableColumn.CellDataFeatures<Orders, String> cd) -> {
//            return new SimpleStringProperty(cd.getValue().getIdOrders());
//        });
//
//            ObservableList<Orders> ord = FXCollections.observableList(ordersList);
//            table.setItems(ord);
//
//    }
}