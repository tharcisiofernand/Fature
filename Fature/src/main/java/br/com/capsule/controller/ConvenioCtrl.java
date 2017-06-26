package br.com.capsule.controller;

import java.util.List;

import br.com.capsule.model.Convenio;

public interface ConvenioCtrl {
	
	public void cadastrar (Convenio convenio);
	public void deletar (int id);
	public void atualizar (Convenio convenio);
	public List<Convenio> litarTodos();
	public Convenio listaPorId(int id);
	public Convenio listaPorCodigo(int codigo);

}
