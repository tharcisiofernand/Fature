package br.com.capsule.model;

public class Tabela {

	private int id;
	private String nome;
	private Integer codigo;
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
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
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
