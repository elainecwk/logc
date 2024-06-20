/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios.pkg05;

import java.util.Scanner;


public class Exercicios05 {

   
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        System.out.println("INFORME A TEMPERATURA EM °C");
        double celsius = leia.nextInt();
        
        double farenhait = (1.8 *celsius)+ 32;
        double kelvin = celsius + 273.15;
        
        System.out.println("CELSIUS:" + celsius + "°C");
        System.out.println("FARENHAIT :" + farenhait + "°F");
        System.out.println("KELVIN;"+ kelvin + "°k");
    }
    
}
