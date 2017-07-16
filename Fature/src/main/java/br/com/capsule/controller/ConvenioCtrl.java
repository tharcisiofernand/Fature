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

import br.com.capsule.model.Convenio;
import br.com.capsule.service.ConvenioService;

@Controller
@EnableAutoConfiguration
public class ConvenioCtrl {
	
	private static final Logger LOGGER = Logger.getLogger(ConvenioCtrl.class.getName());
	
	@Autowired
	private ConvenioService convenioService;
	
	/**
	 * Cadastrar ou alterar convenio
	 * @param cbo
	 * @return
	 */
	@RequestMapping("/salvarConvenio")
	@ResponseBody
	public ResponseEntity<Convenio> cadastrar(@RequestBody Convenio convenio){
		try {
			convenioService.cadastrar(convenio);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<Convenio>(HttpStatus.FORBIDDEN);
		} 
		return new ResponseEntity<Convenio>(HttpStatus.OK);
	}
	
	/**
	 * Deletar convenio
	 * @param id
	 * @return
	 */
	@RequestMapping("/deletarConvenio/{id}")
	@ResponseBody
	public ResponseEntity<Convenio> deletar(@PathVariable Long id){
		try {
			convenioService.deletar(id);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<Convenio>(HttpStatus.NOT_FOUND);
		} 
		
		return new ResponseEntity<Convenio>(HttpStatus.OK);	
	}
	
	/**
	 * listar todas convenio
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarTodosConvenios")
	@ResponseBody
	public List<Convenio> listarTodosConvenios() {		
		return convenioService.litarTodos();	
	}
	
	/**
	 * listar por codigo convenio
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarConvenioCodigo/{codigo}")
	@ResponseBody
	public String listarConveniosCodigo(@PathVariable Long codigo) {
		return convenioService.listaPorCodigo(codigo);
	}

}