package br.ufscar.dc.dsw.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.ufscar.dc.dsw.domain.Profissionais;



@SuppressWarnings("unchecked")
public interface IProfissionaisDAO extends CrudRepository<Profissionais, Long> {
	
	Profissionais findById(long id);

	List<Profissionais> findAll();
	
	Profissionais save(Profissionais profissional);

	void deleteById(Long id);
	
    @Query("SELECT u FROM Profissional u WHERE u.username = :username")
    public Profissionais getUserByUsername(@Param("username") String username);
}






/*
public interface IProfissionaisDAO extends CrudRepository<Profissionais, Long> {
	Profissionais findById(long id);

	Profissionais findBycpf(String CPF);

	List<Profissionais> findAll();

	Profissionais save(Profissionais profissional);

	void deleteById(Long id);
}
*/