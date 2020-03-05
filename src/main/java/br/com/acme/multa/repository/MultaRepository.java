package br.com.acme.multa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.acme.multa.model.Multa;


@Repository
public interface MultaRepository extends JpaRepository<Multa, Long> {
	
	

}
