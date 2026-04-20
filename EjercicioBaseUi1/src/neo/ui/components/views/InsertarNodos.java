package neo.ui.components.views;

import java.awt.Color;

import javax.swing.JPanel;

import neo.back.*;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Scrollbar;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InsertarNodos extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public InsertarNodos(Arbol arbol) {
		
		setBackground(new Color(82, 69, 154));
		setBounds(0,0,359, 403);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INSERTAR NODOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 328, 25);
		add(lblNewLabel);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBounds(339, 0, 20, 403);
		add(scrollbar);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 50, 293, 31);
		add(panel);
		panel.setLayout(new GridLayout(0, 1, 10, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nuevo Valor:");
		lblNewLabel_1.setBounds(5, 5, 86, 19);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(96, 5, 187, 19);
		textField.setColumns(10);
		panel_1.add(textField);
		
		JButton btnNewButton = new JButton("NUEVO CAMPO");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(22, 110, 135, 31);
		add(btnNewButton);
		
		JButton btnEnviar = new JButton("ENVIAR");
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEnviar.setBounds(180, 110, 135, 31);
		add(btnEnviar);
		
		
		
	}
}
