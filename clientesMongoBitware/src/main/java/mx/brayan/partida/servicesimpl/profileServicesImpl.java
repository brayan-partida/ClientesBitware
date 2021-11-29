package mx.brayan.partida.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.brayan.partida.Token.Token;
import mx.brayan.partida.model.profile;
import mx.brayan.partida.repository.profile.profileRepository;
import mx.brayan.partida.repository.profile.profileRepositoryQuery;
import mx.brayan.partida.services.profileServices;

@Service
public class profileServicesImpl implements profileServices {

	@Autowired
	profileRepository profileRepo;

	@Autowired
	profileRepositoryQuery profilequery;

	/**
	 * post profile
	 */
	@Override
	public Token postProfile(profile perfil) {
		Token token = new Token();

		String[] websites = perfil.getWebsites();
		if (websites.length > 2) {
			token.setMensaje("no se puede tener mas de dos websites");
			return token;
		} else {
			profileRepo.save(perfil);
			token.setMensaje("se guardo el perfil");
			return token;
		}

	}

	/**
	 * obtienen todos los perfiles
	 */
	@Override
	public Token getProfile() {
		Token token = new Token();
		List<profile> listadePerfile = profileRepo.findAll();
		if (listadePerfile.isEmpty() == true) {
			token.setMensaje("no se encontraron registros");
			token.setOk(false);
			return token;
		} else {
			token.setObjeto(listadePerfile);
			token.setOk(true);
		}
		return token;

	}

	/**
	 * 
	 */
	@Override
	public Token getProfilePhone(String profilePhone) {
		Token token = new Token();
		List<profile> perfil = profilequery.findByPhoneNumberFreeText(profilePhone);
		// profilequery.findByPhoneNumber(profilePhone);

		if (perfil.isEmpty() == true) {
			token.setMensaje("no se encontraron registros");
			token.setOk(false);
			return token;
		} else {
			token.setObjeto(perfil);
			token.setMensaje("estos son los datos");
			return token;
		}

	}

	/**
	 * actualiza el perfil la parte del body siempre cuando se haya encontrado el
	 * perfil
	 * 
	 * @param String
	 * @param profile
	 */
	@Override
	public Token updateProfilePhone(String phone, profile profileBody) {

		Token token = new Token();
		List<profile> findProfile = profilequery.findByPhoneNumber(phone);
		if (findProfile.isEmpty() == true) {
			token.setMensaje("no se encontro el profile con este phone: " + phone);
			return token;
		} else {
			String respuesta = profilequery.updatePhoneNumber(phone, profileBody);
			token.setMensaje(respuesta);
			token.setOk(true);
			return token;
		}

	}

	/**
	 * 
	 */
	@Override
	public Token selectPhoneAndEmail(String phone, String email) {
		Token token = new Token();
		List<profile> findProfile = profilequery.selectPhoneAndMail(phone, email);
		if (findProfile.isEmpty() == true) {
			token.setMensaje("no se encontro el profile con este phone: " + phone);
			return token;
		} else {
			token.setObjeto(findProfile);
			token.setOk(true);
			return token;
		}

	}

}
