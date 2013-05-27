package model;

import java.util.List;

import dao.DaoHibernate;
import dao.IDAOEngajador;
import entities.Engajador;
import exceptions.BuscaSemResultadoException;
import exceptions.DaoException;
import exceptions.LoginInvalidoException;

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
	public List<Engajador> buscarEngajador(String query) throws DaoException, BuscaSemResultadoException {
		return daoEngajador.buscarEngajador(query);		
	}
	
	@Override
	public List<Engajador> buscarEngajadorPorPais(String query) throws BuscaSemResultadoException, DaoException{
		return daoEngajador.buscarEngajadorPorPais(query);		
	}

	@Override
	public Engajador buscarPorLogin(String login) throws BuscaSemResultadoException{
		return daoEngajador.buscarPorLogin(login);
	}

	@Override
	public Engajador autenticar(String login, String senha) throws LoginInvalidoException
	{
		return daoEngajador.autenticar(login, senha);
	}
	
	public boolean deletar(String login) {
		return daoEngajador.deletar(login);
	}
	
	@Override
	public void editar(Engajador engajador, String login){
		this.daoEngajador.editar(engajador, login);
		
	}
}
