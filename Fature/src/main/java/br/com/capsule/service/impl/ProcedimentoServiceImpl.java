package br.com.capsule.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.capsule.dao.ProcedimentoDao;
import br.com.capsule.model.Procedimentos;
import br.com.capsule.service.ProcedimentoService;

@Service("ProcedimentoService")
@Transactional
public class ProcedimentoServiceImpl implements ProcedimentoService{
	
	@Autowired
	private ProcedimentoDao procedimentodao;

	public void cadastrar(Procedimentos procedimento) {	
		this.procedimentodao.save(procedimento);
	}

	public void deletar(int id) {
		this.procedimentodao.delete((long) id);
	}

	public List<Procedimentos> litarTodos() {
		return (List<Procedimentos>) this.procedimentodao.findAll();
	}

	public Procedimentos listaPorId(int id) {
		return this.procedimentodao.findOne((long) id);
	}

}
