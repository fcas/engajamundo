package model;

import dao.DaoEmMemoria;
import dao.IDAOEngajador;
import exceptions.DaoException;

public class ServicoEngajamundo implements IServicoEngajamundo {

	private static ServicoEngajamundo singleton = null;

	private IDAOEngajador daoEngajador;

	public ServicoEngajamundo() {
		this.daoEngajador = new DaoEmMemoria();
	}

	public static IServicoEngajamundo getInstance() {

		if (singleton == null) {
			singleton = new ServicoEngajamundo();
		}

		return singleton;

	}

	@Override
	public void cadastrarEngajador(Engajador engajador)
			throws DaoException {
			this.daoEngajador.cadastrarEngajador(engajador);
	}

	@Override
	public void buscarEngajador(Engajador engajador) throws DaoException {
		this.daoEngajador.buscarEngajador(engajador);		
	}

}
