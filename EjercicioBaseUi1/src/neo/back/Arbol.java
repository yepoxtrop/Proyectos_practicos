/** Paquetes */
package neo.back;
import neo.back.Nodo;

/**
 * @author Luis Angel Sarmiento Diaz
 * @description Clase que crea el arbol binario
 * @date 12-04-2025
 */
public class Arbol {
	
	/* Atributos */
	private Nodo raiz;
	private int cantidad;
	private int altura;
	
	public Arbol() {
        raiz=null;
    }
	
	/**
	 * @description Metodo get para obtener el valor de la raiz
	 */
    public Nodo getRaiz() {
		return raiz;
	}

    /**
	 * @description Metodo set para asignar el valor de la raiz
	 * @param raiz {Nodo} Nuevo que es asignado a la raiz
	 */
	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}

	/**
	 * @description Metodo get para obtener el valor de la cantidad de nodos
	 * @return El valor del atributo cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @description Metodo set para asignar el valor de la cantidad de nodos
	 * @param cantidad {int} Nueva cantidad de nodos
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	/**
	 * @description Metodo get para obtener el valor de la altura del arbol
	 * @return El valor del atributo altura
	 */
	public int getAltura() {
		return altura;
	}
	
	/**
	 * @description Metodo set para asignar el valor de la altura del arbol
	 * @param altura {int} Nueva altura
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	/**
	 * @description Metodo para insertar nuevos nodos en el arbol
	 * @param informacion {int} Valor numerico del nodo
	 */
	public void insertar (int informacion) {
		
		/* Si no existe el valor, se va agregar */
        if (!existe(informacion)) {
        	
        	/* Crear nuevo nodo */
            Nodo nuevoNodo;
            nuevoNodo = new Nodo(informacion);
            
            /* Si la raiz es nula, se asigna el nuevo nodo */
            if (raiz == null) {
            	
            	this.setRaiz(nuevoNodo);
            }else{
            	
            	/* Recorrer el arbol para el nuevo nodo */
                Nodo nodoAnterior = null; 
                Nodo nodoAuxiliar = null; 
                nodoAuxiliar = raiz;
                
                /* Mientras el nodo auxiliar sea diferente de 0, se recorrera el arbol */
                while (nodoAuxiliar != null)  {
                	nodoAnterior = nodoAuxiliar;
                	
                    if (informacion < nodoAuxiliar.getValor()){
                    	nodoAuxiliar = nodoAuxiliar.getNodoIzquierdo();
                    }else
                    	nodoAuxiliar = nodoAuxiliar.getNodoDerecho();
                }
                
                /* Asignacion del nuevo nodo segun el recorrido */
                if (informacion < nodoAnterior.getValor()){
                	nodoAnterior.setNodoIzquierdo(nuevoNodo);
                }else {
                	nodoAnterior.setNodoDerecho(nuevoNodo);
                }
            }
        }    
    }

	/**
	 * @description Recorre el arbol para verificar que un valor exista o no
	 * @param informacion {int} Valor que se va a buscar
	 * @return True si existe o False si no existe
	 */
    public boolean existe(int informacion) {
        
    	Nodo nodoAuxiliar=raiz;
        
    	/* Recorrer el arbol y validar si el dato no existe aun */
    	while (nodoAuxiliar!=null) {
    		
    		/* Si el parametro es igual al valor del nodo auxiliar, el valor existe */
            if (informacion==nodoAuxiliar.getValor()) {
            	return true;
            }else {
            	
            	/* Si no esta en ese nodo el valor, se verifica con sus nodos hijos */
            	if (informacion>nodoAuxiliar.getValor()) {
                	nodoAuxiliar=nodoAuxiliar.getNodoDerecho();
                }else {
                	nodoAuxiliar=nodoAuxiliar.getNodoDerecho();
                }
            }   	   	
        }
    	
    	/* Si no se encuentra el valor en ningun nodo, no existe el valor */
        return false;
    }
    
	/**
	 * @description Metodo que imprimir en inOrden segun un nodo de referencia
	 * @param nodoBase {Nodo} nodo de referencia
	 */
    private void imprimirEntre (Nodo nodoBase)  {
        if (nodoBase != null)  {    
            imprimirEntre (nodoBase.getNodoIzquierdo());
            System.out.println(nodoBase.getValor());
            imprimirEntre (nodoBase.getNodoDerecho());
        }
    }

    /**
	 * @description Metodo que imprimir en inOrden desde la raiz
	 */
    public void imprimirEntre () {
        imprimirEntre (raiz);
    }

	/**
	 * @description Metodo que cuenta la cantidad de nodos actuales en el arbol, desde un nodo de referncia 
	 * @param nodoBase {Nodo} nodo referencial para contar la cantidad de nodos
	 */
    private void cantidad(Nodo nodoBase) {
        if (nodoBase!=null) {
            cantidad++;
            cantidad(nodoBase.getNodoIzquierdo());
            cantidad(nodoBase.getNodoDerecho());
        }
    }
    
	/**
	 * @description Metodo que cuenta la cantidad de nodos actuales en el arbol desde la raiz
	 * @return La cantidad de nodos
	 */
    public int cantidad() {
        cantidad=0;
        cantidad(raiz);
        return cantidad;
    }

	/**
	 * @description Metodo que cuenta la cantidad de nodos hoja actuales en el arbol, desde un nodo de referncia 
	 * @param nodoBase {Nodo} nodo referencial para contar la cantidad de nodos hoja
	 */
    private void cantidadNodosHoja(Nodo nodoBase) {
        if (nodoBase!=null) {
        	
        	/* Si ambos punteros del nodoBase son nulos, es un nodo hoja */
            if (nodoBase.getNodoIzquierdo()==null && nodoBase.getNodoDerecho()==null)
                cantidad++;
            cantidadNodosHoja(nodoBase.getNodoIzquierdo());
            cantidadNodosHoja(nodoBase.getNodoDerecho());
        }
    }
    
    /**
	 * @description Metodo que cuenta la cantidad de nodos hoja actuales en el arbol desde la raiz
	 * @return La cantidad de nodos hoja
	 */
    public int cantidadNodosHoja() {
        cantidad=0;
        cantidadNodosHoja(raiz);
        return cantidad;
    }

    /**
	 * @description Meodo que imprime inOrden teniendo en cuenta los niveles del arbol, inciandod desde un nodo base
	 * @param nodoBase {Nodo} Nodo de referencia
	 * @param nivel {int} Nivel base
	 */
    private void imprimirEntreConNivel (Nodo nodoBase,int nivel)  {
        if (nodoBase != null) {    
            imprimirEntreConNivel (nodoBase.getNodoIzquierdo(),nivel+1);
            System.out.println(nodoBase.getValor()+ " ("+nivel+") - ");
            imprimirEntreConNivel (nodoBase.getNodoDerecho(),nivel+1);
        }
    }

    /**
	 * @description Meodo que imprime inOrden teniendo en cuenta los niveles del arbol, inciandod desde la raiz(1)
	 */
    public void imprimirEntreConNivel () {
        imprimirEntreConNivel (raiz,1);
    }
    
    /**
	 * @description Meodo que calcula la altura del arbol desde un nodo de referencia
	 * @param nodoBase {Nodo} Nodo de referencia
	 * @param nivel {int} Nivel de altura
	 */
    private void retornarAltura (Nodo nodoBase,int nivel)    {
        if (nodoBase != null) {    
            retornarAltura (nodoBase.getNodoIzquierdo(),nivel+1);
            if (nivel>altura)
                altura=nivel;
            retornarAltura (nodoBase.getNodoDerecho(),nivel+1);
        }
    }

    /**
	 * @description Meodo que calcula la altura del arbol desde la raiz
	 * @return La altura
	 */
    public  int retornarAltura () {
        altura=0;
        retornarAltura (raiz,1);
        return altura;
    }
    
    /**
	 * @description Metodo que recorre el arbol para hallar el valor mayor
	 */
    public int mayorValorl() {
        if (raiz!=null) {
            Nodo nodoAuxiliar=raiz;
            while (nodoAuxiliar.getNodoDerecho()!=null)
            	nodoAuxiliar=nodoAuxiliar.getNodoDerecho();
            return nodoAuxiliar.getValor();
        }
        return 0;
    }
    
    /**
	 * @description Metodo que recorre el elimina el nodo con menor valor
	 */
    public void borrarMenor() {
        if (raiz!=null) {
            if (raiz.getNodoIzquierdo()==null)
            	raiz=raiz.getNodoDerecho();
            	
            
            else {
                Nodo nodoAtras=raiz;
                Nodo nodoAuxiliar=raiz.getNodoIzquierdo();
                while (nodoAuxiliar.getNodoIzquierdo()!=null) {
                	nodoAtras=nodoAuxiliar;
                    nodoAuxiliar=nodoAuxiliar.getNodoIzquierdo();
                }
                nodoAtras.setNodoIzquierdo(nodoAuxiliar.getNodoDerecho());
            }                  
        }
    }
    
}
