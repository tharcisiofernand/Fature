package br.com.capsule.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.capsule.model.Usuario;
import br.com.capsule.service.UsuarioService;

public class UsuarioCtrl {
	
private static final Logger LOGGER = Logger.getLogger(UsuarioCtrl.class.getName());
	
	@Autowired
	private UsuarioService usuarioService;
	
	/**
	 * Cadastrar ou alterar Usuario
	 * @param cbo
	 * @return
	 */
	@RequestMapping("/salvarUsuario")
	@ResponseBody
	public ResponseEntity<Usuario> cadastrar(@RequestBody Usuario usuario){
		try {
			usuarioService.cadastrar(usuario);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<Usuario>(HttpStatus.FORBIDDEN);
		} 
		return new ResponseEntity<Usuario>(HttpStatus.OK);
	}
	
	/**
	 * Deletar Usuario
	 * @param id
	 * @return
	 */
	@RequestMapping("/deletarUsuario/{id}")
	@ResponseBody
	public ResponseEntity<Usuario> deletar(@PathVariable Long id){
		try {
			usuarioService.deletar(id);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
		} 
		
		return new ResponseEntity<Usuario>(HttpStatus.OK);	
	}
	
	/**
	 * listar todas Usuario
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarTodosUsuario")
	@ResponseBody
	public List<Usuario> listarTodosUsuario() {		
		return usuarioService.litarTodos();	
	}
	
	/**
	 * listar por codigo Usuario
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarUsuarioCpf/{cpf}")
	@ResponseBody
	public String listarUsuariosCodigo(@PathVariable Long cpf) {
		return usuarioService.listaPorCpf(cpf);
	}

}
