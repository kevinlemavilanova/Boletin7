/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7;

/**
 *
 * @author klemavilanova
 */
public class Boletin7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro("Pedro","La Fuente",1,0);
        libro1.prestamo();
        System.out.println("Libros disponibles: "+libro1.getNlibros());
        System.out.println("Libros prestados: "+libro1.getNprestados());
        libro1.devolucion();
        System.out.println("Libros disponibles: "+libro1.getNlibros());
        System.out.println("Libros prestados: "+libro1.getNprestados());
        
    }
    
}
