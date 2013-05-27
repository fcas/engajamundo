package dao;

import java.util.List;

import exceptions.DaoException;
import entities.Engajador;
import entities.Postagem;

public interface IDAOEngajador {

	void cadastrarEngajador(Engajador engajador) throws DaoException;

	List<Engajador> getUsers();

	List<Engajador> buscarEngajador(String query) throws DaoException;

	List<Engajador> buscarEngajadorPorPais(String query) throws DaoException;
	
	void savePost(Postagem post);

	Engajador autenticar(String login, String senha);
	
	boolean existeLogin(String login);
	
	boolean deletar(String login);

	List<Postagem> listarPostagens();
}
