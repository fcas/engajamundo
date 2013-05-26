package model;

import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import dao.DaoHibernate;
import dao.IDAOEngajador;
import entities.Postagem;

public class ServicoPostagem {

	private static ServicoPostagem singleton = null;

	private IDAOEngajador daoEngajador;

	public ServicoPostagem() {
		this.daoEngajador = new DaoHibernate();
	}

	public static ServicoPostagem getInstance() {

		if (singleton == null) {
			singleton = new ServicoPostagem();
		}

		return singleton;

	}
	
	public void postar(Postagem post, String tagAux)
	{
		String[] tags = tagAux.trim().split(";");
		post.setTags((ArrayList<String>)Arrays.asList(tags));
		
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		String login = (String) session.getAttribute("login");
		post.setLogin(login);
		
		daoEngajador.savePost(post);
	}
}
