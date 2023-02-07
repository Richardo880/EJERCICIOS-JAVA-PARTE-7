/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo7;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Labo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int d, m, a;
        //Se pide por teclado el dia, mes y año
        //Se crea un objeto Fecha utilizando el consructor con parámetros
        Fecha fecha = new Fecha(14, 4, 2003);
        System.out.println("Fecha introducida: " );
        fecha.imprimirfecha();
        
        System.out.println();
        
        fecha = new Fecha(28, "Mayo", 2005);
        System.out.println("Fecha introducida: ");
        fecha.imprimirfecha();
        
        System.out.println();
        
        fecha = new Fecha(2, 10, 2010);
        System.out.println("Fecha introducida: ");
        fecha.imprimirfecha();
        
        System.out.println();
        
        fecha = new Fecha(25, "Diciembre", 2012);
        System.out.println("Fecha introducida: ");
        fecha.imprimirfecha();
        
    }

}
