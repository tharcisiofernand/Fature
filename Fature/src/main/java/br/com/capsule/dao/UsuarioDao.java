package br.com.capsule.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.capsule.model.Usuario;

@Repository
public interface UsuarioDao extends CrudRepository<Usuario, Long>{
	
	public Usuario findByCpf(Long cpf);

}
