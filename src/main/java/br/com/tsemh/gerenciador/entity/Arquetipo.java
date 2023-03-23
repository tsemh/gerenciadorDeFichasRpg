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
@Table(name="tb_arquetipo")
public class Arquetipo {

	@Id
	@Column(name="id_arquetipo")
	@SequenceGenerator(name="arquetipo", sequenceName="qs_tb_arquetipo", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="arquetipo")
	private int idArquetipo;
	
	@Column(name="nm_arquetipo", length=50)
	private String nomeArquetipo;
	
	@Column(name="ds_arquetipo", length=500)
	private String descricaoArquetipo;
	
	@OneToMany(mappedBy = "arquetipo")
	private Collection<Personagem> personagens;
	
	public Arquetipo() {
		// TODO Auto-generated constructor stub
	}

	public Arquetipo(int idArquetipo, String nomeArquetipo, String descricaoArquetipo,
			Collection<Personagem> personagens) {
		super();
		this.idArquetipo = idArquetipo;
		this.nomeArquetipo = nomeArquetipo;
		this.descricaoArquetipo = descricaoArquetipo;
		this.personagens = personagens;
	}

	public int getIdArquetipo() {
		return idArquetipo;
	}

	public void setIdArquetipo(int idArquetipo) {
		this.idArquetipo = idArquetipo;
	}

	public String getNomeArquetipo() {
		return nomeArquetipo;
	}

	public void setNomeArquetipo(String nomeArquetipo) {
		this.nomeArquetipo = nomeArquetipo;
	}

	public String getDescricaoArquetipo() {
		return descricaoArquetipo;
	}

	public void setDescricaoArquetipo(String descricaoArquetipo) {
		this.descricaoArquetipo = descricaoArquetipo;
	}

	public Collection<Personagem> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(Collection<Personagem> personagens) {
		this.personagens = personagens;
	}

}
