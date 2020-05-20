package br.com.acme.multa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.acme.multa.model.Multa;
import br.com.acme.multa.model.MultaDTO;
import br.com.acme.multa.repository.MultaRepository;

@Service
public class MultaService {
	
	@Autowired
	private MultaRepository repository;
	
	@Transactional(readOnly=true)
	public List<Multa> list(){
		return this.repository.findAll();
		
	}
	
	
	@Transactional
	public void salvar(Multa multa) {
		this.repository.save(multa);
		
	}
	
	public List<Multa> filtrar(MultaDTO multa) {
		String descricao = multa.getDescricao() == null ? "%" : multa.getDescricao()+"%";
		return repository.findByDescricao(descricao);
	}
		

}
