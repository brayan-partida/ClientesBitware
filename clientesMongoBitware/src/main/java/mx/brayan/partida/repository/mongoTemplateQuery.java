package mx.brayan.partida.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import mx.brayan.partida.model.clientes;
@Repository
public class mongoTemplateQuery implements repositoryMongoTemplate {

	@Autowired
	 MongoTemplate mongoTemplate;
	
	@Override
	public List<clientes> findUser(String nombre_usuario) {
		Query query =new Query();
		List<clientes> criteria = new ArrayList<>();
	//	criteria.addAll(Criteria.where(nombre_usuario).is(nombre_usuario));
		return null;
	}
	
	

}
