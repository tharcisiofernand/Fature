package br.com.capsule.model;

import java.util.Date;

public class Pessoa {
	
	private Integer id;
	private String nome;
	private String sexo;
	private String cpf;
	private String pai;
	private String mae;
	private Date dtaNascimento;
	private Endereco endereco;
	private Fone fone;
	
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPai() {
		return pai;
	}
	public void setPai(String pai) {
		this.pai = pai;
	}
	public String getMae() {
		return mae;
	}
	public void setMae(String mae) {
		this.mae = mae;
	}
	public Date getDtaNascimento() {
		return dtaNascimento;
	}
	public void setDtaNascimento(Date dtaNascimento) {
		this.dtaNascimento = dtaNascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Fone getFone() {
		return fone;
	}
	public void setFone(Fone fone) {
		this.fone = fone;
	}
}