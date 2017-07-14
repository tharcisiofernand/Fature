package br.com.capsule.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.capsule.dao.ProfissionalDao;
import br.com.capsule.model.Profissional;
import br.com.capsule.service.ProfissionalService;

@Service("ProfissionalService")
@Transactional
public class ProfissionalServiceImpl implements ProfissionalService{
	
	@Autowired
	private ProfissionalDao profissionaldao;

	public void cadastrar(Profissional profissional) {
		this.profissionaldao.save(profissional);
	}

	public void deletar(int id) {	
		this.profissionaldao.delete((long) id);
	}

	public List<Profissional> litarTodos() {
		return (List<Profissional>) this.profissionaldao.findAll();
	}

	public Profissional listaPorId(int id) {
		return this.profissionaldao.findOne((long) id);
	}

	public Profissional listaPorConselho(String conselho) {
		return this.profissionaldao.listaPorConselho(conselho);
	}

}
