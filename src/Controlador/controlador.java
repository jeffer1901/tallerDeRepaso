package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Modelo.Cliente;
import Modelo.PersonaJuridica;
import Modelo.PersonaNatural;
import Vista.*;

public class controlador implements ActionListener{
	CrudCliente crudCliente=new CrudCliente();
	private ArrayList<Cliente> listaClientes=new ArrayList<Cliente>();
	DefaultTableModel modelo=new DefaultTableModel();
	private int ayuda=0;
	public controlador(CrudCliente crudCliente) {
		this.crudCliente=crudCliente;
		this.crudCliente.btnAgregar.addActionListener(this);this.crudCliente.btnEditar.addActionListener(this);
		this.crudCliente.btnEliminar.addActionListener(this);this.crudCliente.btnSalir.addActionListener(this);
		this.crudCliente.btnListar.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==crudCliente.btnAgregar) {
			if(metodos.validarCliente(crudCliente.textId.getText(), listaClientes)==false) {
				if(crudCliente.boxTipoDePersona.getSelectedItem().toString().equals("Persona Natural")) {
					PersonaNatural cliente=new PersonaNatural(crudCliente.textNombre.getText(),crudCliente.textApellidos.getText(),crudCliente.textId.getText(),
							crudCliente.textDireccion.getText(),
							crudCliente.textTelefono.getText(),crudCliente.textEmail.getText(),crudCliente.textCambiable.getText());
					listaClientes.add(cliente);
					JOptionPane.showMessageDialog(null, "Cliente Agregado");
				}else if(crudCliente.boxTipoDePersona.getSelectedItem().toString().equals("Persona Juridica")){
					PersonaJuridica cliente=new PersonaJuridica(crudCliente.textNombre.getText(),crudCliente.textApellidos.getText(),
							crudCliente.textId.getText(),crudCliente.textDireccion.getText(),
							crudCliente.textTelefono.getText(),crudCliente.textCambiable.getText());
					listaClientes.add(cliente);
					JOptionPane.showMessageDialog(null, "Cliente Agregado");
				}
			}else {
				JOptionPane.showMessageDialog(null, "El cliente ya se encuentra en la lista");
			}
		}
		if(e.getSource()==crudCliente.btnEliminar) {
			int indice=metodos.elegirCliente(crudCliente.textId.getText(), listaClientes);
			if(indice>=0) {
				listaClientes.remove(indice);
				JOptionPane.showMessageDialog(null, "Cliente eliminado");
			}else {
				JOptionPane.showMessageDialog(null, "El cliente no esta en la lista");
			}
		}
		if(e.getSource()==crudCliente.btnEditar) {
			int indice=metodos.elegirCliente(crudCliente.textId.getText(), listaClientes);
			if(indice>=0) {
				if(crudCliente.boxTipoDePersona.getSelectedItem().toString().equals("Persona Natural")) {
					PersonaNatural cliente=new PersonaNatural(crudCliente.textNombre.getText(),crudCliente.textApellidos.getText(),crudCliente.textId.getText(),crudCliente.textDireccion.getText(),
							crudCliente.textTelefono.getText(),crudCliente.textEmail.getText(),crudCliente.textCambiable.getText());
					listaClientes.set(indice, cliente);
					JOptionPane.showMessageDialog(null, "Cliente Editado");
				}else if(crudCliente.boxTipoDePersona.getSelectedItem().toString().equals("Persona Juridica")){
					PersonaJuridica cliente=new PersonaJuridica(crudCliente.textNombre.getText(),crudCliente.textApellidos.getText(),crudCliente.textId.getText(),crudCliente.textDireccion.getText(),
							crudCliente.textTelefono.getText(),crudCliente.textCambiable.getText());
					listaClientes.set(indice, cliente);
					JOptionPane.showMessageDialog(null, "Cliente Editado");
				}
			}else {
				JOptionPane.showMessageDialog(null, "El cliente no esta en la lista");
			}
		}
		if(e.getSource()==crudCliente.btnListar) {
			listar(crudCliente.table);
		}
		if(e.getSource()==crudCliente.btnSalir) {
			crudCliente.setVisible(false);
			Inicio inicio=new Inicio();
			inicio.setVisible(true);
		}
		
		
		
	}
	
	public void listar(JTable tabla) {
		if(ayuda==0) {
			modelo.addColumn("");modelo.addColumn("");modelo.addColumn("");modelo.addColumn("");modelo.addColumn("");
			modelo.addColumn("");modelo.addColumn("");
			ayuda=1;
		}else {
			for(int j=0;j<crudCliente.table.getRowCount();j++) {
				modelo.removeRow(j);
				j-=1;
			}
			
		}
		Object[] objeto=new Object[9];
		for(int i=0;i<listaClientes.size();i++) {
			if(listaClientes.get(i).getClass().getName().equals("Modelo.PersonaJuridica")) {
				PersonaJuridica pj=(PersonaJuridica)listaClientes.get(i);
				objeto[0]=pj.getNombre();
				objeto[1]=pj.getApellidos();
				objeto[2]=pj.getIdentificacion();
				objeto[3]=pj.getTelefono();
				objeto[4]=pj.getDireccion();
				objeto[5]="Persona Juridica";
				objeto[6]=pj.getNit();
				objeto[7]=null;
				objeto[8]=null;
				modelo.addRow(objeto);
			}else {
				PersonaNatural pj=(PersonaNatural)listaClientes.get(i);
				objeto[0]=pj.getNombre();
				objeto[1]=pj.getApellidos();
				objeto[2]=pj.getIdentificacion();
				objeto[3]=pj.getTelefono();
				objeto[4]=pj.getDireccion();
				objeto[5]="Persona Natural";
				objeto[6]=pj.getFechaNacimiento();
				objeto[7]=pj.getEmail();
				objeto[8]=null;
				modelo.addRow(objeto);
			}
		}
		crudCliente.table.setModel(modelo);
	}
	
}
