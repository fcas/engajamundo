package model;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import dao.DAOCrowdfunding;
import dao.DaoHibernate;
import dao.IDAO;
import dao.IDAOCrowdfunding;
import entities.Crowdfunding;
import entities.Engajador;
import exceptions.DaoException;

public class ServicoCrowdfunding {
	
	private static ServicoCrowdfunding singleton = null;

	private IDAOCrowdfunding daoCrowdfunding;

	public ServicoCrowdfunding() {
		this.daoCrowdfunding = new DAOCrowdfunding();
	}

	public static ServicoCrowdfunding getInstance() {

		if (singleton == null) {
			singleton = new ServicoCrowdfunding();
		}

		return singleton;

	}
	
	public Double getDoacoes(){
		return daoCrowdfunding.getDoacoes();
	}
	
	public void doar(Crowdfunding doacao) throws DaoException
	{
		
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		String login = ((Engajador) session.getAttribute("usuario")).getLogin();
		doacao.setLogin(login);
		
		daoCrowdfunding.cadastrar(doacao);
		
	}

}