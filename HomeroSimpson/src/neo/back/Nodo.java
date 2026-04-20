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
    private String nombreTrabajo;
    private int numeroTemporada;
    private int duracionTrabajo;
    private Nodo nodoIzquierdo;
    private Nodo nodoDerecho;

    /**
     * @description Método constructor de la clase
     * @param  nombreTrabajo {String} Es el trabajo realizado por Homero
     * @param  numeroTemporada {int} Es el número de la tempora en la que Homero trabaja de esa profesión
     * @param  duracionTrabajo {String} Es el tiempo que duró Homero trabajando de eso
     */
    public Nodo(String nombreTrabajo, int numeroTemporada, int duracionTrabajo){
        this.nombreTrabajo = nombreTrabajo;
        this.numeroTemporada = numeroTemporada;
        this.duracionTrabajo = duracionTrabajo;
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
     * @description Método set para el nombre del trabajo
     * @param nuevoValor {String} Es el valor del trabajo
     */
    public void setNombreTrabajo(String nuevoValor){
        this.nombreTrabajo = nuevoValor;
    }

    /**
     * @description Método set para el la duracion del trabajo
     * @param nuevoValor {String} Es el valor de la duración
     */
    public void setDuracionTrabajo(int nuevoValor){
        this.duracionTrabajo = nuevoValor;
    }

    /**
     * @description Método get para el nombre del trabajo
     * @return El trabajo que hizo Homero
     */
    public String getNombreTrabajo(){
        return  this.nombreTrabajo;
    }

    /**
     * @description Método get para la duracion del trabajo
     * @return El tiempo que trabajó Homero
     */
    public int getDuracionTrabajo(){
        return  this.duracionTrabajo;
    }

    /**
     * @description Método get para número de temporada
     * @return La tempora en la que trabajó 
     */
    public int getNumeroTemporada(){
        return  this.numeroTemporada;
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

    /**
     * @description Método para formatear los string de la clase
     */
    public void formatearString(){
        setNombreTrabajo(getNombreTrabajo().toLowerCase());
        setNombreTrabajo(getNombreTrabajo().replace("á","a"));
        setNombreTrabajo(getNombreTrabajo().replace("é","e"));
        setNombreTrabajo(getNombreTrabajo().replace("í","i"));
        setNombreTrabajo(getNombreTrabajo().replace("ó","o"));
        setNombreTrabajo(getNombreTrabajo().replace("ú","u"));

    }

}
