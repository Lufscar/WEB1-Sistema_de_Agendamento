package br.ufscar.dc.dsw.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@SuppressWarnings("serial")
@Entity
@Table(name = "Consulta")
public class Consulta extends AbstractEntity<Long> {

	@Column(nullable = false, length = 19)
	private String data;
    
	@Column(columnDefinition = "DECIMAL(8,2) DEFAULT 0.0")
	private BigDecimal valor;
    
	@NotNull(message = "{NotNull.consulta.livro}")
	@ManyToOne
	@JoinColumn(name = "livro_id")
	private Livro livro;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal preco) {
		this.valor = preco;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}


/*
 * 
 * package br.ufscar.dc.dsw.domain;
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Consultas")
public class Consultas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 16)
	@Column(nullable = false, length = 16)
	private String data_hora;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Clientes cliente;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "profissional_id")
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
*/