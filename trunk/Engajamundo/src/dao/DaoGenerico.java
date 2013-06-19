package dao;

import java.util.List;

import exceptions.BuscaSemResultadoException;
import exceptions.DaoException;

public interface DaoGenerico<T> {
	
	  public void cadastrar(T entidade) throws DaoException;
      public void editar(T entidade) throws DaoException;
      public void deletar(String id) throws DaoException;
      public List<T> busca(String tabela, String Parametro) throws DaoException, BuscaSemResultadoException;
      public List<T> listar(String tabela) throws DaoException;
      public boolean existeID(String tabela, String Parametro) throws DaoException;
}
