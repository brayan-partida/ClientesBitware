package mx.brayan.partida.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.rest.core.annotation.RestResource;

import mx.brayan.partida.model.clientes;

@Repository
public interface clientesRepository extends MongoRepository<clientes, Serializable> {

	List<clientes> findByApellidos(String apellidos);

	List<clientes> findByClienteid(String clienteid);

	@Query("{'nombre_usuario':{$regex:0?}}")
	List<clientes> clientesNombre(String Nombre);

	@Query("{'nombre_usuario':'nombreVariable'}")
	List<clientes> clientesNombres(@Param("nombreVariable") String nombreVariable);

	@RestResource(path = "password", rel = "password")
	List<clientes> findByPassword(@Param("password") String password);
	


}
