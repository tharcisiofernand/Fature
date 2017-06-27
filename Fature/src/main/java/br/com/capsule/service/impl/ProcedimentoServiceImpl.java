package br.com.capsule.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.capsule.dao.ProcedimentoDao;
import br.com.capsule.model.Procedimentos;
import br.com.capsule.service.ProcedimentoService;

@Service
public class ProcedimentoServiceImpl implements ProcedimentoService{
	
	private ProcedimentoDao procedimentodao;

	public void setProcedimentodao(ProcedimentoDao procedimentodao) {
		this.procedimentodao = procedimentodao;
	}

	public void cadastrar(Procedimentos procedimento) {	
		this.procedimentodao.cadastrar(procedimento);
	}

	public void deletar(int id) {
		this.procedimentodao.deletar(id);
	}

	public void atualizar(Procedimentos procedimento) {	
		this.procedimentodao.atualizar(procedimento);
	}

	public List<Procedimentos> litarTodos() {
		return this.procedimentodao.litarTodos();
	}

	public Procedimentos listaPorId(int id) {
		return this.procedimentodao.listaPorId(id);
	}

	public Procedimentos listaPorCodigo(String codigo) {
		return this.procedimentodao.listaPorCodigo(codigo);
	}

}
