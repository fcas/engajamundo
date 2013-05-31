package model;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import dao.DaoHibernate;
import dao.IDAOEngajador;
import entities.Crowdfunding;
import entities.Engajador;

public class ServicoCrowdfunding {
	
	private static ServicoCrowdfunding singleton = null;

	private IDAOEngajador daoEngajador;

	public ServicoCrowdfunding() {
		this.daoEngajador = new DaoHibernate();
	}

	public static ServicoCrowdfunding getInstance() {

		if (singleton == null) {
			singleton = new ServicoCrowdfunding();
		}

		return singleton;

	}
	
	public Double getDoacoes(){
		return daoEngajador.getDoacoes();
	}
	
	public void doar(Crowdfunding doacao)
	{
		
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		String login = ((Engajador) session.getAttribute("usuario")).getLogin();
		doacao.setLogin(login);
		
		daoEngajador.saveDoacao(doacao);
		
	}

}