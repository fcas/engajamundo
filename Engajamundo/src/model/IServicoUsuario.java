package model;

import java.util.List;


import entities.Engajador;
import exceptions.BuscaSemResultadoException;
import exceptions.DaoException;
import exceptions.LoginInvalidoException;

public interface IServicoUsuario {
	
	void cadastrarEngajador(Engajador engajador) throws DaoException;

	List<Engajador> getUsers();

	List<Engajador> buscarEngajador(String engajador) throws DaoException, BuscaSemResultadoException;

	List<Engajador> buscarEngajadorPorPais(String engajador) throws DaoException, BuscaSemResultadoException;
	
	Engajador buscarPorLogin(String login) throws BuscaSemResultadoException;

	Engajador autenticar(String login, String senha) throws LoginInvalidoException;
	
	boolean deletar(String login);

	void editar(Engajador engajador, String login);
	
}