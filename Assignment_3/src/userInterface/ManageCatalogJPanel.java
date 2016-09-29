/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import business.Catalog;
import business.CatalogDirectory;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Siddhant
 */
public class ManageCatalogJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCatalogJPanel
     */
    private JPanel userProcessContainer;
    private CatalogDirectory catalogDirectory;

    ManageCatalogJPanel(JPanel userProcessContainer, CatalogDirectory catalogDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.catalogDirectory = catalogDirectory;
        tblCatalog.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblCatalog.getModel();
        dtm.setRowCount(0);
        for (Catalog catalog : catalogDirectory.getCataloglist()) {
            Object[] row = new Object[3];
            row[0] = catalog;
            row[1] = catalog.getModelNumber();
            row[2] = catalog.getVendorName();
            dtm.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCatalog = new javax.swing.JTable();
        btnSearchByProductName = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();
        txtProductName = new javax.swing.JTextField();
        btnDeleteDetails = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        tblCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Model Number", "Vendor Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCatalog);

        btnSearchByProductName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSearchByProductName.setText("Search by Product Name:");
        btnSearchByProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByProductNameActionPerformed(evt);
            }
        });

        btnViewDetails.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnDeleteDetails.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnDeleteDetails.setText("Delete");
        btnDeleteDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDetailsActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnViewDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSearchByProductName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(36, 36, 36)
                            .addComponent(txtProductName)))
                    .addComponent(btnDeleteDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchByProductName)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnViewDetails)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteDetails)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSearchByProductName, txtProductName});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchByProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByProductNameActionPerformed
        // TODO add your handling code here:
        String ProductName = txtProductName.getText();
        if ((ProductName.isEmpty()) || (ProductName.startsWith(" "))) {
            JOptionPane.showMessageDialog(this, "Please enter Product Name", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Catalog catalog = catalogDirectory.searchCatalog(txtProductName.getText());
        if (catalog == null) {
            JOptionPane.showMessageDialog(this, "Account Number does not exist", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            ViewCatalogJPanel panel = new ViewCatalogJPanel(userProcessContainer, catalog);
            userProcessContainer.add("ViewAccountJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
    }//GEN-LAST:event_btnSearchByProductNameActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCatalog.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select any row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Catalog catalog = (Catalog) tblCatalog.getValueAt(selectedRow, 0);
            ViewCatalogJPanel panel = new ViewCatalogJPanel(userProcessContainer, catalog);
            userProcessContainer.add("ViewCatalogJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnDeleteDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCatalog.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogbutton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to delete selected Catalog", "Warning", dialogbutton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Catalog catalog = (Catalog) tblCatalog.getValueAt(selectedRow, 0);
                catalogDirectory.deleteCatalog(catalog);
                populateTable();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select any row", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnDeleteDetailsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteDetails;
    private javax.swing.JButton btnSearchByProductName;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCatalog;
    private javax.swing.JTextField txtProductName;
    // End of variables declaration//GEN-END:variables
}
