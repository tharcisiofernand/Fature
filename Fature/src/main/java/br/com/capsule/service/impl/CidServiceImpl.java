package br.com.capsule.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.capsule.dao.CidDao;
import br.com.capsule.model.Cid;
import br.com.capsule.service.CidService;


@Service
public class CidServiceImpl implements CidService{
	
	private CidDao ciddao;

	public void setCiddao(CidDao ciddao) {
		this.ciddao = ciddao;
	}

	public void cadastrar(Cid cid) {
		this.ciddao.cadastrar(cid);
	}

	public void deletar(int id) {
		this.ciddao.deletar(id);	
	}

	public void atualizar(Cid cid) {
		this.ciddao.atualizar(cid);
	}

	public List<Cid> litarTodos() {
		return this.ciddao.litarTodos();
	}

	public Cid listaPorId(int id) {
		return this.ciddao.listaPorId(id);
	}

	public Cid listaPorCodigo(String codigo) {
		return this.ciddao.listaPorCodigo(codigo);
	}

}
