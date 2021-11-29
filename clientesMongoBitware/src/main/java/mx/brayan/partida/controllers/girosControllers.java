package mx.brayan.partida.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.brayan.partida.Token.Token;
import mx.brayan.partida.model.girosempresa;
import mx.brayan.partida.services.girosServices;
import mx.brayan.partida.servicesimpl.girosServicesImpl;

@RestController
@RequestMapping("/giros")
public class girosControllers {

	@Autowired
	girosServicesImpl girosServices;
/**
 * agrega un nuevo giro
 * @param giro
 * @return
 */
	@PostMapping("/post")
	public Token postToken(@RequestBody girosempresa giro) {
		Token token = new Token();
		token = girosServices.addGiros(giro);
		return token;

	}
/**
 * obtiene toda la lista de datos  de los giros
 * @return
 */
	@GetMapping("/get")
	public Token getToken() {
		Token token = new Token();
		token = girosServices.getGirosAll();
		return token;


	}
}
