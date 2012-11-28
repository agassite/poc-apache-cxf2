
package com.ideo.poc.cxf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ideo.poc.cxf package. 
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

    private final static QName _AdditionResponse_QNAME = new QName("http://cxf.poc.ideo.com/", "additionResponse");
    private final static QName _AdditionRequest_QNAME = new QName("http://cxf.poc.ideo.com/", "additionRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ideo.poc.cxf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AdditionRequest }
     * 
     */
    public AdditionRequest createAdditionRequest() {
        return new AdditionRequest();
    }

    /**
     * Create an instance of {@link AdditionResponse }
     * 
     */
    public AdditionResponse createAdditionResponse() {
        return new AdditionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.poc.ideo.com/", name = "additionResponse")
    public JAXBElement<AdditionResponse> createAdditionResponse(AdditionResponse value) {
        return new JAXBElement<AdditionResponse>(_AdditionResponse_QNAME, AdditionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.poc.ideo.com/", name = "additionRequest")
    public JAXBElement<AdditionRequest> createAdditionRequest(AdditionRequest value) {
        return new JAXBElement<AdditionRequest>(_AdditionRequest_QNAME, AdditionRequest.class, null, value);
    }

}
