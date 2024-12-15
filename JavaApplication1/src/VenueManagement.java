import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VenueManagement extends javax.swing.JFrame {

    
    public VenueManagement() {
        initComponents();
    }  
   Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String db_driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/event_management?useSSL=false"; 
    private void AddVenue(){
        try {
              Class.forName(db_driver);
            con = DriverManager.getConnection(url, "root", "mahode0303");
            ps = con.prepareStatement("INSERT INTO venue_management(Venue_id, Name, Address, Capacity, Availability) VALUES(?,?,?,?,?)"); 
            ps.setString(1, idTextField.getText()); 
            ps.setString(2, venuenameTextField.getText()); 
            ps.setString(3, addressTextField.getText()); 
            ps.setString(4, capacityTextField.getText()); 
            ps.setString(5, availabilityTextField.getText()); 
            ps.executeUpdate(); 

            JOptionPane.showMessageDialog(this, "Successfully Saved"); 

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VenueManagement.class.getName()).log(Level.SEVERE, null, ex);
   
        }
      
    }
    private void DeleteVenue(){
        try {
              Class.forName(db_driver);
             con = DriverManager.getConnection(url, "root", "mahode0303");
                  ps = con.prepareStatement("DELETE FROM venue_management where Venue_id=?"); 
            ps.setString(1, idTextField.getText());
            ps.executeUpdate(); 
 
            JOptionPane.showMessageDialog(this, "Successfully Deleted :)"); 

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VenueManagement.class.getName()).log(Level.SEVERE, null, ex);
   
        } 
    }
         private void UpdateVenue() {
  try {
    Class.forName(db_driver);
    con = DriverManager.getConnection(url, "root", "mahode0303");
    ps = con.prepareStatement("UPDATE venue_management SET Name=?, Address=?, Capacity=?, Availability=? WHERE Venue_id=?");
    ps.setString(1, venuenameTextField.getText()); 
    ps.setString(2, addressTextField.getText()); 
    ps.setString(3, capacityTextField.getText()); 
    ps.setString(4, availabilityTextField.getText());
    ps.setString(5, idTextField.getText()); 
    ps.executeUpdate(); 
    JOptionPane.showMessageDialog(this, "Successfully Updated "); 
  } catch (ClassNotFoundException | SQLException ex) {
    Logger.getLogger(VenueManagement.class.getName()).log(Level.SEVERE, null, ex);  
  }
  
}


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        venueTable = new javax.swing.JTable();
        panel = new javax.swing.JPanel();
        lname = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        venuenameTextField = new javax.swing.JTextField();
        capacityTextField = new javax.swing.JTextField();
        addbutton = new javax.swing.JButton();
        editbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        fname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        availabilityTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        idTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        venueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Venue ID", "Venue Name", "Address", "Capacity", "Availability"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(venueTable);

        panel.setBackground(new java.awt.Color(102, 102, 102));

        lname.setForeground(new java.awt.Color(255, 255, 255));
        lname.setText("Availability");

        phone.setForeground(new java.awt.Color(255, 255, 255));
        phone.setText("Address");

        venuenameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venuenameTextFieldActionPerformed(evt);
            }
        });

        addbutton.setText("Add");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        editbutton.setText("Edit");
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

        fname.setForeground(new java.awt.Color(255, 255, 255));
        fname.setText("Venue ID");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Capacity");

        addressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextFieldActionPerformed(evt);
            }
        });

        jButton1.setText("Back to Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Venue Name");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lname)
                    .addComponent(jLabel2)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fname)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(editbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(deleteButton)
                        .addGap(56, 56, 56)
                        .addComponent(jButton1)
                        .addGap(33, 33, 33))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(capacityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availabilityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(venuenameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(venuenameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(availabilityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbutton)
                    .addComponent(editbutton)
                    .addComponent(deleteButton)
                    .addComponent(jButton1))
                .addGap(69, 69, 69))
        );

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 3, 18)); // NOI18N
        jLabel3.setText("Venue Management");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextFieldActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
           DeleteVenue();
        DefaultTableModel model = (DefaultTableModel) venueTable.getModel();
                    if(venueTable.getSelectedRowCount()==1){
                        model.removeRow(venueTable.getSelectedRow());
                    JOptionPane.showMessageDialog(this,"Venue Deatails Deleted");
                        
                    }else{
                    if(venueTable.getSelectedRowCount()==0){
                       JOptionPane.showMessageDialog(this,"Table is Empty");

                    }else{
                   JOptionPane.showMessageDialog(this,"Please Select Row to Delete");   
                    }
                    }
                            
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbuttonActionPerformed
        // TODO add your handling code here:
       UpdateVenue();
    }//GEN-LAST:event_editbuttonActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
             AddVenue();
        if(idTextField.getText().equals("")|| venuenameTextField.getText().equals("")||addressTextField.getText().equals("")||capacityTextField.getText().equals("")||capacityTextField.getText().equals("")||availabilityTextField.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter All Details!");

        } else {
            // Create an array to hold the data
            String data[] = {idTextField.getText(), venuenameTextField.getText(), addressTextField.getText(), capacityTextField.getText(), availabilityTextField.getText()};

            // Get the table model
            DefaultTableModel model = (DefaultTableModel) venueTable.getModel();

            // Add the data to the table model
            model.addRow(data);
            JOptionPane.showMessageDialog(this,"Passenger Details added!");
            idTextField.setText("");
            venuenameTextField.setText("");
            addressTextField.setText("");
            capacityTextField.setText("");
            availabilityTextField.setText("");

        }
    }//GEN-LAST:event_addbuttonActionPerformed

    private void venuenameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venuenameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_venuenameTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(VenueManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VenueManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VenueManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VenueManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VenueManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JTextField availabilityTextField;
    private javax.swing.JTextField capacityTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editbutton;
    private javax.swing.JLabel fname;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lname;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel phone;
    private javax.swing.JTable venueTable;
    private javax.swing.JTextField venuenameTextField;
    // End of variables declaration//GEN-END:variables
}
