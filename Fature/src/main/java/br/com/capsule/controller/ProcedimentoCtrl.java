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

import br.com.capsule.model.Procedimentos;
import br.com.capsule.service.ProcedimentoService;

@Controller
@EnableAutoConfiguration
public class ProcedimentoCtrl {
	
private static final Logger LOGGER = Logger.getLogger(ProcedimentoCtrl.class.getName());
	
	@Autowired
	private ProcedimentoService procedimentoService;
	
	/**
	 * Cadastrar ou alterar Procedimentos
	 * @param cbo
	 * @return
	 */
	@RequestMapping("/salvarProcedimentos")
	@ResponseBody
	public ResponseEntity<Procedimentos> cadastrar(@RequestBody Procedimentos procedimentos){
		try {
			procedimentoService.cadastrar(procedimentos);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<Procedimentos>(HttpStatus.FORBIDDEN);
		} 
		return new ResponseEntity<Procedimentos>(HttpStatus.OK);
	}
	
	/**
	 * Deletar Procedimentos
	 * @param id
	 * @return
	 */
	@RequestMapping("/deletarProcedimentos/{id}")
	@ResponseBody
	public ResponseEntity<Procedimentos> deletar(@PathVariable Long id){
		try {
			procedimentoService.deletar(id);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<Procedimentos>(HttpStatus.NOT_FOUND);
		} 
		
		return new ResponseEntity<Procedimentos>(HttpStatus.OK);	
	}
	
	/**
	 * listar todas Procedimentos
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarTodosProcedimentoss")
	@ResponseBody
	public List<Procedimentos> listarTodosProcedimentos() {		
		return procedimentoService.litarTodos();	
	}
	
	/**
	 * listar por codigo Procedimentos
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarProcedimentosCodigo/{codigo}")
	@ResponseBody
	public String listarProcedimentosCodigo(@PathVariable Long codigo) {
		return procedimentoService.listaPorCodigo(codigo);
	}

}
