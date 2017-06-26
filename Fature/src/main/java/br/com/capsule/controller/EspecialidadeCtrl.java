package br.com.capsule.controller;

import java.util.List;

import br.com.capsule.model.Especialidade;

public interface EspecialidadeCtrl {
	
	public void cadastrar (Especialidade especialidade);
	public void deletar (int id);
	public void atualizar (Especialidade especialidade);
	public List<Especialidade> litarTodos();
	public Especialidade listaPorId(int id);
	public Especialidade listaPorCodigo(int codigo);

}
