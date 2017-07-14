package br.com.capsule.service;

import java.util.List;

import br.com.capsule.model.Especialidade;

public interface EspecialidadeService {
	
	public void cadastrar (Especialidade especialidade);
	public void deletar (int id);
	public List<Especialidade> litarTodos();
	public Especialidade listaPorId(int id);

}
