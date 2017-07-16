package br.com.capsule.service;

import java.util.List;

import br.com.capsule.model.Cid;

public interface CidService {
	
	public void cadastrar (Cid cid);
	public void deletar (Long id);
	public List<Cid> litarTodos();
	public String listaPorCodigo(String codigo);
	public Cid listaPorId(Long id);

}
