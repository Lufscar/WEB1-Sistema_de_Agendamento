package br.ufscar.dc.dsw.service.spec;

import java.util.List;
import br.ufscar.dc.dsw.domain.Consultas;
import org.springframework.stereotype.Service;

@Service
public interface IConsultasService {
	Consultas buscarPorId(Long id);

	List<Consultas> buscarTodos();

	void salvar(Consultas consulta);

	void excluir(Long id);
}
