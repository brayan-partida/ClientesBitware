package mx.brayan.partida.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.brayan.partida.Token.Token;
import mx.brayan.partida.model.profile;
import mx.brayan.partida.servicesimpl.profileServicesImpl;

@RestController
@RequestMapping("/profile")
public class profileControllers {

	@Autowired
	profileServicesImpl profileServices;

	@PostMapping("/postprofile")
	public Token postProfile(@RequestBody profile perfil) {
		Token token = new Token();
		token = profileServices.postProfile(perfil);
		return token;

	}

	/**
	 * obtiene todos los perfiles
	 * 
	 * @return
	 */
	@GetMapping("/getprofile")
	public Token getProfile() {
		Token token = new Token();
		token = profileServices.getProfile();
		return token;
	}

	@GetMapping("/getprofile/{id_phone_number}")
	public Token getProfilePhone(@PathVariable String id_phone_number) {
		Token token = new Token();
		token = profileServices.getProfilePhone(id_phone_number);
		return token;

	}

	/**
	 * actualiza el profile
	 * 
	 * @param id_phone_number busqueda
	 * @param profileBody     cuerpo de la peticion
	 * @return
	 */
	@PutMapping("/putprofile/{id_phone_number}")
	public Token putProfilePhone(@PathVariable String id_phone_number, @RequestBody profile profileBody) {
		Token token = new Token();
		token = profileServices.updateProfilePhone(id_phone_number, profileBody);
		return token;
	}
	/**
	 * 
	 * @param phone
	 * @param email
	 * @return
	 */
	@GetMapping("/getemailphone/{phone_number_id}/{email}")
	public Token getPhoneAndEmail(@PathVariable String phone_number_id, @PathVariable String email) {
		Token token = new Token();
		token = profileServices.selectPhoneAndEmail(phone_number_id, email);
		return token;

	}

}
