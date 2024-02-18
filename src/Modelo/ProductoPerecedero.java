package Modelo;

public class ProductoPerecedero extends Producto{
	
	private String fechaDeVencimiento;
	public ProductoPerecedero(String codigo, String nombre, String descripcion, String valorUnitario,
			String cantidadEnExistencia,String fechaDeVencimiento) {
		super(codigo, nombre, descripcion, valorUnitario, cantidadEnExistencia);
		this.fechaDeVencimiento=fechaDeVencimiento;
	}
	public String getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}
	public void setFechaDeVencimiento(String fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}
	
}
