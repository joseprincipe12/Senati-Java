/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package py.senati2023;

import java.util.Scanner;

public class PySenati2023 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int parametro = 0;
        float num_uno = 0, num_dos =0, resultado = 0;
        System.out.println("Calculadora");
        System.out.println("|1| Suma");
        System.out.println("|2| Resta");
        System.out.println("|3| multiplicación");
        System.out.println("|4| división");
        parametro = entrada.nextFloat();
        System.out.println("Ingrese el primer número");
        num_uno = entrada.nextInt();
        System.out.println("Ingrese el segundo número");
        num_dos = entrada.nextFloat();
       
        switch(parametro){
        case 1: resultado = num_uno + num_dos;
                System.out.println("El resultado de la suma es: " + resultado);
                break;

        case 2: resultado = num_uno - num_dos;
                System.out.println("El resultado de la resta es: " + resultado);
                break; 
                
        case 3: resultado = num_uno * num_dos;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break; 
         
        case 4: resultado = num_uno / num_dos;
                System.out.println("El resultado de la divisón es: " + resultado);
                break;         
        }
    }
}
