package mx.brayan.partida.services;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import mx.brayan.partida.Token.Token;

@Service
public interface photoProfileServices {
	public String addPhoto(String title, MultipartFile file) throws IOException;
}
