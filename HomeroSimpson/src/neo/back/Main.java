/** Paquetes */
package neo.back;
import java.util.Scanner;

import neo.back.HomeroSimpson;

/**
 * @author Luis Angel Sarmiento Diaz
 * @description Clase principal
 * @date 12-04-2025
 */
public class Main {

    /**
     * @description Clase principal ejecutable
     */
    public static void main(String[] args) {
    	
    	Scanner entrada = new Scanner(System.in);
		boolean estado = true;
    	HomeroSimpson arbol = new HomeroSimpson();
        
        while(estado) {
        	System.out.println("1.Insertar nuevos trabajos.\n2.Imprimir en pre orden.\n3.Imprimir en in orden.\n4.Imprimir en pos orden.\n5.Total de nodos.\n6.Nodo con tiempo menor.\n7.Salir.");
        
        	try {
        		
        		System.out.print("Ingrese una opcion:");
                int opcion = entrada.nextInt();
                switch (opcion) {
                	case 1:
                		System.out.println("Valores Insertados.");
                		arbol.insertarTrabajo("Astronauta", 1, 1);
                        arbol.insertarTrabajo("Boxeador", 2, 2);
                        arbol.insertarTrabajo("Camionero", 1, 3);
                        arbol.insertarTrabajo("Diseñador de autos", 1, 4);
                        arbol.insertarTrabajo("Escritor", 1, 5);
                        arbol.insertarTrabajo("Granjero", 5, 6);
                        arbol.insertarTrabajo("Inspector nuclear", 1, 7);
                        arbol.insertarTrabajo("Jefe de sindicato", 1, 8);
                        arbol.insertarTrabajo("Locutor de radio", 1, 9);
                        arbol.insertarTrabajo("Pintor", 1, 10);
                        arbol.insertarTrabajo("Rey del Carnaval", 1, 11);
                        arbol.insertarTrabajo("Vendedor de azúcar", 1, 12);
                        arbol.insertarTrabajo("Actor de cine", 100001, 13);
                        arbol.insertarTrabajo("Critico gastronómico", 1, 14);
                        arbol.insertarTrabajo("Conductor de monorriel", 1, 15);
                        arbol.insertarTrabajo("Cazador de recompensas", 89, 16);
                        arbol.insertarTrabajo("Guardia seguridad", 1, 17);
                        arbol.insertarTrabajo("Guardia zoológico", 1, 18);
                        arbol.insertarTrabajo("Inventor", 100003, 19);
                        arbol.insertarTrabajo("Musico", 100002, 20);
                        arbol.insertarTrabajo("Profesor sustituto", 25, 21);
                        arbol.insertarTrabajo("Policía", 1, 22);
                		System.out.println("---------------------------------");
                        break;
                	case 2:
                		System.out.println("Imprimir en pre orden.");
                		arbol.imprimirPreOrden();
                		System.out.println("---------------------------------");
                        break;
                	case 3:
                		System.out.println("Imprimir en in orden.");
                		arbol.imprimirPreOrden();
                		System.out.println("---------------------------------");
                        break;
                	case 4:
                		System.out.println("Imprimir en pos orden.");
                		arbol.imprimirPostOrden();
                		System.out.println("---------------------------------");
                        break;
                	case 5:
                		System.out.println("Imprimir el total de nodos.");
                		System.out.println("Total:"+arbol.getCantidad());
                		System.out.println("---------------------------------");
                        break;
                	case 6:
                		System.out.println("Nodo con menor tiempo.");
                		System.out.println(arbol.mayorValor()+" meses");
                		System.out.println("---------------------------------");
                        break;
                	case 7:
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
