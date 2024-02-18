package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Modelo.PersonaJuridica;
import Modelo.PersonaNatural;
import Modelo.Producto;
import Modelo.ProductoEnvasado;
import Modelo.ProductoPerecedero;
import Modelo.ProductoRefrigerado;
import Vista.CrudProducto;
import Vista.Inicio;

public class ControladorProducto implements ActionListener{
	public static ArrayList<Producto> listaProductos=new ArrayList<Producto>();
	CrudProducto crudProducto=new CrudProducto();
	DefaultTableModel modelo=new DefaultTableModel();
	int ayuda=0;
	public ControladorProducto(CrudProducto crudProducto) {
		this.crudProducto=crudProducto;
		this.crudProducto.btnAgregar.addActionListener(this);this.crudProducto.btnEditar.addActionListener(this);
		this.crudProducto.btnEliminar.addActionListener(this);this.crudProducto.btnSalir.addActionListener(this);
		this.crudProducto.btnListar.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==crudProducto.btnAgregar) {
			if(metodos.validarProducto(crudProducto.textCodigo.getText(), listaProductos)==false) {
				if(crudProducto.boxTipoDePersona.getSelectedItem().toString().equals("Producto Perecedero")) {
					ProductoPerecedero producto=new ProductoPerecedero(crudProducto.textCodigo.getText(),crudProducto.textNombre.getText(),crudProducto.textArea.getText(),
							crudProducto.textValor.getText(),crudProducto.textCantidad.getText(),crudProducto.textCambiable1.getText());
					listaProductos.add(producto);
					JOptionPane.showMessageDialog(null, "Producto agregado");
				}else if(crudProducto.boxTipoDePersona.getSelectedItem().toString().equals("Producto Envasado")){
					ProductoEnvasado producto=new ProductoEnvasado(crudProducto.textCodigo.getText(),crudProducto.textNombre.getText(),crudProducto.textArea.getText(),
							crudProducto.textValor.getText(),crudProducto.textCantidad.getText(),crudProducto.textCambiable1.getText(),crudProducto.textCambiable.getText(),
							ProductoEnvasado.PaisOrigen.valueOf(crudProducto.boxPais.getSelectedItem().toString().toUpperCase()));
					listaProductos.add(producto);
					JOptionPane.showMessageDialog(null, "Producto agregado");
				}else if(crudProducto.boxTipoDePersona.getSelectedItem().toString().equals("Producto Refigerado")) {
					ProductoRefrigerado producto=new ProductoRefrigerado(crudProducto.textCodigo.getText(),crudProducto.textNombre.getText(),crudProducto.textArea.getText(),
							crudProducto.textValor.getText(),crudProducto.textCantidad.getText(),crudProducto.textCambiable1.getText(),crudProducto.textCambiable.getText());
					listaProductos.add(producto);
					JOptionPane.showMessageDialog(null, "Producto agregado");
				}
			}else {
				JOptionPane.showMessageDialog(null, "El Producto ya se encuentra en la lista");
			}
		}
		if(e.getSource()==crudProducto.btnEliminar){
			int indice=metodos.elegirProducto(crudProducto.textCodigo.getText(), listaProductos);
			if(indice>=0) {
				listaProductos.remove(indice);
				JOptionPane.showMessageDialog(null, "Producto eliminado");
			}else {
				JOptionPane.showMessageDialog(null, "El Producto no esta en la lista");
			}
		}
		if(e.getSource()==crudProducto.btnEditar) {
			int indice=metodos.elegirProducto(crudProducto.textCodigo.getText(), listaProductos);
			if(indice>=0) {
				if(crudProducto.boxTipoDePersona.getSelectedItem().toString().equals("Producto Perecedero")) {
					ProductoPerecedero producto=new ProductoPerecedero(crudProducto.textCodigo.getText(),crudProducto.textNombre.getText(),crudProducto.textArea.getText(),
							crudProducto.textValor.getText(),crudProducto.textCantidad.getText(),crudProducto.textCambiable1.getText());
					listaProductos.set(indice,producto);
					JOptionPane.showMessageDialog(null, "Producto Editado");
				}else if(crudProducto.boxTipoDePersona.getSelectedItem().toString().equals("Producto Envasado")){
					ProductoEnvasado producto=new ProductoEnvasado(crudProducto.textCodigo.getText(),crudProducto.textNombre.getText(),crudProducto.textArea.getText(),
							crudProducto.textValor.getText(),crudProducto.textCantidad.getText(),crudProducto.textCambiable1.getText(),crudProducto.textCambiable.getText(),
							ProductoEnvasado.PaisOrigen.valueOf(crudProducto.boxPais.getSelectedItem().toString().toUpperCase()));
					listaProductos.set(indice,producto);
					JOptionPane.showMessageDialog(null, "Producto Editado");
				}else if(crudProducto.boxTipoDePersona.getSelectedItem().toString().equals("Producto Refigerado")) {
					ProductoRefrigerado producto=new ProductoRefrigerado(crudProducto.textCodigo.getText(),crudProducto.textNombre.getText(),crudProducto.textArea.getText(),
							crudProducto.textValor.getText(),crudProducto.textCantidad.getText(),crudProducto.textCambiable1.getText(),crudProducto.textCambiable.getText());
					listaProductos.set(indice,producto);
					JOptionPane.showMessageDialog(null, "Producto Editado");
				}
			}else {
				JOptionPane.showMessageDialog(null, "El Producto no esta en la lista");
			}
		}
		if(e.getSource()==crudProducto.btnListar) {
			listar(crudProducto.table);
		}
		if(e.getSource()==crudProducto.btnSalir) {
			crudProducto.setVisible(false);
			Inicio inicio=new Inicio();
			inicio.setVisible(true);
		}
		
	}
	
	
	public void listar(JTable tabla) {
		if(ayuda==0) {
			modelo.addColumn("");modelo.addColumn("");modelo.addColumn("");modelo.addColumn("");modelo.addColumn("");
			modelo.addColumn("");modelo.addColumn("");modelo.addColumn("");
			ayuda=1;
		}else {
			for(int j=0;j<crudProducto.table.getRowCount();j++) {
				modelo.removeRow(j);
				j-=1;
			}
			
		}
		Object[] objeto=new Object[8];
		for(int i=0;i<listaProductos.size();i++) {
			if(listaProductos.get(i).getClass().getName().equals("Modelo.ProductoPerecedero")) {
				ProductoPerecedero pj=(ProductoPerecedero)listaProductos.get(i);
				objeto[0]=pj.getNombre();
				objeto[1]=pj.getCodigo();
				objeto[2]=pj.getValorUnitario();
				objeto[3]=pj.getCantidadExistencia();
				objeto[4]=pj.getFechaDeVencimiento();
				objeto[5]="Producto Perecedero";
				objeto[6]=null;
				objeto[7]=null;
				modelo.addRow(objeto);
			}else if(listaProductos.get(i).getClass().getName().equals("Modelo.ProductoRefrigerado")){
				ProductoRefrigerado pj=(ProductoRefrigerado)listaProductos.get(i);
				objeto[0]=pj.getNombre();
				objeto[1]=pj.getCodigo();
				objeto[2]=pj.getValorUnitario();
				objeto[3]=pj.getCantidadExistencia();
				objeto[4]=pj.getCodigoDeAprobacion();
				objeto[5]="Producto Refrigerado";
				objeto[6]=pj.getTemperaturaRecomendada();
				objeto[7]=null;
				modelo.addRow(objeto);
			}else {
				ProductoEnvasado pj=(ProductoEnvasado)listaProductos.get(i);
				objeto[0]=pj.getNombre();
				objeto[1]=pj.getCodigo();
				objeto[2]=pj.getValorUnitario();
				objeto[3]=pj.getCantidadExistencia();
				objeto[4]=pj.getFechaDeEnvasado();
				objeto[5]="Producto Envasado";
				objeto[6]=pj.getPesoDelEnvase();
				objeto[7]=pj.getPaisOrigen().toString().toLowerCase();
				modelo.addRow(objeto);
			}
		}
		crudProducto.table.setModel(modelo);
	}
	
}
