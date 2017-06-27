package br.com.capsule.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.capsule.dao.PacienteDao;
import br.com.capsule.model.Paciente;
import br.com.capsule.service.PacienteService;

@Service
public class PacienteServiceImpl implements PacienteService{
	
	private PacienteDao pacientedao;

	public void setPacientedao(PacienteDao pacientedao) {
		this.pacientedao = pacientedao;
	}

	public void cadastrar(Paciente paciente) {
		this.pacientedao.cadastrar(paciente);					
	}

	public void deletar(int id) {
		this.pacientedao.deletar(id);			
	}

	public void atualizar(Paciente paciente) {
		this.pacientedao.atualizar(paciente);			
	}

	public List<Paciente> litarTodos() {
		return this.pacientedao.litarTodos();
	}

	public Paciente listaPorId(int id) {
		return this.pacientedao.listaPorId(id);
	}

	public Paciente listaPorCodigo(int codigo) {
		return this.pacientedao.listaPorCodigo(codigo);
	}

}
