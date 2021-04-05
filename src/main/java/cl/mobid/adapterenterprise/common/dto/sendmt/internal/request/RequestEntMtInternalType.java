
package cl.mobid.adapterenterprise.common.dto.sendmt.internal.request;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestEntMtInternalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestEntMtInternalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="detailReqEntMt" type="{http://www.mobid.cl/adapter/common/dto/sendsms/request}itemDetailReqEntMtInternalType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestEntMtInternalType", propOrder = {
    "token",
    "detailReqEntMt"
})
public class RequestEntMtInternalType {

    @XmlElement(required = true)
    protected String token;
    protected List<ItemDetailReqEntMtInternalType> detailReqEntMt;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the detailReqEntMt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailReqEntMt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailReqEntMt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemDetailReqEntMtInternalType }
     * 
     * 
     */
    public List<ItemDetailReqEntMtInternalType> getDetailReqEntMt() {
        if (detailReqEntMt == null) {
            detailReqEntMt = new ArrayList<ItemDetailReqEntMtInternalType>();
        }
        return this.detailReqEntMt;
    }

}
