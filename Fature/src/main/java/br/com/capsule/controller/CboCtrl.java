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

import br.com.capsule.model.Cbo;
import br.com.capsule.service.CboService;

@Controller
@EnableAutoConfiguration
public class CboCtrl {
	
	private static final Logger LOGGER = Logger.getLogger(CboCtrl.class.getName());
	
	@Autowired
	private CboService cboService;
	
	
	/**
	 * Cadastrar ou alterar cbo
	 * @param cbo
	 * @return
	 */
	@RequestMapping("/salvarCbo")
	@ResponseBody
	public ResponseEntity<Cbo> cadastrar(@RequestBody Cbo cbo){
		try {
			cboService.cadastrar(cbo);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<Cbo>(HttpStatus.FORBIDDEN);
		} 
		return new ResponseEntity<Cbo>(HttpStatus.OK);
	}
	
	/**
	 * Deletar cbo
	 * @param id
	 * @return
	 */
	@RequestMapping("/deletarCbo/{id}")
	@ResponseBody
	public ResponseEntity<Cbo> deletar(@PathVariable Long id){
		try {
			cboService.deletar(id);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<Cbo>(HttpStatus.NOT_FOUND);
		} 
		
		return new ResponseEntity<Cbo>(HttpStatus.OK);	
	}
	
	/**
	 * listar todas cbo
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarTodasCbo")
	@ResponseBody
	public List<Cbo> listarTodasCbo() {		
		return cboService.litarTodos();	
	}
	
	/**
	 * listar por codigo cbo
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarCboCodigo/{codigo}")
	@ResponseBody
	public String listarCboCodigo(@PathVariable Long codigo) {
		return cboService.listaPorCodigo(codigo);
	}
	

}
