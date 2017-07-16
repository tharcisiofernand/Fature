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

import br.com.capsule.model.Cid;
import br.com.capsule.service.CidService;

@Controller
@EnableAutoConfiguration
public class CidCtrl {

private static final Logger LOGGER = Logger.getLogger(CidCtrl.class.getName());
	
	@Autowired
	private CidService cidService;
	
	
	/**
	 * Cadastrar ou alterar cid
	 * @param cbo
	 * @return
	 */
	@RequestMapping("/salvarCid")
	@ResponseBody
	public ResponseEntity<Cid> cadastrar(@RequestBody Cid cid){
		try {
			cidService.cadastrar(cid);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<Cid>(HttpStatus.FORBIDDEN);
		} 
		return new ResponseEntity<Cid>(HttpStatus.OK);
	}
	
	/**
	 * Deletar cid
	 * @param id
	 * @return
	 */
	@RequestMapping("/deletarCid/{id}")
	@ResponseBody
	public ResponseEntity<Cid> deletar(@PathVariable Long id){
		try {
			cidService.deletar(id);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<Cid>(HttpStatus.NOT_FOUND);
		} 
		
		return new ResponseEntity<Cid>(HttpStatus.OK);	
	}
	
	/**
	 * listar todas cid
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarTodasCid")
	@ResponseBody
	public List<Cid> listarTodasCbo() {		
		return cidService.litarTodos();	
	}
	
	/**
	 * listar por codigo cid
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarCidCodigo/{codigo}")
	@ResponseBody
	public String listarCboCodigo(@PathVariable String codigo) {
		return cidService.listaPorCodigo(codigo);
	}
	

}

