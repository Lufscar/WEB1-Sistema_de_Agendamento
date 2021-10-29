package br.ufscar.dc.dsw.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import br.ufscar.dc.dsw.domain.Profissionais;

public interface IProfissionaisDAO extends CrudRepository<Profissionais, Long> {
	Profissionais findById(long id);

	Profissionais findBycpf(String CPF);

	List<Profissionais> findAll();

	Profissionais save(Profissionais profissional);

	void deleteById(Long id);

	List<Profissionais> findByArea(String area);
}
