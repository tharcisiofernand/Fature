package br.com.capsule.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.capsule.dao.PacienteDao;
import br.com.capsule.model.Paciente;
import br.com.capsule.service.PacienteService;

@Service("PacienteService")
@Transactional
public class PacienteServiceImpl implements PacienteService{
	
	@Autowired
	private PacienteDao pacientedao;

	public void cadastrar(Paciente paciente) {
		this.pacientedao.save(paciente);					
	}

	public void deletar(int id) {
		this.pacientedao.delete((long) id);			
	}

	public List<Paciente> litarTodos() {
		return (List<Paciente>) this.pacientedao.findAll();
	}

	public Paciente listaPorId(int id) {
		return this.pacientedao.findOne((long) id);
	}

}
