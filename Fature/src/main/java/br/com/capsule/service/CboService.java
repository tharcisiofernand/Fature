package br.com.capsule.service;

import java.util.List;

import br.com.capsule.model.Cbo;

public interface CboService {
	
	public void cadastrar (Cbo cbo);
	public void deletar (int id);
	public void atualizar (Cbo cbo);
	public List<Cbo> litarTodos();
	public Cbo listaPorId(int id);
	public Cbo listaPorCodigo(int codigo);

}
