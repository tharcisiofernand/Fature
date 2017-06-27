package br.com.capsule.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.capsule.dao.EspecialidadeDao;
import br.com.capsule.model.Especialidade;
import br.com.capsule.service.EspecialidadeService;

@Service
public class EspecialidadeServiceImpl implements EspecialidadeService{
	
	private EspecialidadeDao especialidadedao;

	public void setEspecialidadedao(EspecialidadeDao especialidadedao) {
		this.especialidadedao = especialidadedao;
	}

	public void cadastrar(Especialidade especialidade) {
		this.especialidadedao.cadastrar(especialidade);			
	}

	public void deletar(int id) {
		this.especialidadedao.deletar(id);			
	}

	public void atualizar(Especialidade especialidade) {
		this.especialidadedao.atualizar(especialidade);			
	}

	public List<Especialidade> litarTodos() {
		return this.especialidadedao.litarTodos();
	}

	public Especialidade listaPorId(int id) {
		return this.especialidadedao.listaPorId(id);
	}

	public Especialidade listaPorCodigo(int codigo) {
		return this.especialidadedao.listaPorCodigo(codigo);
	}

}
