
package cl.mobid.adapterenterprise.common.dto.sendmt.internal.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemDetailResEntMtInternalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemDetailResEntMtInternalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detailCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="clientCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="internalCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="detailMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemDetailResEntMtInternalType", propOrder = {
    "detailCode",
    "clientCode",
    "internalCode",
    "detailMessage"
})
public class ItemDetailResEntMtInternalType {

    protected int detailCode;
    @XmlElement(required = true)
    protected String clientCode;
    @XmlElement(required = true)
    protected String internalCode;
    @XmlElement(required = true)
    protected String detailMessage;

    /**
     * Gets the value of the detailCode property.
     * 
     */
    public int getDetailCode() {
        return detailCode;
    }

    /**
     * Sets the value of the detailCode property.
     * 
     */
    public void setDetailCode(int value) {
        this.detailCode = value;
    }

    /**
     * Gets the value of the clientCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCode() {
        return clientCode;
    }

    /**
     * Sets the value of the clientCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCode(String value) {
        this.clientCode = value;
    }

    /**
     * Gets the value of the internalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalCode() {
        return internalCode;
    }

    /**
     * Sets the value of the internalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalCode(String value) {
        this.internalCode = value;
    }

    /**
     * Gets the value of the detailMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailMessage() {
        return detailMessage;
    }

    /**
     * Sets the value of the detailMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailMessage(String value) {
        this.detailMessage = value;
    }

}
