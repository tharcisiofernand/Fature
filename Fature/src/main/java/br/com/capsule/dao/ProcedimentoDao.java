package br.com.capsule.dao;

import java.util.List;

import br.com.capsule.model.Procedimentos;

public interface ProcedimentoDao {

	public void cadastrar (Procedimentos procedimento);
	public void deletar (int id);
	public void atualizar (Procedimentos procedimento);
	public List<Procedimentos> litarTodos();
	public Procedimentos listaPorId(int id);
	public Procedimentos listaPorCodigo(String codigo);
}
