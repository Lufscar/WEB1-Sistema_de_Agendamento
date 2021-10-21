package br.ufscar.dc.dsw.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
@Table(name = "Clientes")
public class Clientes extends Pessoa<Long> {

	@Size(max = 13)
	@Column(length = 13)
	private String telefone;

	@Size(max = 2)
	@Column(length = 2)
	private String sexo;

	@Size(max = 10)
	@Column(length = 10)
	private String nascimento;

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

}
