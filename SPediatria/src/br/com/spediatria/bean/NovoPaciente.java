package br.com.spediatria.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.infinispan.util.Util;

import br.com.spediatria.util.*;
import br.com.spediatria.domain.Tbpaciente;
import br.com.spediatria.factory.*;

@SessionScoped
@ManagedBean

public class NovoPaciente {
	private Tbpaciente paciente = new Tbpaciente();
	
	public Tbpaciente getPaciente(){
		return paciente;
	}
	
	public void setPaciente(Tbpaciente paciente){
		this.paciente = paciente;
	}

	public void Salvar(Tbpaciente paciente){
		EntityManager manager = Util.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(paciente);
		tx.commit();
		manager.close();
		Util.close();
	}
}