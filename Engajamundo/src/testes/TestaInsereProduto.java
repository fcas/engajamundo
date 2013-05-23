package testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import controller.ControllerEngajador;

import dao.DaoHibernate;

import entities.Engajador;
import entities.Produto;
import exceptions.DaoException;

public class TestaInsereProduto {
	
	public static void main(String[] args) throws DaoException {
		
		ControllerEngajador ce = new ControllerEngajador();
		
		DaoHibernate daoH = new DaoHibernate();
		
		Engajador p = new Engajador();
		p.setLogin("er");
		
		ce.setEngajador(p);
		ce.cadastrarEngajador();
		
		
	}
}