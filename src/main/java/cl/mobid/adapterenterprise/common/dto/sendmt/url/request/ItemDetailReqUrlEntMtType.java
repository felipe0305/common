
package cl.mobid.adapterenterprise.common.dto.sendmt.url.request;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemDetailReqUrlEntMtType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemDetailReqUrlEntMtType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberMobile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sendDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="clientCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="listUrlDataClient" type="{http://www.mobid.cl/webservice/dto/sendsmsurl/request}itemUrlDataClientType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemDetailReqUrlEntMtType", propOrder = {
    "numberMobile",
    "sendDate",
    "message",
    "url",
    "clientCode",
    "listUrlDataClient"
})
public class ItemDetailReqUrlEntMtType {

    @XmlElement(required = true)
    protected String numberMobile;
    @XmlElement(required = true)
    protected String sendDate;
    @XmlElement(required = true)
    protected String message;
    @XmlElement(required = true)
    protected String url;
    @XmlElement(required = true)
    protected String clientCode;
    protected List<ItemUrlDataClientType> listUrlDataClient;

    /**
     * Gets the value of the numberMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberMobile() {
        return numberMobile;
    }

    /**
     * Sets the value of the numberMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberMobile(String value) {
        this.numberMobile = value;
    }

    /**
     * Gets the value of the sendDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendDate() {
        return sendDate;
    }

    /**
     * Sets the value of the sendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendDate(String value) {
        this.sendDate = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
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
     * Gets the value of the listUrlDataClient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listUrlDataClient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListUrlDataClient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemUrlDataClientType }
     * 
     * 
     */
    public List<ItemUrlDataClientType> getListUrlDataClient() {
        if (listUrlDataClient == null) {
            listUrlDataClient = new ArrayList<ItemUrlDataClientType>();
        }
        return this.listUrlDataClient;
    }

}
