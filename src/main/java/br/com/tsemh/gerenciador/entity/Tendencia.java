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
@Table(name="tb_tendencia")
public class Tendencia {
	
	@Id
	@Column(name="id_tendencia")
	@SequenceGenerator(name="tendencia", sequenceName="sq_tb_tendencia", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="tendencia")
	private String idTendencia;
	
	@Column(name="nm_tendencia")
	private String nomeTendencia;
	
	@Column(name="ds_tendencia")
	private String descricaoTendencia;
	
	@OneToMany(mappedBy = "tendencia")
	private Collection<Personagem> personagens;

	public Tendencia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tendencia(String idTendencia, String nomeTendencia, String descricaoTendencia,
			Collection<Personagem> personagens) {
		super();
		this.idTendencia = idTendencia;
		this.nomeTendencia = nomeTendencia;
		this.descricaoTendencia = descricaoTendencia;
		this.personagens = personagens;
	}

	public String getIdTendencia() {
		return idTendencia;
	}

	public void setIdTendencia(String idTendencia) {
		this.idTendencia = idTendencia;
	}

	public String getNomeTendencia() {
		return nomeTendencia;
	}

	public void setNomeTendencia(String nomeTendencia) {
		this.nomeTendencia = nomeTendencia;
	}

	public String getDescricaoTendencia() {
		return descricaoTendencia;
	}

	public void setDescricaoTendencia(String descricaoTendencia) {
		this.descricaoTendencia = descricaoTendencia;
	}

	public Collection<Personagem> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(Collection<Personagem> personagens) {
		this.personagens = personagens;
	}
}
