package model;

import java.util.ArrayList;
import java.util.List;

import entities.Engajador;
import exceptions.DaoException;

public interface IServicoUsuario {
	
	void cadastrarEngajador(Engajador engajador) throws DaoException;

	List<Engajador> getUsers();

	ArrayList<Engajador> buscarEngajador(String engajador) throws DaoException;

	ArrayList<Engajador> buscarEngajadorPorPais(String engajador) throws DaoException;

	Engajador autenticar(String login, String senha);
}
