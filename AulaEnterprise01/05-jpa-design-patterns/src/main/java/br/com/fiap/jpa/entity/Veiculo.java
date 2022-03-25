package br.com.fiap.jpa.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_veiculo")
@SequenceGenerator(name = "sq_veiculo", allocationSize = 1, sequenceName = "sq_veiculo")
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_veiculo")
	@Column(name = "cd_veiculo", insertable = false)
	private Integer codigo;
	
	@Column(name = "ds_modelo", length = 50)
	private String modelo;
	
	@Column(name = "vl_veiculo", length = 10, scale = 2)
	private Double valor;
	
	@Column(name = "nr_ano", updatable = false)
	private Integer ano;
	
	@Column(name = "dt_revisao", insertable = false)
	private LocalDate revisao;
	
	@Enumerated(value = EnumType.STRING)
	@Column(name = "ds_tipo", length = 30)
	private Tipo tipo;
	
	@Column(name = "br_placa", length = 8, unique = true)
	private String placa;
}
