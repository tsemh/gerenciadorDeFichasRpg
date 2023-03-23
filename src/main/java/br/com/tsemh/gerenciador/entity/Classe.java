package br.com.tsemh.gerenciador.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_classe")
public class Classe {

	@Id
	@Column(name="id_classe")
	@SequenceGenerator(name="classe", sequenceName="sq_tb_classe", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="classe")
	private int idClasse;
	
	@Column(name="nm_classe")
	private String nomeClasse;
	
	@Column(name="ds_classe")
	private String descricaoClasse;
	
	@ManyToMany()
	@JoinTable(name="classe_personagem", joinColumns = @JoinColumn(name = "id_classe"), inverseJoinColumns = @JoinColumn(name = "id_personagem"))
	private Collection<Personagem> personagens;

	public Classe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Classe(int idClasse, String nomeClasse, String descricaoClasse, Collection<Personagem> personagens) {
		super();
		this.idClasse = idClasse;
		this.nomeClasse = nomeClasse;
		this.descricaoClasse = descricaoClasse;
		this.personagens = personagens;
	}

	public int getIdClasse() {
		return idClasse;
	}

	public void setIdClasse(int idClasse) {
		this.idClasse = idClasse;
	}

	public String getNomeClasse() {
		return nomeClasse;
	}

	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}

	public String getDescricaoClasse() {
		return descricaoClasse;
	}

	public void setDescricaoClasse(String descricaoClasse) {
		this.descricaoClasse = descricaoClasse;
	}

	public Collection<Personagem> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(Collection<Personagem> personagens) {
		this.personagens = personagens;
	}

}
