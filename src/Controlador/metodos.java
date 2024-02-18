package Controlador;

import java.util.ArrayList;

import Modelo.Cliente;
import Modelo.Producto;

public class metodos {
	public static boolean validarCliente(String identificacion, ArrayList<Cliente> lista) {
		for(int i=0;i<lista.size();i++) {
			if(identificacion.equals(lista.get(i).getIdentificacion())) {
				return true;
			}
		}
		return false;
	}
	public static int elegirCliente(String identificacion, ArrayList<Cliente> lista) {
		for(int i=0;i<lista.size();i++) {
			if(identificacion.equals(lista.get(i).getIdentificacion())) {
				return i;
			}
		}
		return -1;
	}
	public static boolean validarProducto(String codigo,ArrayList<Producto> lista) {
		for(int i=0;i<lista.size();i++) {
			if(codigo.equals(lista.get(i).getCodigo())) {
				return true;
			}
		}
		return false;
	}
	public static int elegirProducto(String codigo,ArrayList<Producto> lista) {
		for(int i=0;i<lista.size();i++) {
			if(codigo.equals(lista.get(i).getCodigo())) {
				return i;
			}
		}
		return -1;
	}
}
