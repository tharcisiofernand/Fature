package br.com.capsule.service.impl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import br.com.capsule.dao.EspecialidadeDao;
import br.com.capsule.model.Especialidade;
import br.com.capsule.service.EspecialidadeService;

@Service("EspecialidadeService")
@Transactional
public class EspecialidadeServiceImpl implements EspecialidadeService{
	
	private static final Logger LOGGER = Logger.getLogger(EspecialidadeServiceImpl.class.getName());
	
	@Autowired
	private EspecialidadeDao especialidadedao;

	public void cadastrar(Especialidade especialidade) {
		try {
			if(especialidade != null) {
				this.especialidadedao.save(especialidade);
			}
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
	}

	public void deletar(Long id) {
		this.especialidadedao.delete(id);			
	}

	public List<Especialidade> litarTodos() {
		return (List<Especialidade>) this.especialidadedao.findAll();
	}

	public Especialidade listaPorId(Long id) {
		return this.especialidadedao.findOne(id);
	}

	public String listaPorCodigo(Long codigo) {
		Especialidade especialidade = null;
		Gson gson = new Gson();
		try {
			especialidade = this.especialidadedao.findByCodigo(codigo);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
		String resultado = gson.toJson(especialidade);
		return resultado;
	}

}
