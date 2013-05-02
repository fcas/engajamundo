package dao;

import java.util.ArrayList;

import exceptions.DaoException;
import model.Engajador;

public interface IDAOEngajador {

	void cadastrarEngajador(Engajador engajador) throws DaoException;

	ArrayList<Engajador> getUsers();

	void saveUsers(ArrayList<Engajador> usuarios);

	ArrayList<Engajador> buscarEngajador(String query) throws DaoException;

	ArrayList<Engajador> buscarEngajadorPorPais(String query) throws DaoException;
}
