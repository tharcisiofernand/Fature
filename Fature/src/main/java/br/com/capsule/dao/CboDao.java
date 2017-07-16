package br.com.capsule.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.capsule.model.Cbo;

@Repository
public interface CboDao extends CrudRepository<Cbo, Long> {
	
	public Cbo findByCodigo(Long codigo);

}
