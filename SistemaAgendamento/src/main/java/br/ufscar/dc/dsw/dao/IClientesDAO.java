package br.ufscar.dc.dsw.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import br.ufscar.dc.dsw.domain.Clientes;

@SuppressWarnings("unchecked")
public interface IClientesDAO extends CrudRepository<Clientes, Long> {
	
	Clientes findById(long id);

	List<Clientes> findAll();
	
	Clientes save(Clientes cliente);

	void deleteById(Long id);
	
    @Query("SELECT u FROM Cliente u WHERE u.username = :username")
    public Clientes getUserByUsername(@Param("username") String username);
}


/*
public interface IClientesDAO extends CrudRepository<Clientes, Long> {
	Clientes findById(long id);

	Clientes findBycpf(String cpf);

	List<Clientes> findAll();

	Clientes save(Clientes cliente);

	void deleteById(Long id);
}
*/