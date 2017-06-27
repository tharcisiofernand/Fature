package br.com.capsule.dao;

import java.util.List;

import br.com.capsule.model.Profissional;

public interface ProfissionalDao {
	
	public void cadastrar (Profissional profissional);
	public void deletar (int id);
	public void atualizar (Profissional profissional);
	public List<Profissional> litarTodos();
	public Profissional listaPorId(int id);
	public Profissional listaPorConselho(String conselho);

}
