//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.09.09 a las 12:52:52 PM COT 
//


package com.kuiper.mbs601.mel.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.kuiper.mbs601.model package. 
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

    private final static QName _RequestMessage_QNAME = new QName("http://www.example.org/MessageServices", "requestMessage");
    private final static QName _ResponseMessage_QNAME = new QName("http://www.example.org/MessageServices", "responseMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.kuiper.mbs601.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestMessageType }
     * 
     */
    public RequestMessageType createRequestMessageType() {
        return new RequestMessageType();
    }

    /**
     * Create an instance of {@link MessageRS }
     * 
     */
    public MessageRS createMessageRS() {
        return new MessageRS();
    }

    /**
     * Create an instance of {@link ResponseMessageType }
     * 
     */
    public ResponseMessageType createResponseMessageType() {
        return new ResponseMessageType();
    }

    /**
     * Create an instance of {@link MessageRQ }
     * 
     */
    public MessageRQ createMessageRQ() {
        return new MessageRQ();
    }

    /**
     * Create an instance of {@link RequestBodyType }
     * 
     */
    public RequestBodyType createRequestBodyType() {
        return new RequestBodyType();
    }

    /**
     * Create an instance of {@link ResponseBodyType }
     * 
     */
    public ResponseBodyType createResponseBodyType() {
        return new ResponseBodyType();
    }

    /**
     * Create an instance of {@link ResponseHeaderType }
     * 
     */
    public ResponseHeaderType createResponseHeaderType() {
        return new ResponseHeaderType();
    }

    /**
     * Create an instance of {@link RequestHeaderType }
     * 
     */
    public RequestHeaderType createRequestHeaderType() {
        return new RequestHeaderType();
    }

    /**
     * Create an instance of {@link EmployedType }
     * 
     */
    public EmployedType createEmployedType() {
        return new EmployedType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/MessageServices", name = "requestMessage")
    public JAXBElement<RequestMessageType> createRequestMessage(RequestMessageType value) {
        return new JAXBElement<RequestMessageType>(_RequestMessage_QNAME, RequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/MessageServices", name = "responseMessage")
    public JAXBElement<ResponseMessageType> createResponseMessage(ResponseMessageType value) {
        return new JAXBElement<ResponseMessageType>(_ResponseMessage_QNAME, ResponseMessageType.class, null, value);
    }

}
