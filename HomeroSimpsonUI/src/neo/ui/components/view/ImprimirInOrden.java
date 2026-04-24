package neo.ui.components.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import neo.back.HomeroSimpson;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImprimirInOrden extends JPanel {

	private static final long serialVersionUID = 1L;
	JFrame ventana = null;
	private JTable table;
	private DefaultTableModel modelo;
	private int[][] filas;
	private HomeroSimpson homeroSimpson;
	/**
	 * Create the panel.
	 */
	public ImprimirInOrden(HomeroSimpson homeroSimpson, JFrame ventana) {
		
		setBackground(new Color(82, 69, 154));
		setBounds(0,0,359, 403);
		setLayout(null);
		this.ventana = ventana;
		this.homeroSimpson = homeroSimpson;
		
		JLabel lblNewLabel = new JLabel("IMRPIMIR EN IN ORNDEN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 328, 25);
		add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 339, 142);
		add(scrollPane);
		
		table = new JTable();
		modelo = new DefaultTableModel();
		table.setModel(modelo);
		
		modelo.addColumn("ORDEN");
		modelo.addColumn("TRABAJO");
		modelo.addColumn("DURACION");
		modelo.addColumn("TEMPORADA");
		cargarDatos();
		revalidate();
        repaint();
		
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Actualizar Tabla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizar();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(95, 210, 140, 37);
		add(btnNewButton);
	}
	
	public int[][] modificarFilas(){
		filas = new int[homeroSimpson.getCantidad()][2];
		//int[] consulta = homeroSimpson.imprimirInOrden();
		int[] consulta = new int[5];
		for(var i=0; i<filas.length; i++) {
			filas[i][0] = i+1;
			filas[i][1] = consulta[i];
		}
		
		for(var i=0; i<filas.length; i++) {
			System.out.println(filas[i][0]);
			System.out.println(filas[i][1]);
			System.out.println("-----------");
		}
		
		return filas;
	}
	
	public void cargarDatos() {
	    modificarFilas();
	    modelo.setRowCount(0);
	    for (int i = 0; i < filas.length; i++) {
	        modelo.addRow(new Object[]{filas[i][0], filas[i][1]});
	    }
	}
	
	public void actualizar() {
	    cargarDatos(); 
	    revalidate();
	    repaint();
	}
}
