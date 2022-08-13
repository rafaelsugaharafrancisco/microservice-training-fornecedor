package br.com.alura.fornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.fornecedor.model.Fornecedor;
import br.com.alura.fornecedor.service.FornecedorService;

@RestController
@RequestMapping("/info")
public class FornecedorController {

	@Autowired
	private FornecedorService fs;
	
	@GetMapping("/{estado}")
	public Fornecedor obterEndereco(@PathVariable String estado) {
		
		return fs.obterInfo(estado);
	}
}
