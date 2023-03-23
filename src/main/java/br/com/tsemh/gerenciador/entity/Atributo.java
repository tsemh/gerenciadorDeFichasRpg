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
@Table(name="tb_atributo")
public class Atributo {
	
	@Id
	@Column(name="id_atributo")
	@SequenceGenerator(name="atributo", sequenceName="sq-tb_atrbituo", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="atributo")
	private int idAtributo;

	@Column(name="nm_atributo", length=50)
	private String nomeAtributo;
	
	@Column(name="vl_atributo")
	private int valorAtributo;
	
	@ManyToMany
	@JoinTable(name = "atributo_personagem", joinColumns = @JoinColumn(name="id_atributo"), inverseJoinColumns = @JoinColumn(name = "id_personagem"))
	private Collection<Personagem> personagens;
	
	public Atributo() {
		// TODO Auto-generated constructor stub
	}

	public Atributo(int idAtributo, String nomeAtributo, int valorAtributo, Collection<Personagem> personagens) {
		super();
		this.idAtributo = idAtributo;
		this.nomeAtributo = nomeAtributo;
		this.valorAtributo = valorAtributo;
		this.personagens = personagens;
	}

	public int getIdAtributo() {
		return idAtributo;
	}

	public void setIdAtributo(int idAtributo) {
		this.idAtributo = idAtributo;
	}

	public String getNomeAtributo() {
		return nomeAtributo;
	}

	public void setNomeAtributo(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}

	public int getValorAtributo() {
		return valorAtributo;
	}

	public void setValorAtributo(int valorAtributo) {
		this.valorAtributo = valorAtributo;
	}

	public Collection<Personagem> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(Collection<Personagem> personagens) {
		this.personagens = personagens;
	}

}
