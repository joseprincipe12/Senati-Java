/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javasegundociclo;

/**
 *
 * @author Alumno
 */
public class Alumno {
    private String codigo;
    private String nombre;
    private double notaParcial;
    private double NotaFinal;
    //Creamos el constructor 
    public Alumno(String codigo, String nombre, double notaParcial, double NotaFinal){
        this.codigo = codigo;
        this.nombre = nombre;
        this.notaParcial = notaParcial;
        this.NotaFinal = NotaFinal;
    }
    //Creamos la clase: metodo del promedio del alumno
    public double calcularPromedio(){
        return (this.notaParcial + this.NotaFinal)/2;
    }
    //creamos los metodos set y get para modificar los metodos
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getnotaParcial(){
        return notaParcial;
    }
    public void setnotaParcial(double notaParcial){
        this.notaParcial = notaParcial;
    }
    public double getNotaFinal(){
        return NotaFinal;
    }
    public void setNotaFinal(double NotaFinal){
        this.NotaFinal = NotaFinal;
    }
    @Override
    public String toString() {
        return "Alumno: {"+
                "Código='" + codigo + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Edad=" + notaParcial +
                ", Nota=" + NotaFinal +
                '}';
    }
    
}
