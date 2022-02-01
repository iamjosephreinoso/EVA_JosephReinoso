package ec.edu.ups.EVA_ReinosoJoseph_SRV.busines;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.EVA_ReinosoJoseph_SRV.dao.ObraDAO;
import ec.edu.ups.EVA_ReinosoJoseph_SRV.model.ObrasArte;

@Stateless
public class ObraON implements ObraONRemote, ObraONLocal {

	@Inject
	private ObraDAO daoObra;
	public void insertar(ObrasArte op) throws Exception {
		daoObra.insert(op);
	}
	

	public List<ObrasArte> getObras(){
		return daoObra.getList();
	}

}
