package Grupo2.AppBackend.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity  //informa clase es una entidad, o estructura de datos que se conecta con una tabla equivalente. 

public class Productos {
						
	@Id // Indica atributo que le sigue es una llave primaria (PK), definida en la tabla
	private Long codigo_producto;
	private String nombre_producto;
	private long nit_proveedor;
	private Double precio_compra;
	private Double iva_compra;
	private Double precio_venta;
	
	
	public Long getCodigo_producto() {
		return codigo_producto;
	}
	public void setCodigo_producto(Long codigo_producto) {
		this.codigo_producto = codigo_producto;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public long getNit_proveedor() {
		return nit_proveedor;
	}
	public void setNit_proveedor(long nit_proveedor) {
		this.nit_proveedor = nit_proveedor;
	}
	public Double getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(Double precio_compra) {
		this.precio_compra = precio_compra;
	}
	public Double getIva_compra() {
		return iva_compra;
	}
	public void setIva_compra(Double iva_compra) {
		this.iva_compra = iva_compra;
	}
	public Double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(Double precio_venta) {
		this.precio_venta = precio_venta;
	}
	
	
	
}
