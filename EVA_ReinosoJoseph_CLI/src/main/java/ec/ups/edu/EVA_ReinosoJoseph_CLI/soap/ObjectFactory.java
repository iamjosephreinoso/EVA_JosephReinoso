
package ec.ups.edu.EVA_ReinosoJoseph_CLI.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.ups.edu.EVA_ReinosoJoseph_CLI.soap package. 
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

    private final static QName _CrearObra_QNAME = new QName("http://bean.EVA_ReinosoJoseph_SRV.ups.edu.ec/", "crearObra");
    private final static QName _CrearObraResponse_QNAME = new QName("http://bean.EVA_ReinosoJoseph_SRV.ups.edu.ec/", "crearObraResponse");
    private final static QName _GetObras_QNAME = new QName("http://bean.EVA_ReinosoJoseph_SRV.ups.edu.ec/", "getObras");
    private final static QName _GetObrasResponse_QNAME = new QName("http://bean.EVA_ReinosoJoseph_SRV.ups.edu.ec/", "getObrasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.ups.edu.EVA_ReinosoJoseph_CLI.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearObra }
     * 
     */
    public CrearObra createCrearObra() {
        return new CrearObra();
    }

    /**
     * Create an instance of {@link CrearObraResponse }
     * 
     */
    public CrearObraResponse createCrearObraResponse() {
        return new CrearObraResponse();
    }

    /**
     * Create an instance of {@link GetObras }
     * 
     */
    public GetObras createGetObras() {
        return new GetObras();
    }

    /**
     * Create an instance of {@link GetObrasResponse }
     * 
     */
    public GetObrasResponse createGetObrasResponse() {
        return new GetObrasResponse();
    }

    /**
     * Create an instance of {@link ObrasArte }
     * 
     */
    public ObrasArte createObrasArte() {
        return new ObrasArte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearObra }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearObra }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.EVA_ReinosoJoseph_SRV.ups.edu.ec/", name = "crearObra")
    public JAXBElement<CrearObra> createCrearObra(CrearObra value) {
        return new JAXBElement<CrearObra>(_CrearObra_QNAME, CrearObra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearObraResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearObraResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.EVA_ReinosoJoseph_SRV.ups.edu.ec/", name = "crearObraResponse")
    public JAXBElement<CrearObraResponse> createCrearObraResponse(CrearObraResponse value) {
        return new JAXBElement<CrearObraResponse>(_CrearObraResponse_QNAME, CrearObraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObras }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetObras }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.EVA_ReinosoJoseph_SRV.ups.edu.ec/", name = "getObras")
    public JAXBElement<GetObras> createGetObras(GetObras value) {
        return new JAXBElement<GetObras>(_GetObras_QNAME, GetObras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObrasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetObrasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.EVA_ReinosoJoseph_SRV.ups.edu.ec/", name = "getObrasResponse")
    public JAXBElement<GetObrasResponse> createGetObrasResponse(GetObrasResponse value) {
        return new JAXBElement<GetObrasResponse>(_GetObrasResponse_QNAME, GetObrasResponse.class, null, value);
    }

}
