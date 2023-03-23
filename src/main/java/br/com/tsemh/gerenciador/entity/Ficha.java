package br.com.tsemh.gerenciador.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ficha")
public class Ficha {
	
	@Id
	@Column(name="id_ficha")
	@SequenceGenerator(name="ficha", sequenceName="sq_tb_ficha", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ficha")
	private int idFicha;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	
	@Column(name="nm_ficha", length=50)
	private String nomeFicha;
	
	@Column(name="nm_jogador", length=50)
	private String nomeJogador;
	
	@OneToOne(mappedBy = "ficha")
	private Personagem personagem;
	
	public Ficha() {
		// TODO Auto-generated constructor stub
	}

	public Ficha(int idFicha, Usuario usuario, String nomeFicha, String nomeJogador, Personagem personagem) {
		super();
		this.idFicha = idFicha;
		this.usuario = usuario;
		this.nomeFicha = nomeFicha;
		this.nomeJogador = nomeJogador;
		this.personagem = personagem;
	}

	public int getIdFicha() {
		return idFicha;
	}

	public void setIdFicha(int idFicha) {
		this.idFicha = idFicha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNomeFicha() {
		return nomeFicha;
	}

	public void setNomeFicha(String nomeFicha) {
		this.nomeFicha = nomeFicha;
	}

	public String getNomeJogador() {
		return nomeJogador;
	}

	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

}
