/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Stafi;
import java.util.List;

/**
 *
 * @author Admin
 */
public class StafiRepository extends EntMngClass implements StafiInterface{
    public void create (Stafi st) throws BDexception{
       try{
           em.getTransaction().begin();
           em.persist(st);
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

    /**
     *
     * @param st
     * @throws BDexception
     */
    @Override
    public void edit(Stafi st) throws BDexception {
         try{
           em.getTransaction().begin();
           em.persist(st);
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
    public void remove(Stafi st) throws BDexception {
        try{
           em.getTransaction().begin();
           em.persist(st);
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
    public List<Stafi> findAll() throws BDexception {
        try{
          return (List<Stafi>) em.createNamedQuery("Stafi.findAll").getResultList();
        
        
        }catch(Exception e){
             throw new BDexception(" " + e.getMessage());
        }
    }
}
   

