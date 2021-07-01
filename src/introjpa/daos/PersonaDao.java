/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjpa.daos;

import introjpa.entidades.Persona;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Paul
 */
public class PersonaDao extends Dao{
    
   
    
    public Persona crear(Persona persona) throws Exception {

        try {
            //Comienza la transacción
            entitymanager.getTransaction().begin();
            //Persistir el objeto
            entitymanager.persist(persona);
            //Ejecutar la tranzacción
            entitymanager.getTransaction().commit();
            return persona;
        } catch (Exception e) {
            entitymanager.getTransaction().rollback();
            throw new Exception("Ocurrio un error al persistir el objeto", e);
        }
    }

    public List<Persona> traerTodasLasPersonas() {

        String jpql = "Select p from Persona p";
        Query query = entitymanager.createQuery(jpql);

        return query.getResultList();
    }

    public Persona traerPorId(Persona persona) {

        String jpql = "Select p from Persona p where p.id =:id";
        Query query = entitymanager.createQuery(jpql);
        query.setParameter("id", persona.getId());

        return (Persona) query.getSingleResult();
    }
     public Persona traerPorId(Long id) {

        String jpql = "SELECT p FROM Persona p WHERE p.id =:id";
        Query query = entitymanager.createQuery(jpql);
        query.setParameter("id", id);

        return (Persona) query.getSingleResult();
    }
    
    }

