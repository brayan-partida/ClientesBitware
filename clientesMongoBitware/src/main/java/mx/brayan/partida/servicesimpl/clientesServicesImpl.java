package mx.brayan.partida.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.brayan.partida.Token.Token;
import mx.brayan.partida.model.clientes;
import mx.brayan.partida.repository.clientesRepository;
import mx.brayan.partida.services.clientesServices;

@Service
public class clientesServicesImpl implements clientesServices {

	@Autowired(required = true)
	clientesRepository clientesrepo;

	/**
	 * obtiene todos los clientes de en general de la colleccion
	 */
	public Token getClientes() {
		Token token = new Token();
		List<clientes> listaClientes = clientesrepo.findAll();
		if (listaClientes.isEmpty() == true) {
			token.setError(true);
			token.setMensaje("no se encuentrar registros, ingrese un nuevo cliente");
		} else {
			token.setObjeto(listaClientes);

		}
		return token;
	}

	/**
	 * este metodo obtiene los clientes cuanso se busca por apellidos
	 */
	public Token getClientesApellidos(String nombre) {

		Token token = new Token();
		List<clientes> listaClientes = clientesrepo.findByApellidos(nombre);
		return token;
	}

	/**
	 * inserta los clientes por su objeto
	 */
	public Token postClientesAll(clientes post) {
		Token token = new Token();
		clientesrepo.save(post);
		token.setMensaje("se inserto un nuevo cliente");
		return token;
	}

	/**
	 * obtiene los clientes por Id
	 */
	@Override
	public Token getClientesId(String clienteId) {
		Token token = new Token();
		List<clientes> listacliente = clientesrepo.findByClienteid(clienteId);
		if (listacliente.isEmpty() == true) {
			token.setMensaje("no se encontro ningun cliente con este ID");
			token.setError(true);
			token.setOk(false);
			return token;
		} else {
			token.setObjeto(listacliente);
			token.setMensaje("se encointro registros");
			return token;
		}

	}

	/**
	 * actualiza el cliente y valida los campos
	 */
	@Override
	public Token putClientesId(String clienteId, clientes clientesPut) {
		Token token = new Token();
		List<clientes> listaClientes = clientesrepo.findByClienteid(clienteId);
		if (listaClientes.isEmpty() == true) {
			token.setMensaje("no se encontraron clientes que se puedan actualizar");
			token.setOk(false);
			return token;
		} else {
			clientesrepo.save(clientesPut);
			token.setMensaje("se actualizo el registro");
			return token;
		}

	}

}
