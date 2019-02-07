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
public interface StafiInterface {
    void create (Stafi st) throws BDexception;;
    void edit (Stafi st) throws BDexception;
    void remove (Stafi st) throws BDexception;
    List <Stafi> findAll() throws  BDexception;
}
