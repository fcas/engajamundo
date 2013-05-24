package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
	
import model.Postagem;
import entities.Engajador;
import exceptions.DaoException;

public class DaoHibernate implements IDAOEngajador {
	
	EntityManager em;
	
	public DaoHibernate(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("engajamundoDB");
		em = factory.createEntityManager();
	}
	
	public void cadastrarEngajador(Engajador engajador) throws DaoException {
		em.getTransaction().begin();
		em.persist(engajador);
		em.getTransaction().commit();	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Engajador> getUsers() {
		 Query query = em.createNativeQuery("select d from Dog d", Engajador.class);
		 
		 for (int i = 0; i < query.getResultList().size(); i++) {
			System.out.println(query.getResultList().get(i));
		}
		 
	        return query.getResultList();
	
	}

	@Override
	public void saveUsers(ArrayList<Engajador> usuarios) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Engajador> buscarEngajador(String query)
			throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Engajador> buscarEngajadorPorPais(String query)
			throws DaoException {
		return null;
	}

	@Override
	public void savePost(Postagem post) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Engajador autenticar(String login, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existeLogin(String login) {
	
		return true;
	}

}
