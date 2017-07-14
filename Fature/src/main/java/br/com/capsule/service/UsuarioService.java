package br.com.capsule.service;

import java.util.List;

import br.com.capsule.model.Usuario;

public interface UsuarioService {
	
	public void cadastrar (Usuario usuario);
	public void deletar (int id);
	public List<Usuario> litarTodos();
	public Usuario listaPorId(int id);

}
