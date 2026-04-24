package neo.ui.components.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import neo.back.HomeroSimpson;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TotalNodos extends JPanel {

	private static final long serialVersionUID = 1L;
	JFrame ventana = null;
	HomeroSimpson homeroSimpson;
	JLabel lblNewLabel_1;

	/**
	 * Create the panel.
	 */
	public TotalNodos(HomeroSimpson homeroSimpson, JFrame ventana) {
			
		setBackground(new Color(82, 69, 154));
		setBounds(0,0,359, 403);
		setLayout(null);
		this.ventana = ventana;
		this.homeroSimpson = homeroSimpson;
		
		JLabel lblNewLabel = new JLabel("TOTAL DE TRABJOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 328, 25);
		add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setText(valor());
		System.out.print(valor());
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(150, 64, 44, 37);
		add(lblNewLabel_1);
		revalidate();
        repaint();
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(20, 51, 318, 67);
		add(panel);
		
		JButton btnNewButton = new JButton("ACTAULIZAR VALOR");
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
        return Integer.toString(homeroSimpson.getCantidad());
    }

    public void actualizarValor() {
    	lblNewLabel_1.setText(valor());
    }
}
