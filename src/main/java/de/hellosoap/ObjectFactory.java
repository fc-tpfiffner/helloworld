//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.10.25 um 05:26:31 PM CEST 
//


package de.hellosoap;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.hellosoap package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.hellosoap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetGrueziResponse }
     * 
     */
    public GetGrueziResponse createGetGrueziResponse() {
        return new GetGrueziResponse();
    }

    /**
     * Create an instance of {@link Gruezi }
     * 
     */
    public Gruezi createGruezi() {
        return new Gruezi();
    }

    /**
     * Create an instance of {@link GetGrueziRequest }
     * 
     */
    public GetGrueziRequest createGetGrueziRequest() {
        return new GetGrueziRequest();
    }

}
