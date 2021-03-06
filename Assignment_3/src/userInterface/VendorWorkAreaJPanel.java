/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.Catalog;
import business.CatalogDirectory;
import business.VendorDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Siddhant
 */
public class VendorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CatalogDirectory catalogDirectory;
    private VendorDirectory vendorDirectory;
    String select;

    /**
     * Creates new form CatalogMngWorkAreaJPanel
     */
    public VendorWorkAreaJPanel(JPanel userProcessContainer, VendorDirectory vendorDirectory, CatalogDirectory catalogDirectory, String select) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.catalogDirectory = catalogDirectory;
        this.vendorDirectory = vendorDirectory;
        this.select = select;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateCatalog = new javax.swing.JButton();
        btnManageCatalog = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        btnCreateCatalog.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnCreateCatalog.setText("Create Catalog");
        btnCreateCatalog.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCreateCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCatalogActionPerformed(evt);
            }
        });

        btnManageCatalog.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnManageCatalog.setText("Manage Catalog");
        btnManageCatalog.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnManageCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCatalogActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.setText("< Back");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnManageCatalog, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(btnCreateCatalog, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(554, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBack, btnCreateCatalog, btnManageCatalog});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btnCreateCatalog)
                .addGap(50, 50, 50)
                .addComponent(btnManageCatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(263, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, btnCreateCatalog, btnManageCatalog});

    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCatalogActionPerformed
        // TODO add your handling code here:
        CreateCatalogJPanel panel = new CreateCatalogJPanel(userProcessContainer, catalogDirectory, select);
        userProcessContainer.add("CreateCatalogJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateCatalogActionPerformed

    private void btnManageCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCatalogActionPerformed
        // TODO add your handling code here:
        VendorCatalogJPanel panel = new VendorCatalogJPanel(userProcessContainer, catalogDirectory, select);
        userProcessContainer.add("SupplierCatalogJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCatalogActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateCatalog;
    private javax.swing.JButton btnManageCatalog;
    // End of variables declaration//GEN-END:variables
}
