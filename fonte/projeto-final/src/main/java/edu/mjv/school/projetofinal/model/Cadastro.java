package edu.mjv.school.projetofinal.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_cadastro")
public class Cadastro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	//?
	private List<String> emails;
	
	//?
	private List<Telefone> telefones;
	
	//?
	private CadastroLog log; //como salvar o log automaticamente?
	
	//?
	private Endereco endereco;
	
	private Integer profissao;
	
	public Integer getProfissao() {
		return profissao;
	}
	public void setProfissao(Integer profissao) {
		this.profissao = profissao;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public CadastroLog getLog() {
		return log;
	}
	public void setLog(CadastroLog log) {
		this.log = log;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	@Override
	public String toString() {
		return "Cadastro [id=" + id + ", nome=" + nome + "]";
	}
	
}
