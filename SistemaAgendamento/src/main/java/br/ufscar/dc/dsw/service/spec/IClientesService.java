package br.ufscar.dc.dsw.service.spec;

import java.util.List;
import br.ufscar.dc.dsw.domain.Clientes;

public interface IClientesService {
	Clientes buscarPorId(Long id);

	List<Clientes> buscarTodos();

	void salvar(Clientes cliente);

	void excluir(Long id);

	boolean clienteTemConsultas(Long id);
}
