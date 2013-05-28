package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name="doacao")
public class Doacoes {
	
	ServicoCrowdfunding servicoCrowdfunding = ServicoCrowdfunding
			.getInstance();
	public Double metaCapacitacao;
	public Double valorCapitado;
	public Double porcentagem;
	int qtdPatrocinadores;
	
	public Doacoes(){
		this.metaCapacitacao = 200.000;
	}
	
	public Double getMetaCapacitacao() {
		return metaCapacitacao;
	}
	public void setMetaCapacitacao(Double metaCapacitacao) {
		this.metaCapacitacao = metaCapacitacao;
	}
	public Double getValorCapitado() {
		return servicoCrowdfunding.getDoacoes();
	}
	public void setValorCapitado(Double valorCapitado) {
		this.valorCapitado = valorCapitado;
	}
	public Double getPorcentagem() {
		return (getValorCapitado()/metaCapacitacao)*100;
	}
	public void setPorcentagem(Double porcentagem) {
		this.porcentagem = porcentagem;
	}
	public int getQtdPatrocinadores() {
		return qtdPatrocinadores;
	}
	public void setQtdPatrocinadores(int qtdPatrocinadores) {
		this.qtdPatrocinadores = qtdPatrocinadores;
	}

}
