package br.com.capsule.service;

import java.util.List;

import br.com.capsule.model.Cbo;

public interface CboService {
	
	public void cadastrar (Cbo cbo);
	public void deletar (Long id);
	public List<Cbo> litarTodos();
	public String listaPorCodigo(Long codigo);
	public Cbo listaPorId(Long id);

}
