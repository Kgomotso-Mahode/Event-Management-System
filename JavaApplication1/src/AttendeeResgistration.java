import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class AttendeeResgistration extends javax.swing.JFrame {

   
    public AttendeeResgistration() {
        initComponents();
    }
        Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String db_driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/event_management?useSSL=false"; 
    
     private void AddAttendee(){
           
        try {
              Class.forName(db_driver);
             con = DriverManager.getConnection(url, "root", "mahode0303");
                  ps = con.prepareStatement("INSERT INTO attendee_registration(Attendee_id, FullName, Email, Phone, Event_Selection) VALUES(?,?,?,?,?)"); 
            ps.setString(1, idTextField.getText()); 
            ps.setString(2, fullnameTextField.getText()); 
            ps.setString(3, emailTextField.getText()); 
            ps.setString(4, phoneTextField.getText()); 
            ps.setString(5, eventselectionTextField.getText()); 
            ps.executeUpdate(); 

            JOptionPane.showMessageDialog(this, "Successfully Saved"); 

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AttendeeResgistration.class.getName()).log(Level.SEVERE, null, ex);
   
        }
     }
          private void DeleteAttendee(){
        try {
              Class.forName(db_driver);
            con = DriverManager.getConnection(url, "root", "mahode0303");
            ps = con.prepareStatement("DELETE FROM attendee_registration where Attendee_id=?"); 
            ps.setString(1, idTextField.getText()); 
            ps.executeUpdate(); 

            JOptionPane.showMessageDialog(this, "Successfully Deleted "); 

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AttendeeResgistration.class.getName()).log(Level.SEVERE, null, ex);
   
        } 
    }
      private void UpdateAttendee() {
  try {
    Class.forName(db_driver);
    con = DriverManager.getConnection(url, "root", "mahode0303");
    ps = con.prepareStatement("UPDATE attendee_registration SET FullName=?, Email=?, Phone=?, Event_Selection=? WHERE Attendee_id=?");
    ps.setString(1, fullnameTextField.getText()); 
    ps.setString(2, emailTextField.getText()); 
    ps.setString(3, phoneTextField.getText()); 
    ps.setString(4, eventselectionTextField.getText()); 
    ps.setString(5, idTextField.getText()); 
    ps.executeUpdate(); 
    JOptionPane.showMessageDialog(this, "Successfully Updated "); 
  } catch (ClassNotFoundException | SQLException ex) {
    Logger.getLogger(AttendeeResgistration.class.getName()).log(Level.SEVERE, null, ex);  
  }
}

      
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        attendeeTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        email = new javax.swing.JLabel();
        fullnameTextField = new javax.swing.JTextField();
        addbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fullname = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        eventselection = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        eventselectionTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        phoneTextField = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(0, 0, 0));

        attendeeTable.setBackground(new java.awt.Color(102, 102, 102));
        attendeeTable.setForeground(new java.awt.Color(255, 255, 255));
        attendeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Attendee ID", "Full Name", "Email", "Phone", "Event Selection"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Short.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(attendeeTable);

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 3, 18)); // NOI18N
        jLabel3.setText("Attendee Registration");

        panel.setBackground(new java.awt.Color(102, 102, 102));

        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Email");

        fullnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameTextFieldActionPerformed(evt);
            }
        });

        addbutton.setText("Add");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        fullname.setForeground(new java.awt.Color(255, 255, 255));
        fullname.setText("Attendee Full Name");

        phone.setForeground(new java.awt.Color(255, 255, 255));
        phone.setText("Contact Number");

        eventselection.setForeground(new java.awt.Color(255, 255, 255));
        eventselection.setText("Event Selection");

        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setText("Attendee ID");

        jButton1.setText("Back to Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap(75, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fullname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eventselection, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(27, 27, 27))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(addbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phoneTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(eventselectionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(fullnameTextField)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteButton)
                        .addGap(46, 46, 46)
                        .addComponent(jButton1)
                        .addGap(25, 25, 25))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(eventselection)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel1))
                    .addComponent(eventselectionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(deleteButton)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addbutton)
                            .addComponent(updateButton))))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 122, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fullnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameTextFieldActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed

            AddAttendee();

        if(fullnameTextField.getText().equals("")||idTextField.getText().equals("")||fullnameTextField.getText().equals("")||emailTextField.getText().equals("")||phoneTextField.getText().equals("")||eventselectionTextField.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter All Details!");

        } else {
            String data[] = {idTextField.getText(), fullnameTextField.getText(), emailTextField.getText(), phoneTextField.getText(), eventselectionTextField.getText()};
            DefaultTableModel model = (DefaultTableModel) attendeeTable.getModel();

            model.addRow(data);
            JOptionPane.showMessageDialog(this,"Attendee Registered!");

            idTextField.setText("");
            fullnameTextField.setText("");
            emailTextField.setText("");
            phoneTextField.setText("");
            eventselectionTextField.setText("");

        }
  
    }//GEN-LAST:event_addbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          MainMenu mm = new MainMenu();
        mm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
                DeleteAttendee();      // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
      UpdateAttendee();  // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AttendeeResgistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttendeeResgistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttendeeResgistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttendeeResgistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendeeResgistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JTable attendeeTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel email;
    private javax.swing.JFormattedTextField emailTextField;
    private javax.swing.JLabel eventselection;
    private javax.swing.JTextField eventselectionTextField;
    private javax.swing.JLabel fullname;
    private javax.swing.JTextField fullnameTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel phone;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
