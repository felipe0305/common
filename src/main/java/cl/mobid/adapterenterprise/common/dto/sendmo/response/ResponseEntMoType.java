
package cl.mobid.adapterenterprise.common.dto.sendmo.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseEntMoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseEntMoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="generalCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="generalMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="detailResEntMo" type="{http://www.mobid.cl/adapter/adapterbroxel/dto/sendmo/response}itemDetailResEntMoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseEntMoType", propOrder = {
    "generalCode",
    "generalMessage",
    "detailResEntMo"
})
public class ResponseEntMoType {

    protected int generalCode;
    @XmlElement(required = true)
    protected String generalMessage;
    protected List<ItemDetailResEntMoType> detailResEntMo;

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
     * Gets the value of the detailResEntMo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailResEntMo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailResEntMo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemDetailResEntMoType }
     * 
     * 
     */
    public List<ItemDetailResEntMoType> getDetailResEntMo() {
        if (detailResEntMo == null) {
            detailResEntMo = new ArrayList<ItemDetailResEntMoType>();
        }
        return this.detailResEntMo;
    }

}
