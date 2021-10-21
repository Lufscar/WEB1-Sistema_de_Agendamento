package br.ufscar.dc.dsw.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import br.ufscar.dc.dsw.domain.Consultas;

public interface IConsultasDAO extends CrudRepository<Consultas, Long> {
	Consultas findById(long id);

	List<Consultas> findAll();

	Consultas save(Consultas consulta);

	void deleteById(Long id);
}
