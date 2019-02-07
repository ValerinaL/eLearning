package DAL;


import BLL.Studenti;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface StudentiInterface {
    void create (Studenti s) throws BDexception;;
    void edit (Studenti s) throws BDexception;
    void remove (Studenti s) throws BDexception;

    /**
     *
     * @return
     * @throws BDexception
     */
    List <Studenti> findAll() throws  BDexception;
}
