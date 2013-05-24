package dao;

import java.util.ArrayList;
import java.util.List;

import exceptions.DaoException;
import entities.Engajador;
import model.Postagem;

public interface IDAOEngajador {

	void cadastrarEngajador(Engajador engajador) throws DaoException;

	List<Engajador> getUsers();

	void saveUsers(ArrayList<Engajador> usuarios);

	ArrayList<Engajador> buscarEngajador(String query) throws DaoException;

	ArrayList<Engajador> buscarEngajadorPorPais(String query) throws DaoException;
	
	void savePost(Postagem post);

	Engajador autenticar(String login, String senha);
	
	boolean existeLogin(String login);
}
