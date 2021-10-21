package br.ufscar.dc.dsw.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
@Table(name = "Profissionais")
public class Profissionais extends Pessoa<Long> {

	@NotBlank
	@Size(max = 128)
	@Column(nullable = false, length = 128)
	private String area;

	@NotBlank
	@Size(max = 128)
	@Column(nullable = false, length = 128)
	private String especialidade;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}
