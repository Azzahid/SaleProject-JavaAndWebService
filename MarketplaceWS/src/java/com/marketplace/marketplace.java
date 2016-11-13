/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marketplace;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Silva
 */
@WebService(serviceName = "marketplace")
public class marketplace {

    /**
     * This is a sample web service operation
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @param id
     * @param productid
     * @return 
     */
    @WebMethod(operationName = "getLike")
    public int getLike(@WebParam(name = "productid") int productid) {
        //TODO write your implementation code here:
        DbConnector connect = new DbConnector();
        int like = connect.getTotalLike(productid);
        connect.close();
        return like;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllProduct")
    public Product[] getAllProduct() {
        Product[] result = null;
        DbConnector con = new DbConnector();
        if((result = con.getProduct())!=null){
            return result;
        }else{
            return null;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getLikeStatus")
    public Integer getLikeStatus(@WebParam(name = "productid") int productid, @WebParam(name = "userid") int userid) {
        Integer result = null;
        DbConnector con = new DbConnector();
        result = con.getLikeStatus(userid, productid);
        con.close();
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getTotalPurchase")
    public Integer getTotalPurchase(@WebParam(name = "id") int id) {
        Integer result = null;
        DbConnector con = new DbConnector();
        result = con.getTotalPurchase(id);
        con.close();
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "searchProduct")
    public Product[] searchProduct(@WebParam(name = "text") String text, @WebParam(name = "option") int option) {
        Product[] result = null;
        DbConnector con = new DbConnector();
        result = con.searchProduct(text,option);
        con.close();
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getProductPurchase")
    public Purchase[] getProductPurchase(@WebParam(name = "userid") int userid) {
        Purchase[] result;
        DbConnector con = new DbConnector();
        result =con.getProductPurchase(userid, 1);
        con.close();
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getProductSales")
    public Purchase[] getProductSales(@WebParam(name = "userid") int userid) {
        Purchase[] result;
        DbConnector con = new DbConnector();
        result = con.getProductPurchase(userid, 0);
        con.close();
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getPhoto")
    public Product getPhoto(@WebParam(name = "id") int id) {
        Product photo;
        DbConnector con = new DbConnector();
        photo = con.getPhotoProduct(id);
        con.close();
        return photo;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getPhotoPurchase")
    public Purchase getPhotoPurchase(@WebParam(name = "id") int id) {
        Purchase photo;
        DbConnector con = new DbConnector();
        photo = con.getPhotoPurchase(id);
        con.close();
        return photo;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "confirmPurchase")
    public Boolean confirmPurchase(@WebParam(name = "buyer_id") int buyer_id,
            @WebParam(name = "product_id") int product_id,
            @WebParam(name = "consignee") String consignee,
            @WebParam(name = "fulladdress") String fulladdress,
            @WebParam(name = "quantity") int quantity,
            @WebParam(name = "creditcardnumber") String creditcardnumber,
            @WebParam(name = "postalcode") String postalcode,
            @WebParam(name = "phonenumber") String phonenumber,
            @WebParam(name = "card_verification") String card_verification            
            ) {
        //TODO write your implementation code here:
        DbConnector con = new DbConnector();
        return con.confirmPurchase(buyer_id, 
            product_id, 
            consignee,
            fulladdress, 
            quantity, 
            creditcardnumber, 
            postalcode,
            phonenumber, 
            card_verification);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addProduct")
    public Boolean addProduct(@WebParam(name = "productname") String productname, @WebParam(name = "description") String description, @WebParam(name = "price") String price, @WebParam(name = "imageblob") String imageblob, @WebParam(name = "userid") String userid) {
        //TODO write your implementation code here:
        DbConnector con = new DbConnector();
        
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertLike")
    public Integer insertLike(@WebParam(name = "barangid") int barangid, @WebParam(name = "userid") int userid) {
       Integer result = 0;
       DbConnector con = new DbConnector();
       result = con.InsertLikeUser(barangid, userid);
       return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "changeLikeStatus")
    public Integer changeLikeStatus(@WebParam(name = "barangid") int barangid, @WebParam(name = "userid") int userid) {
        Integer result = 0;
        DbConnector con = new DbConnector();
        int x = con.getLikeStatus(userid, barangid);
        result = con.changeLikeStatus(barangid, x, userid);
        return result;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getYourProduct")
    public Product[] getYourProduct(@WebParam(name = "user_id") int user_id) {
        Product[] result = null;
        DbConnector con = new DbConnector();
        if((result = con.getYourProduct(user_id))!=null){
            return result;
        }else{
            return null;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteProduct")
    public Boolean deleteProduct(@WebParam(name = "product_id") int product_id) {
        DbConnector con = new DbConnector();
        return con.deleteProduct(product_id);
    }
}
