package mx.brayan.partida.model;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import com.mongodb.lang.NonNull;

@Document("clientes")
public class clientes {
	@Id
	private Integer ClienteID;
	@NonNull

	private String Nombre_Usuario;
	@NonNull
	// @org.springframework.data.mongodb.core.index.Indexed(unique = true)
	private String Password;

	private String Apellidos;

	@NonNull
	private String Correo_Electronico;

	private Integer Edad;

	@Field(targetType = FieldType.DECIMAL128)
	private BigDecimal Estatura;

	@Field(targetType = FieldType.DECIMAL128)
	private BigDecimal Peso;

	@Field(targetType = FieldType.DECIMAL128)
	private BigDecimal IMC;

	@Field(targetType = FieldType.DECIMAL128)
	private BigDecimal GEB;

	@Field(targetType = FieldType.DECIMAL128)
	private BigDecimal ETA;

	@Field(targetType = FieldType.DATE_TIME)
	private Date Fecha_Creacion;

	public Integer getClienteID() {
		return ClienteID;
	}

	public void setClienteID(Integer clienteID) {
		ClienteID = clienteID;
	}

	public String getNombre_Usuario() {
		return Nombre_Usuario;
	}

	public void setNombre_Usuario(String nombre_Usuario) {
		Nombre_Usuario = nombre_Usuario;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getCorreo_Electronico() {
		return Correo_Electronico;
	}

	public void setCorreo_Electronico(String correo_Electronico) {
		Correo_Electronico = correo_Electronico;
	}

	public Integer getEdad() {
		return Edad;
	}

	public void setEdad(Integer edad) {
		Edad = edad;
	}

	public BigDecimal getEstatura() {
		return Estatura;
	}

	public void setEstatura(BigDecimal estatura) {
		Estatura = estatura;
	}

	public BigDecimal getPeso() {
		return Peso;
	}

	public void setPeso(BigDecimal peso) {
		Peso = peso;
	}

	public BigDecimal getIMC() {
		return IMC;
	}

	public void setIMC(BigDecimal iMC) {
		IMC = iMC;
	}

	public BigDecimal getGEB() {
		return GEB;
	}

	public void setGEB(BigDecimal gEB) {
		GEB = gEB;
	}

	public BigDecimal getETA() {
		return ETA;
	}

	public void setETA(BigDecimal eTA) {
		ETA = eTA;
	}

	public Date getFecha_Creacion() {
		return Fecha_Creacion;
	}

	public void setFecha_Creacion(Date fecha_Creacion) {
		Fecha_Creacion = fecha_Creacion;
	}

	public Date getFecha_Actualizacion() {
		return Fecha_Actualizacion;
	}

	public void setFecha_Actualizacion(Date fecha_Actualizacion) {
		Fecha_Actualizacion = fecha_Actualizacion;
	}

	@Field(targetType = FieldType.DATE_TIME)
	private Date Fecha_Actualizacion;

	public clientes() {
		// TODO Auto-generated constructor stub
	}

}
