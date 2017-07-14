package br.com.capsule.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.capsule.dao.EstabelecimentoDao;
import br.com.capsule.model.Estabelecimento;
import br.com.capsule.service.EstabelecimentoService;

@Service("EstabelecimentoService")
@Transactional
public class EstabelecimentoServiceImpl implements EstabelecimentoService{
	
	@Autowired
	private EstabelecimentoDao estabelecimentodao;

	public void cadastrar(Estabelecimento estabelcimento) {
		this.estabelecimentodao.save(estabelcimento);			
	}

	public void deletar(int id) {
		this.estabelecimentodao.delete((long) id);		
	}

	public List<Estabelecimento> litarTodos() {
		return (List<Estabelecimento>) this.estabelecimentodao.findAll();
	}

	public Estabelecimento listaPorId(int id) {
		return this.estabelecimentodao.findOne((long) id);
	}

	public Estabelecimento listaPorCnpj(Long cnpj) {
		return this.estabelecimentodao.listaPorCnpj(cnpj);
	}

	
}
