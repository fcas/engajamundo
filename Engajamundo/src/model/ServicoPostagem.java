package model;

import java.util.List;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import dao.DaoHibernate;
import dao.IDAOEngajador;
import entities.Engajador;
import entities.Postagem;
import exceptions.UsuarioNaoAutenticadoException;

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
	
	public List<Postagem> getPostagens(){
		return daoEngajador.listarPostagens();
	}
	
	public void postar(Postagem post, String tagAux) throws UsuarioNaoAutenticadoException
    {
            post.setTags(tagAux);
            
            HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
            
            String login = null;
            
            if (session.getAttribute("usuario")!=null){
                    login = ((Engajador) session.getAttribute("usuario")).getLogin();
            } else throw new UsuarioNaoAutenticadoException(); 
            
            post.setLogin(login);
            
            daoEngajador.savePost(post);
    }
	
	public void deletar(int idPostagem){
		daoEngajador.deletarPostagem(idPostagem);
	}
}