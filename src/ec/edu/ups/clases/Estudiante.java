/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
* @version 2.0
 * @since 2019
 * @author Vinicio campoverde
 * @see http://ups.edu.ec
 */

public class Estudiante extends Persona {
private Carrera carrera; 

public Estudiante(){
    
}
    public void setCarrera(Carrera carrera){
      this.carrera=carrera;  
    }
    public Carrera getCarrera(){
        return this.carrera;
    }
}
