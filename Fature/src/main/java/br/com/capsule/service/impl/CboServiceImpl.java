package br.com.capsule.service.impl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import br.com.capsule.controller.CboCtrl;
import br.com.capsule.dao.CboDao;
import br.com.capsule.model.Cbo;
import br.com.capsule.service.CboService;


@Service("CboService")
@Transactional
public class CboServiceImpl implements CboService{
	
	private static final Logger LOGGER = Logger.getLogger(CboServiceImpl.class.getName());

	@Autowired
	private CboDao cbodao;
	
	public void cadastrar(Cbo cbo) {
		try {
			if(cbo != null) {
				this.cbodao.save(cbo);
			}
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
	}

	public void deletar(Long id) {
		this.cbodao.delete(id);
	}

	public List<Cbo> litarTodos() {
		return (List<Cbo>) this.cbodao.findAll();
	}

	public String listaPorCodigo(Long codigo) {
		Cbo cbo = null;
		Gson gson = new Gson();
		try {
			cbo = this.cbodao.findByCodigo(codigo);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
		String resultado = gson.toJson(cbo);
		return resultado;
	}


	public Cbo listaPorId(Long id) {
		return this.cbodao.findOne(id);
	}

}
