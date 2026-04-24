/** Paqutee */
package neo.ui;
/** Clases */
import java.awt.EventQueue;  

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import neo.back.HomeroSimpson;
import neo.ui.components.menu.Menu;
import neo.ui.components.view.*;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.JTable;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelContendor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arbol arbol= new Arbol ();
					Ventana frame = new Ventana(arbol);
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
	public Ventana(Arbol arbol) {
		
		/** Propiedades de la ventana */
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 440);
		setTitle("Practica de Árboles");
		
		/** Panel principal 
		 * -Contiene el menu.
		 * +Contiene las vistas
		 * */
		panelContendor = new JPanel();
		panelContendor.setBackground(new Color(97, 97, 209));
		panelContendor.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelContendor);
		panelContendor.setLayout(null);
		
		/** Contenedor de las vistas 
		 * */
		JPanel panelMain = new JPanel();
		panelMain.setBounds(175, 0, 359, 403);
		panelContendor.add(panelMain);
		CardLayout layoutVentana = new CardLayout(0,0);
		panelMain.setLayout(layoutVentana);
		
		InsertarNodos vistaInsertarNodo = new InsertarNodos(arbol, this);
		panelMain.add(vistaInsertarNodo, "insertarNodo");
		
		ImprimirInOrden vistaConsulta1 = new ImprimirInOrden(arbol, this);
		panelMain.add(vistaConsulta1, "imprimirInOrden");
		
		ImprimirConNivel vistaConsulta2 = new ImprimirConNivel(arbol, this);
		panelMain.add(vistaConsulta2, "imprimirConNivel");
		
		TotalNodos vistaTotalNodos = new TotalNodos(arbol, this);
		panelMain.add(vistaTotalNodos, "totalNodos");
		
		TotalNodosHoja vistaTotalNodosHoja = new TotalNodosHoja(arbol, this);
		panelMain.add(vistaTotalNodosHoja, "totalNodosHoja");
		
		AlturaArbol vistaAlturaAbol = new AlturaArbol(arbol, this);
		panelMain.add(vistaAlturaAbol, "alturaArbol");
		
		ValorMayor vistaMayorValor = new  ValorMayor(arbol, this);
		panelMain.add(vistaMayorValor, "mayorValor");
		
		EliminarNodo vistaEliminarValorMenor = new EliminarNodo(arbol, this);
		panelMain.add(vistaEliminarValorMenor, "eliminarValorMenor");
		
		ExitApp vistaSalir = new ExitApp(this);
		panelMain.add(vistaSalir, "salir");
		
		
		
		

		/** Menu */
		Menu menu = new Menu(panelMain, layoutVentana);
		panelContendor.add(menu);
		
	}
}
