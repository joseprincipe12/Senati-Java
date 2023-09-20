/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Main {

    //ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a lña que pertenezca el objeto  
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<>();
    
    public static void main(String[] args) {
       Entrenador delBosque = new Entrenador("284EZ89",1,"Vicente","Del Bosque",60); 
       Futbolista iniesta = new Futbolista(4,"40",1234,"Andres","Iniesta",41);
       Masajista raulMartinez = new Masajista("Senati",4,1233,"Raul","Martinez",41);
    
       integrantes.add(delBosque);
       integrantes.add(iniesta);
       integrantes.add(raulMartinez);
    
       //Concentracion
       System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismometodo)");
    
       for(SeleccionFutbol integrante : integrantes){
           System.out.println(integrante.getNombre()+" "+integrante.getApellido()+" "+integrante.getEdad()+" "+integrante.getId());
           
           integrante.Concentrarse();
              
       }
       iniesta.entrenar();
    }
    
}
