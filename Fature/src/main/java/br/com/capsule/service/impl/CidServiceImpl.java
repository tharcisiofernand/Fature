package br.com.capsule.service.impl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import br.com.capsule.dao.CidDao;
import br.com.capsule.model.Cid;
import br.com.capsule.service.CidService;


@Service("CidService")
@Transactional
public class CidServiceImpl implements CidService{
	
	private static final Logger LOGGER = Logger.getLogger(CidServiceImpl.class.getName());
	
	@Autowired
	private CidDao ciddao;

	public void cadastrar(Cid cid) {
		try {
			if(cid != null) {
				this.ciddao.save(cid);
			}
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
	}

	public void deletar(Long id) {
		this.ciddao.delete(id);	
	}

	public List<Cid> litarTodos() {
		return (List<Cid>) this.ciddao.findAll();
	}

	public Cid listaPorId(Long id) {
		return this.ciddao.findOne(id);
	}

	public String listaPorCodigo(String codigo) {
		Cid cid = null;
		Gson gson = new Gson();
		try {
			cid = this.ciddao.findByCodigo(codigo);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
		String resultado = gson.toJson(cid);
		return resultado;
	}

}
