
package cl.mobid.adapterenterprise.common.dto.statusmt.request;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestEntStatusMtType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestEntStatusMtType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detailReqEntStatusMt" type="{http://www.mobid.cl/adapter/adaptersaesa/dto/statusmt/enterprise/request}itemReqEntStatusMtType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestEntStatusMtType", propOrder = {
    "detailReqEntStatusMt"
})
public class RequestEntStatusMtType {

    protected List<ItemReqEntStatusMtType> detailReqEntStatusMt;

    /**
     * Gets the value of the detailReqEntStatusMt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailReqEntStatusMt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailReqEntStatusMt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemReqEntStatusMtType }
     * 
     * 
     */
    public List<ItemReqEntStatusMtType> getDetailReqEntStatusMt() {
        if (detailReqEntStatusMt == null) {
            detailReqEntStatusMt = new ArrayList<ItemReqEntStatusMtType>();
        }
        return this.detailReqEntStatusMt;
    }

}
