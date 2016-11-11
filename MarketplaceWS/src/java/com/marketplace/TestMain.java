/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marketplace;

import java.sql.SQLException;

/**
 *
 * @author Silva
 */
public class TestMain {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        DbConnector con = new DbConnector();
        int a = con.getData(13);
        Product[] es = con.getProduct();
        int i;
        System.out.println(es.length);
        for(i = 0; i<es.length;i++){
            System.out.println(es[i].getNamaProduk());
        }
        System.out.println(a);
    }
    
}
