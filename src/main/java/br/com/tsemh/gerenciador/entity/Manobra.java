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
@Table(name="tb_manobra")
public class Manobra {

	@Id
	@Column(name="id_manobra")
	@SequenceGenerator(name="manobra", sequenceName="sq_tb_manobra", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="manobra")
	private int idManobra;
	
	@Column(name="nm_manobra")
	private String nomeManobra;
	
	@Column(name="ds_manobra")
	private String descricaoManobra;
	
	@ManyToMany
	@JoinTable(name="manobra_personagem", joinColumns = @JoinColumn(name = "id_manobra"), inverseJoinColumns = @JoinColumn(name = "id_personagem"))
	private Collection<Personagem> personagens;

	public Manobra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manobra(int idManobra, String nomeManobra, String descricaoManobra, Collection<Personagem> personagens) {
		super();
		this.idManobra = idManobra;
		this.nomeManobra = nomeManobra;
		this.descricaoManobra = descricaoManobra;
		this.personagens = personagens;
	}

	public int getIdManobra() {
		return idManobra;
	}

	public void setIdManobra(int idManobra) {
		this.idManobra = idManobra;
	}

	public String getNomeManobra() {
		return nomeManobra;
	}

	public void setNomeManobra(String nomeManobra) {
		this.nomeManobra = nomeManobra;
	}

	public String getDescricaoManobra() {
		return descricaoManobra;
	}

	public void setDescricaoManobra(String descricaoManobra) {
		this.descricaoManobra = descricaoManobra;
	}

	public Collection<Personagem> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(Collection<Personagem> personagens) {
		this.personagens = personagens;
	}
	
}
