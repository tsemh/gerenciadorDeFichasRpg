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
@Table(name="tb_talento")
public class Talento {
	
	@Id
	@Column(name="id_talento")
	@SequenceGenerator(name="talento", sequenceName="qs_tb_talentp", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="talento")
	private int idTalento;
	
	@Column(name="nm_talento", length=50)
	private String nomeTalento;
	
	@Column(name="ds_talento", length=500)
	private String descricaoTalento;
	
	@ManyToMany()
	@JoinTable(name="talento_personagem", joinColumns = @JoinColumn(name="id_talento"), inverseJoinColumns = @JoinColumn(name="id_personagem"))
	private Collection<Personagem> personagens;

	public Talento() {
		// TODO Auto-generated constructor stub
	}

	public Talento(int idTalento, String nomeTalento, String descricaoTalento, Collection<Personagem> personagens) {
		super();
		this.idTalento = idTalento;
		this.nomeTalento = nomeTalento;
		this.descricaoTalento = descricaoTalento;
		this.personagens = personagens;
	}

	public int getIdTalento() {
		return idTalento;
	}

	public void setIdTalento(int idTalento) {
		this.idTalento = idTalento;
	}

	public String getNomeTalento() {
		return nomeTalento;
	}

	public void setNomeTalento(String nomeTalento) {
		this.nomeTalento = nomeTalento;
	}

	public String getDescricaoTalento() {
		return descricaoTalento;
	}

	public void setDescricaoTalento(String descricaoTalento) {
		this.descricaoTalento = descricaoTalento;
	}

	public Collection<Personagem> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(Collection<Personagem> personagens) {
		this.personagens = personagens;
	}

}
