package mx.brayan.partida.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.brayan.partida.Token.Token;
import mx.brayan.partida.model.girosempresa;
import mx.brayan.partida.repository.giros.girosRepository;
import mx.brayan.partida.repository.giros.girosRepositoryQuery;
import mx.brayan.partida.services.girosServices;

@Service
public class girosServicesImpl implements girosServices {

	@Autowired
	girosRepository girosRepo;

	@Autowired
	girosRepositoryQuery giroQuery;

	@Override
	public Token addGiros(girosempresa giros) {
		Token token = new Token();
		girosRepo.save(giros);
		token.setMensaje("se inserto un nuevo giro");
		return token;
	}

	@Override
	public Token getGirosAll() {
		Token token = new Token();
		List<girosempresa> girosLista = giroQuery.girosAll();
		if (girosLista.isEmpty() == true) {
			token.setMensaje("no se encontraron registros");
			token.setOk(false);
			return token;
		} else {
			token.setObjeto(girosLista);
			token.setOk(true);
			return token;
		}

	}

}
