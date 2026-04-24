/** Paquetes */
package neo.back;
import java.util.Arrays;
import java.util.Scanner;

import neo.back.Nodo;

/**
 * @author Luis Angel Sarmiento Diaz
 * @description Clase que crea el árbol Homero Simpson
 * @date 12-04-2025
 */
public class HomeroSimpson {

    /**
     * @description Atributos de la clase
     */
    private Nodo homeroSimpson;
    private int cantidad = 0;

    /**
     * @description Método constructor de la clase
     */
    public HomeroSimpson(){
        this.homeroSimpson = new Nodo("Homero Simpson", 1, 100000);
    }

    /**
     * @decription Método para comparar las cadenas de str de los trabajos
     * @param trabajo1 {String} Trabajo del nodo anterior
     * @param trabajo2 {String} Trabajo del nodo nuevo
     */
    public boolean comparaTrabajo(String trabajo1, String trabajo2){
    	return trabajo2.compareTo(trabajo1) < 0;
    }

    /**
     * @description Método para insertar nodos sin scanner
     * @param trabajo {String} Nombre del trabajo
     * @param duracionTrabajo {int} Duracion en meses del trabajo
     * @param temporada {int} Numero de la temporada
     */
    public void insertarTrabajo(String trabajo, int duracionTrabajo, int temporada){
        /* Nodo nuevo */
        Nodo nuevoNodo = new Nodo(trabajo, temporada, duracionTrabajo);

        /* Insertar el nodo en el árbol
         *  Primera validación, está vacío el árbol?,
         *  -Si, el nodo raiz es equivalente al nuevo nodo
         *  -No, se asigna la posición correspondiente al nodo nuevo
         */
        if (homeroSimpson == null){

            /* Asignación de la raiz */
            homeroSimpson = nuevoNodo;
            cantidad ++;
        }else{

            /* Nodo auxiliar */
            Nodo nodoAnterior = null;
            Nodo nodoAuxiliar = homeroSimpson;

            /* Recorrer los nodos segun la organizacion */
            while(nodoAuxiliar != null){

                nodoAnterior = nodoAuxiliar;
                if (comparaTrabajo(nodoAnterior.getNombreTrabajo(), nuevoNodo.getNombreTrabajo())){
                    nodoAuxiliar = nodoAuxiliar.getNodoIzquierdo();
                }else{
                    nodoAuxiliar = nodoAuxiliar.getNodoDerecho();
                }
            }
            
            /* Indicar en que nodo se referencia al nuevo nodo, e incrementar el numero de nodos */
            if(comparaTrabajo(nodoAnterior.getNombreTrabajo(), nuevoNodo.getNombreTrabajo())){
                nodoAnterior.setNodoIzquierdo(nuevoNodo);
                cantidad ++;
            }else{
                nodoAnterior.setNodoDerecho(nuevoNodo);
                cantidad ++;
            }
        }
    }

    /**
     * @description Metodo que imprime en pre orden segun un nodo de referencia
     * @param nodoAuxiliar {Nodo} Nodo referencia
     */
    public void imprimirPreOrden(Nodo nodoAuxiliar){

        if (nodoAuxiliar != null)
        {
            System.out.println(nodoAuxiliar.getNombreTrabajo());
            imprimirPreOrden (nodoAuxiliar.getNodoIzquierdo());
            imprimirPreOrden (nodoAuxiliar.getNodoDerecho());
        }
    };

    /**
     * @description Metodo que imprime en pre orden desde la raiz 
     */
    public void imprimirPreOrden(){
        imprimirPreOrden(this.homeroSimpson);
    };

    /**
     * @description Metodo que imprime en in orden segun un nodo de referencia
     * @param nodoAuxiliar {Nodo} Nodo referencia
     */
    public void imprimirInOrden(Nodo nodoAuxiliar){
        if (nodoAuxiliar != null){
            imprimirInOrden(nodoAuxiliar.getNodoIzquierdo());
            System.out.println(nodoAuxiliar.getNombreTrabajo());
            imprimirInOrden(nodoAuxiliar.getNodoDerecho());
        }
    };

    /**
     * @description Metodo que imprime en in orden desde la raiz 
     */
    public void imprimirInOrden(){
        imprimirInOrden(this.homeroSimpson);
    };

    /**
     * @description Metodo que imprime en pos orden segun un nodo de referencia
     * @param nodoAuxiliar {Nodo} Nodo referencia
     */
    public void imprimirPostOrden(Nodo nodoAuxiliar){
        if (nodoAuxiliar != null)
        {
            imprimirPostOrden(nodoAuxiliar.getNodoIzquierdo());
            imprimirPostOrden(nodoAuxiliar.getNodoDerecho());
            System.out.println(nodoAuxiliar.getNombreTrabajo());
        }


    };

    /**
     * @description Metodo que imprime en pos orden desde la raiz 
     */
    public void imprimirPostOrden ()
    {
        imprimirPostOrden (this.homeroSimpson);
    }

    /**
     * @description Metodo get para obtener la cantidad de nodos
     */
    public int getCantidad(){
        return this.cantidad;
    }

    /**
     * @description Meotod para comparar el tiempo de trabajo en base a la raiz y sus nodos sucesores
     */
    public int mayorValor() {
        /* Ejecutar la funcion pero con parametros */
        return mayorValor(homeroSimpson, homeroSimpson.getDuracionTrabajo());
    }
    
    /**
     * @description Meotod para comparar el tiempo de trabajo en base al nodo referencia
     * y sus nodos sucesores
     * @param nodo {Nodo} Nodo de referncia
     * @param valorActual {int} Valor actual más alto de tiempo
     */
    public int mayorValor(Nodo nodo, int valorActual){
    	
    	/* Validar que el nodo refencia no sea vacio */
        if (nodo != null){
        	
        	/* Validar si el nodo refencia tiene un tiempo mayor */
            if (nodo.getDuracionTrabajo() < valorActual) {
                valorActual = nodo.getDuracionTrabajo();
            }
            
            /* Si el tiempo del nodo mayor no mayor al actual, se prueba con sus nodos hijo */
            valorActual = mayorValor(nodo.getNodoDerecho(), valorActual);
            valorActual = mayorValor(nodo.getNodoIzquierdo(), valorActual);
        }
        
        /* Retornar el valor mas alto */
        return valorActual;
    }
}
