package br.com.capsule.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.capsule.model.Cbo;
import br.com.capsule.service.CboService;

@Controller
@EnableAutoConfiguration
public class CboCtrl {
	
	private static final Logger LOGGER = Logger.getLogger(CboCtrl.class.getName());
	
	@Autowired
	private CboService cboService;
	
	@RequestMapping("/cadastrarCbo")
	@ResponseBody
	public  ResponseEntity<Cbo> cadastrar(@RequestBody Cbo cbo){
		try {
			if(cbo != null) {
				cboService.cadastrar(cbo);
			}
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<Cbo>(HttpStatus.FORBIDDEN);
		} 
		
		return new ResponseEntity<Cbo>(HttpStatus.OK);
		
	}
	
	

}
