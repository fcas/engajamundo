package model;

import java.util.ArrayList;

import exceptions.DaoException;

public interface IServicoUsuario {
	
	void cadastrarEngajador(Engajador engajador) throws DaoException;

	Object getUsers();

	void saveUsers(ArrayList<Engajador> usuarios);

	ArrayList<Engajador> buscarEngajador(String engajador) throws DaoException;

	ArrayList<Engajador> buscarEngajadorPorPais(String engajador) throws DaoException;
}
