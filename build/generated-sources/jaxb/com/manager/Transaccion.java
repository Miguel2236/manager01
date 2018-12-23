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
 *       &lt;attribute name="abono" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="cantidad" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="idServicio" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="importe" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="referencia" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tipoPago" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *             &lt;minInclusive value="1"/>
 *             &lt;totalDigits value="1"/>
 *             &lt;pattern value="[\-+]?[1-6]+"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="total" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Transaccion")
public class Transaccion {

    @XmlAttribute(name = "abono", required = true)
    protected boolean abono;
    @XmlAttribute(name = "cantidad", required = true)
    protected int cantidad;
    @XmlAttribute(name = "idServicio", required = true)
    protected int idServicio;
    @XmlAttribute(name = "importe", required = true)
    protected double importe;
    @XmlAttribute(name = "referencia", required = true)
    protected String referencia;
    @XmlAttribute(name = "tipoPago", required = true)
    protected short tipoPago;
    @XmlAttribute(name = "total", required = true)
    protected double total;

    /**
     * Obtiene el valor de la propiedad abono.
     * 
     */
    public boolean isAbono() {
        return abono;
    }

    /**
     * Define el valor de la propiedad abono.
     * 
     */
    public void setAbono(boolean value) {
        this.abono = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad idServicio.
     * 
     */
    public int getIdServicio() {
        return idServicio;
    }

    /**
     * Define el valor de la propiedad idServicio.
     * 
     */
    public void setIdServicio(int value) {
        this.idServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     */
    public double getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     */
    public void setImporte(double value) {
        this.importe = value;
    }

    /**
     * Obtiene el valor de la propiedad referencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Define el valor de la propiedad referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia(String value) {
        this.referencia = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPago.
     * 
     */
    public short getTipoPago() {
        return tipoPago;
    }

    /**
     * Define el valor de la propiedad tipoPago.
     * 
     */
    public void setTipoPago(short value) {
        this.tipoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     */
    public double getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     */
    public void setTotal(double value) {
        this.total = value;
    }

}
