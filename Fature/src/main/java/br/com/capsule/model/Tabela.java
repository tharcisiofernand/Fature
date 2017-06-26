package br.com.capsule.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tabela implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Tabela(String nome, int codigo, Procedimentos procedimento, Double valor) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.procedimento = procedimento;
		this.valor = valor;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private int codigo;
	private Procedimentos procedimento;
	private Double valor;
	
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
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Procedimentos getProcedimento() {
		return procedimento;
	}
	public void setProcedimento(Procedimentos procedimento) {
		this.procedimento = procedimento;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
