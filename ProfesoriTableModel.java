/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import BLL.Profesori;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Admin
 */
public class ProfesoriTableModel extends AbstractTableModel{
    List <Profesori> list;
    String [] columns = {"Profesori_Id","Profesori_Emri","Profesori_Mbiemri","Profesori_DataLindjes","Profesori_Telefoni","Profesori_Materiali"};
    
    public ProfesoriTableModel (List<Profesori>list){
     this.list = list;
    }
     
    /**
     *
     * @param list
     */
    public void add (List<Profesori>list){
      this.list = list;
    }
    
   
    public int getRowCount() {
     return list.size();
    }

    @Override
    public String getColumnName(int column) {
       return columns[column];
    }
    
    public ProfesoriTableModel(int i){
    }

    @Override
    public Object getValueAt(int row, int column) {
         Profesori p = getProfesori (row);
        
        switch (column){
            case 0:
                return p.getProfesoriId();
                case 1:
                return p.getProfesoriEmri();
                case 2:
                return p.getProfesoriMbiemri();
                 case 3:
                return p.getProfesoriTelefoni();
                 case 4:
                     return p.getProfesoriDataLindjes();
                 case 5:
                     return p.getProfesoriMateriali();
        }
        return null;
    }

    @Override
    public int getColumnCount() {
       return columns.length;
    }

    public Profesori getProfesori(int row) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}


