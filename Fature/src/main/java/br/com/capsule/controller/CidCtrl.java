package br.com.capsule.controller;

import java.util.List;

import br.com.capsule.model.Cid;

public interface CidCtrl {
	
	public void cadastrar (Cid cid);
	public void deletar (int id);
	public void atualizar (Cid cid);
	public List<Cid> litarTodos();
	public Cid listaPorId(int id);
	public Cid listaPorCodigo(String codigo);

}
