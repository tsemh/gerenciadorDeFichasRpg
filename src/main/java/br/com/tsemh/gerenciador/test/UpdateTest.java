package br.com.tsemh.gerenciador.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tsemh.gerenciador.entity.Ficha;
import br.com.tsemh.gerenciador.entity.Usuario;

public class UpdateTest {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("gerenciador");
		EntityManager em = fabrica.createEntityManager();
		
		Usuario usuario = new Usuario(1, "UsuarioTesteUpdate01", null, null, null);
		Ficha ficha = new Ficha(1, usuario, "FichaTesteUpdate01", null, null);
		
		em.merge(usuario);
		em.merge(ficha);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		System.out.println(usuario.getIdUsuario() + " " + usuario.getNomeUsuario());
		System.out.println(ficha.getIdFicha() + " " + ficha.getNomeFicha());
		
		em.close();
		fabrica.close();
	}

}
