package br.com.capsule.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.capsule.dao.ProfissionalDao;
import br.com.capsule.model.Profissional;
import br.com.capsule.service.ProfissionalService;

@Service
public class ProfissionalServiceImpl implements ProfissionalService{
	
	private ProfissionalDao profissionaldao;

	public void setProfissionaldao(ProfissionalDao profissionaldao) {
		this.profissionaldao = profissionaldao;
	}

	public void cadastrar(Profissional profissional) {
		this.profissionaldao.cadastrar(profissional);
	}

	public void deletar(int id) {	
		this.profissionaldao.deletar(id);
	}

	public void atualizar(Profissional profissional) {
		this.profissionaldao.atualizar(profissional);
	}

	public List<Profissional> litarTodos() {
		return this.profissionaldao.litarTodos();
	}

	public Profissional listaPorId(int id) {
		return this.profissionaldao.listaPorId(id);
	}

	public Profissional listaPorConselho(String conselho) {
		return this.profissionaldao.listaPorConselho(conselho);
	}

}
