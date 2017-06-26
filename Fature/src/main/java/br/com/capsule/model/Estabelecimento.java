package br.com.capsule.model;

public class Estabelecimento {
	
	private int id;
	private String nome;
	private Endereco endereco;
	private Telefone fone;
	private String cnpj;
	private int cnes;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone getFone() {
		return fone;
	}
	public void setFone(Telefone fone) {
		this.fone = fone;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getCnes() {
		return cnes;
	}
	public void setCnes(int cnes) {
		this.cnes = cnes;
	}

}
