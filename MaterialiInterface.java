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
public interface MaterialiInterface {
    void create (Materiali m) throws BDexception;;
    void edit (Materiali m) throws BDexception;
    void remove (Materiali m) throws BDexception;
    List <Materiali> findAll() throws  BDexception;
}
