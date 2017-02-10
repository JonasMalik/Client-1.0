
package services.searchPerson;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webservice.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateSearch_QNAME = new QName("http://services.webservice.com/", "createSearch");
    private final static QName _SearchRequest_QNAME = new QName("http://services.webservice.com/", "searchRequest");
    private final static QName _CreateSearchResponse_QNAME = new QName("http://services.webservice.com/", "createSearchResponse");
    private final static QName _SearchResponse_QNAME = new QName("http://services.webservice.com/", "searchResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webservice.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchRequest }
     * 
     */
    public SearchRequest createSearchRequest() {
        return new SearchRequest();
    }

    /**
     * Create an instance of {@link CreateSearchResponse }
     * 
     */
    public CreateSearchResponse createCreateSearchResponse() {
        return new CreateSearchResponse();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link CreateSearch }
     * 
     */
    public CreateSearch createCreateSearch() {
        return new CreateSearch();
    }

    /**
     * Create an instance of {@link PersonResponse }
     * 
     */
    public PersonResponse createPersonResponse() {
        return new PersonResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.com/", name = "createSearch")
    public JAXBElement<CreateSearch> createCreateSearch(CreateSearch value) {
        return new JAXBElement<CreateSearch>(_CreateSearch_QNAME, CreateSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.com/", name = "searchRequest")
    public JAXBElement<SearchRequest> createSearchRequest(SearchRequest value) {
        return new JAXBElement<SearchRequest>(_SearchRequest_QNAME, SearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.com/", name = "createSearchResponse")
    public JAXBElement<CreateSearchResponse> createCreateSearchResponse(CreateSearchResponse value) {
        return new JAXBElement<CreateSearchResponse>(_CreateSearchResponse_QNAME, CreateSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.com/", name = "searchResponse")
    public JAXBElement<SearchResponse> createSearchResponse(SearchResponse value) {
        return new JAXBElement<SearchResponse>(_SearchResponse_QNAME, SearchResponse.class, null, value);
    }

}
