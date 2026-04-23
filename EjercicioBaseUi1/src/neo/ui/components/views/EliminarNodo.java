package neo.ui.components.views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import neo.back.Arbol;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EliminarNodo extends JPanel {

	private static final long serialVersionUID = 1L;
	JFrame ventana = null;
	Arbol arbol;
	JLabel lblNewLabel_1;

	/**
	 * Create the panel.
	 */
	public EliminarNodo(Arbol arbol, JFrame ventana) {
			
		setBackground(new Color(82, 69, 154));
		setBounds(0,0,359, 403);
		setLayout(null);
		this.ventana = ventana;
		this.arbol = arbol;
		
		JLabel lblNewLabel = new JLabel("ELIMINAR VALOR MENOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 328, 25);
		add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setText("No se eliminado nada");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(20, 64, 318, 37);
		add(lblNewLabel_1);
		revalidate();
        repaint();
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(20, 51, 318, 67);
		add(panel);
		
		JButton btnNewButton = new JButton("BORRAR VALOR");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actualizarValor();
			}
		});
		btnNewButton.setBounds(20, 142, 318, 37);
		add(btnNewButton);
	}
	
	public String valor() {
		arbol.borrarMenor();
    	return "Nodo eliminado";
        
    }

    public void actualizarValor() {
    	
    	if (!(arbol.cantidad() > 0)) {
    		lblNewLabel_1.setText("No hay nodos");
    	}else {
    		lblNewLabel_1.setText(valor());
    	}
    	
    }
}
