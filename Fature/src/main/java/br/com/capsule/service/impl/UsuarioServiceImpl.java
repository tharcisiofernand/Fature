package br.com.capsule.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.capsule.dao.UsuarioDao;
import br.com.capsule.model.Usuario;
import br.com.capsule.service.UsuarioService;

@Service("UsuarioService")
@Transactional
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioDao usuariodao;

	public void cadastrar(Usuario usuario) {
		this.usuariodao.save(usuario);
	}

	public void deletar(int id) {	
		this.usuariodao.delete((long) id);
	}

	public List<Usuario> litarTodos() {
		return (List<Usuario>) this.usuariodao.findAll();
	}

	public Usuario listaPorId(int id) {
		return this.usuariodao.findOne((long) id);
	}

}
