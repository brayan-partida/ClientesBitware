package mx.brayan.partida.model;

import java.io.Serializable;

import javax.websocket.Decoder.Binary;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document

@AllArgsConstructor
@NoArgsConstructor
public class photoProfile implements Serializable {

	@Id
	public String phone_number_id;

	public String title;

	public Binary image;

	public photoProfile(String title) {
		title = this.title;
	}

	public String getPhone_number_id() {
		return phone_number_id;
	}

	public void setPhone_number_id(String phone_number_id) {
		this.phone_number_id = phone_number_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Binary getImage() {
		return image;
	}

	public void setImage(org.bson.types.Binary binary) {
		this.image = (Binary) binary;
	}
	
	
}
