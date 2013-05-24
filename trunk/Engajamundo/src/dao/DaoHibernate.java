package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Postagem;
import entities.Engajador;
import exceptions.DaoException;

public class DaoHibernate implements IDAOEngajador {
	
	public DaoHibernate(){
		
	}
	
	public void cadastrarEngajador(Engajador engajador) throws DaoException {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(engajador);
		em.getTransaction().commit();	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Engajador> getUsers() {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();

		String query = "select f from Engajador f";

		return em.createQuery(query).getResultList();

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
