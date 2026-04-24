package neo.ui.components.view;

import java.awt.Color; 
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

import neo.ui.Ventana;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExitApp extends JPanel {

	private static final long serialVersionUID = 1L;

	final String[] arreglo_frases = {
		"¿SEGURO QUE DESEAS SALIR?",
		"¿EN SERIO QUIERES SALIR?",
		"NO TE VAYAS AÚN",
		"HAY MÁS POR EXPLORAR"
	};
	
	final String[] arreglo_path_img= {
			"/neo/ui/media/imagen.jpg",
			"/neo/ui/media/gato.png",
			"/neo/ui/media/gato2.jpg",
			"/neo/ui/media/oso.jpg"
		};
	
	int valor = 0; 
	JFrame ventana = null;
	
	
	public String changeText(int posicion) {
		try {
			if (posicion >= arreglo_frases.length) {
				valor = 0;
				ventana.dispose();
				return "";
			}else {
				return arreglo_frases[posicion];
			}
		}catch(Exception e){
			return "¿SEGURO QUE DESEAS SALIR?";
		}
	}
	
	public ExitApp(JFrame ventana) {
		
		this.ventana = ventana;
		
		setBackground(new Color(82, 69, 154));
		setBounds(0,0,359, 403);
		setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("¿SEGURO QUE DESEAS SALIR?");
		lblNewLabel.setBounds(47, 5, 276, 25);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		add(lblNewLabel);
		
		JLabel labelImagen = new JLabel("");
		labelImagen.setBounds(79, 54, 200, 200);
		ImageIcon imagen = new ImageIcon(Ventana.class.getResource(arreglo_path_img[1]));
		Image img = imagen.getImage();
		Image nuevaImagen = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon imagenMejorada = new ImageIcon(nuevaImagen);
		labelImagen.setIcon(imagenMejorada);
		add(labelImagen);
		
		JButton btnNewButton_2 = new JButton("SALIR");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor ++;
				String texto = changeText(valor);
				lblNewLabel.setText(texto);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBounds(124, 276, 121, 39);
		add(btnNewButton_2);
		
	}

}
