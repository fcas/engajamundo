package controller;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;


import entities.Engajador;
import exceptions.LoginInvalidoException;
import model.IServicoUsuario;
import model.ServicoUsuario;

public class ControllerSession {

	Engajador usuarioAtual;
	private String login, senha;
	IServicoUsuario servicoUsuario = ServicoUsuario
			.getInstance();
	
	public String autenticar()
	{
		try{
		usuarioAtual = servicoUsuario.autenticar(login, senha);
		HttpSession session = ( HttpSession ) FacesContext.getCurrentInstance().getExternalContext().getSession(false);  
		session.setAttribute("usuario", usuarioAtual);
		
		if (usuarioAtual == null){
			return "erro";
		}
		
		if (usuarioAtual.getLogin().equals("admin")){
			return "admin";
		} else return "engajador";
		}catch(LoginInvalidoException e){
			FacesMessage message = new FacesMessage("Senha incorreta");  
            message.setSeverity(FacesMessage.SEVERITY_ERROR);  
            FacesContext.getCurrentInstance().addMessage("home:password", message);  
			return "erro";
		}
	}
	
	public String logoff (){
		
		HttpSession session = ( HttpSession ) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		
		String atributo; 
		
		while(session.getAttributeNames().hasMoreElements()){
			atributo = session.getAttributeNames().nextElement();
			session.removeAttribute(atributo);
		}
		
		return "login?faces-redirect=true";
		
	}
	
	public Engajador getUsuarioAtual() {
		return usuarioAtual;
	}
	
	public String getLogin() {
		return login;
	}
	public String getSenha() {
		return senha;
	}
	public void setUsuarioAtual(Engajador usuarioAtual) {
		this.usuarioAtual = usuarioAtual;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
