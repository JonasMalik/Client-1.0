
package services.searchPerson;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createSearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchResponse" type="{http://services.webservice.com/}searchResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createSearchResponse1", propOrder = {
    "searchResponse"
})
public class CreateSearchResponse {

    @XmlElement(required = true)
    protected SearchResponse searchResponse;

    /**
     * Gets the value of the searchResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SearchResponse }
     *     
     */
    public SearchResponse getSearchResponse() {
        return searchResponse;
    }

    /**
     * Sets the value of the searchResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResponse }
     *     
     */
    public void setSearchResponse(SearchResponse value) {
        this.searchResponse = value;
    }

}
