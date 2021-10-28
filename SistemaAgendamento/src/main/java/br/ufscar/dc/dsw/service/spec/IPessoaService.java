package br.ufscar.dc.dsw.service.spec;

import java.util.List;

import br.ufscar.dc.dsw.domain.Pessoa;

public interface IPessoaService {

	Pessoa buscarPorId(Long id);

	List<Pessoa> buscarTodos();

	void salvar(Pessoa editora);

	void excluir(Long id);	
}  