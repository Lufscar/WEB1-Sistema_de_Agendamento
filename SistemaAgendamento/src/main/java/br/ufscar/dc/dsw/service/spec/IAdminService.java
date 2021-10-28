package br.ufscar.dc.dsw.service.spec;

import java.util.List;

import br.ufscar.dc.dsw.domain.Admin;

public interface IAdminService {

	Admin buscarPorId(Long id);

	List<Admin> buscarTodos();

	void salvar(Admin editora);

	void excluir(Long id);	
}