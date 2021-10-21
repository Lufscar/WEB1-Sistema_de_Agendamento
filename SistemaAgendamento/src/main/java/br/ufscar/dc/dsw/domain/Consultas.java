package br.ufscar.dc.dsw.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Consultas")
public class Consultas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "{NotBlank.consulta.data_hora}")
	@Size(max = 16)
	@Column(nullable = false, length = 16)
	private String data_hora;

	@OneToMany
	private Clientes cliente;

	@OneToMany
	private Profissionais profissional;
	
	public String getDataHora() {
		return data_hora;
	}

	public void setDataHora(String data_hora) {
		this.data_hora = data_hora;
	}
	
	public Clientes getCliente() {
		return cliente;
	}
	
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	
	public Profissionais getProfissional() {
		return profissional;
	}
	
	public void setProfissional(Profissionais profissional) {
		this.profissional = profissional;
	}

}