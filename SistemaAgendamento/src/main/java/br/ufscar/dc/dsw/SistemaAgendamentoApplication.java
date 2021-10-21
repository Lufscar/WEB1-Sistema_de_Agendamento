package br.ufscar.dc.dsw;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.ufscar.dc.dsw.dao.*;
import br.ufscar.dc.dsw.domain.*;

@SpringBootApplication
public class SistemaAgendamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaAgendamentoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(IClientesDAO clienteDAO, IProfissionaisDAO profissionalDAO,
			IConsultasDAO consultaDAO) {
		return (args) -> {

			Clientes c1 = new Clientes();
			c1.setCpf("00000000000");
			c1.setNome("Cliente Generico");
			c1.setEmail("cli@cli.com");
			c1.setSenha("1234");
			clienteDAO.save(c1);

			Clientes c2 = new Clientes();
			c2.setCpf("11122233344");
			c2.setNome("Luciana Souza");
			c2.setEmail("luciana.souza@estudante.ufscar.br");
			c2.setSenha("1234");
			clienteDAO.save(c2);

			Clientes c3 = new Clientes();
			c3.setCpf("22233344455");
			c3.setNome("Jean Araujo");
			c3.setEmail("jean.araujo@estudante.ufscar.br");
			c3.setSenha("1234");
			clienteDAO.save(c3);

			Clientes c4 = new Clientes();
			c4.setCpf("33344455566");
			c4.setNome("Anderson Henrique");
			c4.setEmail("agiacomini@estudante.ufscar.br");
			c4.setSenha("1234");
			clienteDAO.save(c4);

			Profissionais p1 = new Profissionais();
			p1.setCpf("00000000000");
			p1.setNome("Profissional Generico");
			p1.setEmail("pro@pro.com");
			p1.setSenha("1234");
			profissionalDAO.save(p1);

			Profissionais p2 = new Profissionais();
			p2.setCpf("11122233344");
			p2.setNome("Luciana Souza");
			p2.setEmail("luciana.souza@estudante.ufscar.br");
			p2.setSenha("1234");
			profissionalDAO.save(p2);

			Profissionais p3 = new Profissionais();
			p3.setCpf("22233344455");
			p3.setNome("Jean Araujo");
			p3.setEmail("jean.araujo@estudante.ufscar.br");
			p3.setSenha("1234");
			profissionalDAO.save(p3);

			Profissionais p4 = new Profissionais();
			p4.setCpf("33344455566");
			p4.setNome("Anderson Henrique");
			p4.setEmail("agiacomini@estudante.ufscar.br");
			p4.setSenha("1234");
			profissionalDAO.save(p4);

			Consultas a1 = new Consultas();
			a1.setDataHora("10/02/2022 14:00");
			a1.setCliente(c1);
			a1.setProfissional(p2);
			consultaDAO.save(a1);

			Consultas a2 = new Consultas();
			a2.setDataHora("11/07/2022 11:00");
			a2.setCliente(c2);
			a2.setProfissional(p3);
			consultaDAO.save(a2);

			Consultas a3 = new Consultas();
			a3.setDataHora("11/07/2022 11:00");
			a3.setCliente(c3);
			a3.setProfissional(p1);
			consultaDAO.save(a3);

		};
	}
}
