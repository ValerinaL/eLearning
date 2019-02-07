/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import BLL.Studenti;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Admin
 */
public class StudentiTableModel extends AbstractTableModel{
 
    List <Studenti> list;
    String [] columns = {"Studenti_Id","Studenti_Emri","Studenti_Mbiemri","Studenti_DataLindjes","Studenti_Email","Studenti_Telefoni","Studenti_DataRegjistrimit"};
    public Studenti getStudenti;

    
    public StudentiTableModel (List<Studenti>list){
     this.list = list;
    }
     
    /**
     *
     * @param list
     */
    public void add (List<Studenti>list){
      this.list = list;
    }
    
   
    public int getRowCount() {
     return list.size();
    }

    @Override
    public String getColumnName(int column) {
       return columns[column];
    }
    
    public Studenti getStudenti (int i){
     return list.get(i);
    }

    @Override
    public Object getValueAt(int row, int column) {
         Studenti s;
        s = getStudenti (row);
        
        switch (column){
            case 0:
                return s.getStudentiId();
                case 1:
                return s.getStudentiEmri();
                case 2:
                return s.getStudentiMbiemri();
                 case 3:
                return s.getStudentiDataLindjes();
                 case 4:
                return s.getStudentiEmail();
                 case 5:
                return s.getStudentiTelefoni();
                 case 6:
                return s.getStudentiDataRegjistrimit();
        }
        return null;
    }

    @Override
    public int getColumnCount() {
       return columns.length;
    }
}
   
