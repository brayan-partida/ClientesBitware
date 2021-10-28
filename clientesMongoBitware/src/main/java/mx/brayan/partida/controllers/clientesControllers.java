package mx.brayan.partida.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.brayan.partida.model.clientes;

@RestController
@RequestMapping("/clientes")
public class clientesControllers {
@Autowired
private MongoTemplate mongoTemplate;

@PostMapping("/post")
public String  saveCliente(@RequestBody clientes  cli) {
	 mongoTemplate.save(cli);
	return "se inserto el registro";
	
}

	
	
	
}
