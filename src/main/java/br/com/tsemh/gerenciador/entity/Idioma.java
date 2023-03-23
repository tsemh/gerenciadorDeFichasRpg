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
@Table(name="tb_idioma")
public class Idioma {

	@Id
	@Column(name="id_idioma")
	@SequenceGenerator(name="idioma", sequenceName="sq_tb_idioma", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idioma")
	private int idIdioma;
	
	@Column(name="nm_idioma")
	private String nomeIdioma;
	
	@Column(name="ds_idioma")
	private String descricaoIdioma;
	
	@ManyToMany()
	@JoinTable(name="idioma_personagem", joinColumns = @JoinColumn(name = "id_idioma"), inverseJoinColumns = @JoinColumn(name = "id_personagem"))
	private Collection<Personagem> personagens;

	public Idioma() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Idioma(int idIdioma, String nomeIdioma, String descricaoIdioma, Collection<Personagem> personagens) {
		super();
		this.idIdioma = idIdioma;
		this.nomeIdioma = nomeIdioma;
		this.descricaoIdioma = descricaoIdioma;
		this.personagens = personagens;
	}

	public int getIdIdioma() {
		return idIdioma;
	}

	public void setIdIdioma(int idIdioma) {
		this.idIdioma = idIdioma;
	}

	public String getNomeIdioma() {
		return nomeIdioma;
	}

	public void setNomeIdioma(String nomeIdioma) {
		this.nomeIdioma = nomeIdioma;
	}

	public String getDescricaoIdioma() {
		return descricaoIdioma;
	}

	public void setDescricaoIdioma(String descricaoIdioma) {
		this.descricaoIdioma = descricaoIdioma;
	}

	public Collection<Personagem> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(Collection<Personagem> personagens) {
		this.personagens = personagens;
	}
	
}
