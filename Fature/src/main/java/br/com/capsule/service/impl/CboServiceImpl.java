package br.com.capsule.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.capsule.dao.CboDao;
import br.com.capsule.model.Cbo;
import br.com.capsule.service.CboService;


@Service("CboService")
@Transactional
public class CboServiceImpl implements CboService{

	@Autowired
	private CboDao cbodao;
	
	public void cadastrar(Cbo cbo) {
		this.cbodao.save(cbo);
		
	}

	public void deletar(int id) {
		this.cbodao.delete((long) id);
		
	}

	public List<Cbo> litarTodos() {
		return (List<Cbo>) this.cbodao.findAll();
	}

	public Cbo listaPorId(int id) {
		return this.cbodao.findOne((long) id);
	}

}
