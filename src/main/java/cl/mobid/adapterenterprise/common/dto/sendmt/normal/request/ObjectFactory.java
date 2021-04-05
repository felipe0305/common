
package cl.mobid.adapterenterprise.common.dto.sendmt.normal.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.mobid.webservice.dto.sendsms.request package. 
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

    private final static QName _Request_QNAME = new QName("http://www.mobid.cl/adapter/common/dto/sendsms/request", "request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.mobid.webservice.dto.sendsms.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestEntMtType }
     * 
     */
    public RequestEntMtType createRequestEntMtType() {
        return new RequestEntMtType();
    }

    /**
     * Create an instance of {@link ItemDetailReqEntMtType }
     * 
     */
    public ItemDetailReqEntMtType createItemDetailReqEntMtType() {
        return new ItemDetailReqEntMtType();
    }

    /**
     * Create an instance of {@link ItemDataClientType }
     * 
     */
    public ItemDataClientType createItemDataClientType() {
        return new ItemDataClientType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestEntMtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mobid.cl/adapter/common/dto/sendsms/request", name = "request")
    public JAXBElement<RequestEntMtType> createRequest(RequestEntMtType value) {
        return new JAXBElement<RequestEntMtType>(_Request_QNAME, RequestEntMtType.class, null, value);
    }

}
