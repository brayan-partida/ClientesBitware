package mx.brayan.partida.repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import mx.brayan.partida.model.clientes;

@Service
public class clientesQuery {
	private MongoTemplate mongoTemplate;

	/**
	 * 
	 * @param mongoTemplate
	 */
	public clientesQuery(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	/**
	 * 1)Find all flights with pagin and sorting 2) Find by flight id 3) count all
	 * international flights 4) Find all Custumer by password 5) fing all custumer
	 * 
	 * 
	 */

	/**
	 * obtien todos los datos
	 * 
	 * @param field
	 * @param pageNb
	 * @param pageSize
	 * @return
	 */
	public List<clientes> findAll(String field, int pageNb, int pageSize) {
		Query allPageAndOrdered = new Query().with(Sort.by(Sort.Direction.ASC, field))
				.with(PageRequest.of(pageNb, pageSize));
		return this.mongoTemplate.find(allPageAndOrdered, clientes.class);

	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public clientes findSingleById(String id) {
		return this.mongoTemplate.findById(id, clientes.class);

	}

	/**
	 * busqueda de password
	 * 
	 * @param password
	 * @return
	 */
	public List<clientes> findByPassword(String password) {
		Query byDepartamento = new Query().addCriteria(Criteria.where("password").is(password));

		return this.mongoTemplate.find(byDepartamento, clientes.class);

	}

	/**
	 * busqueda de usuario por un nombre o varios
	 * 
	 * @param usuario
	 * @return
	 */
	public List<clientes> findByNombre_Usuario(String usuario) {
		Query usuarios = new Query().addCriteria(Criteria.where("nombre_usuario").is(usuario));
		return this.mongoTemplate.find(usuarios, clientes.class);
	}

	/**
	 * busqueda de usuaio an email
	 * 
	 * @param usuario
	 * @param email
	 * @return
	 */
	public List<clientes> findByUsuariosAndCorreo(String usuario, String email) {
		Query usuarios = new Query().addCriteria(Criteria.where("nombre_usuario").is(usuario))
				.addCriteria(Criteria.where("correo_electronico").is(email));
		return this.mongoTemplate.find(usuarios, clientes.class);
	}

}
