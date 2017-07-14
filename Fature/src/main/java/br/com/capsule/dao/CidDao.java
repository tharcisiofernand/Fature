package br.com.capsule.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.capsule.model.Cid;

@Repository
public interface CidDao extends CrudRepository<Cid, Long> {
	
	public Cid listaPorCodigo(String codigo);
	
}
