
package cl.mobid.adapterenterprise.common.dto.sendmt.internal.request;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemDetailReqEntMtInternalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemDetailReqEntMtInternalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberMobil" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sendDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="clientCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="listDataClient" type="{http://www.mobid.cl/adapter/common/dto/sendsms/request}itemDataClientInternalType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemDetailReqEntMtInternalType", propOrder = {
    "numberMobil",
    "sendDate",
    "message",
    "clientCode",
    "listDataClient"
})
public class ItemDetailReqEntMtInternalType {

    @XmlElement(required = true)
    protected String numberMobil;
    @XmlElement(required = true)
    protected String sendDate;
    @XmlElement(required = true)
    protected String message;
    @XmlElement(required = true)
    protected String clientCode;
    protected List<ItemDataClientInternalType> listDataClient;

    /**
     * Gets the value of the numberMobil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberMobil() {
        return numberMobil;
    }

    /**
     * Sets the value of the numberMobil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberMobil(String value) {
        this.numberMobil = value;
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
     * Gets the value of the listDataClient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listDataClient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListDataClient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemDataClientInternalType }
     * 
     * 
     */
    public List<ItemDataClientInternalType> getListDataClient() {
        if (listDataClient == null) {
            listDataClient = new ArrayList<ItemDataClientInternalType>();
        }
        return this.listDataClient;
    }

}
