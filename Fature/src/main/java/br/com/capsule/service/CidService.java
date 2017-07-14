package br.com.capsule.service;

import java.util.List;

import br.com.capsule.model.Cid;

public interface CidService {
	
	public void cadastrar (Cid cid);
	public void deletar (int id);
	public List<Cid> litarTodos();
	public Cid listaPorId(int id);
	public Cid listaPorCodigo(String codigo);

}
