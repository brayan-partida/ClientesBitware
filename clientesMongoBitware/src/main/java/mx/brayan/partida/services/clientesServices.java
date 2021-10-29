package mx.brayan.partida.services;

import org.springframework.stereotype.Service;

import mx.brayan.partida.Token.Token;
import mx.brayan.partida.model.clientes;

@Service
public interface clientesServices {

	/**
	 * obtiene todos los datos del cliente
	 * 
	 * @return List<Clientes>
	 */
	public Token getClientes();

	/**
	 * obtiene la lista pero busca por apellido
	 * 
	 * @param apellidos
	 * @return
	 */
	public Token getClientesApellidos(String apellidos);

	/**
	 * 
	 * @param clientesPost
	 * @return
	 */
	public Token postClientesAll(clientes clientesPost);

	/**
	 * obtendra todos los datos de los clientes que contenga el id
	 * 
	 * @param clienteId
	 * @return
	 */
	public Token getClientesId(String clienteId);

	/**
	 * 
	 * @param clienteId   parametros para la busqueda
	 * @param clientesPut objeto
	 * @return Token
	 */
	public Token putClientesId(String clienteId, clientes clientesPut);

}
