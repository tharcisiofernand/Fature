package br.com.capsule.dao;

import java.util.List;

import br.com.capsule.model.Paciente;

public interface PacienteDao {

	public void cadastrar (Paciente paciente);
	public void deletar (int id);
	public void atualizar (Paciente paciente);
	public List<Paciente> litarTodos();
	public Paciente listaPorId(int id);
	public Paciente listaPorCodigo(int codigo);
}