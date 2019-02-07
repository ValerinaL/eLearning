package DAL;


import BLL.Studenti;
import java.util.List;

/**
 *
 * @author Admin
 */
public class StudentiRepository extends EntMngClass implements StudentiInterface{
    public void create (Studenti s) throws BDexception{
       try{
           em.getTransaction().begin();
           em.persist(s);
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
    public void edit(Studenti s) throws BDexception {
         try{
           em.getTransaction().begin();
           em.persist(s);
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
    public void remove(Studenti s) throws BDexception {
        try{
           em.getTransaction().begin();
           em.persist(s);
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
    public List<Studenti> findAll() throws BDexception {
        try{
          return (List<Studenti>) em.createNamedQuery("Studenti.findAll").getResultList();
        
        
        }catch(Exception e){
             throw new BDexception(" " + e.getMessage());
        }
    }
   
}
