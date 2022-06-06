/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.db.Customers;
import com.mycompany.mavenproject3.db.Orders;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author bartender
 */
public class Ordcust {
    public static void expert(
            HashMap<Orders, Customers> data, File outputFile) throws IOException {
    
        FileWriter fw = new FileWriter(outputFile);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for (Map.Entry<Orders, Customers> i : data.entrySet()) {
            Orders order = i.getKey();
            Customers customer = i.getValue();
            
            String idOrder = order.getIdOrders();
            String nameCustomer = customer.getNameCustomer();
                        
            bw.write(idOrder + "," 
                    + nameCustomer + "\n");
        }

        bw.close();
    }
    
    public static HashMap<Orders, Customers> importOrders(File inputFile) throws IOException {
        FileReader fr = new FileReader(inputFile);
        BufferedReader br = new BufferedReader(fr);
        HashMap<Orders, Customers> result = new HashMap<>();
        
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            String idOrder = data[0];
            String NameCustomer  = data[1];
            System.out.println(
                    "Order id:  " + idOrder 
                    + ", Customer's name: " + NameCustomer);
            
                     Customers c = null;
            for (Map.Entry<Orders, Customers> i : result.entrySet()) {
                Customers r = i.getValue();
                if (r.getNameCustomer().equals(NameCustomer)) {
                    c = r;
                    break;
                }
            }
            
            if (c == null) {
                c = new Customers();
                c.setNameCustomer(NameCustomer);
                                
            }
            
            Orders o = new Orders();
            o.setIdOrders(idOrder);
                        
            result.put(o, c);            
                }
        return result;
    }
}
