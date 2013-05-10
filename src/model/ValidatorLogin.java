package model;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import dao.DaoEmMemoria;
import dao.IDAOEngajador;

public class ValidatorLogin implements Validator{

	@Override
	public void validate(FacesContext contexto, UIComponent component, Object value)
			throws ValidatorException {
		IDAOEngajador daoEngajador = new DaoEmMemoria();

		if(!daoEngajador.existeLogin(String.valueOf(value))){
			System.out.println("Excecao DAO");
            FacesMessage message = new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, "", "Nome do usuario não existente");
            throw new ValidatorException(message);
		}
	}

}
