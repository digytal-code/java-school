package edu.mjv.school.projetofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_cadastro")
public class Profissao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}public void setNome(String nome) {
		this.nome = nome;
	}
}
