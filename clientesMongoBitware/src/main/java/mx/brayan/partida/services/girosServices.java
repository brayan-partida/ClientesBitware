package mx.brayan.partida.services;

import org.springframework.stereotype.Service;

import mx.brayan.partida.Token.Token;
import mx.brayan.partida.model.girosempresa;

@Service
public interface girosServices {

	public Token addGiros(girosempresa g);

	public Token getGirosAll();
}
