/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjpa;

import introjpa.daos.PersonaDao;
import introjpa.entidades.Persona;

/**
 *
 * @author Paul
 */
public class IntroJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            PersonaDao personaDao = new PersonaDao();
            personaDao.crear(new Persona("Nahuel"));
            System.out.println(personaDao.traerPorId(1L).toString());
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: "+e.getMessage());
        }
    }
    
}
