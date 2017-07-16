package br.com.capsule.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.capsule.model.Especialidade;
import br.com.capsule.model.Estabelecimento;

@Repository
public interface EstabelecimentoDao extends CrudRepository<Estabelecimento, Long>{
	
	public Estabelecimento findByCnpj(Long cnpj);
	
	public Estabelecimento findByCnes(Long cnes);

}
