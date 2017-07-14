package br.com.capsule.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.capsule.model.Especialidade;

@Repository
public interface EspecialidadeDao extends CrudRepository<Especialidade, Long> {

}
