package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.ServicoCrowdfunding;

import entities.Crowdfunding;

@SessionScoped
@ManagedBean(name="controllerCrowdfunding")
public class ControllerCrowdfunding {
	
	ServicoCrowdfunding servicoCrowdfunding = ServicoCrowdfunding
			.getInstance();
	
	private Crowdfunding doacao;
	
	public ControllerCrowdfunding(){
		doacao = new Crowdfunding();
	}
	
	public String doar(){
		servicoCrowdfunding.doar(doacao);
		return "doacao";
	}

	public Crowdfunding getDoacao() {
		return doacao;
	}

	public void setDoacao(Crowdfunding doacao) {
		this.doacao = doacao;
	}

}
