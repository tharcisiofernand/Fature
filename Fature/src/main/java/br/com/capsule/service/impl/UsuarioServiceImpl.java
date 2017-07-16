package br.com.capsule.service.impl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import br.com.capsule.dao.UsuarioDao;
import br.com.capsule.model.Usuario;
import br.com.capsule.service.UsuarioService;

@Service("UsuarioService")
@Transactional
public class UsuarioServiceImpl implements UsuarioService{
	
	private static final Logger LOGGER = Logger.getLogger(UsuarioServiceImpl.class.getName());
	
	@Autowired
	private UsuarioDao usuariodao;

	public void cadastrar(Usuario usuario) {
		try {
			if(usuario != null) {
				this.usuariodao.save(usuario);
			}
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
	}

	public void deletar(Long id) {	
		this.usuariodao.delete(id);
	}

	public List<Usuario> litarTodos() {
		return (List<Usuario>) this.usuariodao.findAll();
	}

	public Usuario listaPorId(Long id) {
		return this.usuariodao.findOne(id);
	}

	public String listaPorCpf(Long cpf) {
		Usuario usuario = null;
		Gson gson = new Gson();
		try {
			usuario = this.usuariodao.findByCpf(cpf);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
		String resultado = gson.toJson(usuario);
		return resultado;
	}

}
