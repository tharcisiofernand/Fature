package br.com.capsule.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.capsule.model.Cid;
import br.com.capsule.model.Convenio;

@Repository
public interface ConvenioDao extends CrudRepository<Convenio, Long>{
	
	public Convenio findByCodigo(Long codigo);

}
