package gui.view;

import BLL.Studenti;
import DAL.BDexception;
import DAL.StudentiInterface;
import DAL.StudentiRepository;
import gui.model.StudentiTableModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Admin
 */
public class StudentiForm extends javax.swing.JInternalFrame {
   StudentiInterface si = new StudentiRepository();
   StudentiTableModel stm;
    /**
     * Creates new form StudentiForm
     */
    public StudentiForm() {
        initComponents();
        clearInputs();
    }

    
    private void clearInputs() {
        ID.setText("");
        Emri.setText("");
        Mbiemri.setText("");
        DataeLindjes.setDateFormatString(null);
        Email.setText("");
        Telefoni.setText("");
        DataeRegjistrimit.setDateFormatString(null);
    }
    
    private void tabelaSelectedIndexChange() {
        final ListSelectionModel rowSM;
       rowSM = StudentiTable.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener() {


            @Override
            public void valueChanged(ListSelectionEvent Ise) {
                if (Ise.getValueIsAdjusting()) {
                    return;
                }
                ListSelectionModel rowSM = (ListSelectionModel) Ise.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if (selectedIndex > -1) {
                  Studenti s;
                    s = stm.getStudenti (selectedIndex);
                   
                    ID.setText(s.getStudentiId()+ "");
                    Emri.setText(s.getStudentiEmri());
                    Mbiemri.setText(s.getStudentiMbiemri());
                    DataeLindjes.setDate(s.getStudentiDataLindjes());
                    Email.setText(s.getStudentiEmail());
                    Telefoni.setText(s.getStudentiTelefoni());
                    DataeRegjistrimit.setDateFormatString(s.getStudentiDataRegjistrimit());
                    
         }
            }   
      });
    }
    
    
    public void tableLoad() {
        try {
            List<Studenti> list;
            list = si.findAll();
            stm = new StudentiTableModel(list);
             StudentiTable.setModel(stm);
            stm.fireTableDataChanged();        } catch (BDexception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Emri = new javax.swing.JTextField();
        Mbiemri = new javax.swing.JTextField();
        DataeLindjes = new com.toedter.calendar.JDateChooser();
        Email = new javax.swing.JTextField();
        Telefoni = new javax.swing.JTextField();
        DataeRegjistrimit = new com.toedter.calendar.JDateChooser();
        SAVE = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        StudentiTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 2, 36)); // NOI18N
        jLabel1.setText("       Cloud eLearning");

        jLabel2.setText("ID");

        jLabel3.setText("Emri");

        jLabel4.setText("Mbiemri");

        jLabel5.setText("Data e Lindjes");

        jLabel6.setText("Email");

        jLabel7.setText("Telefoni");

        jLabel8.setText("Data e Regjistrimit");

        SAVE.setText("SAVE");
        SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEActionPerformed(evt);
            }
        });

        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Cancel.setText("CANCEL");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        StudentiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Emri", "Mbiemri", "Data e Lindjes", "Email", "Telefoni", "Data e Regjistrimit"
            }
        ));
        jScrollPane1.setViewportView(StudentiTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(35, 35, 35)
                                .addComponent(DataeRegjistrimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Email)
                                    .addComponent(Telefoni)
                                    .addComponent(DataeLindjes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Mbiemri)
                                    .addComponent(Emri)
                                    .addComponent(ID)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SAVE)
                        .addGap(31, 31, 31)
                        .addComponent(Delete)
                        .addGap(18, 18, 18)
                        .addComponent(Cancel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Emri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Mbiemri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DataeLindjes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel7))
                            .addComponent(Telefoni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(DataeRegjistrimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SAVE)
                            .addComponent(Delete)
                            .addComponent(Cancel)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void SAVEActionPerformed(java.awt.event.ActionEvent evt) {                                     
       int row ;
        row = StudentiTable.getSelectedRow();
        if(row == -1){
            Studenti s;
            s= new Studenti();
            
            s.setStudentiId(Integer.parseInt(ID.getText()));
            s.setStudentiEmri(Emri.getText());
            s.setStudentiMbiemri(Mbiemri.getText());
            s.setStudentiDataLindjes(DataeLindjes.getDate());
            s.setStudentiEmail(Email.getText());
            s.setStudentiTelefoni(Telefoni.getText());
            s.setStudentiDataRegjistrimit(DataeRegjistrimit.getDateFormatString());
            
            
            try {
                si.create(s);
            } catch (BDexception ex) {
                Logger.getLogger(ProfesoriForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            tableLoad();
            clearInputs();
        }
        else{
             Studenti s;
            s= new Studenti();
            
            s.setStudentiId(Integer.parseInt(ID.getText()));
            s.setStudentiEmri(Emri.getText());
            s.setStudentiMbiemri(Mbiemri.getText());
            s.setStudentiDataLindjes(DataeLindjes.getDate());
            s.setStudentiEmail(Email.getText());
            s.setStudentiTelefoni(Telefoni.getText());
            s.setStudentiDataRegjistrimit(DataeRegjistrimit.getDateFormatString());
            
           
            try {
                si.create(s);
            } catch (BDexception ex) {
                Logger.getLogger(ProfesoriForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            tableLoad();
            clearInputs();
        }
    }                                    

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {                                       
       int row ;
        row = StudentiTable.getSelectedRow();
        if (row != -1){
            Object [] ob = {"Po", "Jo"};
            int result = JOptionPane.showOptionDialog(this," A deshironi ta fshini?", "Fshirja", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);

            if (result == 0){
                Studenti s;
                s = stm.getStudenti (row);
                try {
                    si.remove(s);
                } catch (BDexception se) {
                    JOptionPane.showMessageDialog(this, se.getMessage());
                }
                tableLoad();
            }
            clearInputs();

        } else {
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje per te fshire!");

        }
    }                                      

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {                                       
       clearInputs();
    }                                      


    // Variables declaration - do not modify                     
    private javax.swing.JButton Cancel;
    private com.toedter.calendar.JDateChooser DataeLindjes;
    private com.toedter.calendar.JDateChooser DataeRegjistrimit;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Emri;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Mbiemri;
    private javax.swing.JButton SAVE;
    private javax.swing.JTable StudentiTable;
    private javax.swing.JTextField Telefoni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
