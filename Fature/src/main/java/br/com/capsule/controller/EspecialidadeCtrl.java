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

import br.com.capsule.model.Especialidade;
import br.com.capsule.service.EspecialidadeService;

@Controller
@EnableAutoConfiguration
public class EspecialidadeCtrl {
	
private static final Logger LOGGER = Logger.getLogger(EspecialidadeCtrl.class.getName());
	
	@Autowired
	private EspecialidadeService especialidadeService;
	
	/**
	 * Cadastrar ou alterar especialidade
	 * @param cbo
	 * @return
	 */
	@RequestMapping("/salvarEspecialidade")
	@ResponseBody
	public ResponseEntity<Especialidade> cadastrar(@RequestBody Especialidade especialidade){
		try {
			especialidadeService.cadastrar(especialidade);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<Especialidade>(HttpStatus.FORBIDDEN);
		} 
		return new ResponseEntity<Especialidade>(HttpStatus.OK);
	}
	
	/**
	 * Deletar Especialidade
	 * @param id
	 * @return
	 */
	@RequestMapping("/deletarEspecialidade/{id}")
	@ResponseBody
	public ResponseEntity<Especialidade> deletar(@PathVariable Long id){
		try {
			especialidadeService.deletar(id);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<Especialidade>(HttpStatus.NOT_FOUND);
		} 
		
		return new ResponseEntity<Especialidade>(HttpStatus.OK);	
	}
	
	/**
	 * listar todas Especialidade
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarTodosEspecialidades")
	@ResponseBody
	public List<Especialidade> listarTodasEspecialidades() {		
		return especialidadeService.litarTodos();	
	}
	
	/**
	 * listar por codigo Especialidade
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarEspecialidadeCodigo/{codigo}")
	@ResponseBody
	public String listarEspecialidadeCodigo(@PathVariable Long codigo) {
		return especialidadeService.listaPorCodigo(codigo);
	}
	

}