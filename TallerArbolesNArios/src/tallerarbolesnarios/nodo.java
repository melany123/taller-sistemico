package tallerarbolesnarios;

import java.util.logging.Logger;

/**
 *
 * @author Mario Andrés Ruiz y Melany Arboleda
 * @version 1.0.0
 */
public class nodo {
    
    // declaración de variables de la clase nodo
    
    int sw;
    int dato;
    nodo ligaHijo;
    nodo liga;

    
    //constructor que no recibe parámetros
    public nodo() {
        this.sw = 0;
        this.dato = 0;
        this.ligaHijo = null;
        this.liga = null;
    }
    
    // constructor que recibe switche y dato
    public nodo(int sw, int dato) {
        this.sw = sw;
        this.dato = dato;
    }
    
    
    // métodos obtener y asignar
    public int obtenerSw() {
        return sw;
    }

    public void asignarSw(int sw) {
        this.sw = sw;
    }

    public int obtenerDato() {
        return dato;
    }

    public void asignarDato(int dato) {
        this.dato = dato;
    }

    public nodo obtenerLigaHijo() {
        return ligaHijo;
    }

    public void asignarLigaHijo(nodo ligaHijo) {
        this.ligaHijo = ligaHijo;
    }

    public nodo obtenerLiga() {
        return liga;
    }

    public void asignarLiga(nodo liga) {
        this.liga = liga;
    }
} // fin clase nodo
