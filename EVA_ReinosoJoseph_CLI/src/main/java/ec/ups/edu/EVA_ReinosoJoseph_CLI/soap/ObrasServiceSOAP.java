package ec.ups.edu.EVA_ReinosoJoseph_CLI.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-02-01T11:55:50.966-05:00
 * Generated source version: 3.5.0
 *
 */
@WebService(targetNamespace = "http://bean.EVA_ReinosoJoseph_SRV.ups.edu.ec/", name = "ObrasServiceSOAP")
@XmlSeeAlso({ObjectFactory.class})
public interface ObrasServiceSOAP {

    @WebMethod
    @RequestWrapper(localName = "getObras", targetNamespace = "http://bean.EVA_ReinosoJoseph_SRV.ups.edu.ec/", className = "ec.ups.edu.EVA_ReinosoJoseph_CLI.soap.GetObras")
    @ResponseWrapper(localName = "getObrasResponse", targetNamespace = "http://bean.EVA_ReinosoJoseph_SRV.ups.edu.ec/", className = "ec.ups.edu.EVA_ReinosoJoseph_CLI.soap.GetObrasResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<ec.ups.edu.EVA_ReinosoJoseph_CLI.soap.ObrasArte> getObras()
;

    @WebMethod
    @RequestWrapper(localName = "crearObra", targetNamespace = "http://bean.EVA_ReinosoJoseph_SRV.ups.edu.ec/", className = "ec.ups.edu.EVA_ReinosoJoseph_CLI.soap.CrearObra")
    @ResponseWrapper(localName = "crearObraResponse", targetNamespace = "http://bean.EVA_ReinosoJoseph_SRV.ups.edu.ec/", className = "ec.ups.edu.EVA_ReinosoJoseph_CLI.soap.CrearObraResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String crearObra(

        @WebParam(name = "arg0", targetNamespace = "")
        ec.ups.edu.EVA_ReinosoJoseph_CLI.soap.ObrasArte arg0
    );
}
