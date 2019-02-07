/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Profesori;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ProfesoriRepository extends EntMngClass implements ProfesoriInterface{
  
    public void create (Profesori p) throws BDexception{
       try{
           em.getTransaction().begin();
           em.persist(p);
           em.getTransaction().commit();
       }catch(Throwable th){
          
          if(th.getCause().toString().contains("java.sql.SQLException: ORA-00001")){  
               throw new BDexception("E dhena egziston") ;
         }
          else{
          throw new BDexception(th.getClass()+" - "+th.getMessage()); 
          }
       }
    }

    @Override
    public void edit(Profesori p) throws BDexception {
         try{
           em.getTransaction().begin();
           em.persist(p);
           em.getTransaction().commit();
       }catch(Throwable th){
          
          if(th.getCause().toString().contains("java.sql.SQLException: ORA-00001")){  
               throw new BDexception("E dhena egziston") ;
         }
          else{
          throw new BDexception(th.getClass()+" - "+th.getMessage());  
          }
       }
    }

    @Override
    public void remove(Profesori p) throws BDexception {
        try{
           em.getTransaction().begin();
           em.persist(p);
           em.getTransaction().commit();
       }catch(Throwable th){
          
          if(th.getCause().toString().contains("java.sql.SQLException: ORA-00001")){ 
               throw new BDexception("E dhena egziston") ;
         }
          else{
          throw new BDexception(th.getClass()+" - "+th.getMessage()); 
          }
       }
    }

    @Override
    public List<Profesori> findAll() throws BDexception {
        try{
          return (List<Profesori>) em.createNamedQuery("Profesori.findAll").getResultList();
        
        
        }catch(Exception e){
             throw new BDexception(" " + e.getMessage());
        }
    }
}

    