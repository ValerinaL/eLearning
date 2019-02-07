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
public interface ProfesoriInterface {
     void create (Profesori p) throws BDexception;;
    void edit (Profesori p) throws BDexception;
    void remove (Profesori p) throws BDexception;
    List <Profesori> findAll() throws  BDexception;
}
