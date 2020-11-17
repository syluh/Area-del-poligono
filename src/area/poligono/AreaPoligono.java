/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.poligono;

import java.util.Scanner;
/**
 *
 * @author VICTOR|
 */
public class AreaPoligono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in)
       
        // Declraración de las variables
        double lc, at, ar, A, B, ats, area, D;
        
        lc = 0; at= 0; ar = 0; A = 0; B = 0; ats = 0; area = 0; D = 0;
         System.out.println("*** Programa que permite el cálculo "
                 + " computesto***");
         System.out.println("");
         
         //Lectura de datos
         
         System.out.println("Ingrese el lado del cuadrado");
         lc = leer.nextDouble();
         
         System.out.println("Ingrese la altura del triángulo");
         at = leer.nextDouble();
         
         System.out.println("Ingrese la altura del rectángulo");
         ar = leer.nextDouble();
         
         //Proceso
         
         A = Math.pow(lc, 2);
         B = (lc*at)/2;
         ats = B * 3;
         D = lc*ar;
         area = A + ats + D ;
         
         //Salida de datos
         System.out.println("El área del poligono compuesto es:" +area);
         System.out.println("Compuesto por un cuadrado de lado/n " +lc);
         System.out.println("un rectangulo de altura " +ar);
         System.out.println(" y una altura de triangulo " +at);
        
         
         
    }
    
}
