package br.com.capsule.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.capsule.model.Profissional;

@Repository
public interface ProfissionalDao extends CrudRepository<Profissional, Long>{
	
	public Profissional listaPorConselho(String conselho);

}
