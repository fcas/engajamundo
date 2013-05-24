package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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

	@SuppressWarnings("unchecked")
	@Override
	public List<Engajador> buscarEngajador(String nome)
			throws DaoException {
		
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();

		Query query = em.createQuery("select f from Engajador f where nome = :nome");
		query.setParameter("nome", nome);
 
        return query.getResultList();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Engajador> buscarEngajadorPorPais(String pais)
			throws DaoException {
		
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();

		Query query = em.createQuery("select f from Engajador f where pais = :pais");
		query.setParameter("pais", pais);
 
        return query.getResultList();
	}

	@Override
	public void savePost(Postagem post) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Engajador autenticar(String login, String senha) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();

		Query query = em
				.createQuery("select f from Engajador f where login = :login and senha = :senha");
		query.setParameter("login", login);
		query.setParameter("senha", senha);
		
		return (Engajador) query.getSingleResult();
		
	}

	@Override
	public boolean existeLogin(String login) {
	
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();

		Query query = em
				.createQuery("select f from Engajador f where login = :login");
		query.setParameter("login", login);

		if (query.getResultList().isEmpty()) {
			return false;
		} else return true;
	}

}
