package neo.ui.components.view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;


import neo.back.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Scrollbar;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;

public class InsertarNodos extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField nombreTrabajo;
	int heightPanel = 94;
	int heightPanelBtn = 100;
	int cantidadInputs = 0;
	JFrame ventana = null;
	JTextField[] arregloInputs1 = new JTextField[3];
	JTextField[] arregloInputs2 = new JTextField[3];
	JTextField[] arregloInputs3 = new JTextField[3];
	JPanel[] arregloPanelInputs = new JPanel[3];
	private JTextField temporada;
	private JTextField duracion;
	
	/**
	 * Create the panel.
	 */
	public InsertarNodos(HomeroSimpson homeroSimpson, JFrame ventana) {
		
		setBackground(new Color(82, 69, 154));
		setBounds(0,0,359, 403);
		setLayout(null);
		this.ventana = ventana;
		
		JLabel lblNewLabel = new JLabel("INSERTAR NODOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 328, 25);
		add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(82, 69, 154));
		panel.setBounds(22, 50, 311, heightPanel);
		add(panel);
		panel.setLayout(new GridLayout(0, 1, 5, 10));
		
		JPanel panel_inputs = new JPanel();
		panel.add(panel_inputs);
		panel_inputs.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nuevo Trabajo:");
		lblNewLabel_1.setBounds(5, 5, 111, 19);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_inputs.add(lblNewLabel_1);
		
		nombreTrabajo = new JTextField();
		nombreTrabajo.setBounds(113, 7, 188, 19);
		nombreTrabajo.setColumns(10);
		panel_inputs.add(nombreTrabajo);
		arregloInputs1[0] = nombreTrabajo;
		arregloPanelInputs[0] = panel_inputs;
		
		temporada = new JTextField();
		temporada.setColumns(10);
		temporada.setBounds(113, 32, 188, 18);
		arregloInputs2[0] = temporada;
		panel_inputs.add(temporada);
		
		JLabel lblNewLabel_1_1 = new JLabel("Temporada:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(5, 30, 96, 19);
		panel_inputs.add(lblNewLabel_1_1);
		
		duracion = new JTextField();
		duracion.setColumns(10);
		duracion.setBounds(113, 60, 188, 18);
		panel_inputs.add(duracion);
		arregloInputs3[0] = duracion;
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Duracion(dias):");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(5, 60, 138, 18);
		panel_inputs.add(lblNewLabel_1_1_1);
		
		JPanel panel_btn = new JPanel();
		panel_btn.setBackground(new Color(82, 69, 154));
		panel_btn.setBounds(22, 193, 293, 31);
		add(panel_btn);
		panel_btn.setLayout(new GridLayout(0, 3, 10, 10));
		
		JButton btnAgregar = new JButton("ADD");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				if (cantidadInputs < 2) {
					cantidadInputs ++;
					heightPanel = heightPanel + 100;
					if (cantidadInputs == 1) {
						heightPanelBtn = heightPanelBtn + 155;
					}else {
						heightPanelBtn = heightPanelBtn + 110;
					}
					
					panel.setBounds(22, 50, 311, heightPanel);
					
					panel_btn.setBounds(22, heightPanelBtn, 293, 31);
					
					JPanel panel_inputs = new JPanel();
					panel.add(panel_inputs);
					panel_inputs.setLayout(null);
					
					JLabel lblNewLabel_1 = new JLabel("Nuevo Trabajo:");
					lblNewLabel_1.setBounds(5, 5, 111, 19);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
					panel_inputs.add(lblNewLabel_1);
					
					JTextField nombreTrabajo = new JTextField();
					nombreTrabajo.setBounds(113, 7, 188, 19);
					nombreTrabajo.setColumns(10);
					panel_inputs.add(nombreTrabajo);
					arregloInputs1[cantidadInputs] = nombreTrabajo;
					arregloPanelInputs[cantidadInputs] = panel_inputs;
					
					JTextField temporada = new JTextField();
					temporada.setColumns(10);
					temporada.setBounds(113, 32, 188, 18);
					arregloInputs2[cantidadInputs] = temporada;
					panel_inputs.add(temporada);
					
					JLabel lblNewLabel_1_1 = new JLabel("Temporada:");
					lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
					lblNewLabel_1_1.setBounds(5, 30, 96, 19);
					panel_inputs.add(lblNewLabel_1_1);
					
					JTextField duracion = new JTextField();
					duracion.setColumns(10);
					duracion.setBounds(113, 60, 188, 18);
					panel_inputs.add(duracion);
					arregloInputs3[cantidadInputs] = duracion;
					
					JLabel lblNewLabel_1_1_1 = new JLabel("Duracion(dias):");
					lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
					lblNewLabel_1_1_1.setBounds(5, 60, 138, 18);
					panel_inputs.add(lblNewLabel_1_1_1);
					
			        panel.revalidate(); // refresca el layout
			        panel.repaint();    // repinta la interfaz
			        
			        System.out.println("nuevo campo");
				}else {
					JOptionPane.showMessageDialog(ventana, "No se pueden crear mas campos", "ERROR", 0);
				}
				
				
			}
		});
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_btn.add(btnAgregar);
		
		JButton btnEnviar = new JButton("SEND");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<arregloInputs1.length; i++) {
					
					if (arregloInputs1[i] != null ) {
						
						if(arregloInputs1[i].getText() != null) {
							
							
							try {
								String valor1 = arregloInputs1[i].getText();
								System.out.print(valor1);
								int valor2 = Integer.parseInt(arregloInputs2[i].getText());
								int valor3 = Integer.parseInt(arregloInputs3[i].getText());
								homeroSimpson.insertarTrabajo(valor1, valor2, valor3);
							}catch(Exception er) {
								System.out.print(arregloInputs1[i].getText());
								JOptionPane.showMessageDialog(ventana, "Uno de los valores no es numerico", "ERROR", 0);
							}
						}else {
							JOptionPane.showMessageDialog(ventana, "Algún campo esta vacio", "ERROR", 0);
						}
					}
					
				}
			}
		});
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_btn.add(btnEnviar);
		
		JButton btnBorrar = new JButton("DEL");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cantidadInputs <=0) {
					JOptionPane.showMessageDialog(ventana, "No se puede borrar el campo", "ERROR", 0);
				}else {
					panel.remove(arregloPanelInputs[cantidadInputs]);
					arregloInputs1[cantidadInputs] = null;
					arregloInputs2[cantidadInputs] = null;
					arregloInputs3[cantidadInputs] = null;
					arregloPanelInputs[cantidadInputs] = null;
					
					if (cantidadInputs == 2) {
						heightPanelBtn = heightPanelBtn -110;
					}if(cantidadInputs == 1){
						heightPanelBtn = heightPanelBtn -155;
					}
					cantidadInputs --;
					
					System.out.println(cantidadInputs);
					
					heightPanel = heightPanel -100;
					
					
					panel.setBounds(22, 50, 311, heightPanel);
					
					panel_btn.setBounds(22, 50 + heightPanel + 10, 293, 31); 
					
					panel.revalidate();
			        panel.repaint();
				}
			}
		});
		panel_btn.add(btnBorrar);
	}
}
