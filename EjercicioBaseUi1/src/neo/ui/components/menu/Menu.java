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
	public Menu(JPanel panelVistas) {
		
		/** Propiedades del panel */
		setBounds(0, 0, 175, 403);
		setLayout(new GridLayout(0, 1, 0, 0));
		
		/** Labels */
		JLabel lblNewLabel_1 = new JLabel("MENU DE OPCIONES");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_1);
		
		/** Botones */
		JButton btnInsertarNodos = new JButton("Nuevos Valores");
		add(btnInsertarNodos);
		
		JButton btnImprimirEnInorden = new JButton("Imprimir InOrden");
		add(btnImprimirEnInorden);
		
		JButton btnImprimirConNivel = new JButton("Imprimir con Nivel");
		add(btnImprimirConNivel);
		
		JButton btnNewButton_1 = new JButton("Diseño de Arbol");
		add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Total de Nodos");
		add(btnNewButton);
		
		JButton btnTotalDeNodos = new JButton("Total de Nodos Hoja");
		add(btnTotalDeNodos);
		
		JButton btnAlturaDelArbol = new JButton("Altura del Arbol");
		add(btnAlturaDelArbol);
		
		JButton btnValorMayor = new JButton("Valor Mayor");
		add(btnValorMayor);
		
		JButton btnBorrarNodoMenor = new JButton("Borrar Nodo Menor");
		add(btnBorrarNodoMenor);
		
		JButton btnNewButton_3 = new JButton("Salir");
		add(btnNewButton_3);
	}

}
