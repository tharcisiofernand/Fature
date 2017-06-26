package br.com.capsule.controller;

import java.util.List;

import br.com.capsule.model.Estabelecimento;

public interface EstabelecimentoCtrl {
	
	public void cadastrar (Estabelecimento estabelcimento);
	public void deletar (int id);
	public void atualizar (Estabelecimento estabelecimento);
	public List<Estabelecimento> litarTodos();
	public Estabelecimento listaPorId(int id);
	public Estabelecimento listaPorCnpj(int cnpj);

}
