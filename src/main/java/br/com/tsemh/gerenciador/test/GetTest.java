package br.com.tsemh.gerenciador.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tsemh.gerenciador.entity.Ficha;
import br.com.tsemh.gerenciador.entity.Usuario;

public class GetTest {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("gerenciador");
		EntityManager em = fabrica.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 1);
		Ficha ficha = em.find(Ficha.class, 1);
		
		System.out.println(usuario.getIdUsuario() + " " + usuario.getNomeUsuario());
		System.out.println(ficha.getIdFicha() + " " + ficha.getNomeFicha());
		
		em.close();
		fabrica.close();
	}

}
