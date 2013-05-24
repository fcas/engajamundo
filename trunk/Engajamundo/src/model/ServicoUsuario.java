package model;

import java.util.ArrayList;
import java.util.List;

import dao.DaoHibernate;
import dao.IDAOEngajador;
import entities.Engajador;
import exceptions.DaoException;

public class ServicoUsuario implements IServicoUsuario {

	private static ServicoUsuario singleton = null;

	private IDAOEngajador daoEngajador;

	public ServicoUsuario() {
		this.daoEngajador = new DaoHibernate();
	}

	public static IServicoUsuario getInstance() {

		if (singleton == null) {
			singleton = new ServicoUsuario();
		}

		return singleton;

	}

	public List<Engajador> getUsers()
	{
		return daoEngajador.getUsers();
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

	@Override
	public Engajador autenticar(String login, String senha)
	{
		return daoEngajador.autenticar(login, senha);
	}
}
