/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio.pkg4;

import java.util.Scanner;


public class Exercicio4 {

  
    public static void main(String[] args) {
       Scanner leia = new Scanner (System.in);
       
        System.out.println("DIGITE O TOTAL DE ELEITORES");
        int eleitores = leia.nextInt();
        
        System.out.println("DIGITE A QTD DE VOTOS NULOS");
        int nulos = leia.nextInt();
        
        System.out.println("DIGITE A QTD DE VOTOS BRANCOS");
        int brancos = leia.nextInt();
        
        System.out.println("DIGITE A QTD VOTOS VALIDOS");
        int validos = leia.nextInt();
        
        
        double nulospercentual = (nulos *100)/ eleitores;
        double brancopercentual = (brancos *100)/ eleitores;
        double validospercentual = (validos *100)/ eleitores;
        
        System.out.println("PORCENTAGEM NULOS" + nulospercentual);
        System.out.println("PORCENTAGEM BRANCOS"+ brancopercentual);
        System.out.println("PORCENTAGEM VALIDOS" + validospercentual);
        
    }
    
}
