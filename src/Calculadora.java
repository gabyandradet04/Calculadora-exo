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
public class Calculadora {
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    public void sumar(int numero1, int numero2){
        
        suma=numero1+numero2;     
    }
    
    public void restar(int numero1, int numero2){
        
        resta=numero1-numero2;
    }
    public void multiplicar(int numero1, int numero2){
        
        multiplicacion=numero1*numero2;
    } 
    public void mostrar(){
        System.out.println("El resultado de la suma es "+suma);
        System.out.println("El resultado de la multiplicacion es "+multiplicacion);
        System.out.println("El resultado de la resta es "+resta); 
        
    }
    

    public static void main(String[] args){
       
        Calculadora operacion=new Calculadora();
        int a=40;
        int b=30;
                
        operacion.sumar(a,b);
        operacion.multiplicar(a,b);
      
        operacion.restar(a,b);
        
        operacion.mostrar();
        
        
        
        


    }

    private void multiplicacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}