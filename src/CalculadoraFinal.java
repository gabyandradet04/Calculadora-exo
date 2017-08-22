/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Español
 */
import java.util.Scanner;
public class CalculadoraFinal {
    
     int nume1;
     int nume2;
     int sum;
     int rest;
     int mult;
     int div;
     
     public void Ingresar(){
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Ingrese el primer dato");
        nume1=sc.nextInt();
        System.out.println("Ingrese el segundo dato");
        nume2=sc.nextInt();

         
         
     }
     public void Sumar(){
         sum=nume1+nume2;
     }
     public void Restar(){
         rest=nume1-nume2;
     }
     
     public void Multiplicar(){
         mult=nume1*nume2;
     }
     public void Dividir(){
         if(nume2>0){
             div=nume1/nume2;
         }
         
     }
     public void Mostrar(){
         System.out.println("El resultado de la suma es igual a "+sum);
         System.out.println(rest);
         System.out.println(mult);
         System.out.println(div);
     }
    
     
     public static void main(String[] args) {
        CalculadoraFinal operacion = new CalculadoraFinal();
        
        operacion.Ingresar();
        operacion.Sumar();
        operacion.Restar();
        operacion.Multiplicar();
        operacion.Dividir();
        operacion.Mostrar();    
        
    }
}
