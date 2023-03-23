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
@Table(name="tb_origem")
public class Origem {
	
	@Id
	@Column(name="id_origem")
	@SequenceGenerator(name="origem", sequenceName="qs_tb_origem", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="origem")
	private int idOrigem;
	
	@Column(name="nm_origem", length=50)
	private String nomeOrigem;
	
	@Column(name="ds_origem", length=500)
	private String descricaoOrigem;
	
	@OneToMany(mappedBy = "origem")
	private Collection<Personagem> personagens;

	public Origem() {
		// TODO Auto-generated constructor stub
	}

	public Origem(int idOrigem, String nomeOrigem, String descricaoOrigem, Collection<Personagem> personagens) {
		super();
		this.idOrigem = idOrigem;
		this.nomeOrigem = nomeOrigem;
		this.descricaoOrigem = descricaoOrigem;
		this.personagens = personagens;
	}

	public int getIdOrigem() {
		return idOrigem;
	}

	public void setIdOrigem(int idOrigem) {
		this.idOrigem = idOrigem;
	}

	public String getNomeOrigem() {
		return nomeOrigem;
	}

	public void setNomeOrigem(String nomeOrigem) {
		this.nomeOrigem = nomeOrigem;
	}

	public String getDescricaoOrigem() {
		return descricaoOrigem;
	}

	public void setDescricaoOrigem(String descricaoOrigem) {
		this.descricaoOrigem = descricaoOrigem;
	}

	public Collection<Personagem> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(Collection<Personagem> personagens) {
		this.personagens = personagens;
	}

}
