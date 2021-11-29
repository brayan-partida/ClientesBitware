package mx.brayan.partida.repository.profile;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import mx.brayan.partida.model.profile;

@Repository
public interface profileRepository extends MongoRepository<profile, Serializable> {

}
