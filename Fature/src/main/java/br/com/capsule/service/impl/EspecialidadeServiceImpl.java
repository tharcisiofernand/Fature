package br.com.capsule.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.capsule.dao.EspecialidadeDao;
import br.com.capsule.model.Especialidade;
import br.com.capsule.service.EspecialidadeService;

@Service("EspecialidadeService")
@Transactional
public class EspecialidadeServiceImpl implements EspecialidadeService{
	
	@Autowired
	private EspecialidadeDao especialidadedao;

	public void cadastrar(Especialidade especialidade) {
		this.especialidadedao.save(especialidade);			
	}

	public void deletar(int id) {
		this.especialidadedao.delete((long) id);			
	}

	public List<Especialidade> litarTodos() {
		return (List<Especialidade>) this.especialidadedao.findAll();
	}

	public Especialidade listaPorId(int id) {
		return this.especialidadedao.findOne((long) id);
	}

	public Especialidade listaPorCodigo(int codigo) {
		return this.especialidadedao.listaPorCodigo(codigo);
	}

}
