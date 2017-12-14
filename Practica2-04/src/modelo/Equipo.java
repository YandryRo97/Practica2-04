/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Estudiante
 */
@Entity
public class Equipo implements Serializable 
{
    @Id
    private int id;
    private int numJugadores;
   

    public Equipo(int id, int numJugadores) {
        this.id = id;
        this.numJugadores = numJugadores;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    

    @Override
    public String toString() {
        return "Equipo{" + "id=" + id + ", numJugadores=" + numJugadores + '}';
    }
    
}
