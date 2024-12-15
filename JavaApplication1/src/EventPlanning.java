import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EventPlanning extends javax.swing.JFrame {

    
    public EventPlanning() {
        initComponents();
    }
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String db_driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/event_management?useSSL=false"; 
    private void AddEvent(){
         try {
              Class.forName(db_driver);
            con = DriverManager.getConnection(url, "root", "mahode0303");
            ps = con.prepareStatement("INSERT INTO event_planning(Event_id, EventName, Description, OrganiserDetails, Date, Time) VALUES(?,?,?,?,?,?)"); 
            ps.setString(1, idTextField.getText()); 
            ps.setString(2, eventnameTextField.getText()); 
            ps.setString(3, descTextField.getText()); 
            ps.setString(4, organiserdetailsTextField.getText());
            ps.setString(5, dateTextField.getText());
            ps.setString(6, timeTextField.getText()); 
            ps.executeUpdate(); 

            JOptionPane.showMessageDialog(this, "Successfully Saved"); 

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EventPlanning.class.getName()).log(Level.SEVERE, null, ex);
   
        }
      
    }
        private void DeleteEvent(){
        try {
              Class.forName(db_driver);
            con = DriverManager.getConnection(url, "root", "mahode0303");
            ps = con.prepareStatement("DELETE FROM event_planning where Event_id=?"); 
            ps.setString(1, idTextField.getText()); 
            ps.executeUpdate(); 

            JOptionPane.showMessageDialog(this, "Successfully Deleted "); 

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EventPlanning.class.getName()).log(Level.SEVERE, null, ex);
   
        } 
    }
         private void UpdateEvent() {
  try {
    Class.forName(db_driver);
    con = DriverManager.getConnection(url, "root", "mahode0303");
    ps = con.prepareStatement("UPDATE event_planning SET EventName=?, Description=?, OrganiserDetails=?, Date=?, Time=? WHERE Event_id=?");
    ps.setString(1, idTextField.getText()); 
    ps.setString(1, eventnameTextField.getText()); 
    ps.setString(2, descTextField.getText()); 
    ps.setString(3, organiserdetailsTextField.getText());
    ps.setString(4, dateTextField.getText());
    ps.setString(5, timeTextField.getText()); 
    ps.setString(6, idTextField.getText()); 

    ps.executeUpdate(); 
    JOptionPane.showMessageDialog(this, "Successfully Updated "); 
  } catch (ClassNotFoundException | SQLException ex) {
    Logger.getLogger(EventPlanning.class.getName()).log(Level.SEVERE, null, ex);  
  }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel = new javax.swing.JPanel();
        lname = new javax.swing.JLabel();
        dest = new javax.swing.JLabel();
        desc = new javax.swing.JLabel();
        eventnameTextField = new javax.swing.JTextField();
        organiserdetailsTextField = new javax.swing.JTextField();
        addbutton = new javax.swing.JButton();
        editbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        eventname = new javax.swing.JLabel();
        organiserdetails = new javax.swing.JLabel();
        descTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        dateTextField = new javax.swing.JFormattedTextField();
        timeTextField = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        eventTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(102, 102, 102));

        lname.setForeground(new java.awt.Color(255, 255, 255));
        lname.setText("Date");

        dest.setForeground(new java.awt.Color(255, 255, 255));
        dest.setText("Time");

        desc.setForeground(new java.awt.Color(255, 255, 255));
        desc.setText("Description");

        eventnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventnameTextFieldActionPerformed(evt);
            }
        });

        addbutton.setText("Add");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        editbutton.setText("Update");
        editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbuttonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        eventname.setForeground(new java.awt.Color(255, 255, 255));
        eventname.setText("Event Name");

        organiserdetails.setForeground(new java.awt.Color(255, 255, 255));
        organiserdetails.setText("Organiser Details");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Event ID");

        dateTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        timeTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        timeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeTextFieldActionPerformed(evt);
            }
        });

        jButton1.setText("Back to Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(eventname))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(eventnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateTextField))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(organiserdetails)
                            .addComponent(addbutton))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(descTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                    .addComponent(organiserdetailsTextField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dest, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(editbutton)
                                .addGap(69, 69, 69)
                                .addComponent(deleteButton)
                                .addGap(37, 37, 37)
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(172, 172, 172))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventname, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(desc)
                            .addComponent(descTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dest))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(organiserdetails)
                            .addComponent(organiserdetailsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editbutton)
                    .addComponent(deleteButton)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addbutton)
                        .addComponent(jButton1)))
                .addGap(16, 16, 16))
        );

        eventTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event ID", "Event Name", "Description", "Orgeniser Details", "Date", "Time"
            }
        ));
        jScrollPane3.setViewportView(eventTable);

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 3, 18)); // NOI18N
        jLabel3.setText("Event Planning");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eventnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventnameTextFieldActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
           AddEvent();
        // TODO add your handling code here:
        if(idTextField.getText().equals("")||eventnameTextField.getText().equals("")||descTextField.getText().equals("")||organiserdetailsTextField.getText().equals("")||dateTextField.getText().equals("")||timeTextField.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter All Details OR Check Data Correct Format");

        } else {
            // Create an array to hold the data
            String data[] = {idTextField.getText(), eventnameTextField.getText(), descTextField.getText(), organiserdetailsTextField.getText(), dateTextField.getText(), timeTextField.getText()};

            // Get the table model
            DefaultTableModel model = (DefaultTableModel) eventTable.getModel();

            // Add the data to the table model
            model.addRow(data);
            JOptionPane.showMessageDialog(this,"Event added!");

            idTextField.setText("");
            eventnameTextField.setText("");
            descTextField.setText("");
            organiserdetailsTextField.setText("");
            dateTextField.setText("");
            timeTextField.setText("");


        }
        
    }//GEN-LAST:event_addbuttonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
             DeleteEvent();
        DefaultTableModel model = (DefaultTableModel) eventTable.getModel();
                    if(eventTable.getSelectedRowCount()==1){
                        model.removeRow(eventTable.getSelectedRow());
                    JOptionPane.showMessageDialog(this,"Event Deleted");

                        
                    }else{
                    if(eventTable.getSelectedRowCount()==0){
                       JOptionPane.showMessageDialog(this,"Table is Empty");

                    }else{
                   JOptionPane.showMessageDialog(this,"Please Select Row to Delete");

                        
                        
                    }
                    }
                        
                   

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbuttonActionPerformed
UpdateEvent();             
    }//GEN-LAST:event_editbuttonActionPerformed

    private void timeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EventPlanning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventPlanning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventPlanning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventPlanning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventPlanning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JFormattedTextField dateTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel desc;
    private javax.swing.JTextField descTextField;
    private javax.swing.JLabel dest;
    private javax.swing.JButton editbutton;
    private javax.swing.JTable eventTable;
    private javax.swing.JLabel eventname;
    private javax.swing.JTextField eventnameTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel organiserdetails;
    private javax.swing.JTextField organiserdetailsTextField;
    private javax.swing.JPanel panel;
    private javax.swing.JFormattedTextField timeTextField;
    // End of variables declaration//GEN-END:variables
}
