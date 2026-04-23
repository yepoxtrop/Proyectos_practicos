package neo.ui.components.views;

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
	private JTextField textField;
	int heightPanel = 31;
	int heightPanelBtn = 100;
	int cantidadInputs = 0;
	JFrame ventana = null;
	JTextField[] arregloInputs = new JTextField[7];
	JPanel[] arregloPanelInputs = new JPanel[7];
	
	/**
	 * Create the panel.
	 */
	public InsertarNodos(Arbol arbol, JFrame ventana) {
		
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
		panel.setBounds(22, 50, 293, heightPanel);
		add(panel);
		panel.setLayout(new GridLayout(0, 1, 5, 10));
		
		JPanel panel_inputs = new JPanel();
		panel.add(panel_inputs);
		panel_inputs.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nuevo Valor:");
		lblNewLabel_1.setBounds(5, 5, 86, 19);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_inputs.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(96, 5, 187, 19);
		textField.setColumns(10);
		panel_inputs.add(textField);
		arregloInputs[0] = textField;
		arregloPanelInputs[0] = panel_inputs;
		
		JPanel panel_btn = new JPanel();
		panel_btn.setBackground(new Color(82, 69, 154));
		panel_btn.setBounds(22, heightPanelBtn, 293, 31);
		add(panel_btn);
		panel_btn.setLayout(new GridLayout(0, 3, 10, 10));
		
		JButton btnAgregar = new JButton("ADD");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				if (cantidadInputs < 6) {
					cantidadInputs ++;
					heightPanel = heightPanel +36;
					heightPanelBtn = heightPanelBtn + 35;
					panel.setBounds(22, 50, 293, heightPanel);
					
					panel_btn.setBounds(22, heightPanelBtn, 293, 31);
					
					JPanel panel_inputs = new JPanel();
					panel.add(panel_inputs);
					panel_inputs.setLayout(null);
					
					JLabel lblNewLabel_1 = new JLabel("Nuevo Valor:");
					lblNewLabel_1.setBounds(5, 5, 86, 19);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
					panel_inputs.add(lblNewLabel_1);
					
					JTextField textFieldNuevo = new JTextField();
					textFieldNuevo.setBounds(96, 5, 187, 19);
					textFieldNuevo.setColumns(10);
					panel_inputs.add(textFieldNuevo);
					
					arregloInputs[cantidadInputs] = textFieldNuevo;
					arregloPanelInputs[cantidadInputs] = panel_inputs;
			        
			        panel.add(panel_inputs); // se agrega al panel principal
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
				for(int i=0; i<arregloInputs.length; i++) {
					
					if (arregloInputs[i] != null ) {
						
						if(arregloInputs[i].getText() != null) {
							
							System.out.print(arregloInputs[i].getText());
							try {
								int valor = Integer.parseInt(arregloInputs[i].getText());
								arbol.insertar(valor);
							}catch(Exception er) {
								System.out.print(arregloInputs[i].getText());
								JOptionPane.showMessageDialog(ventana, "Uno de los valores no es numerico", "ERROR", 0);
							}
						}else {
							JOptionPane.showMessageDialog(ventana, "Algún campo esta vacio", "ERROR", 0);
						}
					}
					
				}
				arbol.imprimirEntre();
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
					arregloInputs[cantidadInputs] = null;
					arregloPanelInputs[cantidadInputs] = null;
					
					cantidadInputs --;
					
					System.out.println(cantidadInputs);
					
					heightPanel = heightPanel -36;
					heightPanelBtn = heightPanelBtn -35;
					
					panel.setBounds(22, 50, 293, heightPanel);
					
					panel_btn.setBounds(22, heightPanelBtn, 293, 31);
					
					panel.revalidate();
			        panel.repaint();
				}
			}
		});
		panel_btn.add(btnBorrar);
	}
}
