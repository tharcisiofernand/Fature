package br.com.capsule.service;

import java.util.List;

import br.com.capsule.model.Estabelecimento;

public interface EstabelecimentoService {
	
	public void cadastrar (Estabelecimento estabelcimento);
	public void deletar (int id);
	public List<Estabelecimento> litarTodos();
	public Estabelecimento listaPorId(int id);
	public Estabelecimento listaPorCnpj(Long cnpj);

}
