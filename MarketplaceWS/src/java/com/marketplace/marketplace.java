/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marketplace;

import java.sql.SQLException;
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
    public int getLike(@WebParam(name = "productid") int productid) throws SQLException {
        //TODO write your implementation code here:
        DbConnector connect = new DbConnector();
        int like = connect.getTotalLike(productid);
        return like;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllProduct")
    public Product[] getAllProduct() throws SQLException {
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
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "searchProduct")
    public Product[] searchProduct(@WebParam(name = "text") String text, @WebParam(name = "option") int option) {
        Product[] result = null;
        DbConnector con = new DbConnector();
        if ((result = con.searchProduct(text,option)) != null) {
            return result;
        }else{
            return null;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getProductPurchase")
    public Purchase[] getProductPurchase(@WebParam(name = "userid") int userid) {
        Purchase[] result;
        DbConnector con = new DbConnector();
        result =con.getProductPurchase(userid, 1);
        
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
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public Byte[] getPhoto(@WebParam(name = "id") int id, @WebParam(name="pilihan") int pilihan) {
        Byte[] photo = null;
        DbConnector con = new DbConnector();
//        photo = con.getPhoto(id, pilihan);
        
        return null;
    }
    
    
}
