
package cl.mobid.adapterenterprise.common.dto.sendmo.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.mobid.adapter.adapterbroxel.dto.sendmo.response package. 
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

    private final static QName _Response_QNAME = new QName("http://www.mobid.cl/adapter/adapterbroxel/dto/sendmo/response", "response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.mobid.adapter.adapterbroxel.dto.sendmo.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseEntMoType }
     * 
     */
    public ResponseEntMoType createResponseEntMoType() {
        return new ResponseEntMoType();
    }

    /**
     * Create an instance of {@link ItemDetailResEntMoType }
     * 
     */
    public ItemDetailResEntMoType createItemDetailResEntMoType() {
        return new ItemDetailResEntMoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseEntMoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mobid.cl/adapter/adapterbroxel/dto/sendmo/response", name = "response")
    public JAXBElement<ResponseEntMoType> createResponse(ResponseEntMoType value) {
        return new JAXBElement<ResponseEntMoType>(_Response_QNAME, ResponseEntMoType.class, null, value);
    }

}
