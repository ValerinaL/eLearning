
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import BLL.Materiali;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Admin
 */
public class MaterialiTableModel extends AbstractTableModel {
    List <Materiali> list;
      String [] columns = {"Materiali_ISBN","Profesori_Id","Libri","Ushtrimet","Tutorials"};

    /**
     *
     * @param list
     */
    public MaterialiTableModel (List<Materiali>list){
     this.list = list;
    }
     
    public void add (List<Materiali>list){
      this.list = list;
    }
    
   
    public int getRowCount() {
     return list.size();
    }

    @Override
    public String getColumnName(int column) {
       return columns[column];
    }
    
    public Materiali getMaterials (int i){
     return list.get(i);
    }

    @Override
    public Object getValueAt(int row, int column) {
         Materiali m = getMaterials (row);
        
        switch (column){
            case 0:
                return m.getIsbn();
                case 1:
                return m.getProfesoriId();
                case 2:
                return m.getLibri();
                 case 3:
                return m.getUshtrimet();
                 case 4:
                     return m.getTutorials();
        }
        return null;
    }

    @Override
    public int getColumnCount() {
       return columns.length;
    }

    public Materiali getMateriali(int selectedIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
