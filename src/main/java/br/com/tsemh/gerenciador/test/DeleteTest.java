package br.com.tsemh.gerenciador.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tsemh.gerenciador.entity.Ficha;
import br.com.tsemh.gerenciador.entity.Usuario;

public class DeleteTest {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("gerenciador");
		EntityManager em = fabrica.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 1);
		em.remove(usuario);
		
		Ficha ficha = em.find(Ficha.class, 1);
		em.remove(ficha);
		
		try {
		em.getTransaction().begin();
		em.getTransaction().commit();
		}catch(Exception e) {
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		} 
		
		em.close();
		fabrica.close();
	}

}
