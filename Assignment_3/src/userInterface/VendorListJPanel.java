/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.Catalog;
import business.CatalogDirectory;
import business.Vendor;
import business.VendorDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Siddhant
 */
public class VendorListJPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form VendorListJPanel
     */
    
    private JPanel userProcessContainer;
    private CatalogDirectory catalogDirectory;
    private VendorDirectory vendorDirectory;
    
    VendorListJPanel(JPanel userProcessContainer, VendorDirectory vendorDirectory, CatalogDirectory catalogDirectory) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.vendorDirectory= vendorDirectory;
        this.catalogDirectory=catalogDirectory;
        populateComboBox();
        
    }
    
   public void populateComboBox() {
       
          for (Vendor vendor : vendorDirectory.getVendorlist()) {
            VendorComboBox.addItem(vendor.getVendorName());
        }  
   }

        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGo = new javax.swing.JButton();
        VendorComboBox = new javax.swing.JComboBox<>();
        lblSelectVendorName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        btnGo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnGo.setText("Go >>");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        VendorComboBox.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        VendorComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSelectVendorName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblSelectVendorName.setText("Vendor Name:");

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSelectVendorName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(VendorComboBox, 0, 146, Short.MAX_VALUE)
                    .addComponent(btnGo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(462, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VendorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelectVendorName))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGo)
                    .addComponent(btnBack))
                .addContainerGap(368, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, btnGo});

    }// </editor-fold>//GEN-END:initComponents

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        // TODO add your handling code here:
        String select = null;
        try{
            select=VendorComboBox.getSelectedItem().toString();
        }catch(Exception e){
           // e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Please select Vendor Name", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
            VendorWorkAreaJPanel panel = new VendorWorkAreaJPanel(userProcessContainer, vendorDirectory, catalogDirectory, select);
            userProcessContainer.add("CatalogMngWorkAreaJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_btnGoActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> VendorComboBox;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGo;
    private javax.swing.JLabel lblSelectVendorName;
    // End of variables declaration//GEN-END:variables
}