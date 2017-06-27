package br.com.capsule.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.capsule.dao.CboDao;
import br.com.capsule.model.Cbo;
import br.com.capsule.service.CboService;


@Service
public class CboServiceImpl implements CboService{

	private CboDao cbodao;
	
	public void setCbodao(CboDao cbodao) {
		this.cbodao = cbodao;
	}

	public void cadastrar(Cbo cbo) {
		this.cbodao.cadastrar(cbo);
		
	}

	public void deletar(int id) {
		this.cbodao.deletar(id);
		
	}

	public void atualizar(Cbo cbo) {
		this.cbodao.atualizar(cbo);
		
	}

	public List<Cbo> litarTodos() {
		return this.cbodao.litarTodos();
	}

	public Cbo listaPorId(int id) {
		return this.cbodao.listaPorId(id);
	}

	public Cbo listaPorCodigo(int codigo) {
		return this.cbodao.listaPorCodigo(codigo);
	}

}
