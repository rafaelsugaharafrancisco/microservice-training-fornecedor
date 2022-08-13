package br.com.alura.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.fornecedor.model.Fornecedor;
import br.com.alura.fornecedor.repository.FornecedorRepository;

@Service
public class FornecedorService {

	@Autowired
	private FornecedorRepository fr;
	
	public Fornecedor obterInfo(String estado) {
		
		return fr.findByEstado(estado).orElseGet(null);
	}
}
