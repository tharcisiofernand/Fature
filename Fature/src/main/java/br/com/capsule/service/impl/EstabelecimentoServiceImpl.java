package br.com.capsule.service.impl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import br.com.capsule.dao.EstabelecimentoDao;
import br.com.capsule.model.Estabelecimento;
import br.com.capsule.service.EstabelecimentoService;

@Service("EstabelecimentoService")
@Transactional
public class EstabelecimentoServiceImpl implements EstabelecimentoService{
	
	private static final Logger LOGGER = Logger.getLogger(EstabelecimentoServiceImpl.class.getName());
	
	@Autowired
	private EstabelecimentoDao estabelecimentodao;

	public void cadastrar(Estabelecimento estabelcimento) {
		try {
			if(estabelcimento != null) {
				this.estabelecimentodao.save(estabelcimento);
			}
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
	}

	public void deletar(Long id) {
		this.estabelecimentodao.delete(id);		
	}

	public List<Estabelecimento> litarTodos() {
		return (List<Estabelecimento>) this.estabelecimentodao.findAll();
	}

	public Estabelecimento listaPorId(Long id) {
		return this.estabelecimentodao.findOne(id);
	}

	public String listaPorCnpj(Long cnpj) {
		Estabelecimento estabelecimento = null;
		Gson gson = new Gson();
		try {
			estabelecimento = this.estabelecimentodao.findByCnpj(cnpj);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
		String resultado = gson.toJson(estabelecimento);
		return resultado;
	}

	public String listaPorCnes(Long cnes) {
		Estabelecimento estabelecimento = null;
		Gson gson = new Gson();
		try {
			estabelecimento = this.estabelecimentodao.findByCnes(cnes);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
		String resultado = gson.toJson(estabelecimento);
		return resultado;
	}
	
}
