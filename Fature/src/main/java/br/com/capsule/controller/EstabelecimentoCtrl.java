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

import br.com.capsule.model.Estabelecimento;
import br.com.capsule.service.EstabelecimentoService;

@Controller
@EnableAutoConfiguration
public class EstabelecimentoCtrl {
	
private static final Logger LOGGER = Logger.getLogger(EstabelecimentoCtrl.class.getName());
	
	@Autowired
	private EstabelecimentoService estabelecimentoService;
	
	/**
	 * Cadastrar ou alterar Estabelecimento
	 * @param cbo
	 * @return
	 */
	@RequestMapping("/salvarEstabelecimento")
	@ResponseBody
	public ResponseEntity<Estabelecimento> cadastrar(@RequestBody Estabelecimento estabelecimento){
		try {
			estabelecimentoService.cadastrar(estabelecimento);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<Estabelecimento>(HttpStatus.FORBIDDEN);
		} 
		return new ResponseEntity<Estabelecimento>(HttpStatus.OK);
	}
	
	/**
	 * Deletar Estabelecimento
	 * @param id
	 * @return
	 */
	@RequestMapping("/deletarEstabelecimento/{id}")
	@ResponseBody
	public ResponseEntity<Estabelecimento> deletar(@PathVariable Long id){
		try {
			estabelecimentoService.deletar(id);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<Estabelecimento>(HttpStatus.NOT_FOUND);
		} 
		
		return new ResponseEntity<Estabelecimento>(HttpStatus.OK);	
	}
	
	/**
	 * listar todas Estabelecimento
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarTodosEstabelecimentos")
	@ResponseBody
	public List<Estabelecimento> listarTodasEstabelecimentos() {		
		return estabelecimentoService.litarTodos();	
	}
	
	/**
	 * listar por cnpj Estabelecimento
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarEstabelecimentoCodigo/{cnpj}")
	@ResponseBody
	public String listarEstabelecimentosCnpj(@PathVariable Long cnpj) {
		return estabelecimentoService.listaPorCnpj(cnpj);
	}
	
	/**
	 * listar por cnes Estabelecimento
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarEstabelecimentoCodigo/{cnes}")
	@ResponseBody
	public String listarEstabelecimentoCnes(@PathVariable Long cnes) {
		return estabelecimentoService.listaPorCnes(cnes);
	}
	

}