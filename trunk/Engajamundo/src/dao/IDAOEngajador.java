package dao;

import exceptions.DaoException;
import model.Engajador;

public interface IDAOEngajador {

	void cadastrarEngajador(Engajador engajador) throws DaoException;

	Engajador buscarEngajador(Engajador engajador) throws DaoException;

}
