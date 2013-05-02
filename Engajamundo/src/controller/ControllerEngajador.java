package controller;

import exceptions.DaoException;
import model.Engajador;
import model.IServicoEngajamundo;
import model.ServicoEngajamundo;

public class ControllerEngajador {

	private Engajador engajador;

	public ControllerEngajador() {
		engajador = new Engajador();
	}
	
	IServicoEngajamundo servicoEngajamundo = ServicoEngajamundo
			.getInstance();
	
	public String cadastrarEngajador() {

		String action = "";

		try {
				servicoEngajamundo.cadastrarEngajador(engajador);
				action = "sucesso";
		} catch (DaoException e) {
			action = "erro";
			System.out.println(e);
		}

		return action;

	}
	
	public String buscarEngajador() {

		String action = "";

		try {
				servicoEngajamundo.buscarEngajador(engajador);
				action = "sucesso";
		} catch (DaoException e) {
			action = "erro";
			System.out.println(e);
		}

		return action;

	}
	

	public Engajador getEngajador() {
		return engajador;
	}

	public void setEngajador(Engajador engajador) {
		this.engajador = engajador;
	}

}
