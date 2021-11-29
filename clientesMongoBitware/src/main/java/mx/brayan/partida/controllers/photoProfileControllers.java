package mx.brayan.partida.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import mx.brayan.partida.repository.profile.profileRepository;
import mx.brayan.partida.services.profileServices;
import mx.brayan.partida.servicesimpl.photoProfileServicesImpl;
import mx.brayan.partida.servicesimpl.profileServicesImpl;

@RestController
@RequestMapping("/photo")
public class photoProfileControllers {

	@Autowired
	photoProfileServicesImpl service;

	@PostMapping("/add")
	public String addPhoto(@RequestParam("title") String title, @RequestParam("image") MultipartFile image, Model model)
			throws IOException {
		String id = service.addPhoto(title, image);
		return "redirect:/photos/" + id;

	}

}
