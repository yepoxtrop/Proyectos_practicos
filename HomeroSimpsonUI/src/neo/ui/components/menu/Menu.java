package neo.ui.components.menu;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import neo.ui.Ventana;

public class Menu extends JPanel {

	private static final long serialVersionUID = 1L;

	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { JPanel panel = new JPanel(); Menu menu
	 * = new Menu(panel); menu.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */
	
	/**
	 * Create the panel.
	 */
	public Menu(JPanel panelVistas, CardLayout layoutPanel) {
		
		/** Propiedades del panel */
		setBounds(0, 0, 175, 403);
		setLayout(new GridLayout(0, 1, 0, 0));
		
		/** Labels */
		JLabel lblNewLabel_1 = new JLabel("MENU DE OPCIONES");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_1);
		
		/** Botones */
		JButton btnInsertarNodos = new JButton("Nuevos Trabajos");
		btnInsertarNodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layoutPanel.show(panelVistas, "insertarNodo");
			}
		});
		add(btnInsertarNodos);
		
		JButton btnImprimirEnInorden = new JButton("Imprimir InOrden");
		btnImprimirEnInorden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layoutPanel.show(panelVistas, "imprimirInOrden");
			}
		});
		add(btnImprimirEnInorden);
		
		JButton btnImprimirEnPreOrden = new JButton("Imprimir PreOrden");
		btnImprimirEnPreOrden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layoutPanel.show(panelVistas, "imprimirPreOrden");
			}
		});
		add(btnImprimirEnPreOrden);
		
		
		JButton btnImprimirEnPosOrden = new JButton("Imprimir PosOrden");
		btnImprimirEnPosOrden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layoutPanel.show(panelVistas, "imprimirPosOrden");
			}
		});
		add(btnImprimirEnPosOrden);
		
		JButton btnTotalDeNodos = new JButton("Total de Trabajos");
		btnTotalDeNodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layoutPanel.show(panelVistas, "totalNodos");
			}
		});
		add(btnTotalDeNodos);
		
		JButton btnTrabajoMayor = new JButton("Trabajo Menor");
		btnTrabajoMayor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layoutPanel.show(panelVistas, "mayorValor");
			}
		});
		add(btnTrabajoMayor);
		
		JButton btnSarlir = new JButton("Salir");
		btnSarlir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layoutPanel.show(panelVistas, "salir");
			}
		});
		add(btnSarlir);
	}

}
