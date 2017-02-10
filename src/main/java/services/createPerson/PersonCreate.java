package services.createPerson;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for personCreate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personCreate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createPersonRequest" type="{http://services.webservice.com/}createPersonRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personCreate1", propOrder = {
    "createPersonRequest"
})
public class PersonCreate {

    @XmlElement(required = true)
    protected CreatePersonRequest createPersonRequest;

    /**
     * Gets the value of the createPersonRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CreatePersonRequest }
     *     
     */
    public CreatePersonRequest getCreatePersonRequest() {
        return createPersonRequest;
    }

    /**
     * Sets the value of the createPersonRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreatePersonRequest }
     *     
     */
    public void setCreatePersonRequest(CreatePersonRequest value) {
        this.createPersonRequest = value;
    }

}
