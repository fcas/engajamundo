package model;

import exceptions.ValidatorException;

public interface IServicoEngajamundo {
	
	void cadastrarEngajador(Engajador engajador) throws ValidatorException;

}
