package br.com.capsule.service;

import java.util.List;

import br.com.capsule.model.Procedimentos;

public interface ProcedimentoService {
	
	public void cadastrar (Procedimentos procedimento);
	public void deletar (Long id);
	public List<Procedimentos> litarTodos();
	public Procedimentos listaPorId(Long id);
	public String listaPorCodigo(Long codigo);

}
