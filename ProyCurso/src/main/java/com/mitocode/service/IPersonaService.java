package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Persona;

public interface IPersonaService {

	void registrar(Persona per) throws Exception;
	void modificar(Persona per) throws Exception;
	List<Persona> listar() throws Exception;
}
