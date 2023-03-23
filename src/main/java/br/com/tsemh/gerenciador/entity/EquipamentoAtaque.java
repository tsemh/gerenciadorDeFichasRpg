package br.com.tsemh.gerenciador.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ATAQUE")
public class EquipamentoAtaque extends Equipamento{
	
	@Column(name="dn_equipamento")
	private int danoEquipamento;
	
	public EquipamentoAtaque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EquipamentoAtaque(int idEquipamento, String nomeEquipamento, String descricaoEquipamento,
			String tipoEquipamento, int pesoEquipamento, String penalidadeEquipamento, Personagem personagem) {
		super(idEquipamento, nomeEquipamento, descricaoEquipamento, tipoEquipamento, pesoEquipamento, penalidadeEquipamento,
				personagem);
		// TODO Auto-generated constructor stub
	}


	public EquipamentoAtaque(int danoEquipamento) {
		super();
		this.danoEquipamento = danoEquipamento;
	}

	public int getDanoEquipamento() {
		return danoEquipamento;
	}

	public void setDanoEquipamento(int danoEquipamento) {
		this.danoEquipamento = danoEquipamento;
	}

}
