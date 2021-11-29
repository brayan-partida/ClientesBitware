package mx.brayan.partida.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("flights")
public class FlightInformation {
	@Id
	private String id;
	
	@Indexed(unique = true)
	private String internalId;
	
	//@Field("s")
	
}
