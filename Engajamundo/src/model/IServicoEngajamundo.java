package model;

import exceptions.DaoException;

public interface IServicoEngajamundo {
	
	void cadastrarEngajador(Engajador engajador) throws DaoException;

	void buscarEngajador(Engajador engajador) throws DaoException;

}
