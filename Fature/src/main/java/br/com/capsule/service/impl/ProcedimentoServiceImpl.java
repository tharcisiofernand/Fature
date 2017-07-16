package br.com.capsule.service.impl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import br.com.capsule.dao.ProcedimentoDao;
import br.com.capsule.model.Procedimentos;
import br.com.capsule.service.ProcedimentoService;

@Service("ProcedimentoService")
@Transactional
public class ProcedimentoServiceImpl implements ProcedimentoService{
	
	private static final Logger LOGGER = Logger.getLogger(ConvenioServiceImpl.class.getName());
	
	@Autowired
	private ProcedimentoDao procedimentodao;

	public void cadastrar(Procedimentos procedimento) {	
		try {
			if(procedimento != null) {
				this.procedimentodao.save(procedimento);
			}
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
	}

	public void deletar(Long id) {
		this.procedimentodao.delete(id);
	}

	public List<Procedimentos> litarTodos() {
		return (List<Procedimentos>) this.procedimentodao.findAll();
	}

	public Procedimentos listaPorId(Long id) {
		return this.procedimentodao.findOne(id);
	}

	@Override
	public String listaPorCodigo(Long codigo) {
		Procedimentos procedimentos = null;
		Gson gson = new Gson();
		try {
			procedimentos = this.procedimentodao.findByCodigo(codigo);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
		String resultado = gson.toJson(procedimentos);
		return resultado;
	}

}
