package controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import entities.Postagem;
import exceptions.DaoException;
import exceptions.UsuarioNaoAutenticadoException;
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

		try {
			servicoPostagem.postar(postagem, tag);
			postagens = servicoPostagem.getPostagens();
			return "sucesso";
		} catch (UsuarioNaoAutenticadoException e) {
			FacesMessage message = new FacesMessage("Login necessário");  
            message.setSeverity(FacesMessage.SEVERITY_ERROR);  
            FacesContext.getCurrentInstance().addMessage("home:password", message);
		}

		return 	"erro";
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

	public String getTagAux() {
		return tag;
	}

	public void setPost(Postagem postagem) {
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

}
