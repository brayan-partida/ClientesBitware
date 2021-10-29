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
	private String clienteid;

	@NonNull

	private String nombre_usuario;
	@NonNull
	// @org.springframework.data.mongodb.core.index.Indexed(unique = true)
	private String password;

	private String apellidos;

	@NonNull
	private String correo_electronico;

	private Integer edad;

	@Field(targetType = FieldType.DECIMAL128)
	private BigDecimal estatura;

	@Field(targetType = FieldType.DECIMAL128)
	private BigDecimal peso;

	@Field(targetType = FieldType.DECIMAL128)
	private BigDecimal imc;

	@Field(targetType = FieldType.DECIMAL128)
	private BigDecimal geb;

	@Field(targetType = FieldType.DECIMAL128)
	private BigDecimal eta;

	@Field(targetType = FieldType.DATE_TIME)
	private Date fecha_creacion;

	@Field(targetType = FieldType.DATE_TIME)
	private Date fecha_actualizacion;

	public clientes(String clienteid, String nombre_usuario, String password, String apellidos,
			String correo_electronico, Integer edad, BigDecimal estatura, BigDecimal peso, BigDecimal imc,
			BigDecimal geb, BigDecimal eta, Date fecha_creacion, Date fecha_actualizacion) {
		super();
		this.clienteid = clienteid;
		this.nombre_usuario = nombre_usuario;
		this.password = password;
		this.apellidos = apellidos;
		this.correo_electronico = correo_electronico;
		this.edad = edad;
		this.estatura = estatura;
		this.peso = peso;
		this.imc = imc;
		this.geb = geb;
		this.eta = eta;
		this.fecha_creacion = fecha_creacion;
		this.fecha_actualizacion = fecha_actualizacion;
	}

	public String getClienteid() {
		return clienteid;
	}

	public void setClienteid(String clienteid) {
		this.clienteid = clienteid;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public BigDecimal getEstatura() {
		return estatura;
	}

	public void setEstatura(BigDecimal estatura) {
		this.estatura = estatura;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public BigDecimal getImc() {
		return imc;
	}

	public void setImc(BigDecimal imc) {
		this.imc = imc;
	}

	public BigDecimal getGeb() {
		return geb;
	}

	public void setGeb(BigDecimal geb) {
		this.geb = geb;
	}

	public BigDecimal getEta() {
		return eta;
	}

	public void setEta(BigDecimal eta) {
		this.eta = eta;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public Date getFecha_actualizacion() {
		return fecha_actualizacion;
	}

	public void setFecha_actualizacion(Date fecha_actualizacion) {
		this.fecha_actualizacion = fecha_actualizacion;
	}

}
