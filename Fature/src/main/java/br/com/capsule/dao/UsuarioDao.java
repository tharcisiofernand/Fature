package br.com.capsule.dao;

import java.util.List;

import br.com.capsule.model.Usuario;

public interface UsuarioDao {
	
	public void cadastrar (Usuario usuario);
	public void deletar (int id);
	public void atualizar (Usuario usuario);
	public List<Usuario> litarTodos();
	public Usuario listaPorId(int id);
	public Usuario listaPorCpf(int cpf);

}
