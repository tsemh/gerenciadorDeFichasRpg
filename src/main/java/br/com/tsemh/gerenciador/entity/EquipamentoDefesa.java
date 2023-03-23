package br.com.tsemh.gerenciador.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("DEFESA")
public class EquipamentoDefesa extends Equipamento{
	
	@Column(name="vl_defesa")
	private int valorDefesa;

	public EquipamentoDefesa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EquipamentoDefesa(int idEquipamento, String nomeEquipamento, String descricaoEquipamento,
			String tipoEquipamento, int pesoEquipamento, String penalidadeEquipamento, Personagem personagem) {
		super(idEquipamento, nomeEquipamento, descricaoEquipamento, tipoEquipamento, pesoEquipamento, penalidadeEquipamento,
				personagem);
		// TODO Auto-generated constructor stub
	}

	public EquipamentoDefesa(int valorDefesa) {
		super();
		this.valorDefesa = valorDefesa;
	}

	public int getValorDefesa() {
		return valorDefesa;
	}

	public void setValorDefesa(int valorDefesa) {
		this.valorDefesa = valorDefesa;
	}

}
