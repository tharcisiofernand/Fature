package br.com.capsule.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profissional extends Pessoa{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String conselho;
	private Especialidade especialidade;
	private Cbo cbo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getConselho() {
		return conselho;
	}
	public void setConselho(String conselho) {
		this.conselho = conselho;
	}
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	public Cbo getCbo() {
		return cbo;
	}
	public void setCbo(Cbo cbo) {
		this.cbo = cbo;
	}
	
	

}
