package ec.ups.edu.EVA_ReinosoJoseph_CLI.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-02-01T11:55:50.991-05:00
 * Generated source version: 3.5.0
 *
 */
@WebServiceClient(name = "ObrasServiceSOAPService",
                  wsdlLocation = "http://localhost:8080/EVA_ReinosoJoseph_SRV/ObrasServiceSOAP?WSDL",
                  targetNamespace = "http://bean.EVA_ReinosoJoseph_SRV.ups.edu.ec/")
public class ObrasServiceSOAPService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://bean.EVA_ReinosoJoseph_SRV.ups.edu.ec/", "ObrasServiceSOAPService");
    public final static QName ObrasServiceSOAPPort = new QName("http://bean.EVA_ReinosoJoseph_SRV.ups.edu.ec/", "ObrasServiceSOAPPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/EVA_ReinosoJoseph_SRV/ObrasServiceSOAP?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ObrasServiceSOAPService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/EVA_ReinosoJoseph_SRV/ObrasServiceSOAP?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public ObrasServiceSOAPService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ObrasServiceSOAPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ObrasServiceSOAPService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ObrasServiceSOAPService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ObrasServiceSOAPService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ObrasServiceSOAPService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ObrasServiceSOAP
     */
    @WebEndpoint(name = "ObrasServiceSOAPPort")
    public ObrasServiceSOAP getObrasServiceSOAPPort() {
        return super.getPort(ObrasServiceSOAPPort, ObrasServiceSOAP.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ObrasServiceSOAP
     */
    @WebEndpoint(name = "ObrasServiceSOAPPort")
    public ObrasServiceSOAP getObrasServiceSOAPPort(WebServiceFeature... features) {
        return super.getPort(ObrasServiceSOAPPort, ObrasServiceSOAP.class, features);
    }

}
