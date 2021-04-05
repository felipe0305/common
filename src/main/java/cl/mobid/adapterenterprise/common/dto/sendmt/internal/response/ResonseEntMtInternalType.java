
package cl.mobid.adapterenterprise.common.dto.sendmt.internal.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resonseEntMtInternalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resonseEntMtInternalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="generalCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="generalMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="detailResEntMt" type="{http://www.mobid.cl/adapter/common/dto/sendsms/response}itemDetailResEntMtInternalType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resonseEntMtInternalType", propOrder = {
    "generalCode",
    "generalMessage",
    "detailResEntMt"
})
public class ResonseEntMtInternalType {

    protected int generalCode;
    @XmlElement(required = true)
    protected String generalMessage;
    protected List<ItemDetailResEntMtInternalType> detailResEntMt;

    /**
     * Gets the value of the generalCode property.
     * 
     */
    public int getGeneralCode() {
        return generalCode;
    }

    /**
     * Sets the value of the generalCode property.
     * 
     */
    public void setGeneralCode(int value) {
        this.generalCode = value;
    }

    /**
     * Gets the value of the generalMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralMessage() {
        return generalMessage;
    }

    /**
     * Sets the value of the generalMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralMessage(String value) {
        this.generalMessage = value;
    }

    /**
     * Gets the value of the detailResEntMt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailResEntMt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailResEntMt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemDetailResEntMtInternalType }
     * 
     * 
     */
    public List<ItemDetailResEntMtInternalType> getDetailResEntMt() {
        if (detailResEntMt == null) {
            detailResEntMt = new ArrayList<ItemDetailResEntMtInternalType>();
        }
        return this.detailResEntMt;
    }

}
