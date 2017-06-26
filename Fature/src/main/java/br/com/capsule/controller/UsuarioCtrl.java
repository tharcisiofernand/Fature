package br.com.capsule.controller;

import java.util.List;

import br.com.capsule.model.Usuario;

public interface UsuarioCtrl {
	
	public void cadastrar (Usuario usuario);
	public void deletar (int id);
	public void atualizar (Usuario usuario);
	public List<Usuario> litarTodos();
	public Usuario listaPorId(int id);
	public Usuario listaPorCpf(int cpf);

}
