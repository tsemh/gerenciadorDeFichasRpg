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
@Table(name="tb_item")
public class Item {

	@Id
	@Column(name="id_item")
	@SequenceGenerator(name="item", sequenceName="sq-tb_item", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="item")
	private int idItem;
	
	@Column(name="nm_item", length=50)
	private String nomeItem;
	
	@Column(name="ds_item", length=500)
	private String descricaoItem;
	
	@Column(name="ps_item")
	private int pesoItem;
	
	@ManyToOne()
	@JoinColumn(name="id_inventario")
	private Inventario inventario;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int idItem, String nomeItem, String descricaoItem, int pesoItem, Inventario inventario) {
		super();
		this.idItem = idItem;
		this.nomeItem = nomeItem;
		this.descricaoItem = descricaoItem;
		this.pesoItem = pesoItem;
		this.inventario = inventario;
	}

	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public String getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

	public int getPesoItem() {
		return pesoItem;
	}

	public void setPesoItem(int pesoItem) {
		this.pesoItem = pesoItem;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

}
