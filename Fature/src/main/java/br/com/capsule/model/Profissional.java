package br.com.capsule.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
@PrimaryKeyJoinColumn(name="id")
public class Profissional extends Pessoa{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private String conselho;
	private Especialidade especialidade;
	private Cbo cbo;
	
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
