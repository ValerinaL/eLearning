package gui.view;

import BLL.Materiali;
import DAL.BDexception;
import DAL.MaterialiInterface;
import DAL.MaterialiRepository;
import gui.model.MaterialiTableModel;
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
public class MaterialiForm extends javax.swing.JInternalFrame {
   MaterialiInterface mi  = new MaterialiRepository();
   MaterialiTableModel mtm;
    /**
     * Creates new form MaterialiForm
     */
    public MaterialiForm() {
        initComponents();
        clearInputs();
    }
    
        
        private void clearInputs() {
            ISBN.setText("");
            Profesori_Id.setText("");
            Libri.setText("");
            Ushtrimet.setText("");
            Tutorials.setText("");
        }
        
        private void tabelaSelectedIndexChange() {
        final ListSelectionModel rowSM;
       rowSM = MaterialiTable.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener() {


            @Override
            public void valueChanged(ListSelectionEvent Ise) {
                if (Ise.getValueIsAdjusting()) {
                    return;
                }
                ListSelectionModel rowSM = (ListSelectionModel) Ise.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if (selectedIndex > -1) {
                  Materiali m;
                    m = mtm.getMateriali (selectedIndex);
                   
                    ISBN.setText(m.getIsbn() + "");
                    Profesori_Id.setText(m.getProfesoriId() + "");
                    Libri.setText(m.getLibri() + "");
                    Ushtrimet.setText(m.getUshtrimet() + "");
                    Tutorials.setText(m.getTutorials() + "");
       
         }
            }
      });
    }
    
    
    public void tableLoad() {
        try {
            List<Materiali> list;
            list = mi.findAll();
            mtm = new MaterialiTableModel(list);
             MaterialiTable.setModel(mtm);
            mtm.fireTableDataChanged();        } catch (BDexception e) {
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
        ISBN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Profesori_Id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Libri = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Ushtrimet = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Tutorials = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MaterialiTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 2, 36)); // NOI18N
        jLabel1.setText("       Cloud eLearning");

        jLabel2.setText("ISBN");

        jLabel3.setText("ID");

        jLabel4.setText("Libri");

        jLabel5.setText("Ushtrimet");

        jLabel6.setText("Tutorials");

        Save.setText("SAVE");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
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

        MaterialiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ISBN", "ID", "Libri", "Ushtrimet", "Tutorials"
            }
        ));
        jScrollPane1.setViewportView(MaterialiTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(54, 54, 54)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ISBN)
                                .addComponent(Profesori_Id)
                                .addComponent(Libri)
                                .addComponent(Ushtrimet)
                                .addComponent(Tutorials, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(Save)
                            .addGap(32, 32, 32)
                            .addComponent(Delete)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                            .addComponent(Cancel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 408, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Profesori_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Libri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Ushtrimet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tutorials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Save)
                            .addComponent(Delete)
                            .addComponent(Cancel))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>                        

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {                                     
        int row ;
        row = MaterialiTable.getSelectedRow();
        if(row == -1){
            Materiali m;
            m = new Materiali();
            
            m.setIsbn(Integer.parseInt(ISBN.getText()));
            m.setProfesoriId(Integer.parseInt(Profesori_Id.getText()));
            m.setLibri(Libri.getText());
            m.setUshtrimet(Ushtrimet.getText());
            m.setTutorials(Tutorials.getText());
            
           
            try {
                mi.create(m);
            } catch (BDexception ex) {
                Logger.getLogger(ProfesoriForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            tableLoad();
            clearInputs();
        }
        else{
            Materiali m;
            m = new Materiali();
            
            m.setIsbn(Integer.parseInt(ISBN.getText()));
            m.setProfesoriId(Integer.parseInt(Profesori_Id.getText()));
            m.setLibri(Libri.getText());
            m.setUshtrimet(Ushtrimet.getText());
            m.setTutorials(Tutorials.getText());
            
           
            try {
                mi.create(m);
            } catch (BDexception ex) {
                Logger.getLogger(ProfesoriForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            tableLoad();
            clearInputs();
        }
    }                                    

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {                                       
       int row ;
        row = MaterialiTable.getSelectedRow();
        if (row != -1){
            Object [] ob = {"Po", "Jo"};
            int result = JOptionPane.showOptionDialog(this," A deshironi ta fshini?", "Fshirja", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);

            if (result == 0){
                Materiali m;
                m = mtm.getMateriali(row);
                try {
                    mi.remove(m);
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
    private javax.swing.JButton Delete;
    private javax.swing.JTextField ISBN;
    private javax.swing.JTextField Libri;
    private javax.swing.JTable MaterialiTable;
    private javax.swing.JTextField Profesori_Id;
    private javax.swing.JButton Save;
    private javax.swing.JTextField Tutorials;
    private javax.swing.JTextField Ushtrimet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
