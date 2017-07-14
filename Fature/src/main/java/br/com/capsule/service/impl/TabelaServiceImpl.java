package br.com.capsule.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.capsule.dao.TabelaDao;
import br.com.capsule.model.Tabela;
import br.com.capsule.service.TabelaService;

@Service("TabelaService")
@Transactional
public class TabelaServiceImpl implements TabelaService{
	
	@Autowired
	private TabelaDao tabeladao;

	public void cadastrar(Tabela tabela) {
		this.tabeladao.save(tabela);
	}

	public void deletar(int id) {
		this.tabeladao.delete((long) id);
	}

	public List<Tabela> litarTodos() {
		return (List<Tabela>) this.tabeladao.findAll();
	}

	public Tabela listaPorId(int id) {
		return this.tabeladao.findOne((long) id);
	}

	public Tabela listaPorCodigo(Long codigo) {
		return this.tabeladao.listaPorCodigo(codigo);
	}

}
