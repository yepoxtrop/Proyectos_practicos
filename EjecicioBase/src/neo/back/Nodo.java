/** Paquetes */
package neo.back;

/**
 * @author Luis Angel Sarmiento Diaz
 * @description Clase que crea los nodos para el arbol binario
 * @date 12-04-2025
 */
public class Nodo {

    /**
     * @description Atributos de la clase
     */
    private int valor;
    private Nodo nodoIzquierdo;
    private Nodo nodoDerecho;

    /**
     * @description Método constructor de la clase
     * @param  valor {int} Valor numerico aleatorio
     */
    public Nodo(int valor){
        this.valor= valor;
        this.nodoIzquierdo = null;
        this.nodoDerecho = null;
    }

    /**
     * @description Método set para el nodo derecho
     * @param nuevoNodo {Nodo} Es el valor del nodo derecho
     */
    public void setNodoDerecho(Nodo nuevoNodo){
        this.nodoDerecho = nuevoNodo;
    }

    /**
     * @description Método set para el nodo izquierdo
     * @param nuevoNodo {Nodo} Es el valor del nodo izquierdo
     */
    public void setNodoIzquierdo(Nodo nuevoNodo){
        this.nodoIzquierdo = nuevoNodo;
    }
    
    /**
     * @description Método get para el valor
     */
    public int getValor(){
        return this.valor;
    }

    /**
     * @description Método set para el valor
     * @param valor {int} Es el valor nuevo
     */
    public void setValor(int valor){
        this.valor = valor;
    }

    /**
     * @description Método get para el nodo izquierdo
     * @return El nodo izquierdo
     */
    public Nodo getNodoIzquierdo(){
        return  this.nodoIzquierdo;
    }

    /**
     * @description Método get para el nodo derecho
     * @return El nodo derecho
     */
    public Nodo getNodoDerecho(){
        return  this.nodoDerecho;
    }

}
