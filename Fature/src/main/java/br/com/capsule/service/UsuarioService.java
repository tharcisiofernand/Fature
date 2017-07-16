package br.com.capsule.service;

import java.util.List;

import br.com.capsule.model.Usuario;

public interface UsuarioService {
	
	public void cadastrar (Usuario usuario);
	public void deletar (Long id);
	public List<Usuario> litarTodos();
	public Usuario listaPorId(Long id);
	public String listaPorCpf(Long cpf);

}
