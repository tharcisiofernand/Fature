package br.com.capsule.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.capsule.dao.UsuarioDao;
import br.com.capsule.model.Usuario;
import br.com.capsule.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	private UsuarioDao usuariodao;

	public void setUsuariodao(UsuarioDao usuariodao) {
		this.usuariodao = usuariodao;
	}

	public void cadastrar(Usuario usuario) {
		this.usuariodao.cadastrar(usuario);
	}

	public void deletar(int id) {	
		this.usuariodao.deletar(id);
	}

	public void atualizar(Usuario usuario) {
		this.usuariodao.atualizar(usuario);
	}

	public List<Usuario> litarTodos() {
		return this.usuariodao.litarTodos();
	}

	public Usuario listaPorId(int id) {
		return this.usuariodao.listaPorId(id);
	}

	public Usuario listaPorCpf(int cpf) {
		return this.usuariodao.listaPorCpf(cpf);
	}

}
