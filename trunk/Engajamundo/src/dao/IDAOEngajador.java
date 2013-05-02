package dao;

import exceptions.ValidatorException;
import model.Engajador;

public interface IDAOEngajador {

	String cadastrarEngajador(Engajador engajador) throws ValidatorException;

}
