/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marketplace;

import com.mysql.jdbc.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Silva
 */
public class DbConnector {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DbConnector(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/t2_product", "root", "");
            st = (Statement) con.createStatement();
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error "+ ex);
        }
    }
    
    public int getTotalLike(int productid){
        int count = -999;
        try{
            String query;
            query = ("SELECT COUNT(*) AS total FROM user_like WHERE barang_id='"+Integer.toString(productid)+"'");
            rs = st.executeQuery(query);
            while(rs.next()){
                count = rs.getInt("total");
            }
        } catch (Exception ex) {
            System.out.println("Result: "+ex);
        }
        return count;
    }
    
    public Product[] getProduct(){
        Product[] es = null;
        try{
            String query;
            int count;
            int i = 0;
            query = ("SELECT COUNT(*) AS total FROM product");
            rs = st.executeQuery(query);
            if(rs.next()){
                count = rs.getInt("total");
            }else{
                return null;
            }
            if(count==0){
                return null;
            }
            es = new Product[count];
            query = ("SELECT * FROM product");
            rs = st.executeQuery(query);
            while(rs.next()){
                /*
                private Integer pId;
                private String namaProduk;
                private String description;
                private String price;
                private byte[] photoUrl;
                private Date createdAt;
                private String imageType;
                private String imageName;
                private User userId;*/
                es[i] = new Product();
                es[i].setPId(rs.getInt("p_Id"));
                es[i].setNamaProduk(rs.getString("namaProduk"));
                es[i].setDescription(rs.getString("description"));
                es[i].setPrice(rs.getString("price"));
                es[i].setPhotoUrl(rs.getBytes("photo_Url"));
                es[i].setCreatedAt(rs.getDate("created_At"));
                es[i].setImageType(rs.getString("image_Type"));
                es[i].setImageName(rs.getString("image_Name"));
                es[i].setUserId(rs.getInt("user_Id"));
                i++;
            }
        }catch(Exception ex){
            System.out.println("Result: "+ex);
        }
        
        return es;
    }
    
    public Integer getLikeStatus(int id, int productid){
        Integer result = null;
            
            try{
                String query;
                int i = 0;
                query = ("SELECT COUNT(*) AS total FROM user_like WHERE user_id = '"+id+"' AND barang_id = '"+productid+"'");
                rs = st.executeQuery(query);
                if(rs.next()){
                    result = rs.getInt("total");
                }else{
                    return null;
                }
            }catch(Exception ex){
                System.out.println("Result : "+ex);
            }
        
        return result;
    }
    
    public Integer getTotalPurchase(int id){
        Integer result = null;
            
            try{
                String query;
                int i = 0;
                query = ("SELECT COUNT(*) AS total FROM purchase WHERE product_id = '"+id+"'");
                rs = st.executeQuery(query);
                if(rs.next()){
                    result = rs.getInt("total");
                }else{
                    return null;
                }
            }catch(Exception ex){
                System.out.println("Result : "+ex);
            }
        
        return result;
    }
    
    public Product[] searchProduct(String text, Integer pilihan){
        Product[] es = null;
        String query;
        String query1;
        if(pilihan == 0){
            query = ("SELECT COUNT(*) AS total FROM product WHERE namaProduk LIKE '%"+text+"%'");
            query1 = ("SELECT * FROM product WHERE namaProduk LIKE '%"+text+"%' ORDER BY created_at DESC");
        }else{
            query = ("SELECT COUNT(*) AS total FROM product WHERE user_id LIKE '%"+text+"%'");
            query1 = ("SELECT * FROM product WHERE user_id LIKE '%"+text+"%' ORDER BY created_at DESC");
        }
        try{
            int count;
            int i = 0;
            rs = st.executeQuery(query);
            if(rs.next()){
                count = rs.getInt("total");
            }else{
                return null;
            }
            if(count==0){
                return null;
            }
            es = new Product[count];
            rs = st.executeQuery(query1);
            while(rs.next()){
                es[i] = new Product();
                es[i].setPId(rs.getInt("p_id"));
                es[i].setNamaProduk(rs.getString("namaProduk"));
                es[i].setDescription(rs.getString("description"));
                es[i].setPrice(rs.getString("price"));
                es[i].setPhotoUrl(rs.getBytes("photo_Url"));
                es[i].setCreatedAt(rs.getDate("created_at"));
                es[i].setImageType(rs.getString("image_Type"));
                es[i].setImageName(rs.getString("image_Name"));
                es[i].setUserId(rs.getInt("user_Id"));
                i++;
            }
        }catch(Exception ex){
            System.out.println("Result: "+ex);
        }
        
        return es;
    }
    
    public Purchase[] getProductPurchase(Integer userid, Integer pilihan){
        Purchase[] es = null;
        String query;
        String query1;
        if(pilihan  == 1){
            query = ("SELECT COUNT(*) AS total FROM purchase WHERE purchase.buyer_id = '"+userid+"'");
            query1 = ("SELECT * FROM purchase WHERE purchase.buyer_id = '"+userid+"' ORDER BY created_at DESC");
        }else{
            query = ("SELECT COUNT(*) AS total FROM purchase WHERE purchase.seller_id = '"+userid+"'");
            query1 = ("SELECT * FROM purchase WHERE purchase.seller_id = '"+userid+"' ORDER BY created_at DESC");
        }
        try{
            int count;
            int i = 0;
            rs = st.executeQuery(query);
            if(rs.next()){
                count = rs.getInt("total");
            }else{
                return null;
            }
            if(count==0){
                return null;
            }
            es = new Purchase[count];
            rs = st.executeQuery(query1);
            while (rs.next()) {
                /*private Integer purchaseId;
            */
                es[i] = new Purchase();
                es[i].setPurchaseId(rs.getInt("purchase_id"));
                es[i].setBuyerId(rs.getInt("buyer_id"));
                es[i].setProductId(rs.getInt("product_id"));
                es[i].setConsignee("consignee");
                es[i].setFulladdress(rs.getString("fulladdress"));
                es[i].setQuantity(rs.getInt(6));
                es[i].setCreditcardnumber(rs.getString(7));
                es[i].setPostalcode(rs.getString(8));
                es[i].setPhonenumber(rs.getString(9));
                es[i].setCreatedAt(rs.getDate(10));
                es[i].setCardVerification(rs.getString(11));
                es[i].setProductName(rs.getString(12));
                es[i].setProductDescription(rs.getString(13));
                es[i].setProductPrice(rs.getString(14));
                es[i].setProductPhotourl(rs.getBytes(15));
                es[i].setSellerId(rs.getInt(16));
                es[i].setImageType(rs.getString(17));
                i++;
            }
        } catch (SQLException ex) {
            System.out.println("Result: "+ex);
        }
        
        return es;
    }
    
}
