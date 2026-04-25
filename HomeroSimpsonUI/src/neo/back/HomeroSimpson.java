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
        this.cantidad = 1;
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
    private int imprimirPreOrden(Nodo nodoAuxiliar, int[] arrayTemporadas, int[] arrayDiasTrabajados, String[] arrayTrabajos, int posicion) {

        if (nodoAuxiliar != null)
        {
            arrayTemporadas[posicion] = nodoAuxiliar.getNumeroTemporada();
            arrayDiasTrabajados[posicion] = nodoAuxiliar.getDuracionTrabajo();
            arrayTrabajos[posicion] = nodoAuxiliar.getNombreTrabajo();
            posicion++;
            posicion = imprimirPreOrden(nodoAuxiliar.getNodoIzquierdo(), arrayTemporadas, arrayDiasTrabajados, arrayTrabajos, posicion);
            posicion = imprimirPreOrden(nodoAuxiliar.getNodoDerecho(), arrayTemporadas, arrayDiasTrabajados, arrayTrabajos, posicion);
        }
        return posicion;
    };

    /**
     * @description Metodo que imprime en pre orden desde la raiz 
     */
    public Resultados imprimirPreOrden() {
        int[] arrayTemporadas = new int[cantidad];
        int[] arrayDiasTrabajados = new int[cantidad];
        String[] arrayTrabajos = new String[cantidad];
        imprimirPreOrden(this.homeroSimpson, arrayTemporadas, arrayDiasTrabajados, arrayTrabajos, 0);
        return new Resultados(arrayTemporadas, arrayDiasTrabajados, arrayTrabajos);
    };

    /**
     * @description Metodo que imprime en in orden segun un nodo de referencia
     * @param nodoAuxiliar {Nodo} Nodo referencia
     */
    private int imprimirInOrden(Nodo nodoAuxiliar, int[] arrayTemporadas, int[] arrayDiasTrabajados, String[] arrayTrabajos, int posicion) {
        if (nodoAuxiliar != null){
            posicion = imprimirInOrden(nodoAuxiliar.getNodoIzquierdo(), arrayTemporadas, arrayDiasTrabajados, arrayTrabajos, posicion);
            arrayTemporadas[posicion] = nodoAuxiliar.getNumeroTemporada();
            arrayDiasTrabajados[posicion] = nodoAuxiliar.getDuracionTrabajo();
            arrayTrabajos[posicion] = nodoAuxiliar.getNombreTrabajo();
            posicion++;
            posicion = imprimirInOrden(nodoAuxiliar.getNodoDerecho(), arrayTemporadas, arrayDiasTrabajados, arrayTrabajos, posicion);
        }
        return posicion;
    };

    /**
     * @description Metodo que imprime en in orden desde la raiz 
     */
    public Resultados imprimirInOrden() {
        int[] arrayTemporadas = new int[cantidad];
        int[] arrayDiasTrabajados = new int[cantidad];
        String[] arrayTrabajos = new String[cantidad];
        imprimirInOrden(this.homeroSimpson, arrayTemporadas, arrayDiasTrabajados, arrayTrabajos, 0);
        return new Resultados(arrayTemporadas, arrayDiasTrabajados, arrayTrabajos);
    };

    /**
     * @description Metodo que imprime en pos orden segun un nodo de referencia
     * @param nodoAuxiliar {Nodo} Nodo referencia
     */
    private int imprimirPostOrden(Nodo nodoAuxiliar, int[] arrayTemporadas, int[] arrayDiasTrabajados, String[] arrayTrabajos, int posicion) {
        if (nodoAuxiliar != null)
        {
            posicion = imprimirPostOrden(nodoAuxiliar.getNodoIzquierdo(), arrayTemporadas, arrayDiasTrabajados, arrayTrabajos, posicion);
            posicion = imprimirPostOrden(nodoAuxiliar.getNodoDerecho(), arrayTemporadas, arrayDiasTrabajados, arrayTrabajos, posicion);
            arrayTemporadas[posicion] = nodoAuxiliar.getNumeroTemporada();
            arrayDiasTrabajados[posicion] = nodoAuxiliar.getDuracionTrabajo();
            arrayTrabajos[posicion] = nodoAuxiliar.getNombreTrabajo();
            posicion++;
        }
        return posicion;
    };

    /**
     * @description Metodo que imprime en pos orden desde la raiz 
     */
    public Resultados imprimirPostOrden() {
        int[] arrayTemporadas = new int[cantidad];
        int[] arrayDiasTrabajados = new int[cantidad];
        String[] arrayTrabajos = new String[cantidad];
        imprimirPostOrden(this.homeroSimpson, arrayTemporadas, arrayDiasTrabajados, arrayTrabajos, 0);
        return new Resultados(arrayTemporadas, arrayDiasTrabajados, arrayTrabajos);
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
