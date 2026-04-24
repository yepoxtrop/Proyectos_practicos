/** Paquetes */
package neo.back;
import neo.back.*;
import javax.swing.*;

import java.util.*;

/**
 * @author Luis Angel Sarmiento Diaz
 * @description Clase que crea el arbol binario
 * @date 12-04-2025
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		boolean estado = true;
		
		Arbol arbol= new Arbol ();

        while (estado) {
        	
        	System.out.println("1.Insertar nuevo valor.\n2.Imprimir total de nodos.\n3.Imprimir total de nodos hoja.\n4.Imprimir en inOrden.\n5.Imprimir en entre orden junto al nivel donde se encuentra dicho nodo.\n6.Imprimir la altura del arbol.\n7.Imprimir el mayor valor.\n8.Eliminar el nodo menor.\n9.Salir.");
    		//JOptionPane.showMessageDialog(null, "1.Insertar nuevo valor.\n2.Imprimir total de nodos.\n3.Imprimir total de nodos hoja.\n4.Imprimir en inOrden.\n5.Imprimir en entre orden junto al nivel donde se encuentra dicho nodo.\n6.Imprimir la altura del arbol.\n7.Imprimir el mayor valor.\n8.Eliminar el nodo menor.", "Menu", 1, null);
    		//int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoja una opción:", 1));
        	try {
        		System.out.print("Ingrese una opcion:");
                int opcion = entrada.nextInt();
                switch (opcion) {
                	case 1:
                		System.out.println("Valores Insertados.");
                		//JOptionPane.showMessageDialog(null, "Insertar Valores", "INSERTAR VALORES", 1, null);
                		arbol.insertar(100);
                        arbol.insertar(50);
                        arbol.insertar(25);
                        arbol.insertar(75);
                        arbol.insertar(150);
                        arbol.insertar(28);
                        arbol.insertar(17);
                        arbol.insertar(66);
                        arbol.insertar(71);
                        arbol.insertar(200);
                        System.out.println("---------------------------------");
                        break;
                        
                	case 2:
                		System.out.println("Total Nodos");
                		System.out.println("Total:"+arbol.cantidad());
                		System.out.println("---------------------------------");
                		break;
                	case 3:
                		System.out.println("Total Nodos Hoja");
                		System.out.println("Total:"+arbol.cantidadNodosHoja());
                		System.out.println("---------------------------------");
                		break;
                	case 4:
                		System.out.println("Imprimir en orden");
                		for(var i:arbol.imprimirEntre()) {
                			System.out.println(i);
                		}
                		System.out.println("---------------------------------");
                		break;
                	case 5:
                		System.out.println("Imprimir en entre orden junto al nivel donde se encuentra dicho nodo");
                		arbol.imprimirEntreConNivel();
                		System.out.println("---------------------------------");
                		break;
                	case 6:
                		System.out.println("Altura del arbol");
                		System.out.println("Total:"+arbol.retornarAltura());
                		System.out.println("---------------------------------");
                		break;
                	case 7:
                		System.out.println("Valor mas grande");
                		arbol.mayorValorl();
                		System.out.println("---------------------------------");
                		break;
                	case 8:
                		System.out.println("Borrar el nodo menor del árbol");
                		arbol.borrarMenor();
                		System.out.println("Cantidad:"+arbol.cantidad());
                		arbol.imprimirEntreConNivel();
                		System.out.println("---------------------------------");
                		break;
                	case 9:
                		System.out.println("Saliendo del programa");
                		estado = false;
                		break;
                	default:
                		System.out.println("Opcion no disponible");
                		System.out.println("---------------------------------");
                }
        	}catch(Exception e) {
        		
        		System.out.println("ALERTA:Opcion no valida");
        		entrada.nextLine();
        	}
        }
        entrada.close();
	}
}
