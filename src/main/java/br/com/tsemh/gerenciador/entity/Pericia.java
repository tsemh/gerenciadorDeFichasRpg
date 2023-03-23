package br.com.tsemh.gerenciador.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_pericia")
public class Pericia {

	@Id
	@Column(name="id_pericia")
	@SequenceGenerator(name="pericia", sequenceName="qs_tb_pericia", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pericia")
	private int idPericia;
	
	@Column(name="nm_pericia", length=50)
	private String nomePericia;
	
	@Column(name="vl_pericia")
	private int valorPericia;
	
	@ManyToMany
	@JoinTable(name="pericia_personagem", joinColumns = @JoinColumn(name="id_pericia"), inverseJoinColumns = @JoinColumn(name="id_personagem"))
	private Collection<Personagem> personagens;
	
	public Pericia() {
		// TODO Auto-generated constructor stub
	}

	public Pericia(int idPericia, String nomePericia, int valorPericia, Collection<Personagem> personagens) {
		super();
		this.idPericia = idPericia;
		this.nomePericia = nomePericia;
		this.valorPericia = valorPericia;
		this.personagens = personagens;
	}

	public int getIdPericia() {
		return idPericia;
	}

	public void setIdPericia(int idPericia) {
		this.idPericia = idPericia;
	}

	public String getNomePericia() {
		return nomePericia;
	}

	public void setNomePericia(String nomePericia) {
		this.nomePericia = nomePericia;
	}

	public int getValorPericia() {
		return valorPericia;
	}

	public void setValorPericia(int valorPericia) {
		this.valorPericia = valorPericia;
	}

	public Collection<Personagem> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(Collection<Personagem> personagens) {
		this.personagens = personagens;
	}

}
