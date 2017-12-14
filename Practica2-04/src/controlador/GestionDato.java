/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Equipo;

/**
 *
 * @author Estudiante
 */
public class GestionDato {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Practica2-04PU");
    
    public boolean persistirEquipo(Equipo e) {
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        em.close();
        retorno=true;
        return retorno;
    }
     
    public List<Equipo> leerEquipo() {
        List<Equipo> retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        retorno=em.createQuery("SELECT e FROM Equipo e ORDER BY e.id").getResultList();        
        em.close();
        return retorno;
    }
     
     
    public boolean actualizarEquipo(Equipo e) {  
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(e);
        em.getTransaction().commit();
        em.close();
        retorno=true;
        return retorno;
    }

    public Equipo buscarEquipo(int i) {
        Equipo retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        try
        {
            retorno=em.find(Equipo.class, i);
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }

    public boolean eliminarEquipo(Equipo e) {        
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.remove(em.merge(e));
            em.getTransaction().commit();
            retorno=true;
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }
   

     
    
     
 

    

    
    

}
    

