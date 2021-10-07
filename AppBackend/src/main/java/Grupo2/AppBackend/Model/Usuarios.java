package Grupo2.AppBackend.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  //informa clase es una entidad, o estructura de datos que se conecta con una tabla equivalente. 
public class Usuarios {

	@Id // Indica atributo que le sigue es una llave primaria (PK), definida en la tabla
	private Long cedula_usuario;
	private String nombre_usuario;
	private String apellido_usuario;
	private String email_usuario;
	private String usuario;
	private String password;
	private int tipo_usuario;
	private int estado_usuario;
	public Long getCedula_usuario() {
		return cedula_usuario;
	}
	public void setCedula_usuario(Long cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getApellido_usuario() {
		return apellido_usuario;
	}
	public void setApellido_usuario(String apellido_usuario) {
		this.apellido_usuario = apellido_usuario;
	}
	public String getEmail_usuario() {
		return email_usuario;
	}
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getTipo_usuario() {
		return tipo_usuario;
	}
	public void setTipo_usuario(int tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
	public int getEstado_usuario() {
		return estado_usuario;
	}
	public void setEstado_usuario(int estado_usuario) {
		this.estado_usuario = estado_usuario;
	}
	
	
	
	
	
	
}
