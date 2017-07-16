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

import br.com.capsule.model.Tabela;
import br.com.capsule.service.TabelaService;

@Controller
@EnableAutoConfiguration
public class TabelaCtrl {
	
private static final Logger LOGGER = Logger.getLogger(TabelaCtrl.class.getName());
	
	@Autowired
	private TabelaService tabelaService;
	
	/**
	 * Cadastrar ou alterar Tabela
	 * @param cbo
	 * @return
	 */
	@RequestMapping("/salvarTabela")
	@ResponseBody
	public ResponseEntity<Tabela> cadastrar(@RequestBody Tabela tabela){
		try {
			tabelaService.cadastrar(tabela);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<Tabela>(HttpStatus.FORBIDDEN);
		} 
		return new ResponseEntity<Tabela>(HttpStatus.OK);
	}
	
	/**
	 * Deletar Tabela
	 * @param id
	 * @return
	 */
	@RequestMapping("/deletarTabela/{id}")
	@ResponseBody
	public ResponseEntity<Tabela> deletar(@PathVariable Long id){
		try {
			tabelaService.deletar(id);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<Tabela>(HttpStatus.NOT_FOUND);
		} 
		
		return new ResponseEntity<Tabela>(HttpStatus.OK);	
	}
	
	/**
	 * listar todas Tabela
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarTodosTabela")
	@ResponseBody
	public List<Tabela> listarTodosTabela() {		
		return tabelaService.litarTodos();	
	}
	
	/**
	 * listar por codigo Tabela
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarTabelaCodigo/{codigo}")
	@ResponseBody
	public String listarTabelaCodigo(@PathVariable Long codigo) {
		return tabelaService.listaPorCodigo(codigo);
	}

}
