package controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlCommandLink;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import entities.Engajador;
import entities.Postagem;
import exceptions.DaoException;
import model.ServicoPostagem;

@SessionScoped
@ManagedBean(name="controllerPostagem")
public class ControllerPostagem {

	ServicoPostagem servicoPostagem = ServicoPostagem
			.getInstance();
	private Postagem postagem;
	private String tag;
	private List<Postagem> postagens;
	public String postar() throws DaoException
	{
		servicoPostagem.postar(postagem, tag);
		postagens = servicoPostagem.getPostagens();
		return 	"sucesso";
	}
	
	public ControllerPostagem(){
		postagem = new Postagem();
		postagens = servicoPostagem.getPostagens();
		for(int i = 0; i < postagens.size(); i++){
			System.out.println(postagens.get(i).getTitulo());
		}
	}
	public Postagem getPostagem() {
		return postagem;
	}
	
	public boolean permiteDelecao(){
		HttpSession session = ( HttpSession ) FacesContext.getCurrentInstance().getExternalContext().getSession(true);  
		Engajador e = (Engajador) session.getAttribute("usuario");
		e.getLogin();
		
		FacesContext context = FacesContext.getCurrentInstance();  
		HttpServletRequest req = (HttpServletRequest) context.getExternalContext().getRequest();  
		System.out.println(req.getParameter("login"));
		
		return true;
	}

	public String getTagAux() {
		return tag;
	}

	public void setPostagem(Postagem postagem) {
		this.postagem = postagem;
	}

	public void setTagAux(String tagAux) {
		this.tag = tagAux;
	}
	

	
	public void salvarPostagem()
	{
		
	}
	
	public List<Postagem> getPostagens() {
		return postagens;
	}

	public void setPostagens(List<Postagem> postagens) {
		this.postagens = postagens;
	}

	
	public void deletar(ActionEvent actionEvent){
		FacesContext context = FacesContext.getCurrentInstance();  
		HttpServletRequest req = (HttpServletRequest) context.getExternalContext().getRequest();  
		int idPostagem = new Long( req.getParameter("idPostagem") ).intValue();  
		System.out.println("-->> " + idPostagem + " <<--");  
		servicoPostagem.deletar(idPostagem);
		postagens = servicoPostagem.getPostagens();
	}
}
