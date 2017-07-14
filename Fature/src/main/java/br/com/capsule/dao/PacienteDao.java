package br.com.capsule.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.capsule.model.Paciente;

@Repository
public interface PacienteDao extends CrudRepository<Paciente, Long>{

}
