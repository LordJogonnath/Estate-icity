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
import java.net.URL;
import java.awt.Desktop;

/**
 *
 * @author jagan
 */
public class Lands extends javax.swing.JFrame {

    /**
     * Creates new form Lands
     */
    private static final String username= "root";
    private static final String password= "kannan@mysqlroot";
    private static final String dataConn= "jdbc:mysql://localhost:3306/estate-icity";
        
    Connection sqlConn= null;
    PreparedStatement pst= null;    
    ResultSet rs= null;
    int q, i, id, deleteItem;
    
    public Lands() {
        initComponents();
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Profile_Head = new javax.swing.JLabel();
        profileback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        chenngo = new javax.swing.JButton();
        indogo = new javax.swing.JButton();
        manago = new javax.swing.JButton();
        kolkgo = new javax.swing.JButton();
        delgo = new javax.swing.JButton();
        mumbgo = new javax.swing.JButton();
        profileexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Profile_Head.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        Profile_Head.setText("Welcome!");

        profileback.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        profileback.setText("Back");
        profileback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilebackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Chennai:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Indore:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Manali:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Kolkata:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("New Delhi:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Mumbai:");

        chenngo.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        chenngo.setText("Go!");
        chenngo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chenngoActionPerformed(evt);
            }
        });

        indogo.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        indogo.setText("Go!");
        indogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indogoActionPerformed(evt);
            }
        });

        manago.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        manago.setText("Go!");
        manago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managoActionPerformed(evt);
            }
        });

        kolkgo.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        kolkgo.setText("Go!");
        kolkgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolkgoActionPerformed(evt);
            }
        });

        delgo.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        delgo.setText("Go!");
        delgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delgoActionPerformed(evt);
            }
        });

        mumbgo.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        mumbgo.setText("Go!");
        mumbgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mumbgoActionPerformed(evt);
            }
        });

        profileexit.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        profileexit.setText("Exit");
        profileexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(Profile_Head)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(profileexit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(profileback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delgo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mumbgo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chenngo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(indogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kolkgo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Profile_Head)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(chenngo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(indogo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kolkgo)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manago)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mumbgo)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delgo)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profileback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(profileexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private JFrame frame;
    private void profilebackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilebackActionPerformed
        // TODO add your handling code here:
        Login hframe= new Login();
        hframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profilebackActionPerformed

    private void chenngoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chenngoActionPerformed
        // TODO add your handling code here:
        String url="https://www.magicbricks.com/owner-property-for-sale-in-chennai-pppfs";
        try{
            Desktop.getDesktop().browse(new URL(url).toURI());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"URL connection failed.");
        }
    }//GEN-LAST:event_chenngoActionPerformed

    private void indogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indogoActionPerformed
        // TODO add your handling code here:
        String url="https://www.magicbricks.com/owner-property-for-sale-in-indore-pppfs";
        try{
            Desktop.getDesktop().browse(new URL(url).toURI());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"URL connection failed.");
        }
    }//GEN-LAST:event_indogoActionPerformed

    private void kolkgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolkgoActionPerformed
        // TODO add your handling code here:
        String url="https://www.magicbricks.com/owner-property-for-sale-in-kolkata-pppfs";
        try{
            Desktop.getDesktop().browse(new URL(url).toURI());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"URL connection failed.");
        }
    }//GEN-LAST:event_kolkgoActionPerformed

    private void managoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managoActionPerformed
        // TODO add your handling code here:
        String url="https://www.magicbricks.com/owner-property-for-sale-in-manali-pppfs";
        try{
            Desktop.getDesktop().browse(new URL(url).toURI());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"URL connection failed.");
        }
    }//GEN-LAST:event_managoActionPerformed

    private void mumbgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mumbgoActionPerformed
        // TODO add your handling code here:
        String url="https://www.magicbricks.com/owner-property-for-sale-in-mumbai-pppfs";
        try{
            Desktop.getDesktop().browse(new URL(url).toURI());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"URL connection failed.");
        }
    }//GEN-LAST:event_mumbgoActionPerformed

    private void delgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delgoActionPerformed
        // TODO add your handling code here:
        String url="https://www.magicbricks.com/owner-property-for-sale-in-new-delhi-pppfs";
        try{
            Desktop.getDesktop().browse(new URL(url).toURI());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"URL connection failed.");
        }
    }//GEN-LAST:event_delgoActionPerformed

    private void profileexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileexitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Exit?","Land-Grabber 2000 says",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(this, "Thankyou for using Estate-icity!");
            System.exit(0);
           
        }
    }//GEN-LAST:event_profileexitActionPerformed

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
            java.util.logging.Logger.getLogger(Lands.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lands.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lands.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lands.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lands().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Profile_Head;
    private javax.swing.JButton chenngo;
    private javax.swing.JButton delgo;
    private javax.swing.JButton indogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton kolkgo;
    private javax.swing.JButton manago;
    private javax.swing.JButton mumbgo;
    private javax.swing.JButton profileback;
    private javax.swing.JButton profileexit;
    // End of variables declaration//GEN-END:variables
}
