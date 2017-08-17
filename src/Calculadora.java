/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**pedir dosnumeros por teclado
 * 
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
        /**Metodo para ingresar datos por pantalla 
         * Se llama al metodo Scanner afuera de la clase y luego se llama al 
         * metodo,ingresando un objeto exclusivo del metodo Scanner en este caso 
         * sc, para luego llamar al objeto operacion creado anteriomente , 
         * convocando al objeto de la clase scanner (sc)
         * 
         * 
         */
       Scanner sc=new Scanner(System.in);
        
        System.out.println("ingrese el primer numero");
        operacion.numero1= sc.nextInt();
        System.out.println("ingrese el segundo numero");
        operacion.numero2= sc.nextInt();
        System.out.println("El primer numero ingresado fue  "+operacion.numero1+"el segundo numero ingresado "+ operacion.numero2);

        
        
        


    }

    private void multiplicacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}