package br.com.capsule.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.capsule.model.Procedimentos;

@Repository
public interface ProcedimentoDao extends CrudRepository<Procedimentos, Long>{
	
	public Procedimentos findByCodigo(Long codigo);

}
