package testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entities.Produto;

public class TestaInsereProduto {
	
	public static void main(String[] args) {
		
		 try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	 
		
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("engajamundoDB");
		EntityManager em = factory.createEntityManager();
		Produto p = new Produto();
		p.setNome("camiseta");
		p.setPreco(12);
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}
}