package dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Engajador;
import model.Postagem;
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

	@Override
	public ArrayList<Engajador> getUsers() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return true;
	}

}
