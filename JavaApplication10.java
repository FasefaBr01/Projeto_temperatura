/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;
import java.util.Scanner;

/**
 *
 * @author FASEFA
 */
public class JavaApplication10 {

    
    public static void main(String[] args) {
        
        String nome;
        double temperatura;
        String temperatura1;
        double celcius;
        String celcius1;
        double fahrenheit;
        String fahrenheit1;
        double kelvin;
        String kelvin1;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        nome = ler.nextLine();
        
        System.out.print("Qual unidade temperamétrica quer usar: Celcius, Kelvin ou Fahrenheit? ");
        temperatura1 = ler.nextLine();

        System.out.print("Agora digite a temperatura: ");
        temperatura = ler.nextDouble();
           
        if("Celcius".equals(temperatura1) && (temperatura >= 0 || temperatura <= 0)){
            
            kelvin = temperatura + 273.15;
            fahrenheit = (temperatura * (9/5)) + 32;
            
            System.out.println("Graus Kelvin: " + kelvin);
            System.out.println("Graus fahrenheit: " + fahrenheit);
            
        }else if("Kelvin".equals(temperatura1) && (temperatura >= 0 || temperatura <= 0)){
            
            celcius = temperatura - 273.15;
            fahrenheit = (temperatura - 273.15) * (9/5 + 32);
            
            System.out.println("Graus Celcius: " + celcius);
            System.out.println("Graus Fahrenheit: " + fahrenheit);
            
        }if("Fahrenheit".equals(temperatura1) && (temperatura >= 0 || temperatura <= 0)){
            
            celcius = (temperatura - 32) * 5/9;
            kelvin = (temperatura - 32) * (5/9 + 273.15);
            
            System.out.println("Graus Celcius: " + celcius);
            System.out.println("Graus Kelvin: " + kelvin);
            
        }
        
        
    }
    
}
