
package cl.mobid.adapterenterprise.common.dto.sendmo.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.mobid.adapter.adapterbroxel.dto.sendmo.request package. 
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

    private final static QName _Request_QNAME = new QName("http://www.mobid.cl/adapter/adapterbroxel/dto/sendmo/request", "request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.mobid.adapter.adapterbroxel.dto.sendmo.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestEntMoType }
     * 
     */
    public RequestEntMoType createRequestEntMoType() {
        return new RequestEntMoType();
    }

    /**
     * Create an instance of {@link ItemReqEntMoType }
     * 
     */
    public ItemReqEntMoType createItemReqEntMoType() {
        return new ItemReqEntMoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestEntMoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mobid.cl/adapter/adapterbroxel/dto/sendmo/request", name = "request")
    public JAXBElement<RequestEntMoType> createRequest(RequestEntMoType value) {
        return new JAXBElement<RequestEntMoType>(_Request_QNAME, RequestEntMoType.class, null, value);
    }

}
