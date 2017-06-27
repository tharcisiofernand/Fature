package br.com.capsule.dao;

import java.util.List;

import br.com.capsule.model.Cbo;

public interface CboDao {
	
	public void cadastrar (Cbo cbo);
	public void deletar (int id);
	public void atualizar (Cbo cbo);
	public List<Cbo> litarTodos();
	public Cbo listaPorId(int id);
	public Cbo listaPorCodigo(int codigo);

}
