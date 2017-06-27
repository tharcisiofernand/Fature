package br.com.capsule.dao;

import java.util.List;

import br.com.capsule.model.Estabelecimento;

public interface EstabelecimentoDao {
	
	public void cadastrar (Estabelecimento estabelcimento);
	public void deletar (int id);
	public void atualizar (Estabelecimento estabelecimento);
	public List<Estabelecimento> litarTodos();
	public Estabelecimento listaPorId(int id);
	public Estabelecimento listaPorCnpj(int cnpj);

}
