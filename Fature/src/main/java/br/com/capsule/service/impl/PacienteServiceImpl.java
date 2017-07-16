package br.com.capsule.service.impl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import br.com.capsule.dao.PacienteDao;
import br.com.capsule.model.Paciente;
import br.com.capsule.service.PacienteService;

@Service("PacienteService")
@Transactional
public class PacienteServiceImpl implements PacienteService{
	
	private static final Logger LOGGER = Logger.getLogger(PacienteServiceImpl.class.getName());
	
	@Autowired
	private PacienteDao pacientedao;

	public void cadastrar(Paciente paciente) {
		try {
			if(paciente != null) {
				this.pacientedao.save(paciente);
			}
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
	}

	public void deletar(Long id) {
		this.pacientedao.delete(id);			
	}

	public List<Paciente> litarTodos() {
		return (List<Paciente>) this.pacientedao.findAll();
	}

	public Paciente listaPorId(Long id) {
		return this.pacientedao.findOne(id);
	}

	public String listaPorCodigo(Long codigo) {
		Paciente paciente = null;
		Gson gson = new Gson();
		try {
			paciente = this.pacientedao.findByCodigo(codigo);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
		String resultado = gson.toJson(paciente);
		return resultado;
	}

	public String listaPorCpf(Long cpf) {
		Paciente paciente = null;
		Gson gson = new Gson();
		try {
			paciente = this.pacientedao.findByCpf(cpf);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
		String resultado = gson.toJson(paciente);
		return resultado;
	}

}
