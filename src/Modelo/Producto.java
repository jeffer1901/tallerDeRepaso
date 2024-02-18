package Modelo;

public class Producto {
	private String codigo;
	private String nombre;
	private String descripcion;
	private String valorUnitario;
	private String cantidadEnExistencia;
	public Producto(String codigo,String nombre,String descripcion,String valorUnitario,String cantidadEnExistencia) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.valorUnitario=valorUnitario;
		this.cantidadEnExistencia=cantidadEnExistencia;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCantidadExistencia() {
		return cantidadEnExistencia;
	}
	public void setCantidadExistencia(String cantidadExistencia) {
		this.cantidadEnExistencia = cantidadExistencia;
	}
	public String getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(String valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
}
