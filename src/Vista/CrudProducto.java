package Vista;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class CrudProducto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textCambiable;
	public JButton btnSalir;
	public JComboBox boxTipoDePersona;
	public JTextField textCambiable1;
	public JTextField textValor;
	public JTextField textCodigo;
	public JButton btnEditar;
	public JButton btnEliminar;
	public JTextField textNombre;
	public JTextField textCantidad;
	public JButton btnAgregar;
	public JButton btnListar;
	public JLabel lblPais;
	public JLabel lblCambiable;
	public JTable table;
	public JLabel lblCambiable1;
	public JComboBox boxPais;
	public JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrudProducto frame = new CrudProducto();
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
	public CrudProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 896, 756);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Productos");
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
		
		lblCambiable1 = new JLabel("Fecha de Vencimiento");
		lblCambiable1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCambiable1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCambiable1.setBounds(31, 217, 204, 40);
		contentPane.add(lblCambiable1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cantidad en existencia");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(198, 43, 204, 40);
		contentPane.add(lblNewLabel_1_2);
		
		textCambiable1 = new JTextField();
		textCambiable1.setColumns(10);
		textCambiable1.setBounds(10, 268, 165, 20);
		contentPane.add(textCambiable1);
		
		textCantidad = new JTextField();
		textCantidad.setColumns(10);
		textCantidad.setBounds(222, 86, 165, 20);
		contentPane.add(textCantidad);
		
		textValor = new JTextField();
		textValor.setColumns(10);
		textValor.setBounds(10, 174, 165, 20);
		contentPane.add(textValor);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Valor Unitario");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2_1.setBounds(-16, 123, 204, 40);
		contentPane.add(lblNewLabel_1_2_1);
		
		boxTipoDePersona = new JComboBox();
		boxTipoDePersona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(boxTipoDePersona.getSelectedIndex()==0) {
					lblCambiable1.setText("Fecha de vencimiento");
					lblCambiable.setVisible(false);
					textCambiable.setVisible(false);
					lblPais.setVisible(false);
					boxPais.setVisible(false);
					
				}else if(boxTipoDePersona.getSelectedIndex()==1){
					lblCambiable1.setText("Codigo de aprobacion");
					lblCambiable.setVisible(true);
					textCambiable.setVisible(true);
					lblCambiable.setText("Temperatura Recomendada");
					lblPais.setVisible(false);
					boxPais.setVisible(false);
					
					
				}else {
					lblCambiable1.setText("Fecha de envasado");
					lblCambiable.setVisible(true);
					textCambiable.setVisible(true);
					lblCambiable.setText("Peso del envase");
					lblPais.setVisible(true);
					boxPais.setVisible(true);
				}
			}
		});
		boxTipoDePersona.setFont(new Font("Tahoma", Font.PLAIN, 14));
		boxTipoDePersona.setModel(new DefaultComboBoxModel(new String[] {"Producto Perecedero", "Producto Refigerado", "Producto Envasado"}));
		boxTipoDePersona.setBounds(222, 267, 167, 22);
		contentPane.add(boxTipoDePersona);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Tipo de producto");
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2_2.setBounds(208, 217, 204, 40);
		contentPane.add(lblNewLabel_1_2_2);
		
		lblCambiable = new JLabel("Identificacion");
		lblCambiable.setHorizontalAlignment(SwingConstants.CENTER);
		lblCambiable.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCambiable.setBounds(0, 299, 232, 40);
		contentPane.add(lblCambiable);
		
		textCodigo = new JTextField();
		textCodigo.setColumns(10);
		textCodigo.setBounds(222, 174, 165, 20);
		contentPane.add(textCodigo);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Codigo");
		lblNewLabel_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2_3.setBounds(198, 117, 204, 40);
		contentPane.add(lblNewLabel_1_2_3);
		
		textCambiable = new JTextField();
		textCambiable.setColumns(10);
		textCambiable.setBounds(10, 352, 165, 20);
		contentPane.add(textCambiable);
		
		lblPais = new JLabel("Pais de origen");
		lblPais.setHorizontalAlignment(SwingConstants.CENTER);
		lblPais.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPais.setBounds(198, 300, 204, 40);
		contentPane.add(lblPais);
		
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
		table.setBounds(10, 476, 860, 230);
		contentPane.add(table);
		
		boxPais = new JComboBox();
		boxPais.setFont(new Font("Tahoma", Font.PLAIN, 14));
		boxPais.setModel(new DefaultComboBoxModel(new String[] {"Colombia", "Argentina", "Chile", "Ecuador", "Peru"}));
		boxPais.setBounds(222, 351, 165, 22);
		contentPane.add(boxPais);
		
		textArea = new JTextArea();
		textArea.setBounds(611, 174, 259, 193);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_1_2_3_1 = new JLabel("Descripcion");
		lblNewLabel_1_2_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2_3_1.setBounds(640, 117, 204, 40);
		contentPane.add(lblNewLabel_1_2_3_1);
	}
}
