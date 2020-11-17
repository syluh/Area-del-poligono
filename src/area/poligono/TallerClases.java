/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.poligono;

import java.util.Scanner;
/**
 *
 * @author VICTOR
 */
public class TallerClases {
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaración de las variables
        double ar, at, bt, A, B, area;
        
        ar = 0; at = 0; bt = 0; A = 0; B = 0; area = 0;
         System.out.println("*** Programa que permite el cálculo "
                 + " computesto***");
         System.out.println("");
           
        //Lectura de datos
         System.out.println("Ingrese la altura del rectángulo");
         ar = leer.nextDouble();
         
         System.out.println("Ingrese la altura del triángulo");
         at = leer.nextDouble();
         
         System.out.println("Ingrese la base de triángulo");
         bt = leer.nextDouble();
         
         //Proceso
         A = bt * ar;
         B =(bt*at)/2;
	 area = A+B; 
         
         //Salida de datos
            System.out.println("El área del poligono compuesto es:" +area);
            System.out.println(" Compuesto por un rectagulo de altura" +ar);
            System.out.println(" Un triángulo de altura " +at);
            System.out.println(" con base " +bt);
         
        

            
           
    
}
