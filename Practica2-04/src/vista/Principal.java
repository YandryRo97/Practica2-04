/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.GestionDato;
import modelo.Equipo;

/**
 *
 * @author Estudiante
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Equipo e = new Equipo(200,10); 
       GestionDato gD= new GestionDato();
       gD.persistirEquipo(e);
       
        
    }
    
}
