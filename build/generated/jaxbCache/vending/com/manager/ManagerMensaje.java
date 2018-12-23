//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.11.05 a las 06:16:49 PM CST 
//


package com.manager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}Transaccion"/>
 *         &lt;element ref="{}Ticket"/>
 *         &lt;element ref="{}Script" minOccurs="0"/>
 *         &lt;element ref="{}Documento" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="comando" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="(consultar|cobrar)"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transaccion",
    "ticket",
    "script",
    "documento"
})
@XmlRootElement(name = "ManagerMensaje")
public class ManagerMensaje {

    @XmlElement(name = "Transaccion", required = true)
    protected Transaccion transaccion;
    @XmlElement(name = "Ticket", required = true)
    protected Ticket ticket;
    @XmlElement(name = "Script")
    protected Script script;
    @XmlElement(name = "Documento")
    protected Documento documento;
    @XmlAttribute(name = "comando", required = true)
    protected String comando;

    /**
     * Obtiene el valor de la propiedad transaccion.
     * 
     * @return
     *     possible object is
     *     {@link Transaccion }
     *     
     */
    public Transaccion getTransaccion() {
        return transaccion;
    }

    /**
     * Define el valor de la propiedad transaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaccion }
     *     
     */
    public void setTransaccion(Transaccion value) {
        this.transaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad ticket.
     * 
     * @return
     *     possible object is
     *     {@link Ticket }
     *     
     */
    public Ticket getTicket() {
        return ticket;
    }

    /**
     * Define el valor de la propiedad ticket.
     * 
     * @param value
     *     allowed object is
     *     {@link Ticket }
     *     
     */
    public void setTicket(Ticket value) {
        this.ticket = value;
    }

    /**
     * Obtiene el valor de la propiedad script.
     * 
     * @return
     *     possible object is
     *     {@link Script }
     *     
     */
    public Script getScript() {
        return script;
    }

    /**
     * Define el valor de la propiedad script.
     * 
     * @param value
     *     allowed object is
     *     {@link Script }
     *     
     */
    public void setScript(Script value) {
        this.script = value;
    }

    /**
     * Obtiene el valor de la propiedad documento.
     * 
     * @return
     *     possible object is
     *     {@link Documento }
     *     
     */
    public Documento getDocumento() {
        return documento;
    }

    /**
     * Define el valor de la propiedad documento.
     * 
     * @param value
     *     allowed object is
     *     {@link Documento }
     *     
     */
    public void setDocumento(Documento value) {
        this.documento = value;
    }

    /**
     * Obtiene el valor de la propiedad comando.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComando() {
        return comando;
    }

    /**
     * Define el valor de la propiedad comando.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComando(String value) {
        this.comando = value;
    }

}
