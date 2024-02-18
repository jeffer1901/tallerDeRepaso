package Modelo;

public class ProductoRefrigerado extends Producto{
	private String codigoDeAprobacion;
	private String temperaturaRecomendada;
	public ProductoRefrigerado(String codigo, String nombre, String descripcion, String valorUnitario,
			String cantidadEnExistencia,String codigoDeAprobacion,String temperaturaRecomendada) {
		super(codigo, nombre, descripcion, valorUnitario, cantidadEnExistencia);
		this.codigoDeAprobacion=codigoDeAprobacion;
		this.temperaturaRecomendada=temperaturaRecomendada;
	}
	public String getCodigoDeAprobacion() {
		return codigoDeAprobacion;
	}
	public void setCodigoDeAprobacion(String codigoDeAprobacion) {
		this.codigoDeAprobacion = codigoDeAprobacion;
	}
	public String getTemperaturaRecomendada() {
		return temperaturaRecomendada;
	}
	public void setTemperaturaRecomendada(String temperaturaRecomendada) {
		this.temperaturaRecomendada = temperaturaRecomendada;
	}

}
