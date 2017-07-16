package br.com.capsule.service;

import java.util.List;

import br.com.capsule.model.Paciente;

public interface PacienteService {

	public void cadastrar (Paciente paciente);
	public void deletar (Long id);
	public List<Paciente> litarTodos();
	public Paciente listaPorId(Long id);
	public String listaPorCodigo(Long codigo);
	public String listaPorCpf(Long cpf);

}
