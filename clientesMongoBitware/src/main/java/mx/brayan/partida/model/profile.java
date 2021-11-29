package mx.brayan.partida.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class profile implements Serializable {
	@Id
	public String id;

	public String phone_number_id;

	public String address;

	@Field(targetType = FieldType.STRING)
	public String description;

	public String email;

	public String vertical;

	public String[] websites;

}
