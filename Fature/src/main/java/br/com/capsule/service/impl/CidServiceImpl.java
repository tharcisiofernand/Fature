package br.com.capsule.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.capsule.dao.CidDao;
import br.com.capsule.model.Cid;
import br.com.capsule.service.CidService;


@Service("CidService")
@Transactional
public class CidServiceImpl implements CidService{
	
	@Autowired
	private CidDao ciddao;

	public void cadastrar(Cid cid) {
		this.ciddao.save(cid);
	}

	public void deletar(int id) {
		this.ciddao.delete((long) id);	
	}

	public List<Cid> litarTodos() {
		return (List<Cid>) this.ciddao.findAll();
	}

	public Cid listaPorId(int id) {
		return this.ciddao.findOne((long) id);
	}

}
