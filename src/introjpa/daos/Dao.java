/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjpa.daos;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Paul
 */
public class Dao {
    
   protected EntityManager entitymanager = Persistence.createEntityManagerFactory("IntroJPAPU").createEntityManager();
    
    
}
