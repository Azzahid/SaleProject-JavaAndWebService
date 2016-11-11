
package com.marketplace;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.marketplace package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllProduct_QNAME = new QName("http://marketplace.com/", "getAllProduct");
    private final static QName _GetAllProductResponse_QNAME = new QName("http://marketplace.com/", "getAllProductResponse");
    private final static QName _GetLike_QNAME = new QName("http://marketplace.com/", "getLike");
    private final static QName _GetLikeResponse_QNAME = new QName("http://marketplace.com/", "getLikeResponse");
    private final static QName _GetLikeStatus_QNAME = new QName("http://marketplace.com/", "getLikeStatus");
    private final static QName _GetLikeStatusResponse_QNAME = new QName("http://marketplace.com/", "getLikeStatusResponse");
    private final static QName _GetTotalPurchase_QNAME = new QName("http://marketplace.com/", "getTotalPurchase");
    private final static QName _GetTotalPurchaseResponse_QNAME = new QName("http://marketplace.com/", "getTotalPurchaseResponse");
    private final static QName _Hello_QNAME = new QName("http://marketplace.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://marketplace.com/", "helloResponse");
    private final static QName _Product_QNAME = new QName("http://marketplace.com/", "product");
    private final static QName _SearchProduct_QNAME = new QName("http://marketplace.com/", "searchProduct");
    private final static QName _SearchProductResponse_QNAME = new QName("http://marketplace.com/", "searchProductResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.marketplace
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllProduct }
     * 
     */
    public GetAllProduct createGetAllProduct() {
        return new GetAllProduct();
    }

    /**
     * Create an instance of {@link GetAllProductResponse }
     * 
     */
    public GetAllProductResponse createGetAllProductResponse() {
        return new GetAllProductResponse();
    }

    /**
     * Create an instance of {@link GetLike }
     * 
     */
    public GetLike createGetLike() {
        return new GetLike();
    }

    /**
     * Create an instance of {@link GetLikeResponse }
     * 
     */
    public GetLikeResponse createGetLikeResponse() {
        return new GetLikeResponse();
    }

    /**
     * Create an instance of {@link GetLikeStatus }
     * 
     */
    public GetLikeStatus createGetLikeStatus() {
        return new GetLikeStatus();
    }

    /**
     * Create an instance of {@link GetLikeStatusResponse }
     * 
     */
    public GetLikeStatusResponse createGetLikeStatusResponse() {
        return new GetLikeStatusResponse();
    }

    /**
     * Create an instance of {@link GetTotalPurchase }
     * 
     */
    public GetTotalPurchase createGetTotalPurchase() {
        return new GetTotalPurchase();
    }

    /**
     * Create an instance of {@link GetTotalPurchaseResponse }
     * 
     */
    public GetTotalPurchaseResponse createGetTotalPurchaseResponse() {
        return new GetTotalPurchaseResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link SearchProduct }
     * 
     */
    public SearchProduct createSearchProduct() {
        return new SearchProduct();
    }

    /**
     * Create an instance of {@link SearchProductResponse }
     * 
     */
    public SearchProductResponse createSearchProductResponse() {
        return new SearchProductResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "getAllProduct")
    public JAXBElement<GetAllProduct> createGetAllProduct(GetAllProduct value) {
        return new JAXBElement<GetAllProduct>(_GetAllProduct_QNAME, GetAllProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "getAllProductResponse")
    public JAXBElement<GetAllProductResponse> createGetAllProductResponse(GetAllProductResponse value) {
        return new JAXBElement<GetAllProductResponse>(_GetAllProductResponse_QNAME, GetAllProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLike }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "getLike")
    public JAXBElement<GetLike> createGetLike(GetLike value) {
        return new JAXBElement<GetLike>(_GetLike_QNAME, GetLike.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLikeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "getLikeResponse")
    public JAXBElement<GetLikeResponse> createGetLikeResponse(GetLikeResponse value) {
        return new JAXBElement<GetLikeResponse>(_GetLikeResponse_QNAME, GetLikeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLikeStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "getLikeStatus")
    public JAXBElement<GetLikeStatus> createGetLikeStatus(GetLikeStatus value) {
        return new JAXBElement<GetLikeStatus>(_GetLikeStatus_QNAME, GetLikeStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLikeStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "getLikeStatusResponse")
    public JAXBElement<GetLikeStatusResponse> createGetLikeStatusResponse(GetLikeStatusResponse value) {
        return new JAXBElement<GetLikeStatusResponse>(_GetLikeStatusResponse_QNAME, GetLikeStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTotalPurchase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "getTotalPurchase")
    public JAXBElement<GetTotalPurchase> createGetTotalPurchase(GetTotalPurchase value) {
        return new JAXBElement<GetTotalPurchase>(_GetTotalPurchase_QNAME, GetTotalPurchase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTotalPurchaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "getTotalPurchaseResponse")
    public JAXBElement<GetTotalPurchaseResponse> createGetTotalPurchaseResponse(GetTotalPurchaseResponse value) {
        return new JAXBElement<GetTotalPurchaseResponse>(_GetTotalPurchaseResponse_QNAME, GetTotalPurchaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "searchProduct")
    public JAXBElement<SearchProduct> createSearchProduct(SearchProduct value) {
        return new JAXBElement<SearchProduct>(_SearchProduct_QNAME, SearchProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "searchProductResponse")
    public JAXBElement<SearchProductResponse> createSearchProductResponse(SearchProductResponse value) {
        return new JAXBElement<SearchProductResponse>(_SearchProductResponse_QNAME, SearchProductResponse.class, null, value);
    }

}
