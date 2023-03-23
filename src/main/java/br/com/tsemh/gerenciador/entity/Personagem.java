package br.com.tsemh.gerenciador.entity;

import java.math.BigDecimal;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_personagem")
public class Personagem {
	
	@Id
	@Column(name="id_personagem")
	@SequenceGenerator(name="personagem", sequenceName="sq_tb_personagem", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="personagem")
	private int idPersonagem;
	
	@Column(name="nm_personagem", length=50)
	private String nomePersonagem;
	
	@Column(name="vd_personagem")
	private int vidaPersonagem;
	
	@Column(name="mn_personagem")
	private int manaPersonagem;
	
	@Column(name="ex_personagem")
	private BigDecimal experienciaPersonagem;
	
	@Column(name="in_personagem")
	private int inspiracaoPersonagem;
	
	@Column(name="ds_personagem", length=1000)
	private String descricaoPersonagem;
	
	@OneToOne
	@JoinColumn(name="id_ficha")
	private Ficha ficha;

	@ManyToOne
	@JoinColumn(name = "id_raca")
	private Raca raca;
	
	@ManyToOne
	@JoinColumn(name = "id_origem")
	private Origem origem;
	
	@ManyToMany(mappedBy = "personagens")
	private Collection<Talento> talentos;
	
	@ManyToMany(mappedBy = "personagens")
	private Collection<Atributo> atributos;
	
	@ManyToMany(mappedBy = "personagens")
	private Collection<Magia> magias;
	
	@OneToOne(mappedBy = "personagem")
	private Inventario inventario;
	
	@ManyToOne()
	@JoinColumn(name = "id_arquetipo")
	private Arquetipo arquetipo;
	
	@ManyToMany(mappedBy = "personagens")
	private Collection<Pericia> pericias;
	
	@ManyToMany(mappedBy = "personagens")
	private Collection<Habilidade> habilidades;
	
	@ManyToMany(mappedBy = "personagens")
	private Collection<Truque> truques;
	
	@ManyToOne()
	@JoinColumn(name = "id_tendencia")
	private Tendencia tendencia;
	
	@ManyToMany(mappedBy = "personagens")
	private Collection<Idioma> idiomas;
	
	@ManyToMany(mappedBy = "personagens")
	private Collection<Classe> classes;
	
	@OneToMany(mappedBy = "personagem")
	private Collection<Equipamento> equipamentos;
	
	public Personagem() {
		// TODO Auto-generated constructor stub
	}

	public Personagem(int idPersonagem, String nomePersonagem, int vidaPersonagem, int manaPersonagem,
			BigDecimal experienciaPersonagem, int inspiracaoPersonagem, String descricaoPersonagem, Ficha ficha,
			Raca raca, Origem origem, Collection<Talento> talentos, Collection<Atributo> atributos,
			Collection<Magia> magias, Inventario inventario, Arquetipo arquetipo, Collection<Pericia> pericias,
			Collection<Habilidade> habilidades, Collection<Truque> truques, Tendencia tendencia,
			Collection<Idioma> idiomas, Collection<Classe> classes, Collection<Equipamento> equipamentos) {
		super();
		this.idPersonagem = idPersonagem;
		this.nomePersonagem = nomePersonagem;
		this.vidaPersonagem = vidaPersonagem;
		this.manaPersonagem = manaPersonagem;
		this.experienciaPersonagem = experienciaPersonagem;
		this.inspiracaoPersonagem = inspiracaoPersonagem;
		this.descricaoPersonagem = descricaoPersonagem;
		this.ficha = ficha;
		this.raca = raca;
		this.origem = origem;
		this.talentos = talentos;
		this.atributos = atributos;
		this.magias = magias;
		this.inventario = inventario;
		this.arquetipo = arquetipo;
		this.pericias = pericias;
		this.habilidades = habilidades;
		this.truques = truques;
		this.tendencia = tendencia;
		this.idiomas = idiomas;
		this.classes = classes;
		this.equipamentos = equipamentos;
	}

	public int getIdPersonagem() {
		return idPersonagem;
	}

	public void setIdPersonagem(int idPersonagem) {
		this.idPersonagem = idPersonagem;
	}

	public String getNomePersonagem() {
		return nomePersonagem;
	}

	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}

	public int getVidaPersonagem() {
		return vidaPersonagem;
	}

	public void setVidaPersonagem(int vidaPersonagem) {
		this.vidaPersonagem = vidaPersonagem;
	}

	public int getManaPersonagem() {
		return manaPersonagem;
	}

	public void setManaPersonagem(int manaPersonagem) {
		this.manaPersonagem = manaPersonagem;
	}

	public BigDecimal getExperienciaPersonagem() {
		return experienciaPersonagem;
	}

	public void setExperienciaPersonagem(BigDecimal experienciaPersonagem) {
		this.experienciaPersonagem = experienciaPersonagem;
	}

	public int getInspiracaoPersonagem() {
		return inspiracaoPersonagem;
	}

	public void setInspiracaoPersonagem(int inspiracaoPersonagem) {
		this.inspiracaoPersonagem = inspiracaoPersonagem;
	}

	public String getDescricaoPersonagem() {
		return descricaoPersonagem;
	}

	public void setDescricaoPersonagem(String descricaoPersonagem) {
		this.descricaoPersonagem = descricaoPersonagem;
	}

	public Ficha getFicha() {
		return ficha;
	}

	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}

	public Raca getRaca() {
		return raca;
	}

	public void setRaca(Raca raca) {
		this.raca = raca;
	}

	public Origem getOrigem() {
		return origem;
	}

	public void setOrigem(Origem origem) {
		this.origem = origem;
	}

	public Collection<Talento> getTalentos() {
		return talentos;
	}

	public void setTalentos(Collection<Talento> talentos) {
		this.talentos = talentos;
	}

	public Collection<Atributo> getAtributos() {
		return atributos;
	}

	public void setAtributos(Collection<Atributo> atributos) {
		this.atributos = atributos;
	}

	public Collection<Magia> getMagias() {
		return magias;
	}

	public void setMagias(Collection<Magia> magias) {
		this.magias = magias;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

	public Arquetipo getArquetipo() {
		return arquetipo;
	}

	public void setArquetipo(Arquetipo arquetipo) {
		this.arquetipo = arquetipo;
	}

	public Collection<Pericia> getPericias() {
		return pericias;
	}

	public void setPericias(Collection<Pericia> pericias) {
		this.pericias = pericias;
	}

	public Collection<Habilidade> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(Collection<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}

	public Collection<Truque> getTruques() {
		return truques;
	}

	public void setTruques(Collection<Truque> truques) {
		this.truques = truques;
	}

	public Tendencia getTendencia() {
		return tendencia;
	}

	public void setTendencia(Tendencia tendencia) {
		this.tendencia = tendencia;
	}

	public Collection<Idioma> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(Collection<Idioma> idiomas) {
		this.idiomas = idiomas;
	}

	public Collection<Classe> getClasses() {
		return classes;
	}

	public void setClasses(Collection<Classe> classes) {
		this.classes = classes;
	}

	public Collection<Equipamento> getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(Collection<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}

}
