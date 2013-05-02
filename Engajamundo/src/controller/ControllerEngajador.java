package controller;

import java.util.ArrayList;

import exceptions.DaoException;
import model.Engajador;
import model.IServicoUsuario;
import model.ServicoUsuario;

public class ControllerEngajador {

	private Engajador engajador;
	private ArrayList<Engajador> usuarios;
	private boolean buscou = false;
	private String query;
	IServicoUsuario servicoUsuario = ServicoUsuario
			.getInstance();
	
	public ControllerEngajador() {
		engajador = new Engajador();
		usuarios = new ArrayList();
	}
	
	public String editar(){
		usuarios = (ArrayList<Engajador>) servicoUsuario.getUsers();
		return "Editar";
	}

	public String cadastrarEngajador() {

		String action = "";

		try {
				servicoUsuario.cadastrarEngajador(engajador);
				action = "sucesso";
		} catch (DaoException e) {
			action = "erro";
			System.out.println(e);
		}

		return action;

	}
	
	public String visualizar()
	{
		usuarios = (ArrayList<Engajador>) servicoUsuario.getUsers();
		return "Visualizar";
	}
	
	public String manterUsuario()
	{
		return "manterUsuario";
	}
	
	public String cadastrar()
	{
		return "Cadastrar";
	}
	
	
	public String atualizar()
	{
		servicoUsuario.saveUsers(usuarios);
		return "sucesso";
	}
	
	public String buscarEngajador() {

		String action = "";
		try {
			usuarios = servicoUsuario.buscarEngajador(query);
			buscou = true;
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return action;
	}	

	public Engajador getEngajador() {
		return engajador;
	}

	public void setEngajador(Engajador engajador) {
		this.engajador = engajador;
	}

	public ArrayList<Engajador> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Engajador> usuarios) {
		this.usuarios = usuarios;
	}

	public boolean isBuscou() {
		return buscou;
	}

	public void setBuscou(boolean buscou) {
		this.buscou = buscou;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

}
