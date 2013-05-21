package model;

import java.util.ArrayList;

public class Postagem {

	private Engajador autor;
	private String titulo;
	private String texto;
	private ArrayList<String> tags;
	
	public Postagem()
	{
		
	}
	
	public Engajador getAutor() {
		return autor;
	}
	public void setAutor(Engajador autor) {
		this.autor = autor;
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
