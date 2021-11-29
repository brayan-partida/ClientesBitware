package mx.brayan.partida.repository.photoProfile;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

import mx.brayan.partida.model.photoProfile;

public interface photoProfileRepository extends MongoRepository<photoProfile, Serializable> {

}
