package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema="engajamundoDB")  
public class Crowdfunding {

	Double metaCapacitacao;
	Double valorCapitado;
	int qtdPatrocinadores;
	Double porcentagem;
	
	public Double getMetaCapacitacao() {
		return metaCapacitacao;
	}
	public void setMetaCapacitacao(Double metaCapacitacao) {
		this.metaCapacitacao = metaCapacitacao;
	}
	public Double getValorCapitado() {
		return valorCapitado;
	}
	public void setValorCapitado(Double valorCapitado) {
		this.valorCapitado = valorCapitado;
	}
	public int getQtdPatrocinadores() {
		return qtdPatrocinadores;
	}
	public void setQtdPatrocinadores(int qtdPatrocinadores) {
		this.qtdPatrocinadores = qtdPatrocinadores;
	}
	public Double getPorcentagem() {
		return porcentagem;
	}
	public void setPorcentagem(Double porcentagem) {
		this.porcentagem = porcentagem;
	}
	
	
	
}
