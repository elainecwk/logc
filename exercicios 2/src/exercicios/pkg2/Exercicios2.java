/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios.pkg2;

import java.util.Scanner;


public class Exercicios2 {

   
    
    public static void main(String[] args) {
       Scanner leia = new Scanner (System.in);
       
        System.out.println("DIGITE A LARGURA");
        double largura = leia.nextDouble();
        
        System.out.println("DIGITE A ALTURA");
        double altura = leia.nextDouble();
        
        double result = largura * altura;
        
        System.out.println("A AREA É IGUAL :" + result);
    }
   
        
        
    
}
