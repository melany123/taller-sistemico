package tallerarbolesnarios;

import java.util.Scanner;

/**
 * @author Mario Andrés Ruiz y Melany Arboleda
 * @version 1.1.0
 */
public class TallerArbolesNArios {

    // variable que contiene la raiz del arbol
    nodo raiz;

    /**
     * IMPLEMENTACION DE LA CLASE ARBOL *
     */
    //constructor sin parámetros
    public void TallerArbolesNArios() {
        raiz = null;
    }

    // obtener y asignar raiz
    public nodo obtenerRaiz() {
        return raiz;
    }

    public void asignarRaiz(nodo raiz) {
        this.raiz = raiz;
    }

    /*insertar elementos*/
    public void insertarNodo(int padre, int dato) {
        nodo p;
        if (raiz == null) {
            p = new nodo(0, dato);
            raiz = p;
        } 
        else {
            insertarRecursivo(raiz, raiz, padre, dato);
        }
    }

    public void insertarRecursivo(nodo p, nodo ant, int padre, int dato) {
        if (p != null) {
            if (p.obtenerSw() == 0) {
                if (p.obtenerDato() == padre) {
                    if (p == ant) {
                        nodo q, z;
                        q = p;
                        while (q.obtenerLiga() != null) {
                            q = q.obtenerLiga();
                        }
                        z = new nodo(0, dato);
                        q.asignarLiga(z);

                    } else {
                        nodo q, z;

                        q = new nodo(0, padre);
                        z = new nodo(0, dato);
                        q.asignarLiga(z);
                        p.asignarLigaHijo(q);
                        p.asignarDato(0);
                        p.asignarSw(1);
                    }
                }
            } else {
                insertarRecursivo(p.obtenerLigaHijo(), p.obtenerLigaHijo(), padre, dato);
            }
            insertarRecursivo(p.obtenerLiga(), ant, padre, dato);
        } // Fin si p diferente de null
    }

    /* método mostrar árbol entero
    método principal para enviar a raiz*/
    public void mostrarArbolPpal() {
        mostrarArbol(raiz);
    }

    /* método recursivo para mostrar árbol*/
    public void mostrarArbol(nodo p) {
        // p toma valor de la raiz del arbol 
        if (p != null) {
            if (p.obtenerSw() == 0) {
                System.out.println(p.obtenerDato());
            } else {
                mostrarArbol(p.obtenerLigaHijo());
            }
            mostrarArbol(p.obtenerLiga());
        }
    }

    /* método contar datos
    método principal de contar datos que llama al método recursivo*/
    public void contarDatosPpal() {
        int datos;
        datos = contarDatos(raiz);
        System.out.println("El número de datos es: "+datos);
    }

    public int contarDatos(nodo p) {
        int contador = 0;
        if (p != null) {
            if (p.obtenerSw() == 0) {
                contador++;
            } else {
                contador = contador + contarDatos(p.obtenerLigaHijo());
            }
            contador = contador + contarDatos(p.obtenerLiga());
        }
        return contador;
    }

    /* método que devuelve altura del árbol
    método principal que llama al recursivo*/
    public void alturaArbolPpal() {
        int altura;
        altura = alturaArbol(raiz);
        System.out.println("La altura del árbol es: " + altura);
    }

    /* Este método recorre mientras p sea diferente de null, si el sw
    igual a 0 entonces es verdaderamente un dato, sino se recorre la 
    siguiente lista hija y va sumando de a uno a altura*/
    public int alturaArbol(nodo p) {
        //p toma valor de raiz
        int altura = 0;

        if (p != null) {

            if (p.obtenerSw() == 0) {
                altura += 1;
            } else {
                altura = altura + alturaArbol(p.obtenerLigaHijo());
            }
            altura = altura + alturaArbol(p.obtenerLiga());
        }
        return altura;
    }

    /*método para buscar el dato mayor*/
    public void mostrarMayorPpal() {
        int mayor;
        mayor = mostrarMayor(raiz);
        System.out.println("El dato mayor es: " + mayor);
    }

    /*método para buscar el dato mayor que recibe a p como la raiz del arbol*/
    public int mostrarMayor(nodo p) {
        int mayor;
        mayor = 0;

        if (p != null) {
            if (p.obtenerSw() == 0) {
                if (p.obtenerDato() > mayor) {
                    mayor = p.obtenerDato();
                }
            } else if (p.obtenerSw() == 1) {
                mostrarMayor(p.obtenerLigaHijo());
            }
            mostrarMayor(p.obtenerLiga());
        }//Fin if recursivo
        return mayor;
    }

    // nivel de un dato
    public void nivelDatoPpal() {
        Scanner leer = new Scanner(System.in);

        int nivel;

        int dato;
        System.out.println("Ingrese el dato a buscar ");
        dato = leer.nextInt();

        if (raiz.obtenerDato() == dato) {
            System.out.println("El nivel del dato es: 0");
        } else {
            nivel = nivelDato(raiz, dato);
            System.out.println("El nivel del dato " + dato + " es: " + nivel);
        }
    }

    public int nivelDato(nodo p, int dato) {
        //p toma valor de raiz
        int nivel = 0;

        if (p != null) {
            if (p.obtenerSw() == 0) {
                if (p.obtenerDato() == dato) {
                    return nivel;
                }
                nivelDato(p.obtenerLiga(), dato);
            } else {
                nivel = nivel + nivelDato(p.obtenerLigaHijo(), dato) + 1;
            }
        }
        return nivel;
    }
}//FIN CLASE TALLER ARBOL N ARIOS
