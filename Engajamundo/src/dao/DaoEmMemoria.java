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
		this.engajadores = new ArrayList<Engajador>();
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
	public Engajador buscarEngajador(Engajador engajador) throws DaoException {

		for (int i = 0; i < engajadores.size(); i++) {
			if (engajadores.get(i).getNome().equals(engajador.getNome())) {
				return engajador;
			}

		}

		throw new DaoException("Usuário não encontrado");
	}

}
