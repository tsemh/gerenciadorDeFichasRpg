package br.com.tsemh.gerenciador.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo_equipamento", discriminatorType = DiscriminatorType.STRING)
public class Equipamento {

	@Id
	@Column(name="id_equipamento")
	@SequenceGenerator(name="equipamento", sequenceName="sq_tb_equipamento", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="equipamento")
	private int idEquipamento;
	
	@Column(name="nm_equipamento", length=50)
	private String nomeEquipamento;
	
	@Column(name="ds_equipamento", length=500)
	private String descricaoEquipamento;
	
	@Column(name="tp_equipamento", length=50)
	private String tipoEquipamento;
	
	@Column(name="ps_equipamento")
	private int pesoEquipamento;
	
	@Column(name="pd_equipamento")
	private String penalidadeEquipamento;
	
	@ManyToOne()
	@JoinColumn(name="id_personagem")
	private Personagem personagem;

	public Equipamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Equipamento(int idEquipamento, String nomeEquipamento, String descricaoEquipamento, String tipoEquipamento,
			int pesoEquipamento, String penalidadeEquipamento, Personagem personagem) {
		super();
		this.idEquipamento = idEquipamento;
		this.nomeEquipamento = nomeEquipamento;
		this.descricaoEquipamento = descricaoEquipamento;
		this.tipoEquipamento = tipoEquipamento;
		this.pesoEquipamento = pesoEquipamento;
		this.penalidadeEquipamento = penalidadeEquipamento;
		this.personagem = personagem;
	}
	
	public int getIdEquipamento() {
		return idEquipamento;
	}

	public void setIdEquipamento(int idEquipamento) {
		this.idEquipamento = idEquipamento;
	}

	public String getNomeEquipamento() {
		return nomeEquipamento;
	}

	public void setNomeEquipamento(String nomeEquipamento) {
		this.nomeEquipamento = nomeEquipamento;
	}

	public String getDescricaoEquipamento() {
		return descricaoEquipamento;
	}

	public void setDescricaoEquipamento(String descricaoEquipamento) {
		this.descricaoEquipamento = descricaoEquipamento;
	}

	public String getTipoEquipamento() {
		return tipoEquipamento;
	}

	public void setTipoEquipamento(String tipoEquipamento) {
		this.tipoEquipamento = tipoEquipamento;
	}

	public int getPesoEquipamento() {
		return pesoEquipamento;
	}

	public void setPesoEquipamento(int pesoEquipamento) {
		this.pesoEquipamento = pesoEquipamento;
	}

	public String getPenalidadeEquipamento() {
		return penalidadeEquipamento;
	}

	public void setPenalidadeEquipamento(String penalidadeEquipamento) {
		this.penalidadeEquipamento = penalidadeEquipamento;
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

}
