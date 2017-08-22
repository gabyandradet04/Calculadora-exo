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
public class Calculadora3 {
    
    int num1;
    int num2;
    double div;
    
    public void Dividir(int a, int b){
       if(b==0){
           System.out.println("ERROR");
       }
       else{
           div= a/b;
           System.out.println(div);
       }
        
       
    }
    public static void main(String[]args){
       
        
        
        Calculadora3 a =new Calculadora3();
     

                
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese el primer dato");
        a.num1=sc.nextInt();
        
        System.out.println("Ingrese el segundo dato");
        a.num2= sc.nextInt();


        
        
        
    }
   
}
