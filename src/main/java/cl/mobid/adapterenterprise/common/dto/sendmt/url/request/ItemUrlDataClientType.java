
package cl.mobid.adapterenterprise.common.dto.sendmt.url.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemUrlDataClientType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemUrlDataClientType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeDataClient" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="valueDataClient" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemUrlDataClientType", propOrder = {
    "codeDataClient",
    "valueDataClient"
})
public class ItemUrlDataClientType {

    @XmlElement(required = true)
    protected String codeDataClient;
    @XmlElement(required = true)
    protected String valueDataClient;

    /**
     * Gets the value of the codeDataClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDataClient() {
        return codeDataClient;
    }

    /**
     * Sets the value of the codeDataClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDataClient(String value) {
        this.codeDataClient = value;
    }

    /**
     * Gets the value of the valueDataClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueDataClient() {
        return valueDataClient;
    }

    /**
     * Sets the value of the valueDataClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueDataClient(String value) {
        this.valueDataClient = value;
    }

}
