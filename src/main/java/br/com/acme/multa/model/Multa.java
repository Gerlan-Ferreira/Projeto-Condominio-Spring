package br.com.acme.multa.model;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_multas" )
public class Multa {
	
	@Id	@GeneratedValue
//	(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotNull(message="A descrição é obrigatória")
	private String descricao;
	
	@NotNull(message="O valor é obrigatório")
	private Float valor;
	
	@NotNull(message="A data é obrigatória")
	private Date data;
	
	

}
