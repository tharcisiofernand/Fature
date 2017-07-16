package br.com.capsule.service;

import java.util.List;

import br.com.capsule.model.Profissional;

public interface ProfissionalService {
	
	public void cadastrar (Profissional profissional);
	public void deletar (Long id);
	public List<Profissional> litarTodos();
	public Profissional listaPorId(Long id);
	public String listaPorConselho(Long conselho);

}
