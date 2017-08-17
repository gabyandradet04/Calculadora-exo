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
public class Calculadora2 {
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
   
    
 
   public void mostrar(){
        System.out.println("El resultado de la suma es "+suma);
        
   }
   public void pedir_dato(){
    
       Scanner n2=new Scanner (System.in);
       numero1 =n2.nextInt();
       numero2=n2.nextInt();
       
   }
    public void sumar(){
        
        suma=numero1+numero2;     
    }
    
    public static void main(String[] args) {
       Calculadora operacion=new Calculadora();
       
      
        System.out.println("ingrese el primer numero");
       Scanner n1 = new Scanner (System.in);
       operacion.numero1=n1.nextInt();
          System.out.println("ingrese el segundo numero");
        
       operacion.numero2=n1.nextInt();
       
        operacion.sumar(operacion.numero1, operacion.numero2);
       operacion.mostrar();
    
        
    }
}
