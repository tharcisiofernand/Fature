package br.com.capsule.testcase;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.capsule.model.Cbo;
import br.com.capsule.model.Convenio;
import br.com.capsule.model.Paciente;

public class HibernateTest{
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();

			Cbo cbo = new Cbo("Medico Radiologista", 225320);
			session.save(cbo);
			
			
			Paciente paciente = new Paciente();
			paciente.setCodigo(123);
			paciente.setConvenio(null);
			paciente.setCpf(72355);
			paciente.setDtaNascimento(new Date());
			paciente.setEndereco(null);
			paciente.setFone(null);
			paciente.setId(1);
			paciente.setNome("Tharcisio C V Fernandes");
			paciente.setMae("Josiniana C V Fernandes");
			paciente.setPai("Raul F de O Junior");
			paciente.setSexo("Masculino");
			
			session.save(paciente);

			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
