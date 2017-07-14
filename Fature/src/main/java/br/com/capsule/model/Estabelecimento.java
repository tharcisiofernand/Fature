package br.com.capsule.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Estabelecimento implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Estabelecimento(String nome, Endereco endereco, Telefone fone, Long cnpj, int cnes) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.fone = fone;
		this.cnpj = cnpj;
		this.cnes = cnes;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private Endereco endereco;
	private Telefone fone;
	private Long cnpj;
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
	public Long getCnpj() {
		return cnpj;
	}
	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}
	public int getCnes() {
		return cnes;
	}
	public void setCnes(int cnes) {
		this.cnes = cnes;
	}

}
