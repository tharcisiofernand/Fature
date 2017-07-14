package br.com.capsule.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.capsule.model.Estabelecimento;

@Repository
public interface EstabelecimentoDao extends CrudRepository<Estabelecimento, Long>{

}
