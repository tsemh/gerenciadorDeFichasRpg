package br.com.tsemh.gerenciador.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tsemh.gerenciador.entity.Ficha;
import br.com.tsemh.gerenciador.entity.Usuario;

public class SetTest {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("gerenciador");
		EntityManager em = fabrica.createEntityManager();
		
		Usuario usuario = new Usuario();
		usuario.setNomeUsuario("UsuarioTeste01");
		
		Ficha ficha = new Ficha();
		ficha.setNomeFicha("FichaTeste01");
		
		try {
		em.persist(usuario);
		em.persist(ficha);
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
