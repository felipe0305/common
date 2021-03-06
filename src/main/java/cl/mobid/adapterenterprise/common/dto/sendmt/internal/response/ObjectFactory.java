
package cl.mobid.adapterenterprise.common.dto.sendmt.internal.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.mobid.adapterenterprise.common.dto.sendsms.response package. 
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

    private final static QName _Response_QNAME = new QName("http://www.mobid.cl/adapter/common/dto/sendsms/response", "response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.mobid.adapterenterprise.common.dto.sendsms.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResonseEntMtInternalType }
     * 
     */
    public ResonseEntMtInternalType createResonseEntMtInternalType() {
        return new ResonseEntMtInternalType();
    }

    /**
     * Create an instance of {@link ItemDetailResEntMtInternalType }
     * 
     */
    public ItemDetailResEntMtInternalType createItemDetailResEntMtInternalType() {
        return new ItemDetailResEntMtInternalType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResonseEntMtInternalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mobid.cl/adapter/common/dto/sendsms/response", name = "response")
    public JAXBElement<ResonseEntMtInternalType> createResponse(ResonseEntMtInternalType value) {
        return new JAXBElement<ResonseEntMtInternalType>(_Response_QNAME, ResonseEntMtInternalType.class, null, value);
    }

}
