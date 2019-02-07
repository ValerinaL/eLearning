
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Materiali;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MaterialiRepository extends EntMngClass implements MaterialiInterface{
   
    public void create (Materiali m) throws BDexception{
       try{
           em.getTransaction().begin();
           em.persist(m);
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
    public void edit(Materiali m) throws BDexception {
         try{
           em.getTransaction().begin();
           em.persist(m);
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
    public void remove(Materiali m) throws BDexception {
        try{
           em.getTransaction().begin();
           em.persist(m);
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
    public List<Materiali> findAll() throws BDexception {
        try{
          return (List<Materiali>) em.createNamedQuery("Materiali.findAll").getResultList();
        
        
        }catch(Exception e){
             throw new BDexception(" " + e.getMessage());
        }
    }
}
   