/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;
import business.Catalog;
import business.CatalogDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Siddhant
 */
public class CatalogMngWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private CatalogDirectory catalogDirectory;
    
       /**
     * Creates new form CatalogMngWorkAreaJPanel
     */
    CatalogMngWorkAreaJPanel(JPanel userProcessContainer, CatalogDirectory catalogDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.catalogDirectory = catalogDirectory;
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageCatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateCatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(671, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreateCatalog, btnManageCatalog});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btnCreateCatalog)
                .addGap(55, 55, 55)
                .addComponent(btnManageCatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreateCatalog, btnManageCatalog});

    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCatalogActionPerformed
        // TODO add your handling code here:
        CreateCatalogJPanel panel = new CreateCatalogJPanel(userProcessContainer, catalogDirectory);
        userProcessContainer.add("CreateCatalogJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateCatalogActionPerformed

    private void btnManageCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCatalogActionPerformed
        // TODO add your handling code here:
        ManageCatalogJPanel panel = new ManageCatalogJPanel(userProcessContainer, catalogDirectory);
        userProcessContainer.add("ManageCatalogJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCatalogActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCatalog;
    private javax.swing.JButton btnManageCatalog;
    // End of variables declaration//GEN-END:variables
}
