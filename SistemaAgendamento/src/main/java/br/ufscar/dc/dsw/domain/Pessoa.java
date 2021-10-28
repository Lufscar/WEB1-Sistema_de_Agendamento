package br.ufscar.dc.dsw.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@SuppressWarnings("serial")
@Entity
@Table(name = "Pessoa")
public class Pessoa extends AbstractEntity<Long> {

	@NotBlank
    @Column(nullable = false, length = 20, unique = true)
    private String username;
    
	@NotBlank
    @Column(nullable = false, length = 64)
    private String password;
       
    @NotBlank
    @Column(nullable = false, length = 60)
    private String name;
    
    @NotBlank
    @Column(nullable = false, length = 14)
    private String CPF;
    
    @NotBlank
    @Column(nullable = false, length = 10)
    private String role;
    
    @Column(nullable = false)
    private boolean enabled;
		
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public boolean isEnabled() {
		return enabled;
	}
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}


/*@MappedSuperclass
public abstract class Pessoa<ID extends Serializable> implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID id;

	@NotBlank
	@Size(max = 128)
	@Column(nullable = false, length = 128)
	private String nome;

	@NotBlank
	//@UniqueCPF(message = "{Unique.CPF}")
	@Size(min = 11, max = 11, message = "{Size.CPF}")
	@Column(nullable = false, length = 11)
	private String cpf;

	@NotBlank
	@Size(max = 128)
	@Column(nullable = false, length = 128)
	private String email;

	@NotBlank
	@Size(max = 64)
	@Column(nullable = false, length = 64)
	private String senha;

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
}*/
