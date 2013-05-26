package entities;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Postagens", schema="engajamundoDB")  
public class Postagem {

	@Id
	@Column(name="login", length=20)
	public String login;
	@Column(name="titulo", length=20)
	public String titulo;
	@Column(name="texto", length=140)
	public String texto;
	@Column(name="tag", length=50)
	public ArrayList<String> tags;
	
	public Postagem()
	{
		
	}
	
	public Postagem(String titulo, String texto, ArrayList<String> tags, String login){ 
		this.titulo = titulo; 
		this.texto = texto; 
		this.tags = tags; 
		this.login = login;
	}
	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public ArrayList<String> getTags() {
		return tags;
	}

	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	
	
	
}
