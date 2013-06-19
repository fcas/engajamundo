package model;

import java.util.List;

import dao.DAOEngajador;
import dao.IDAOEngajador;
import entities.Engajador;
import exceptions.BuscaSemResultadoException;
import exceptions.DaoException;
import exceptions.LoginInvalidoException;

public class ServicoUsuario implements IServicoUsuario {

	private static ServicoUsuario singleton = null;

	private IDAOEngajador daoEngajador;

	public ServicoUsuario() {
		this.daoEngajador = new DAOEngajador();
	}

	public static IServicoUsuario getInstance() {

		if (singleton == null) {
			singleton = new ServicoUsuario();
		}

		return singleton;

	}

	public List<Engajador> getUsers() throws DaoException
	{
		return daoEngajador.listar(Engajador.class.getName());
	}
	
	@Override
	public void cadastrarEngajador(Engajador engajador) {
		try {
			this.daoEngajador.cadastrar(engajador);
		} catch (DaoException e) {
			
		}
	}

	public List<Engajador> buscarEngajador(String nomeEngajador) throws DaoException, BuscaSemResultadoException {
		return daoEngajador.buscar(Engajador.class.getSimpleName(), "nome", nomeEngajador);		
	}
	
	@Override
	public List<Engajador> buscarEngajadorPorPais(String nomePais) throws BuscaSemResultadoException, DaoException{
		return daoEngajador.buscar(Engajador.class.getSimpleName(), "pais", nomePais);		
	}

	@Override
	public Engajador buscarPorLogin(String nomeLogin) throws BuscaSemResultadoException, DaoException{
		return daoEngajador.buscar(Engajador.class.getSimpleName(), "login", nomeLogin).get(0);
	}

	@Override
	public Engajador autenticar(String login, String senha) throws LoginInvalidoException
	{
		return daoEngajador.autenticar(login, senha);
	}
	
	public void deletar(String login) throws DaoException {
		daoEngajador.deletar(login);
	}
	
	public void editar(Engajador engajador, String login) throws DaoException, BuscaSemResultadoException{
		this.daoEngajador.editar(engajador, login);
	}
}