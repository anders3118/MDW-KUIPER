//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.09.09 a las 12:52:52 PM COT 
//


package com.kuiper.mbs601.mel.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.example.org/MessageServices}requestMessage"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestMessage"
})
@XmlRootElement(name = "messageRQ")
public class MessageRQ {

    @XmlElement(required = true)
    protected RequestMessageType requestMessage;

    /**
     * Obtiene el valor de la propiedad requestMessage.
     * 
     * @return
     *     possible object is
     *     {@link RequestMessageType }
     *     
     */
    public RequestMessageType getRequestMessage() {
        return requestMessage;
    }

    /**
     * Define el valor de la propiedad requestMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestMessageType }
     *     
     */
    public void setRequestMessage(RequestMessageType value) {
        this.requestMessage = value;
    }

}
