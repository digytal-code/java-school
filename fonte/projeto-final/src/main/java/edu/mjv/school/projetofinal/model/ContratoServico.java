package edu.mjv.school.projetofinal.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_contrato_servico")
public class ContratoServico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	//como saber de qual contrato ele pertence ?
	
	@Column(name = "dh_previsao")
	private LocalDateTime dataHoraPrevisao;
	
	@Enumerated(EnumType.STRING)
	private Servico servico;
	
	@Column(scale = 8, precision = 2)
	private Double valor;

	public LocalDateTime getDataHoraPrevisao() {
		return dataHoraPrevisao;
	}

	public void setDataHoraPrevisao(LocalDateTime dataHoraPrevisao) {
		this.dataHoraPrevisao = dataHoraPrevisao;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}
	
	
}
