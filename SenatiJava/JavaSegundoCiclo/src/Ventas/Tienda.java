/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ventas;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String codigo, nombre, vendedor;
        int cantidad;
        double precio;
        
        System.out.print("Ingrese el codigo del producto: ");
        codigo = in.next();
        System.out.print("Ingrese el nombre del producto: ");
        nombre = in.next();
        System.out.print("Ingrese el precio del producto: ");
        precio = in.nextDouble();
        System.out.print("Ingrese la cantidad: ");
        cantidad = in.nextInt();
        System.out.print("Ingrese el nombre del vendedor: ");
        vendedor = in.next();
        
        
        Ventas ven = new Ventas(precio,cantidad,codigo,nombre,vendedor);
        System.out.println(ven);
    }
    
}
