package model;

import java.util.List;


import entities.Engajador;
import exceptions.DaoException;
import exceptions.LoginInvalidoException;

public interface IServicoUsuario {
	
	void cadastrarEngajador(Engajador engajador) throws DaoException;

	List<Engajador> getUsers();

	List<Engajador> buscarEngajador(String engajador) throws DaoException;

	List<Engajador> buscarEngajadorPorPais(String engajador) throws DaoException;

	Engajador autenticar(String login, String senha) throws LoginInvalidoException;
	
	boolean deletar(String login);
	
}
