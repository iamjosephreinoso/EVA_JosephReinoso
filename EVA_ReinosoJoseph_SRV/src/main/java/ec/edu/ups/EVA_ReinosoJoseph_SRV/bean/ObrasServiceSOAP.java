package ec.edu.ups.EVA_ReinosoJoseph_SRV.bean;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.edu.ups.EVA_ReinosoJoseph_SRV.busines.ObraONLocal;
import ec.edu.ups.EVA_ReinosoJoseph_SRV.model.ObrasArte;


@WebService
public class ObrasServiceSOAP {
	
	@Inject
	private ObraONLocal obrasON;
	
	
	@WebMethod
	public String crearObra(ObrasArte obra) {
		try {
			obrasON.insertar(obra);
			return "Ok";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Error";
		}
	}
	
	@WebMethod
	public List<ObrasArte> getObras(){
		
		return obrasON.getObras();
	}
}
