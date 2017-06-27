package br.com.capsule.service;

import java.util.List;

import br.com.capsule.model.Especialidade;

public interface EspecialidadeService {
	
	public void cadastrar (Especialidade especialidade);
	public void deletar (int id);
	public void atualizar (Especialidade especialidade);
	public List<Especialidade> litarTodos();
	public Especialidade listaPorId(int id);
	public Especialidade listaPorCodigo(int codigo);

}
