package br.ufscar.dc.dsw.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import br.ufscar.dc.dsw.validation.UniqueCPF;

@SuppressWarnings("serial")
@MappedSuperclass
public abstract class Pessoa<ID extends Serializable> implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID id;

	@NotBlank
	@Size(max = 128)
	@Column(nullable = false, length = 128)
	private String nome;

	@NotBlank
	@UniqueCPF(message = "{Unique.CPF}")
	@Size(min = 11, max = 11, message = "{Size.CPF}")
	@Column(nullable = false, unique = true, length = 11)
	private String cpf;

	@NotBlank
	@Size(max = 128)
	@Column(nullable = false, length = 128)
	private String email;

	@NotBlank
	@Size(max = 64)
	@Column(nullable = false, length = 64)
	private String senha;

	@OneToMany(mappedBy = "pessoa")
	private List<Consultas> consulta;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Consultas> getConsultas() {
		return consulta;
	}

	public void setConsultas(List<Consultas> consulta) {
		this.consulta = consulta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa<?> other = (Pessoa<?>) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ID: " + id + "Nome: " + nome + "CPF: " + cpf + "E-mail: " + email + "Senha: " + senha;
	}
}
