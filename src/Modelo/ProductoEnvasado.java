package Modelo;

public class ProductoEnvasado extends Producto{
	private String fechaDeEnvasado;
	private String pesoDelEnvase;
	public enum PaisOrigen{COLOMBIA,ARGENTINA,CHILE,ECUADRO,PERU};
	private PaisOrigen paisOrigen;
	public ProductoEnvasado(String codigo, String nombre, String descripcion, String valorUnitario,
			String cantidadEnExistencia,String fechaDeEnvasado,String pesoDelEnvase,PaisOrigen paisOrigen) {
		super(codigo, nombre, descripcion, valorUnitario, cantidadEnExistencia);
		this.paisOrigen=paisOrigen;
		this.fechaDeEnvasado=fechaDeEnvasado;
		this.pesoDelEnvase=pesoDelEnvase;
	}
	public String getFechaDeEnvasado() {
		return fechaDeEnvasado;
	}
	public void setFechaDeEnvasado(String fechaDeEnvasado) {
		this.fechaDeEnvasado = fechaDeEnvasado;
	}
	public String getPesoDelEnvase() {
		return pesoDelEnvase;
	}
	public void setPesoDelEnvase(String pesoDelEnvase) {
		this.pesoDelEnvase = pesoDelEnvase;
	}
	public PaisOrigen getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(PaisOrigen paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
}
