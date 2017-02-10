package services.createPerson;

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

    private final static QName _CreatePersonRequest_QNAME = new QName("http://services.webservice.com/", "createPersonRequest");
    private final static QName _PersonCreate_QNAME = new QName("http://services.webservice.com/", "personCreate");
    private final static QName _PersonCreateResponse_QNAME = new QName("http://services.webservice.com/", "personCreateResponse");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://services.webservice.com/", "createPersonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webservice.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link CreatePersonRequest }
     * 
     */
    public CreatePersonRequest createCreatePersonRequest() {
        return new CreatePersonRequest();
    }

    /**
     * Create an instance of {@link PersonCreate }
     * 
     */
    public PersonCreate createPersonCreate() {
        return new PersonCreate();
    }

    /**
     * Create an instance of {@link PersonCreateResponse }
     * 
     */
    public PersonCreateResponse createPersonCreateResponse() {
        return new PersonCreateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.com/", name = "createPersonRequest")
    public JAXBElement<CreatePersonRequest> createCreatePersonRequest(CreatePersonRequest value) {
        return new JAXBElement<CreatePersonRequest>(_CreatePersonRequest_QNAME, CreatePersonRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonCreate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.com/", name = "personCreate")
    public JAXBElement<PersonCreate> createPersonCreate(PersonCreate value) {
        return new JAXBElement<PersonCreate>(_PersonCreate_QNAME, PersonCreate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonCreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.com/", name = "personCreateResponse")
    public JAXBElement<PersonCreateResponse> createPersonCreateResponse(PersonCreateResponse value) {
        return new JAXBElement<PersonCreateResponse>(_PersonCreateResponse_QNAME, PersonCreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.com/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

}
