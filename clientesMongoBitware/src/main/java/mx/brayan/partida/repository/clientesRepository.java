package mx.brayan.partida.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import mx.brayan.partida.model.clientes;

@Repository
public interface clientesRepository extends MongoRepository<clientes, Integer> {

	List<clientes> findByApellidos(String apellidos);

	List<clientes> findByClienteid(Integer clienteid);

	@Query("{'nombre_usuario':{$regex:0?}}")
	List<clientes> clientesNombre(String Nombre);

}
