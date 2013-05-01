package model;

import dao.DaoEmMemoria;
import dao.IDAOEngajador;
import exceptions.CadastroExcpetion;

public class ServicoEngajamundo implements IServicoEngajamundo {

	private static ServicoEngajamundo singleton = null;

	private IDAOEngajador daoEngajador;

	public ServicoEngajamundo() {
		this.daoEngajador = new DaoEmMemoria();
	}

	public static IServicoEngajamundo getInstance() {

		if (singleton == null) {
			singleton = new ServicoEngajamundo();
		}

		return singleton;

	}

	private int[] quebraData(String dataString) {
		String[] aux = dataString.split("/");
		int[] dataInt = new int[3];
		for (int i = 0; i < 3; i++) {
			dataInt[i] = Integer.parseInt(aux[i]);

		}
		return dataInt;
	}

	private boolean checaData(int[] dataInt) {
		int dia = dataInt[0];
		int mes = dataInt[1];
		int ano = dataInt[2];
		boolean bissexto = false;
		if (ano >= 1896 && ano <= 2020) { // se for um ano valido
			if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)) { // se for bissexto
				bissexto = true;
			}

			if (mes >= 1 && mes <= 12) { // se for um mes valido

				if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8
						|| mes == 10 || mes == 12) { // se for um mes com 31 dias
					if (dia >= 1 && dia <= 31) { // se tiver 31 dias
						return true;
					}
				} else

					if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { // se for
						// um mes com 30 dias
						if (dia >= 1 && dia <= 30) { // se tiver ate 30 dias
							return true;
						}
					} else

						if (mes == 2) { // se for o mes 2
							if (bissexto) { // se for bissexto
								if (dia >= 1 && dia <= 29) { // se tem ate 29 dias
									return true;
								}
							} else { // se nao for bissexto
								if (dia >= 1 && dia <= 28) { // se tem ate 28 dias
									return true;
								}
							}
						}
			}

		}
		return false;
	}

	public boolean validacao_cadastro(Engajador engajador)
			throws CadastroExcpetion {

		if (engajador.getNome() == null || engajador.getNome().isEmpty()) {
			throw new CadastroExcpetion("Nome inválido");
		}

		if (engajador.getSobrenome() == null
				|| engajador.getSobrenome().isEmpty()) {
			throw new CadastroExcpetion("Sobrenome inválido");
		}

		if (!(engajador.getEmail().contains("@"))
				|| engajador.getNome().isEmpty()
				|| engajador.getEmail() == null) {
			throw new CadastroExcpetion("Email inválido");
		}

		if (engajador.getSobrenome() == null
				|| engajador.getSobrenome().isEmpty()) {
			throw new CadastroExcpetion("Sobrenome inválido");
		}

		if (engajador.getData_nascimento() != null
				&& !engajador.getData_nascimento().isEmpty()) {
			if (!(checaData(quebraData(engajador.getData_nascimento())))) {
				throw new CadastroExcpetion("Data inválida");
			}
		}

		if ((Integer.toString(engajador.getTelefone()).length() < 8)) {
			engajador.getTelefone();
			throw new CadastroExcpetion("Telefone inválido");
		}

		return true;
	}

	@Override
	public void cadastrarEngajador(Engajador engajador)
			throws CadastroExcpetion {
		if (validacao_cadastro(engajador)) {
			this.daoEngajador.cadastrarEngajador(engajador);
		} 
	}

}
