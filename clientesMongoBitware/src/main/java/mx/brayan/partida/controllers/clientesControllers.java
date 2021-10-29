package mx.brayan.partida.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.brayan.partida.Token.Token;
import mx.brayan.partida.model.clientes;
import mx.brayan.partida.servicesimpl.clientesServicesImpl;

@RestController
@RequestMapping("/")
public class clientesControllers {

	@Autowired(required = true)
	clientesServicesImpl services;

	@PostMapping("/post/nutrinet/cliente")
	public Token saveCliente(@RequestBody clientes cli) {
		Token token = new Token();
		services.postClientesAll(cli);

		return token;

	}

	@GetMapping("/get/nutrinet/cliente/{clienteid}")
	public Token getCliente(@PathVariable Integer clienteid) {
		Token token = new Token();
		token = services.getClientesId(clienteid);
		return token;

	}

	@GetMapping("/get/nutrinet/cliente")
	public Token getClientesAll() {
		Token token = new Token();
		token = services.getClientes();
		return token;
	}

}
