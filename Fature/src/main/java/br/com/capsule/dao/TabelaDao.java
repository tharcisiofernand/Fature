package br.com.capsule.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.capsule.model.Tabela;

@Repository
public interface TabelaDao extends CrudRepository<Tabela, Long>{
	
	public Tabela findByCodigo(Long codigo);

}
