package edu.mjv.school.projetofinal.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CadastroLog {
	@Column(name = "dh_inclusao")
	private LocalDateTime dataHoraInclusao;
	@Column(name = "dh_alteracao")
	private LocalDateTime dataHoraAlteracao;
	public LocalDateTime getDataHoraInclusao() {
		return dataHoraInclusao;
	}
	public void setDataHoraInclusao(LocalDateTime dataHoraInclusao) {
		this.dataHoraInclusao = dataHoraInclusao;
	}
	public LocalDateTime getDataHoraAlteracao() {
		return dataHoraAlteracao;
	}
	public void setDataHoraAlteracao(LocalDateTime dataHoraAlteracao) {
		this.dataHoraAlteracao = dataHoraAlteracao;
	}
	
	
}
