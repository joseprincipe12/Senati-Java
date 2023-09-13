/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasegundociclo;

/**
 *
 * @author Alumno
 */
public class Promedio {
    private String codigo;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;

    public Promedio(String codigo, double nota1, double nota2, double nota3) {
        this.codigo = codigo;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public static Double formatearDecimales(Double numero, Integer numeroDecimales) {
        return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
    }
    public double Promedio(){
        promedio = formatearDecimales((this.nota1+this.nota2+this.nota3)/3,2);
        //promedio = Math.round(((this.nota1+this.nota2+this.nota3)/3)*100)/100;
        return promedio;
    }
    
  
    @Override
    public String toString() {
        return "Venta: {"+
                "Código='" + codigo + '\'' +
                ", Nota 1='" + nota1 + '\'' +
                ", Nota 2='" + nota2 + '\'' +
                ", Nota 3='" + nota3 + '\'' +
                ", Promedio=" + Promedio()  +
                '}';
    }
}

