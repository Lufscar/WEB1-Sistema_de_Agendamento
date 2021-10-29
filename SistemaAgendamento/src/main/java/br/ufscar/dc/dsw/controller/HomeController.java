package br.ufscar.dc.dsw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.ufscar.dc.dsw.domain.Pessoa;
import br.ufscar.dc.dsw.security.PessoaDetails;
import br.ufscar.dc.dsw.service.spec.IProfissionaisService;

@Controller
public class HomeController {

	@Autowired
	private IProfissionaisService service;
	
	private Pessoa getPessoa() {
		PessoaDetails pessoaDetails = (PessoaDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return pessoaDetails.getPessoa();
	}
	
	@GetMapping("/")
	public String listar(ModelMap model) {
					
		model.addAttribute("profissionais",service.buscarTodos());
		
		return "home";
	}
	
	@GetMapping("/homecontroller")
	public String listarhome(@RequestParam(value="area", required = false) String area, ModelMap model) {
		model.addAttribute("profissionais", service.buscarPorArea(area));
		return "home";
	}
}