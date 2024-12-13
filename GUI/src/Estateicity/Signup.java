/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estateicity;
import java.sql.*;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jagan
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Register_Page
     */
    private static final String username= "root";
    private static final String password= "kannan@mysqlroot";
    private static final String dataConn= "jdbc:mysql://localhost:3306/estate-icity";
        
    Connection sqlConn= null;
    PreparedStatement pst= null;    
    ResultSet rs= null;
    int q, i, id, deleteItem;
    
    public Signup() {
        initComponents();
    }
//=================================================================================
   
    
    public void updateDB()
    {
     try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         sqlConn = DriverManager.getConnection(dataConn, username, password);
         pst = sqlConn.prepareStatement("select * from profile");
         
         rs= pst.executeQuery();
         ResultSetMetaData stData = rs.getMetaData();
         
         q= stData.getColumnCount();
                  
         DefaultTableModel RecordTable = (DefaultTableModel)signuptable.getModel();
         RecordTable.setRowCount(0);
                 
         while(rs.next()){
             Vector columnData = new Vector();
             
             for(i=1;i<=q;i++){
                 columnData.add(rs.getString("Username"));
                 columnData.add(rs.getString("Password"));
                 columnData.add(rs.getString("Email"));
             }
             RecordTable.addRow(columnData);
         }
     }
     catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
     }
     }
 
//=================================================================================    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Register_Head = new javax.swing.JLabel();
        signupback = new javax.swing.JButton();
        signupsignup = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        signuptable = new javax.swing.JTable();
        signupusername = new javax.swing.JLabel();
        signuppwd = new javax.swing.JLabel();
        signupmail = new javax.swing.JLabel();
        usernamefield = new javax.swing.JTextField();
        emailfield = new javax.swing.JTextField();
        pwdfield = new javax.swing.JPasswordField();
        signuplogin = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Register_Head.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        Register_Head.setText("     Sign-up Page");

        signupback.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        signupback.setText("Back");
        signupback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbackActionPerformed(evt);
            }
        });

        signupsignup.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        signupsignup.setText("Sign-up");
        signupsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupsignupActionPerformed(evt);
            }
        });

        signuptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password", "Email"
            }
        ));
        jScrollPane2.setViewportView(signuptable);

        signupusername.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        signupusername.setText("Username:");

        signuppwd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        signuppwd.setText("Password:");

        signupmail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        signupmail.setText("E-mail:");

        pwdfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdfieldActionPerformed(evt);
            }
        });

        signuplogin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        signuplogin.setText("Login");
        signuplogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signuploginActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Register_Head)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(signupback, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(signuplogin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                            .addComponent(signupsignup))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(signupusername, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(signuppwd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(signupmail, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(130, 130, 130)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usernamefield)
                                .addComponent(emailfield, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                .addComponent(pwdfield)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Register_Head)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupusername))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signuppwd)
                    .addComponent(pwdfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signupmail)
                    .addComponent(emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signupback, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signuplogin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
         
    private void signupbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbackActionPerformed
        // TODO add your handling code here:
        Welcome hframe= new Welcome();
        hframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signupbackActionPerformed

    private void signupsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupsignupActionPerformed
        // TODO add your handling code here:
        try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         sqlConn = DriverManager.getConnection(dataConn, username, password);
         pst = sqlConn.prepareStatement("insert into profile(Username,"
                 + " Password, Email) values(?,?,?)");
         
         pst.setString(1, usernamefield.getText());
         pst.setString(2, pwdfield.getText());
         pst.setString(3, emailfield.getText());
         
         pst.executeUpdate();
         JOptionPane.showMessageDialog(this, "Signed Up!");
         updateDB();
        }
        catch(ClassNotFoundException e){
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE,
                    null,e);
            JOptionPane.showMessageDialog(this, "Unsucessful! Please try another username or password.");
        } catch(SQLException e){
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE,
                    null,e);
            JOptionPane.showMessageDialog(this, "Unsucessful! Please try another username or password.");
        }
        
        Lands hframe= new Lands();
        hframe.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_signupsignupActionPerformed

    private void pwdfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdfieldActionPerformed

    private void signuploginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signuploginActionPerformed
        // TODO add your handling code here:
        Login hframe= new Login();
        hframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signuploginActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Register_Head;
    private javax.swing.JTextField emailfield;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPasswordField pwdfield;
    private javax.swing.JButton signupback;
    private javax.swing.JButton signuplogin;
    private javax.swing.JLabel signupmail;
    private javax.swing.JLabel signuppwd;
    private javax.swing.JButton signupsignup;
    private javax.swing.JTable signuptable;
    private javax.swing.JLabel signupusername;
    private javax.swing.JTextField usernamefield;
    // End of variables declaration//GEN-END:variables
}