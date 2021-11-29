package mx.brayan.partida.repository.giros;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import mx.brayan.partida.model.clientes;
import mx.brayan.partida.model.girosempresa;
import mx.brayan.partida.repository.repositoryMongoTemplate;

@Service
public class girosRepositoryQuery {
	private MongoTemplate mongoTemplate;

	public girosRepositoryQuery(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	public List<girosempresa> girosAll() {
		return this.mongoTemplate.findAll(girosempresa.class);

	}

}
