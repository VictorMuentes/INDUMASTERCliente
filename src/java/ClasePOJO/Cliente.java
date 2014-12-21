/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasePOJO;

import javax.xml.bind.annotation.XmlRootElement;



/**
 *
 * @author V1C70R MU3N735
 */

@XmlRootElement 
public class Cliente extends Persona{

    public Cliente(String direccion, String sexo, String telefono, String correo, String apellidos, String nombres, String cedula) {
        super(direccion, sexo, telefono, correo, apellidos, nombres, cedula);
    }

   

    

    

  
    
}
