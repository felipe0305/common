
package cl.mobid.adapterenterprise.common.dto.sendmt.url.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.mobid.webservice.dto.sendsmsurl.request package. 
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

    private final static QName _Request_QNAME = new QName("http://www.mobid.cl/webservice/dto/sendsmsurl/request", "request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.mobid.webservice.dto.sendsmsurl.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestUrlEntMtType }
     * 
     */
    public RequestUrlEntMtType createRequestUrlEntMtType() {
        return new RequestUrlEntMtType();
    }

    /**
     * Create an instance of {@link ItemDetailReqUrlEntMtType }
     * 
     */
    public ItemDetailReqUrlEntMtType createItemDetailReqUrlEntMtType() {
        return new ItemDetailReqUrlEntMtType();
    }

    /**
     * Create an instance of {@link ItemUrlDataClientType }
     * 
     */
    public ItemUrlDataClientType createItemUrlDataClientType() {
        return new ItemUrlDataClientType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestUrlEntMtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mobid.cl/webservice/dto/sendsmsurl/request", name = "request")
    public JAXBElement<RequestUrlEntMtType> createRequest(RequestUrlEntMtType value) {
        return new JAXBElement<RequestUrlEntMtType>(_Request_QNAME, RequestUrlEntMtType.class, null, value);
    }

}
