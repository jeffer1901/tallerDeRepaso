package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controlador.metodos;
import Modelo.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;

public class CrudCliente extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textCambiable;
	public JTextField textEmail;
	public JButton btnSalir;
	public JComboBox boxTipoDePersona;
	public JTextField textApellidos;
	public JTextField textDireccion;
	public JTextField textId;
	public JButton btnEditar;
	public JButton btnEliminar;
	public JTextField textNombre;
	public JTextField textTelefono;
	public JButton btnAgregar;
	public JButton btnListar;
	public JLabel lblEmail;
	public JLabel lblCambiable;
	public JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrudCliente frame = new CrudCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CrudCliente() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 756);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Clientes");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel.setBounds(157, 11, 245, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(-16, 43, 204, 40);
		contentPane.add(lblNewLabel_1);
		
		textNombre = new JTextField();
		textNombre.setBounds(10, 86, 165, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellidos");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(-16, 217, 204, 40);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("telefono");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(198, 43, 204, 40);
		contentPane.add(lblNewLabel_1_2);
		
		textApellidos = new JTextField();
		textApellidos.setColumns(10);
		textApellidos.setBounds(10, 268, 165, 20);
		contentPane.add(textApellidos);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(222, 86, 165, 20);
		contentPane.add(textTelefono);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(10, 174, 165, 20);
		contentPane.add(textDireccion);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Direccion");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2_1.setBounds(-16, 123, 204, 40);
		contentPane.add(lblNewLabel_1_2_1);
		
		boxTipoDePersona = new JComboBox();
		boxTipoDePersona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(boxTipoDePersona.getSelectedIndex()==0) {
					lblCambiable.setText("NIT");
					lblEmail.setVisible(false);
					textEmail.setVisible(false);
				}else {
					lblCambiable.setText("Fecha de nacimiento");
					lblEmail.setVisible(true);
					textEmail.setVisible(true);
				}
			}
		});
		boxTipoDePersona.setFont(new Font("Tahoma", Font.PLAIN, 14));
		boxTipoDePersona.setModel(new DefaultComboBoxModel(new String[] {"Persona Juridica", "Persona Natural"}));
		boxTipoDePersona.setBounds(222, 267, 167, 22);
		contentPane.add(boxTipoDePersona);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Tipo de persona");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2_2.setBounds(208, 217, 204, 40);
		contentPane.add(lblNewLabel_1_2_2);
		
		lblCambiable = new JLabel("Identificacion");
		lblCambiable.setHorizontalAlignment(SwingConstants.CENTER);
		lblCambiable.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCambiable.setBounds(-16, 299, 204, 40);
		contentPane.add(lblCambiable);
		
		textId = new JTextField();
		textId.setColumns(10);
		textId.setBounds(222, 174, 165, 20);
		contentPane.add(textId);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Identificacion");
		lblNewLabel_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2_3.setBounds(198, 117, 204, 40);
		contentPane.add(lblNewLabel_1_2_3);
		
		textCambiable = new JTextField();
		textCambiable.setColumns(10);
		textCambiable.setBounds(10, 352, 165, 20);
		contentPane.add(textCambiable);
		
		lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmail.setBounds(198, 300, 204, 40);
		contentPane.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(222, 352, 165, 20);
		contentPane.add(textEmail);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAgregar.setBounds(454, 66, 120, 40);
		contentPane.add(btnAgregar);
		
		
		btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEditar.setBounds(454, 156, 120, 40);
		contentPane.add(btnEditar);
		
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEliminar.setBounds(454, 250, 120, 40);
		contentPane.add(btnEliminar);
	
		
		btnSalir = new JButton("Salir\r\n");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalir.setBounds(454, 415, 115, 40);
		contentPane.add(btnSalir);
		
		btnListar = new JButton("Listar");
		btnListar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnListar.setBounds(454, 332, 115, 40);
		contentPane.add(btnListar);
		
		table = new JTable();
		table.setBounds(10, 476, 640, 230);
		contentPane.add(table);
	}
}
