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
        int a = con.getTotalLike(13);
        Product[] es = con.searchProduct("poke", 0);
        int i;
        Purchase[] ex = con.getProductPurchase(7, 1);
        Purchase[] eb = con.getProductPurchase(7,2);
        System.out.println("Purchase = "+ex.length);
        for(i=0;i<ex.length;i++){
            System.out.println(i+" = "+ex[i].getProductName());
        }
        System.out.println("Sales = "+eb.length);
        for(i=0;i<eb.length;i++){
            System.out.println(eb[i].getProductName());
        }
        System.out.println(a);
    }
    
}
