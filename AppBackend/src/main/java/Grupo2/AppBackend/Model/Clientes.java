package Grupo2.AppBackend.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  //informa clase es una entidad, o estructura de datos que se conecta con una tabla equivalente. 
public class Clientes {
	@Id // Indica atributo que le sigue es una llave primaria (PK), definida en la tabla
	private Long cedula_cliente;
	private String nombre_cliente;
	private String apellido_cliente;
	private String direccion_cliente;
	private String email_cliente;
	private String telefono_cliente;
	public Long getCedula_cliente() {
		return cedula_cliente;
	}
	public void setCedula_cliente(Long cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public String getApellido_cliente() {
		return apellido_cliente;
	}
	public void setApellido_cliente(String apellido_cliente) {
		this.apellido_cliente = apellido_cliente;
	}
	public String getDireccion_cliente() {
		return direccion_cliente;
	}
	public void setDireccion_cliente(String direccion_cliente) {
		this.direccion_cliente = direccion_cliente;
	}
	public String getEmail_cliente() {
		return email_cliente;
	}
	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}
	public String getTelefono_cliente() {
		return telefono_cliente;
	}
	public void setTelefono_cliente(String telefono_cliente) {
		this.telefono_cliente = telefono_cliente;
	}
	
	
	
	
	
}