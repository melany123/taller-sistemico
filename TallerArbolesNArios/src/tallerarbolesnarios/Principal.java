/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerarbolesnarios;

/**
 *
 * @author Mario Ruiz
 * @version 1.1.0
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* implementación de prueba para verificar que los métodos funcionan*/
        
        TallerArbolesNArios arbol;
        arbol = new TallerArbolesNArios();
        
        arbol.insertarNodo(0, 5);
        arbol.insertarNodo(5, 10);
        arbol.insertarNodo(5, 15);
        arbol.insertarNodo(5, 20);
        
        arbol.insertarNodo(10, 8);
        arbol.insertarNodo(10, 9);
        
        arbol.insertarNodo(15, 11);
  
        arbol.mostrarArbolPpal();
        arbol.contarDatosPpal();
        arbol.nivelDatoPpal();
       
    }  //fin main
} // fin clase
