package br.com.capsule.dao;

import java.util.List;

import br.com.capsule.model.Cid;

public interface CidDao {
	
	public void cadastrar (Cid cid);
	public void deletar (int id);
	public void atualizar (Cid cid);
	public List<Cid> litarTodos();
	public Cid listaPorId(int id);
	public Cid listaPorCodigo(String codigo);

}
