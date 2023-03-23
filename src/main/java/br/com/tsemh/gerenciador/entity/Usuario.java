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
@Table(name="tb_usuario")
public class Usuario {
	
	@Id
	@Column(name="id_usuario")
	@SequenceGenerator(name="usuario", sequenceName="sq_tb_usuario", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="usuario")
	private int idUsuario;
	
	@Column(name="nm_usuario", length=50)
	private String nomeUsuario;
	
	@Column(name="em_usuario", length=50)
	private String emailUsuario;
	
	@Column(name="sn_usuario", length=50)
	private String senhaUsuario;
	
	@OneToMany(mappedBy = "usuario")
	private Collection<Ficha> fichas;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(int idUsuario, String nomeUsuario, String emailUsuario, String senhaUsuario,
			Collection<Ficha> fichas) {
		super();
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.emailUsuario = emailUsuario;
		this.senhaUsuario = senhaUsuario;
		this.fichas = fichas;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public Collection<Ficha> getFichas() {
		return fichas;
	}

	public void setFichas(Collection<Ficha> fichas) {
		this.fichas = fichas;
	}

}
