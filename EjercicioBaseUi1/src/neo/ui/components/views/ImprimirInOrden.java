package neo.ui.components.views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import neo.back.Arbol;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class ImprimirInOrden extends JPanel {

	private static final long serialVersionUID = 1L;
	JFrame ventana = null;
	private JTable table;
	private DefaultTableModel modelo;
	/**
	 * Create the panel.
	 */
	public ImprimirInOrden(Arbol arbol, JFrame ventana) {
		
		setBackground(new Color(82, 69, 154));
		setBounds(0,0,359, 403);
		setLayout(null);
		this.ventana = ventana;
		
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
		modelo.addColumn("NUDAMERO AGREGADO");
		
		
		scrollPane.setViewportView(table);
	}
}
