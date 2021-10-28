package mx.brayan.partida.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import mx.brayan.partida.model.clientes;

@Repository
public interface clientesRepository   extends MongoRepository<clientes,Integer> {

	
	

}
