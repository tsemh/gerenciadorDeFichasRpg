package br.com.tsemh.gerenciador.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_moeda")
public class Moeda {
	
	@Id
	@Column(name="id_moeda")
	@SequenceGenerator(name="moeda", sequenceName="qs_tb_moeda", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="moeda")
	private int idMoeda;
	
	@Column(name="nm_moeda", length=50)
	private String nomeMoeda;
	
	@Column(name="qt_moeda")
	private int quantidadeMoeda;
	
	@Column(name="ps_moeda")
	private int pesoMoeda;
	
	@ManyToOne
	@JoinColumn(name="id_inventario")
	private Inventario inventario;
	
	public Moeda() {
		// TODO Auto-generated constructor stub
	}

	public Moeda(int idMoeda, String nomeMoeda, int quantidadeMoeda, int pesoMoeda, Inventario inventario) {
		super();
		this.idMoeda = idMoeda;
		this.nomeMoeda = nomeMoeda;
		this.quantidadeMoeda = quantidadeMoeda;
		this.pesoMoeda = pesoMoeda;
		this.inventario = inventario;
	}

	public int getIdMoeda() {
		return idMoeda;
	}

	public void setIdMoeda(int idMoeda) {
		this.idMoeda = idMoeda;
	}

	public String getNomeMoeda() {
		return nomeMoeda;
	}

	public void setNomeMoeda(String nomeMoeda) {
		this.nomeMoeda = nomeMoeda;
	}

	public int getQuantidadeMoeda() {
		return quantidadeMoeda;
	}

	public void setQuantidadeMoeda(int quantidadeMoeda) {
		this.quantidadeMoeda = quantidadeMoeda;
	}

	public int getPesoMoeda() {
		return pesoMoeda;
	}

	public void setPesoMoeda(int pesoMoeda) {
		this.pesoMoeda = pesoMoeda;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

}
