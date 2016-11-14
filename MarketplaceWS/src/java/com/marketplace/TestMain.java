/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marketplace;

import java.io.InputStream;
import java.io.OutputStream;
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
        
        Purchase test = con.getPhotoPurchase(5);
        Product test2 = con.getPhotoProduct(17);
         System.out.println(con.InsertLikeUser(3, 5));
        int cek = con.getLikeStatus(17,15);
        System.out.println(cek);
       //System.out.println(con.changeLikeStatus(33, cek, 3));
        //System.out.println(con.getLikeStatus(33, 3));
        System.out.println(a);
    }
    
}
