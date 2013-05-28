package model;

import java.util.List;
import entities.Postagem;

public interface IServicoPostagem {
	
	public List<Postagem> getPostagens();
	
	public void postar(Postagem post, String tagAux);

}
