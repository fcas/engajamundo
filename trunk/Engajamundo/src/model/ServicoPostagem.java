package model;

import dao.DaoEmMemoria;
import dao.IDAOEngajador;

public class ServicoPostagem {

	private static ServicoPostagem singleton = null;

	private IDAOEngajador daoEngajador;

	public ServicoPostagem() {
		this.daoEngajador = new DaoEmMemoria();
	}

	public static ServicoPostagem getInstance() {

		if (singleton == null) {
			singleton = new ServicoPostagem();
		}

		return singleton;

	}
	
	public void postar(Postagem post)
	{
		
	}
}
