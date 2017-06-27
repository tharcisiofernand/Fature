package br.com.capsule.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.capsule.dao.ConvenioDao;
import br.com.capsule.model.Convenio;
import br.com.capsule.service.ConvenioService;

@Service
public class ConvenioServiceImpl implements ConvenioService{
	
	private ConvenioDao conveniodao;

	public void setConveniodao(ConvenioDao conveniodao) {
		this.conveniodao = conveniodao;
	}

	public void cadastrar(Convenio convenio) {
		this.conveniodao.cadastrar(convenio);					
	}

	public void deletar(int id) {
		this.conveniodao.deletar(id);			
	}

	public void atualizar(Convenio convenio) {
		this.conveniodao.atualizar(convenio);			
	}

	public List<Convenio> litarTodos() {
		return this.conveniodao.litarTodos();
	}

	public Convenio listaPorId(int id) {
		return this.conveniodao.listaPorId(id);
	}

	public Convenio listaPorCodigo(int codigo) {
		return this.conveniodao.listaPorCodigo(codigo);
	}

}
