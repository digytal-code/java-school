package edu.mjv.school.projetofinal.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_contrato")
public class Contrato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "num_protocolo")
	private Integer numeroProtocolo;
	
	@Column(name = "dh_contrato")
	private LocalDateTime dataHora;
	
	//?
	private Cadastro cadastro;
	//?
	private Endereco enderecoInstalacao;
	//?
	private List<ContratoServico> servicos;
	
	public Integer getId() {
		return id;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public Integer getNumeroProtocolo() {
		return numeroProtocolo;
	}

	public void setNumeroProtocolo(Integer numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}
	public List<ContratoServico> getServicos() {
		return servicos;
	}
	public void setServicos(List<ContratoServico> servicos) {
		this.servicos = servicos;
	}
	public Endereco getEnderecoInstalacao() {
		return enderecoInstalacao;
	}
	public void setEnderecoInstalacao(Endereco enderecoInstalacao) {
		this.enderecoInstalacao = enderecoInstalacao;
	}
}
