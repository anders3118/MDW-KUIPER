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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para requestBodyType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="requestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employed" type="{http://www.example.org/MessageServices}EmployedType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestBodyType", propOrder = {
    "employed"
})
public class RequestBodyType {

    @XmlElement(required = true)
    protected EmployedType employed;

    /**
     * Obtiene el valor de la propiedad employed.
     * 
     * @return
     *     possible object is
     *     {@link EmployedType }
     *     
     */
    public EmployedType getEmployed() {
        return employed;
    }

    /**
     * Define el valor de la propiedad employed.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployedType }
     *     
     */
    public void setEmployed(EmployedType value) {
        this.employed = value;
    }

}
