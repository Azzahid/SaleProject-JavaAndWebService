
package com.marketplace;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "marketplace", targetNamespace = "http://marketplace.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Marketplace {


    /**
     * 
     * @param productid
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLike", targetNamespace = "http://marketplace.com/", className = "com.marketplace.GetLike")
    @ResponseWrapper(localName = "getLikeResponse", targetNamespace = "http://marketplace.com/", className = "com.marketplace.GetLikeResponse")
    @Action(input = "http://marketplace.com/marketplace/getLikeRequest", output = "http://marketplace.com/marketplace/getLikeResponse")
    public int getLike(
        @WebParam(name = "productid", targetNamespace = "")
        int productid);

    /**
     * 
     * @return
     *     returns java.util.List<com.marketplace.Product>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllProduct", targetNamespace = "http://marketplace.com/", className = "com.marketplace.GetAllProduct")
    @ResponseWrapper(localName = "getAllProductResponse", targetNamespace = "http://marketplace.com/", className = "com.marketplace.GetAllProductResponse")
    @Action(input = "http://marketplace.com/marketplace/getAllProductRequest", output = "http://marketplace.com/marketplace/getAllProductResponse")
    public List<Product> getAllProduct();

    /**
     * 
     * @param productid
     * @param userid
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLikeStatus", targetNamespace = "http://marketplace.com/", className = "com.marketplace.GetLikeStatus")
    @ResponseWrapper(localName = "getLikeStatusResponse", targetNamespace = "http://marketplace.com/", className = "com.marketplace.GetLikeStatusResponse")
    @Action(input = "http://marketplace.com/marketplace/getLikeStatusRequest", output = "http://marketplace.com/marketplace/getLikeStatusResponse")
    public Integer getLikeStatus(
        @WebParam(name = "productid", targetNamespace = "")
        int productid,
        @WebParam(name = "userid", targetNamespace = "")
        int userid);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTotalPurchase", targetNamespace = "http://marketplace.com/", className = "com.marketplace.GetTotalPurchase")
    @ResponseWrapper(localName = "getTotalPurchaseResponse", targetNamespace = "http://marketplace.com/", className = "com.marketplace.GetTotalPurchaseResponse")
    @Action(input = "http://marketplace.com/marketplace/getTotalPurchaseRequest", output = "http://marketplace.com/marketplace/getTotalPurchaseResponse")
    public Integer getTotalPurchase(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param text
     * @param option
     * @return
     *     returns java.util.List<com.marketplace.Product>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchProduct", targetNamespace = "http://marketplace.com/", className = "com.marketplace.SearchProduct")
    @ResponseWrapper(localName = "searchProductResponse", targetNamespace = "http://marketplace.com/", className = "com.marketplace.SearchProductResponse")
    @Action(input = "http://marketplace.com/marketplace/searchProductRequest", output = "http://marketplace.com/marketplace/searchProductResponse")
    public List<Product> searchProduct(
        @WebParam(name = "text", targetNamespace = "")
        String text,
        @WebParam(name = "option", targetNamespace = "")
        int option);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://marketplace.com/", className = "com.marketplace.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://marketplace.com/", className = "com.marketplace.HelloResponse")
    @Action(input = "http://marketplace.com/marketplace/helloRequest", output = "http://marketplace.com/marketplace/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
