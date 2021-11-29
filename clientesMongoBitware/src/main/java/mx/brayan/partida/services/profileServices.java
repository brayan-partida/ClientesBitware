package mx.brayan.partida.services;

import org.springframework.stereotype.Service;

import mx.brayan.partida.Token.Token;
import mx.brayan.partida.model.profile;

@Service
public interface profileServices {

	public Token postProfile(profile perfil);

	public Token getProfile();

	public Token getProfilePhone(String Profile);

	/**
	 * 
	 * @param phone
	 * @param profileBody
	 * @return
	 */
	public Token updateProfilePhone(String phone, profile profileBody);
	/**
	 * busca por 
	 * @param phone
	 * @param email
	 * @return
	 */
	
	/**
	 * busca por  phone y email
	 * @param phone
	 * @param email
	 * @return
	 */
	public Token selectPhoneAndEmail(String phone, String email);

}
