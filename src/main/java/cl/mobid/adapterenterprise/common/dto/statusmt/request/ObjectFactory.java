
package cl.mobid.adapterenterprise.common.dto.statusmt.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.mobid.adapterenterprise.adaptersaesa.dto.statusmt.enterprise.request package. 
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

    private final static QName _Request_QNAME = new QName("http://www.mobid.cl/adapter/adaptersaesa/dto/statusmt/enterprise/request", "request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.mobid.adapterenterprise.adaptersaesa.dto.statusmt.enterprise.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestEntStatusMtType }
     * 
     */
    public RequestEntStatusMtType createRequestEntStatusMtType() {
        return new RequestEntStatusMtType();
    }

    /**
     * Create an instance of {@link ItemReqEntStatusMtType }
     * 
     */
    public ItemReqEntStatusMtType createItemReqEntStatusMtType() {
        return new ItemReqEntStatusMtType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestEntStatusMtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mobid.cl/adapter/adaptersaesa/dto/statusmt/enterprise/request", name = "request")
    public JAXBElement<RequestEntStatusMtType> createRequest(RequestEntStatusMtType value) {
        return new JAXBElement<RequestEntStatusMtType>(_Request_QNAME, RequestEntStatusMtType.class, null, value);
    }

}
