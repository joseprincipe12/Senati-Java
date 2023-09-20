/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author Alumno
 */
public class Futbolista extends SeleccionFutbol{    
    
    private int dorsal;
    private String demarcacion;
    
    public Futbolista(){
        super();
    }

    public Futbolista(int dorsal, String demarcacion, int id, String Nombre, String Apellido, int Edad) {
        super(id, Nombre, Apellido, Edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    public void jugarPartido(){
        System.out.println("Jugando");
    }
    
    public void entrenar(){
        System.out.println("Entrenando");
    }
    
}
