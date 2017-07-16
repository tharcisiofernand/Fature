package br.com.capsule.service;

import java.util.List;

import br.com.capsule.model.Convenio;

public interface ConvenioService {
	
	public void cadastrar (Convenio convenio);
	public void deletar (Long id);
	public List<Convenio> litarTodos();
	public Convenio listaPorId(Long id);
	public String listaPorCodigo(Long codigo);

}
