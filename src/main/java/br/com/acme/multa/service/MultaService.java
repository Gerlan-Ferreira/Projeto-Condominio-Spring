package br.com.acme.multa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.acme.multa.repository.MultaRepository;

@Service
public class MultaService {
	
	@Autowired
	private MultaRepository repository;

}
