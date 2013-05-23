package model;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import dao.DaoHibernate;
import dao.IDAOEngajador;

@FacesValidator(value = "loginValidator")
public class ValidatorLogin implements Validator{

	@Override
	public void validate(FacesContext contexto, UIComponent component, Object value)
			throws ValidatorException {
		IDAOEngajador daoEngajador = new DaoHibernate();

		if(!daoEngajador.existeLogin(String.valueOf(value))){
			System.out.println("Excecao DAO");
            FacesMessage message = new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, "", "Nome do usuario não existente");
            throw new ValidatorException(message);
		}
	}

}
