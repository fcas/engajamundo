package testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entities.Produto;

public class TestaInsereProduto {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();
		Produto p = new Produto();
		p.setNome("camisetaa");
		p.setPreco(12);
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}
}