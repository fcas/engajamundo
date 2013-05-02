package dao;

import java.util.ArrayList;

import exceptions.DaoException;

import model.Engajador;

public class DaoEmMemoria implements IDAOEngajador {

	private ArrayList<Engajador> engajadores;
	private String nome = "";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DaoEmMemoria() {
		engajadores = new ArrayList();
		engajadores.add(new Engajador("Lucas", "Rodrigues", "lucas@bol.com.br", "01/07/1993", 99749574));
		engajadores.add(new Engajador("Itanildo", "Augusto", "ssdfg@bol.com.br", "12/12/1567", 45364756));
		engajadores.add(new Engajador("Mariana", "Cagona", "shalala@ig.com.br", "04/05/1667", 85746352));
		
	}

	public ArrayList<Engajador> getUsers(){
		return this.engajadores;
	}

	public void saveUsers(ArrayList<Engajador> usuarios) {
		this.engajadores = usuarios;
	}
	
	public void cadastrarEngajador(Engajador engajador)
			throws DaoException {

		try {

			engajadores.add(engajador);

			for (int i = 0; i < engajadores.size(); i++) {
				System.out.println(engajadores.get(i).getNome()
						+ " foi cadastrado com sucesso!!!");
			}
		} catch (Exception e) {
			throw new DaoException("Erro no cadastro");
		}

	}

	@Override
	public ArrayList<Engajador> buscarEngajador(String query) throws DaoException {

		ArrayList<Engajador> usuarios = new ArrayList();
		for (int i = 0; i < engajadores.size(); i++) {
			if (engajadores.get(i).getNome().equals(query)) {
				System.out.println("Resultado:" + query);
				usuarios.add(engajadores.get(i));
			}

		}
		if (usuarios.size() == 0)
			throw new DaoException("Usuário não encontrado");
		else
			return usuarios;
	}

}
