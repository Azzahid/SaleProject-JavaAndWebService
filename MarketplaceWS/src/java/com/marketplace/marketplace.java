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
        int like = connect.getData(productid);
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
    
}
