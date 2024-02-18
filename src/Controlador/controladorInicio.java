package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.*;

public class controladorInicio implements ActionListener{
	Inicio inicio=new Inicio();
	CrudCliente crudCliente = new CrudCliente();
	public controladorInicio(Inicio inicio) {
		this.inicio=inicio;
		this.inicio.btnClientes.addActionListener(this);this.inicio.btnProductos.addActionListener(this);
		this.inicio.btnCerrar.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==inicio.btnClientes) {
			CrudCliente crudCliente=new CrudCliente();
			controlador control=new controlador(crudCliente);
			inicio.setVisible(false);
			crudCliente.lblCambiable.setText("NIT");
			crudCliente.lblEmail.setVisible(false);
			crudCliente.textEmail.setVisible(false);
			crudCliente.setVisible(true);
			
		}
		if(e.getSource()==inicio.btnCerrar) {
			System.exit(0);;
		}
		if(e.getSource()==inicio.btnProductos) {
			CrudProducto crudProductos=new CrudProducto();
			ControladorProducto controlProducto=new ControladorProducto(crudProductos);
			
			inicio.setVisible(false);
			crudProductos.lblCambiable.setVisible(false);
			crudProductos.textCambiable.setVisible(false);
			crudProductos.lblPais.setVisible(false);
			crudProductos.boxPais.setVisible(false);
			crudProductos.setVisible(true);
		}
			
	}

}
