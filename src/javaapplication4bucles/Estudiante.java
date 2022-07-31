/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4bucles;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Estudiante {
    
      private float cantidadNotas ;
 
    public Estudiante() {
        this.cantidadNotas = 0;
       
    }

    public void solicitudNotas(){
    
         Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de notas: ");
        this.cantidadNotas = read.nextFloat();
 
    }
    
    public float sumaNotas()
    {
        
       Scanner read = new Scanner(System.in);
                
     float notas ;
       float promedio=0;
      
         for (int i = 1; i<=this.cantidadNotas; i++)
         {
            System.out.println("Ingrese la nota: "+i);
            notas = read.nextFloat();
            
            promedio = (notas + promedio);
         }
         return promedio;
         
    }
      public float resulPromedio(){
       float resultado;
       
      resultado = this.sumaNotas()/this.cantidadNotas;
          
      return resultado;
      } 

    
    
}
