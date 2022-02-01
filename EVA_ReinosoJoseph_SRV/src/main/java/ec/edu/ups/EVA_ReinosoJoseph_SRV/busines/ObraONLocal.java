package ec.edu.ups.EVA_ReinosoJoseph_SRV.busines;

import java.util.List;

import javax.ejb.Local;

import ec.edu.ups.EVA_ReinosoJoseph_SRV.model.ObrasArte;

@Local
public interface ObraONLocal {
	public void insertar(ObrasArte o) throws Exception;
	public List<ObrasArte> getObras();

}
