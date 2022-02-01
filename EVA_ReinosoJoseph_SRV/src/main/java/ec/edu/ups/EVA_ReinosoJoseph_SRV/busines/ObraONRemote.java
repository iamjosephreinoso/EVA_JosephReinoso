package ec.edu.ups.EVA_ReinosoJoseph_SRV.busines;

import java.util.List;

import javax.ejb.Remote;

import ec.edu.ups.EVA_ReinosoJoseph_SRV.model.ObrasArte;

@Remote
public interface ObraONRemote {
	public void insertar(ObrasArte o) throws Exception;
	public List<ObrasArte> getObras();
}
