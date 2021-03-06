package br.com.capsule.service;

import java.util.List;

import br.com.capsule.model.Tabela;

public interface TabelaService {
	
	public void cadastrar (Tabela tabela);
	public void deletar (Long id);
	public List<Tabela> litarTodos();
	public Tabela listaPorId(Long id);
	public String listaPorCodigo(Long codigo);

}
