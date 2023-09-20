/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author Alumno
 */
public class Entrenador extends SeleccionFutbol{
    
    private String idFederacion;
    
    public Entrenador(){
        super();
    }


    public Entrenador(String idFederacion, int id, String Nombre, String Apellido, int Edad) {
        super(id, Nombre, Apellido, Edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    public void dirigirPartido(){
        System.out.println("Dirigiendo Partido");
    }
    
    public void dirigirEntreno(){
        System.out.println("Dirigiendo Entrenamiento");
    }
}
