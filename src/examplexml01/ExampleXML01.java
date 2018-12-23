
package examplexml01;

import com.manager.*;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author miguel
 */
public class ExampleXML01 
{

    public static void main(String[] args) throws JAXBException
    {
        // TODO code application logic here
        xmlManager();
    }
    
    public static void xmlManager() throws JAXBException
    {
        Short valor = 1;
        ObjectFactory factory = new ObjectFactory();
        
        //declaramos el nodo transaccion
        Transaccion transa = factory.createTransaccion();
        //declaramos todos los atributos del nodo transaccion
        transa.setIdServicio(23);
        transa.setReferencia("REF000964");
        transa.setCantidad(1);
        transa.setImporte(350);
        transa.setTotal(350);
        transa.setTipoPago(valor);
        transa.setAbono(false);
        
        //declaramos el subnodo dato
        Dato dato = factory.createDato();
        //decalramos todos los atributos de dato
        dato.setNombre("Cuenta");
        dato.setDescripcion("ERDD345");
        
        //declaramos el subnodo datos
        Datos datos = factory.createDatos();
        //metemos tos subnodos dato decalrados anteriormente dentro del subnodo datos
        datos.getDato().add(dato);
        
        //decalramos el subnodo concepto
        Concepto concepto = factory.createConcepto();
        //declaramos lso valores de cada subnodo concepto
        concepto.setDescripcion("Pago de acta de nacimiento");
        concepto.setImporte(350);
        
        //declarar el nodo conceptos
        Conceptos conceptos = factory.createConceptos();
        //agregamos los conceptos creados
        conceptos.setQty(false);
        conceptos.getConcepto().add(concepto);
        
        //decalramos el nodo ticket
        Ticket ticket = factory.createTicket();
        //agregamos todos los subnodos dentro de ticket
        ticket.setTitulo("Recibo Oficial");
        ticket.setDatos(datos);
        ticket.setConceptos(conceptos);
        
        //declaramos el nodo sript
        Script script = factory.createScript();
        //decalramso los atributos del nodo script
        script.setUrl("http://localhost/demo/registraPago?num=1&amp;id=200");
        
        //declaramos el oso documento
        Documento documento = factory.createDocumento();
        //decalramos el atributo de documento
        documento.setUrl("http://localhost/demo/registraPago?num=1&amp;id=200");
        
        //declaramos el nodo raiz
        ManagerMensaje msg = factory.createManagerMensaje();
        //agregamos los nodos a la raiz
        msg.setComando("Cobrar");
        msg.setTransaccion(transa);
        msg.setTicket(ticket);
        msg.setScript(script);
        msg.setDocumento(documento);
        
        //generamos el XML
        JAXBContext ctx = JAXBContext.newInstance("com.manager");   //ubicación de los paquetes
        Marshaller marshaller = ctx.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); //configuramso el formato a XML de lo contrario saldrá lineal
        marshaller.marshal(msg, new File("XML/vending.xml"));
    }
    
}
