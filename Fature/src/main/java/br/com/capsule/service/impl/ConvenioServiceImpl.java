package br.com.capsule.service.impl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import br.com.capsule.dao.ConvenioDao;
import br.com.capsule.model.Convenio;
import br.com.capsule.service.ConvenioService;

@Service("ConvenioService")
@Transactional
public class ConvenioServiceImpl implements ConvenioService{
	
	private static final Logger LOGGER = Logger.getLogger(ConvenioServiceImpl.class.getName());
	
	@Autowired
	private ConvenioDao conveniodao;

	public void cadastrar(Convenio convenio) {
		try {
			if(convenio != null) {
				this.conveniodao.save(convenio);
			}
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
	}

	public void deletar(Long id) {
		this.conveniodao.delete(id);			
	}

	public List<Convenio> litarTodos() {
		return (List<Convenio>) this.conveniodao.findAll();
	}

	public Convenio listaPorId(Long id) {
		return this.conveniodao.findOne(id);
	}

	public String listaPorCodigo(Long codigo) {
		Convenio convenio = null;
		Gson gson = new Gson();
		try {
			convenio = this.conveniodao.findByCodigo(codigo);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
		String resultado = gson.toJson(convenio);
		return resultado;
	}

}
