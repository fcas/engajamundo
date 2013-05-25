package controller;

import entities.Postagem;
import model.ServicoPostagem;

public class ControllerPostagem {

	ServicoPostagem servicoPostagem = ServicoPostagem
			.getInstance();
	private Postagem post;
	private String tagAux;
	
	public String postar()
	{
		servicoPostagem.postar(post, tagAux);
		return "";
	}
	
	public Postagem getPost() {
		return post;
	}

	public String getTagAux() {
		return tagAux;
	}

	public void setPost(Postagem post) {
		this.post = post;
	}

	public void setTagAux(String tagAux) {
		this.tagAux = tagAux;
	}
	
	public void salvarPostagem()
	{
		
	}
	
	
}
