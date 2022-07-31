/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4bucles;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class JavaApplication4Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        float resul= 0;
        Estudiante ob1 = new Estudiante();
        
        ob1.solicitudNotas();
        resul =ob1.resulPromedio();
        
        System.out.println("el resultado del promedio es: "+resul);
         
    }
    
}
