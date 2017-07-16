package br.com.capsule.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.capsule.model.Profissional;
import br.com.capsule.service.ProfissionalService;

@Controller
@EnableAutoConfiguration
public class ProfissionalCtrl {
	
private static final Logger LOGGER = Logger.getLogger(ProfissionalCtrl.class.getName());
	
	@Autowired
	private ProfissionalService profissionalService;
	
	/**
	 * Cadastrar ou alterar Profissional
	 * @param cbo
	 * @return
	 */
	@RequestMapping("/salvarProfissional")
	@ResponseBody
	public ResponseEntity<Profissional> cadastrar(@RequestBody Profissional profissional){
		try {
			profissionalService.cadastrar(profissional);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<Profissional>(HttpStatus.FORBIDDEN);
		} 
		return new ResponseEntity<Profissional>(HttpStatus.OK);
	}
	
	/**
	 * Deletar Profissional
	 * @param id
	 * @return
	 */
	@RequestMapping("/deletarProfissional/{id}")
	@ResponseBody
	public ResponseEntity<Profissional> deletar(@PathVariable Long id){
		try {
			profissionalService.deletar(id);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<Profissional>(HttpStatus.NOT_FOUND);
		} 
		
		return new ResponseEntity<Profissional>(HttpStatus.OK);	
	}
	
	/**
	 * listar todas Profissional
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarTodosProfissional")
	@ResponseBody
	public List<Profissional> listarTodosProfissional() {		
		return profissionalService.litarTodos();	
	}
	
	/**
	 * listar por conselho Profissional
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarProfissionalCodigo/{conselho}")
	@ResponseBody
	public String listarProfissionalConselho(@PathVariable Long conselho) {
		return profissionalService.listaPorConselho(conselho);
	}

}