package controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean(name="controllerMessages")
public class ControllerMessages {

	private String mensagem;  
    
    public String getText() {  
        return mensagem;  
    }  
    public void setText(String mensagem) {  
        this.mensagem = mensagem;  
    }  
  
    public void save(ActionEvent actionEvent) {  
        FacesContext context = FacesContext.getCurrentInstance();  
          
        context.addMessage(null, new FacesMessage("Successful", "Hello " + mensagem));  
        context.addMessage(null, new FacesMessage("Second Message", "Additional Info Here..."));  
    }  
	
}
