package br.com.tsemh.gerenciador.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_magia")
public class Magia {

	@Id
	@Column(name="id_magia")
	@SequenceGenerator(name="magia", sequenceName="qs_tb_magia", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="magia")
	private int id_magia;
	
	@Column(name="nm_magia", length=50)
	private String nomeMagia;
	
	@Column(name="tp_magia", length=50)
	private String tipoMagia;
	
	@Column(name="dn_magia")
	private int danoMagia;
	
	@Column(name="tp_dano_magia", length=50)
	private String tipoDanoMagia;
	
	@Column(name="ds_magia", length=500)
	private String descricaoMagia;
	
	@ManyToMany
	@JoinTable(name="magia_personagem", joinColumns = @JoinColumn(name = "id_magia"), inverseJoinColumns = @JoinColumn(name = "id_personagem"))
	private Collection<Personagem> personagens;
	
	public Magia() {
		// TODO Auto-generated constructor stub
	}

	public Magia(int id_magia, String nomeMagia, String tipoMagia, int danoMagia, String tipoDanoMagia,
			String descricaoMagia, Collection<Personagem> personagens) {
		super();
		this.id_magia = id_magia;
		this.nomeMagia = nomeMagia;
		this.tipoMagia = tipoMagia;
		this.danoMagia = danoMagia;
		this.tipoDanoMagia = tipoDanoMagia;
		this.descricaoMagia = descricaoMagia;
		this.personagens = personagens;
	}

	public int getId_magia() {
		return id_magia;
	}

	public void setId_magia(int id_magia) {
		this.id_magia = id_magia;
	}

	public String getNomeMagia() {
		return nomeMagia;
	}

	public void setNomeMagia(String nomeMagia) {
		this.nomeMagia = nomeMagia;
	}

	public String getTipoMagia() {
		return tipoMagia;
	}

	public void setTipoMagia(String tipoMagia) {
		this.tipoMagia = tipoMagia;
	}

	public int getDanoMagia() {
		return danoMagia;
	}

	public void setDanoMagia(int danoMagia) {
		this.danoMagia = danoMagia;
	}

	public String getTipoDanoMagia() {
		return tipoDanoMagia;
	}

	public void setTipoDanoMagia(String tipoDanoMagia) {
		this.tipoDanoMagia = tipoDanoMagia;
	}

	public String getDescricaoMagia() {
		return descricaoMagia;
	}

	public void setDescricaoMagia(String descricaoMagia) {
		this.descricaoMagia = descricaoMagia;
	}

	public Collection<Personagem> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(Collection<Personagem> personagens) {
		this.personagens = personagens;
	}

}
