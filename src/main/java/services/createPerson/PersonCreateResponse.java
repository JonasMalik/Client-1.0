package services.createPerson;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for personCreateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personCreateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createPersonResponse" type="{http://services.webservice.com/}createPersonResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personCreateResponse1", propOrder = {
    "createPersonResponse"
})
public class PersonCreateResponse {

    @XmlElement(required = true)
    protected CreatePersonResponse createPersonResponse;

    /**
     * Gets the value of the createPersonResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CreatePersonResponse }
     *     
     */
    public CreatePersonResponse getCreatePersonResponse() {
        return createPersonResponse;
    }

    /**
     * Sets the value of the createPersonResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreatePersonResponse }
     *     
     */
    public void setCreatePersonResponse(CreatePersonResponse value) {
        this.createPersonResponse = value;
    }

}
