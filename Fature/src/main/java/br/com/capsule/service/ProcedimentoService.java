package br.com.capsule.service;

import java.util.List;

import br.com.capsule.model.Procedimentos;

public interface ProcedimentoService {
	
	public void cadastrar (Procedimentos procedimento);
	public void deletar (int id);
	public List<Procedimentos> litarTodos();
	public Procedimentos listaPorId(int id);
	public Procedimentos listaPorCodigo(String codigo);

}
