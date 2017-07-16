package br.com.capsule.service.impl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import br.com.capsule.dao.ProfissionalDao;
import br.com.capsule.model.Convenio;
import br.com.capsule.model.Profissional;
import br.com.capsule.service.ProfissionalService;

@Service("ProfissionalService")
@Transactional
public class ProfissionalServiceImpl implements ProfissionalService{
	
	private static final Logger LOGGER = Logger.getLogger(ProfissionalServiceImpl.class.getName());
	
	@Autowired
	private ProfissionalDao profissionaldao;

	public void cadastrar(Profissional profissional) {
		try {
			if(profissional != null) {
				this.profissionaldao.save(profissional);
			}
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
	}

	public void deletar(Long id) {	
		this.profissionaldao.delete(id);
	}

	public List<Profissional> litarTodos() {
		return (List<Profissional>) this.profissionaldao.findAll();
	}

	public Profissional listaPorId(Long id) {
		return this.profissionaldao.findOne(id);
	}

	public String listaPorConselho(Long conselho) {
		Profissional profissional = null;
		Gson gson = new Gson();
		try {
			profissional = this.profissionaldao.findByConselho(conselho);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
		String resultado = gson.toJson(profissional);
		return resultado;
	}

}
