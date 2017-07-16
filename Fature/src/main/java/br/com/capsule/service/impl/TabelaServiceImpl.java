package br.com.capsule.service.impl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import br.com.capsule.dao.TabelaDao;
import br.com.capsule.model.Tabela;
import br.com.capsule.service.TabelaService;

@Service("TabelaService")
@Transactional
public class TabelaServiceImpl implements TabelaService{
	
	private static final Logger LOGGER = Logger.getLogger(TabelaServiceImpl.class.getName());
	
	@Autowired
	private TabelaDao tabeladao;

	public void cadastrar(Tabela tabela) {
		try {
			if(tabela != null) {
				this.tabeladao.save(tabela);
			}
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
	}

	public void deletar(Long id) {
		this.tabeladao.delete(id);
	}

	public List<Tabela> litarTodos() {
		return (List<Tabela>) this.tabeladao.findAll();
	}

	public Tabela listaPorId(Long id) {
		return this.tabeladao.findOne(id);
	}

	public String listaPorCodigo(Long codigo) {
		Tabela tabela = null;
		Gson gson = new Gson();
		try {
			tabela = this.tabeladao.findByCodigo(codigo);
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}
		String resultado = gson.toJson(tabela);
		return resultado;
	}

}
