package br.com.tsemh.gerenciador.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_raca")
public class Raca {
	
	@Id
	@Column(name="id_raca")
	@SequenceGenerator(name="raca", sequenceName="sq_tb_raca", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="raca")
	private int idraca;
	
	@Column(name="nm_raca", length=50)
	private String nomeRaca;
	
	@Column(name="ds_raca", length=500)
	private String descricaoRaca;
	
	@OneToMany(mappedBy = "raca")
	private Collection<Personagem> personagens;
	
	public Raca() {
		// TODO Auto-generated constructor stub
	}

	public Raca(int idraca, String nomeRaca, String descricaoRaca, Collection<Personagem> personagens) {
		super();
		this.idraca = idraca;
		this.nomeRaca = nomeRaca;
		this.descricaoRaca = descricaoRaca;
		this.personagens = personagens;
	}

	public int getIdraca() {
		return idraca;
	}

	public void setIdraca(int idraca) {
		this.idraca = idraca;
	}

	public String getNomeRaca() {
		return nomeRaca;
	}

	public void setNomeRaca(String nomeRaca) {
		this.nomeRaca = nomeRaca;
	}

	public String getDescricaoRaca() {
		return descricaoRaca;
	}

	public void setDescricaoRaca(String descricaoRaca) {
		this.descricaoRaca = descricaoRaca;
	}

	public Collection<Personagem> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(Collection<Personagem> personagens) {
		this.personagens = personagens;
	}

}
