package mx.brayan.partida.servicesimpl;


import java.io.IOException;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import mx.brayan.partida.Token.Token;
import mx.brayan.partida.model.photoProfile;
import mx.brayan.partida.repository.photoProfile.photoProfileRepository;
import mx.brayan.partida.services.photoProfileServices;
@Service
public class photoProfileServicesImpl implements photoProfileServices {

	@Autowired
	photoProfileRepository photoRepo;
	
	

	@Override
	public String addPhoto(String title, MultipartFile file) throws IOException {
		photoProfile photo = new photoProfile(title); 
        try {
			photo.setImage(
			   new Binary(BsonBinarySubType.BINARY, file.getBytes()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        photo = photoRepo.insert(photo); 
        return photo.getTitle(); 
		
	}

}
