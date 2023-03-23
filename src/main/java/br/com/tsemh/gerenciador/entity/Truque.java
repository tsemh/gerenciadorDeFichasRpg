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
@Table(name="tb_truque")
public class Truque {
	
	@Id
	@Column(name="id_truque")
	@SequenceGenerator(name="truque", sequenceName="sq_tb_truque", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="truque")
	private int idTruque;

	@Column(name="nm_truque", length=50)
	private String nomeTruque;
	
	@Column(name="tp_truque", length=50)
	private String tipoTruque;
	
	@Column(name="ds_truque", length=500)
	private String descricaoTruque;
	
	@ManyToMany
	@JoinTable(name="truque_personagem", joinColumns = @JoinColumn(name = "id_truque"), inverseJoinColumns = @JoinColumn(name = "id_personagem"))
	private Collection<Personagem> personagens;

	public Truque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Truque(int idTruque, String nomeTruque, String tipoTruque, String descricaoTruque,
			Collection<Personagem> personagens) {
		super();
		this.idTruque = idTruque;
		this.nomeTruque = nomeTruque;
		this.tipoTruque = tipoTruque;
		this.descricaoTruque = descricaoTruque;
		this.personagens = personagens;
	}

	public int getIdTruque() {
		return idTruque;
	}

	public void setIdTruque(int idTruque) {
		this.idTruque = idTruque;
	}

	public String getNomeTruque() {
		return nomeTruque;
	}

	public void setNomeTruque(String nomeTruque) {
		this.nomeTruque = nomeTruque;
	}

	public String getTipoTruque() {
		return tipoTruque;
	}

	public void setTipoTruque(String tipoTruque) {
		this.tipoTruque = tipoTruque;
	}

	public String getDescricaoTruque() {
		return descricaoTruque;
	}

	public void setDescricaoTruque(String descricaoTruque) {
		this.descricaoTruque = descricaoTruque;
	}

	public Collection<Personagem> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(Collection<Personagem> personagens) {
		this.personagens = personagens;
	}
}
