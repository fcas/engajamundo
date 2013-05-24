package controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import exceptions.DaoException;
import entities.Engajador;
import model.IServicoUsuario;
import model.ServicoUsuario;

@ManagedBean(name="controllerEngajador")
public class ControllerEngajador {

	private Engajador engajador;
	private List<Engajador> usuarios;
	private ArrayList<Boolean> del;
	private boolean buscou = false;
	private String query;
	IServicoUsuario servicoUsuario = ServicoUsuario
			.getInstance();
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void iniciarDel(int tam)
	{
		del = new ArrayList();
		for (int i = 0; i < tam; i++)
			del.add(false);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ControllerEngajador() {
		engajador = new Engajador();
		usuarios = new ArrayList();
	}
	
	@SuppressWarnings("unchecked")
	public String editar(){
		usuarios = (ArrayList<Engajador>) servicoUsuario.getUsers();
		iniciarDel(usuarios.size());
		return "Editar";
	}

	public String cadastrarEngajador() {

		String action = "";

		try {
				servicoUsuario.cadastrarEngajador(engajador);
				action = "sucesso";
		} catch (DaoException e) {
			action = "erro";
			System.out.println(e);
		}

		return action;

	}
	
	public String deletar() {
		
		try {
			for (int i = 0; i < usuarios.size(); i++)
			{
				if (usuarios.get(i).isSelecionado())
					usuarios.remove(i);
			}
			return "sucesso";
		}
		catch (Exception e)
		{
			return "erro";
		}
		
	}
	@SuppressWarnings("unchecked")
	public String visualizar()
	{
		usuarios = (List<Engajador>) servicoUsuario.getUsers();
		iniciarDel(usuarios.size());
		return "Visualizar";
	}
	
	public String manterUsuario()
	{
		return "manterUsuario";
	}
	
	public String cadastrar()
	{
		return "Cadastrar";
	}
	
	
	public String atualizar()
	{
//		servicoUsuario.saveUsers(usuarios);
		return "sucesso";
	}
	
	public String buscar()
	{
		return "Buscar";
	}
	
	public String buscarPorPais()
	{
		buscou = false;
		query = "";
		return "BuscarPorPais";
	}
	
	public String buscarPorNome() {
		buscou = false;
		query = "";
		return "BuscarPorNome";
	}
	
	public String buscarEngajadorPorNome() {

		String action = "";
		try {
			usuarios = servicoUsuario.buscarEngajador(query);
			iniciarDel(usuarios.size());
			buscou = true;
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return action;
	}
	
	public String buscarEngajadorPorPais() {

		String action = "";
		try {
			usuarios = servicoUsuario.buscarEngajadorPorPais(query);
			iniciarDel(usuarios.size());
			buscou = true;
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return action;
	}

	public Engajador getEngajador() {
		return engajador;
	}

	public void setEngajador(Engajador engajador) {
		this.engajador = engajador;
	}

	public List<Engajador> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Engajador> usuarios) {
		this.usuarios = usuarios;
	}

	public boolean isBuscou() {
		return buscou;
	}

	public void setBuscou(boolean buscou) {
		this.buscou = buscou;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

}
