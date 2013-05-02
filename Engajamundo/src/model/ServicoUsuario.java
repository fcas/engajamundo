package model;

import java.util.ArrayList;

import dao.DaoEmMemoria;
import dao.IDAOEngajador;
import exceptions.DaoException;

public class ServicoUsuario implements IServicoUsuario {

	private static ServicoUsuario singleton = null;

	private IDAOEngajador daoEngajador;

	public ServicoUsuario() {
		this.daoEngajador = new DaoEmMemoria();
	}

	public static IServicoUsuario getInstance() {

		if (singleton == null) {
			singleton = new ServicoUsuario();
		}

		return singleton;

	}

	public ArrayList<Engajador> getUsers()
	{
		return daoEngajador.getUsers();
	}
	
	public void saveUsers(ArrayList<Engajador> usuarios)
	{
		daoEngajador.saveUsers(usuarios);
	}
	
	@Override
	public void cadastrarEngajador(Engajador engajador) {
		try {
			this.daoEngajador.cadastrarEngajador(engajador);
		} catch (DaoException e) {
			
		}
	}

	@Override
	public ArrayList<Engajador> buscarEngajador(String query) throws DaoException {
		return daoEngajador.buscarEngajador(query);		
	}
	
	@Override
	public ArrayList<Engajador> buscarEngajadorPorPais(String query) throws DaoException {
		return daoEngajador.buscarEngajadorPorPais(query);		
	}

}
