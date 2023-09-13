/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javasegundociclo;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class JavaSegundoCiclo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        
        String codigo;
        double nota1, nota2, nota3;
        
        System.out.print("Ingrese el codigo del Estudiante: ");
        codigo = in.next();
        System.out.print("Ingrese la nota 1: ");
        nota1 = in.nextDouble();
        System.out.print("Ingrese la nota 2: ");
        nota2 = in.nextDouble();
        System.out.print("Ingrese la nota 3: ");
        nota3 = in.nextDouble();
       
        Promedio prom = new Promedio(codigo,nota1,nota2,nota3);
        System.out.println(prom);
    }
    
    
}
