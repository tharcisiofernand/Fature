package br.com.capsule.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.capsule.dao.ConvenioDao;
import br.com.capsule.model.Convenio;
import br.com.capsule.service.ConvenioService;

@Service("ConvenioService")
@Transactional
public class ConvenioServiceImpl implements ConvenioService{
	
	@Autowired
	private ConvenioDao conveniodao;

	public void cadastrar(Convenio convenio) {
		this.conveniodao.save(convenio);					
	}

	public void deletar(int id) {
		this.conveniodao.delete((long) id);			
	}

	public List<Convenio> litarTodos() {
		return (List<Convenio>) this.conveniodao.findAll();
	}

	public Convenio listaPorId(int id) {
		return this.conveniodao.findOne((long) id);
	}

}
