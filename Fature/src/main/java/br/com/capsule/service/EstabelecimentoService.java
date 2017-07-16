package br.com.capsule.service;

import java.util.List;

import br.com.capsule.model.Estabelecimento;

public interface EstabelecimentoService {
	
	public void cadastrar (Estabelecimento estabelcimento);
	public void deletar (Long id);
	public List<Estabelecimento> litarTodos();
	public Estabelecimento listaPorId(Long id);
	public String listaPorCnpj(Long cnpj);
	public String listaPorCnes(Long cnes);

}
