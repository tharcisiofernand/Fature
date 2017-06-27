package br.com.capsule.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.capsule.dao.TabelaDao;
import br.com.capsule.model.Tabela;
import br.com.capsule.service.TabelaService;

@Service
public class TabelaServiceImpl implements TabelaService{
	
	private TabelaDao tabeladao;

	public void setTabeladao(TabelaDao tabeladao) {
		this.tabeladao = tabeladao;
	}

	public void cadastrar(Tabela tabela) {
		this.tabeladao.cadastrar(tabela);
	}

	public void deletar(int id) {
		this.tabeladao.deletar(id);
	}

	public void atualizar(Tabela tabela) {	
		this.tabeladao.atualizar(tabela);
	}

	public List<Tabela> litarTodos() {
		return this.tabeladao.litarTodos();
	}

	public Tabela listaPorId(int id) {
		return this.tabeladao.listaPorId(id);
	}

	public Tabela listaPorCodigo(int codigo) {
		return this.tabeladao.listaPorCodigo(codigo);
	}

}
