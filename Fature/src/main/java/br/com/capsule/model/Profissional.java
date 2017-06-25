package br.com.capsule.model;

public class Profissional extends Pessoa{
	
	private Integer id;
	private String conselho;
	private Especialiade especialidade;
	private Cbo cbo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getConselho() {
		return conselho;
	}
	public void setConselho(String conselho) {
		this.conselho = conselho;
	}
	public Especialiade getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Especialiade especialidade) {
		this.especialidade = especialidade;
	}
	public Cbo getCbo() {
		return cbo;
	}
	public void setCbo(Cbo cbo) {
		this.cbo = cbo;
	}
	
	

}
