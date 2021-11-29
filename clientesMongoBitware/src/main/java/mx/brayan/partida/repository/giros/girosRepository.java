package mx.brayan.partida.repository.giros;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import mx.brayan.partida.model.girosempresa;

@Repository
public interface girosRepository extends MongoRepository<girosempresa, Serializable> {

}
