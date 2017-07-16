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

import br.com.capsule.model.Paciente;
import br.com.capsule.service.PacienteService;

@Controller
@EnableAutoConfiguration
public class PacienteCtrl {
	
private static final Logger LOGGER = Logger.getLogger(PacienteCtrl.class.getName());
	
	@Autowired
	private PacienteService pacienteService;
	
	/**
	 * Cadastrar ou alterar Paciente
	 * @param cbo
	 * @return
	 */
	@RequestMapping("/salvarPaciente")
	@ResponseBody
	public ResponseEntity<Paciente> cadastrar(@RequestBody Paciente paciente){
		try {
			pacienteService.cadastrar(paciente);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<Paciente>(HttpStatus.FORBIDDEN);
		} 
		return new ResponseEntity<Paciente>(HttpStatus.OK);
	}
	
	/**
	 * Deletar Paciente
	 * @param id
	 * @return
	 */
	@RequestMapping("/deletarPaciente/{id}")
	@ResponseBody
	public ResponseEntity<Paciente> deletar(@PathVariable Long id){
		try {
			pacienteService.deletar(id);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
			return new ResponseEntity<Paciente>(HttpStatus.NOT_FOUND);
		} 
		
		return new ResponseEntity<Paciente>(HttpStatus.OK);	
	}
	
	/**
	 * listar todas Paciente
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarTodosPacientes")
	@ResponseBody
	public List<Paciente> listarTodosPacientes() {		
		return pacienteService.litarTodos();	
	}
	
	/**
	 * listar por codigo Paciente
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarPacienteCodigo/{codigo}")
	@ResponseBody
	public String listarPacienteCodigo(@PathVariable Long codigo) {
		return pacienteService.listaPorCodigo(codigo);
	}
	
	/**
	 * listar por cpf Paciente
	 * @param id
	 * @return
	 */
	@RequestMapping("/listarPacienteCpf/{cpf}")
	@ResponseBody
	public String listarPacienteCpf(@PathVariable Long cpf) {
		return pacienteService.listaPorCpf(cpf);
	}
}