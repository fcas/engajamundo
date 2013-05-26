package controller;

import entities.Postagem;
import exceptions.DaoException;
import model.ServicoPostagem;

public class ControllerPostagem {

	ServicoPostagem servicoPostagem = ServicoPostagem
			.getInstance();
	public Postagem post;
	public String tag;
	
	public String postar() throws DaoException
	{
		servicoPostagem.postar(post, tag);
		return 	"sucesso";
	}
	
	public Postagem getPost() {
		return post;
	}

	public String getTagAux() {
		return tag;
	}

	public void setPost(Postagem post) {
		this.post = post;
	}

	public void setTagAux(String tagAux) {
		this.tag = tagAux;
	}
	
	public void salvarPostagem()
	{
		
	}
	
	
}
