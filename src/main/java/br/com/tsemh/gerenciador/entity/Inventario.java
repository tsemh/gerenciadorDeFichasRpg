package br.com.tsemh.gerenciador.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_inventario")
public class Inventario {
	
	@Id
	@Column(name="id_inventario")
	@SequenceGenerator(name="inventario", sequenceName="sq_tb_inventario", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="inventario")
	private int idInventario;
	
	@Column(name="ps_inventario")
	private int pesoInventario;

	@OneToOne
	@JoinColumn(name="id_personagem")
	private Personagem personagem;
	
	@OneToMany(mappedBy = "inventario")
	private Collection<Item> itens;
	
	@OneToMany(mappedBy = "inventario")
	private Collection<Moeda> moedas;
	
	public Inventario() {
		// TODO Auto-generated constructor stub
	}

	public Inventario(int idInventario, int pesoInventario, Personagem personagem, Collection<Item> itens,
			Collection<Moeda> moedas) {
		super();
		this.idInventario = idInventario;
		this.pesoInventario = pesoInventario;
		this.personagem = personagem;
		this.itens = itens;
		this.moedas = moedas;
	}

	public int getIdInventario() {
		return idInventario;
	}

	public void setIdInventario(int idInventario) {
		this.idInventario = idInventario;
	}

	public int getPesoInventario() {
		return pesoInventario;
	}

	public void setPesoInventario(int pesoInventario) {
		this.pesoInventario = pesoInventario;
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public Collection<Item> getItens() {
		return itens;
	}

	public void setItens(Collection<Item> itens) {
		this.itens = itens;
	}

	public Collection<Moeda> getMoedas() {
		return moedas;
	}

	public void setMoedas(Collection<Moeda> moedas) {
		this.moedas = moedas;
	}
}
