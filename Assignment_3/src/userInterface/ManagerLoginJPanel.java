/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.CatalogDirectory;
import business.VendorDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Siddhant
 */
public class ManagerLoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagerLoginJPanel
     */
    private JPanel userProcessContainer;
    private CatalogDirectory catalogDirectory;
    private VendorDirectory vendorDirectory;

    ManagerLoginJPanel(JPanel userProcessContainer, CatalogDirectory catalogDirectory, VendorDirectory vendorDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.catalogDirectory = catalogDirectory;
        this.vendorDirectory = vendorDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnGo = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Hello Manager !!!");

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPassword.setText("Password:");

        btnGo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnGo.setText("Go >>");
        btnGo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(lblPassword)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(453, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblPassword, txtPassword});

    }// </editor-fold>//GEN-END:initComponents

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        // TODO add your handling code here:
        
        String password=new String(txtPassword.getPassword());
        
        if(password.equals("manager")){
        ManageVendorJPanel panel = new ManageVendorJPanel(userProcessContainer,catalogDirectory, vendorDirectory);
        userProcessContainer.add("ManageVendorJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        txtPassword.setText("");
        }else{
            JOptionPane.showMessageDialog(this, "Please enter Correct Password");
            txtPassword.setText("");
            return;
        }
               
    }//GEN-LAST:event_btnGoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}