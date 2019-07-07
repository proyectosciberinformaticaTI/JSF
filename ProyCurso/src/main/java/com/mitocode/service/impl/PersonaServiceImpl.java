package com.mitocode.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.mitocode.dao.IPersonaDAO;
import com.mitocode.model.Persona;
import com.mitocode.service.IPersonaService;

@Named
@RequestScoped
public class PersonaServiceImpl implements IPersonaService, Serializable{

	@Inject
	private IPersonaDAO dao;
	
	@Override
	public void registrar(Persona per) throws Exception {
		dao.registrar(per);
	}

	@Override
	public void modificar(Persona per) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Persona> listar() throws Exception {
		return dao.listar();
	}

}
