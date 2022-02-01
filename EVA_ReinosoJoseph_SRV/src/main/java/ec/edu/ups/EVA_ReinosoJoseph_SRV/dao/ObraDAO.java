package ec.edu.ups.EVA_ReinosoJoseph_SRV.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.EVA_ReinosoJoseph_SRV.model.ObrasArte;

@Stateless
public class ObraDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void insert(ObrasArte op) {
		em.persist(op);
	}
	
	public void update(ObrasArte op) {
		em.merge(op);
	}
	
	public ObrasArte read(int id) {
		ObrasArte op = em.find(ObrasArte.class, id);
		return op;
	}
	
	public void delete(int id) {
		ObrasArte op = em.find(ObrasArte.class, id);
		em.remove(op);
	}
	
	public List<ObrasArte> getList(){
		List<ObrasArte> listado = new ArrayList<ObrasArte>();
		
		String jpql = "SELECT op FROM ObrasArte op";
		Query query = em.createQuery(jpql, ObrasArte.class);
		
		listado = query.getResultList();
		
		
		return listado;
	}
	
}
