/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import BLL.Stafi;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Admin
 */
public class StafiTableModel extends AbstractTableModel{
    List <Stafi> list;
    String [] columns = {"Stafi_Id","Stafi_Emri","Stafi_Mbiemri","Stafi_Telefoni","Stafi_DataLindjes","Stafi_Email","Stafi_Password"};

    
    public StafiTableModel (List<Stafi>list){
     this.list = list;
    }
     
    public void add (List<Stafi>list){
      this.list = list;
    }
    
   
    public int getRowCount() {
     return list.size();
    }

    @Override
    public String getColumnName(int column) {
       return columns[column];
    }
    
    /**
     *
     * @param i
     * @return
     */
    public Stafi getStafi (int i){
     return list.get(i);
    }

    @Override
    public Object getValueAt(int row, int column) {
       Stafi st;
        st = getStafi (row);
        
        switch (column){
            case 0:
                return st.getStafiId();
                case 1:
                return st.getStafiEmri();
                case 2:
                return st.getStafiMbiemri();
                 case 3:
                return st.getStafiTelefoni();
                 case 4:
                     return st.getStafiDataLindjes();
                 case 5:
                     return st.getStafiEmail();
                 case 6 : 
                     return st.getStafiPassword();
        }
        return null;
    }

    @Override
    public int getColumnCount() {
       return columns.length;
    }
}


