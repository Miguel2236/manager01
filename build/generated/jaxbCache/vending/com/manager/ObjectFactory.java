//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.11.05 a las 06:16:49 PM CST 
//


package com.manager;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.manager package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.manager
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Conceptos }
     * 
     */
    public Conceptos createConceptos() {
        return new Conceptos();
    }

    /**
     * Create an instance of {@link Concepto }
     * 
     */
    public Concepto createConcepto() {
        return new Concepto();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link Datos }
     * 
     */
    public Datos createDatos() {
        return new Datos();
    }

    /**
     * Create an instance of {@link Dato }
     * 
     */
    public Dato createDato() {
        return new Dato();
    }

    /**
     * Create an instance of {@link Script }
     * 
     */
    public Script createScript() {
        return new Script();
    }

    /**
     * Create an instance of {@link ManagerMensaje }
     * 
     */
    public ManagerMensaje createManagerMensaje() {
        return new ManagerMensaje();
    }

    /**
     * Create an instance of {@link Transaccion }
     * 
     */
    public Transaccion createTransaccion() {
        return new Transaccion();
    }

    /**
     * Create an instance of {@link Documento }
     * 
     */
    public Documento createDocumento() {
        return new Documento();
    }

}
