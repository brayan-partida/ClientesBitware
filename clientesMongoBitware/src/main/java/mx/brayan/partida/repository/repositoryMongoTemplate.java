package mx.brayan.partida.repository;

import java.util.List;

import mx.brayan.partida.model.clientes;

public interface repositoryMongoTemplate {

	
	public List<clientes> findUser(String nombre_usuario);
}
