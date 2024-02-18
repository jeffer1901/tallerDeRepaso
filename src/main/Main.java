package main;
import Controlador.*;
import Vista.*;
public class Main {

	public static void main(String[] args) {
		Inicio inicio=new Inicio();
		controladorInicio ci=new controladorInicio(inicio);
		inicio.setVisible(true);
		
	}

}
