package br.com.capsule.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.capsule.dao.EstabelecimentoDao;
import br.com.capsule.model.Estabelecimento;
import br.com.capsule.service.EstabelecimentoService;

@Service
public class EstabelecimentoServiceImpl implements EstabelecimentoService{
	
	private EstabelecimentoDao estabelecimentodao;

	public void setEstabelecimentodao(EstabelecimentoDao estabelecimentodao) {
		this.estabelecimentodao = estabelecimentodao;
	}

	public void cadastrar(Estabelecimento estabelcimento) {
		this.estabelecimentodao.cadastrar(estabelcimento);			
	}

	public void deletar(int id) {
		this.estabelecimentodao.deletar(id);		
	}

	public void atualizar(Estabelecimento estabelecimento) {
		this.estabelecimentodao.atualizar(estabelecimento);		
	}

	public List<Estabelecimento> litarTodos() {
		return this.estabelecimentodao.litarTodos();
	}

	public Estabelecimento listaPorId(int id) {
		return this.estabelecimentodao.listaPorId(id);
	}

	public Estabelecimento listaPorCnpj(int cnpj) {
		return this.estabelecimentodao.listaPorCnpj(cnpj);
	}

	
}
