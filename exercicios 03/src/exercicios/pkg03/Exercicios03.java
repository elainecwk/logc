/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios.pkg03;

import java.util.Scanner;

public class Exercicios03 {

    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        System.out.println("DIGITE A QTD DE ANOS");
        int anos = leia.nextInt();
        
        System.out.println("DIGITE A QTD DE MESES");
        int meses = leia.nextInt();
        
        System.out.println("DIGITE A QTD DE DIAS");
        int dias = leia.nextInt();
        
        int totalDias = (anos * 365) + (meses * 30)+ dias;
        
        System.out.println("VOCE VIVEU" + totalDias);
    }
    
}
