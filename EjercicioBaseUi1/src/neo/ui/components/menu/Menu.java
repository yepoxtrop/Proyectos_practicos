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
		JButton btnInsertarNodos = new JButton("Nuevos Valores");
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
		
		JButton btnImprimirConNivel = new JButton("Imprimir con Nivel");
		btnImprimirConNivel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layoutPanel.show(panelVistas, "imprimirConNivel");
			}
		});
		add(btnImprimirConNivel);
		
		JButton btnNewButton_1 = new JButton("Diseño de Arbol");
		add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Total de Nodos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layoutPanel.show(panelVistas, "totalNodos");
			}
		});
		add(btnNewButton);
		
		JButton btnTotalDeNodos = new JButton("Total de Nodos Hoja");
		btnTotalDeNodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layoutPanel.show(panelVistas, "totalNodosHoja");
			}
		});
		add(btnTotalDeNodos);
		
		JButton btnAlturaDelArbol = new JButton("Altura del Arbol");
		btnAlturaDelArbol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layoutPanel.show(panelVistas, "alturaArbol");
			}
		});
		add(btnAlturaDelArbol);
		
		JButton btnValorMayor = new JButton("Valor Mayor");
		btnValorMayor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layoutPanel.show(panelVistas, "mayorValor");
			}
		});
		add(btnValorMayor);
		
		JButton btnBorrarNodoMenor = new JButton("Borrar Nodo Menor");
		btnBorrarNodoMenor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layoutPanel.show(panelVistas, "eliminarValorMenor");
			}
		});
		add(btnBorrarNodoMenor);
		
		JButton btnNewButton_3 = new JButton("Salir");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layoutPanel.show(panelVistas, "salir");
			}
		});
		add(btnNewButton_3);
	}

}
