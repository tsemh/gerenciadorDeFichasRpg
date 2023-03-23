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
@Table(name="tb_habilidade")
public class Habilidade {
	
	@Id
	@Column(name="id_habilidade")
	@SequenceGenerator(name="habilidade", sequenceName="sq_tb_habilidade", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="habilidade")
	private int idHabilidade;
	
	@Column(name="nm_habilidade", length=50)
	private String nomeHabilidade;
	
	@Column(name="tp_habilidade", length=50)
	private String tipoHabilidade;
	
	@Column(name="ds_habilidade", length=50)
	private String descricaoHabilidade;
	
	@ManyToMany
	@JoinTable(name="habilidade_personagem", joinColumns = @JoinColumn(name = "id_habilidade"), inverseJoinColumns = @JoinColumn(name = "id_personagem"))
	private Collection<Personagem> personagens;

	public Habilidade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Habilidade(int idHabilidade, String nomeHabilidade, String tipoHabilidade, String descricaoHabilidade,
			Collection<Personagem> personagens) {
		super();
		this.idHabilidade = idHabilidade;
		this.nomeHabilidade = nomeHabilidade;
		this.tipoHabilidade = tipoHabilidade;
		this.descricaoHabilidade = descricaoHabilidade;
		this.personagens = personagens;
	}

	public int getIdHabilidade() {
		return idHabilidade;
	}

	public void setIdHabilidade(int idHabilidade) {
		this.idHabilidade = idHabilidade;
	}

	public String getNomeHabilidade() {
		return nomeHabilidade;
	}

	public void setNomeHabilidade(String nomeHabilidade) {
		this.nomeHabilidade = nomeHabilidade;
	}

	public String getTipoHabilidade() {
		return tipoHabilidade;
	}

	public void setTipoHabilidade(String tipoHabilidade) {
		this.tipoHabilidade = tipoHabilidade;
	}

	public String getDescricaoHabilidade() {
		return descricaoHabilidade;
	}

	public void setDescricaoHabilidade(String descricaoHabilidade) {
		this.descricaoHabilidade = descricaoHabilidade;
	}

	public Collection<Personagem> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(Collection<Personagem> personagens) {
		this.personagens = personagens;
	}
	
}
