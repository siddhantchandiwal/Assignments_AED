/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SupplierRole;

import business.Product;
import business.ProductCatalog;
import business.Supplier;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Siddhant
 */
public class ManageProductCatalogJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageProductCatalogJPanel
     */
    
    JPanel userProcessContainer;
    Supplier supplier;
   ManageProductCatalogJPanel(JPanel userProcessContainer, Supplier supplier) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.supplier=supplier;
        txtName.setText(supplier.getSupplierName());
        refreshTable();
        
    }
   
   public void refreshTable(){
        int rowCount = tblProductCatalog.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblProductCatalog.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        
        for(Product p: supplier.getProductCatalog().getProductCatalog()){
            Object row[]= new Object[3];
            row[0]=p;
            row[1]= p.getModelNumber();
            row[2]= p.getPrice();
            model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductCatalog = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnDeleteProduct = new javax.swing.JButton();
        btnViewProductDetail = new javax.swing.JButton();
        btnCreateNewProduct = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Product Catalog");

        txtName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtName.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Supplier:");

        tblProductCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product ID", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductCatalog);

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSearch.setText("Search >>");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDeleteProduct.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnDeleteProduct.setText("Delete Products>>");
        btnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductActionPerformed(evt);
            }
        });

        btnViewProductDetail.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnViewProductDetail.setText("View Product Details>>");
        btnViewProductDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProductDetailActionPerformed(evt);
            }
        });

        btnCreateNewProduct.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnCreateNewProduct.setText("Create New Product>>");
        btnCreateNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewProductActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.setText("<< Back");
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
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearch))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnDeleteProduct)
                                .addComponent(btnBack))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCreateNewProduct)
                                .addComponent(btnViewProductDetail)))))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteProduct)
                    .addComponent(btnViewProductDetail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateNewProduct)
                    .addComponent(btnBack))
                .addContainerGap(181, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewProductDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProductDetailActionPerformed
        // TODO add your handling code here:
        int row=tblProductCatalog.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(this, "Please select row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Product p = (Product)tblProductCatalog.getValueAt(row, 0);
        ViewProductDetailJpanel vpdjp = new ViewProductDetailJpanel(userProcessContainer, p);
        userProcessContainer.add("ViewProductDetailJpanel", vpdjp);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
         
    }//GEN-LAST:event_btnViewProductDetailActionPerformed

    private void btnCreateNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewProductActionPerformed
        // TODO add your handling code here:
         CreateNewProductJPanel cnpjp = new CreateNewProductJPanel(userProcessContainer, supplier);
        userProcessContainer.add("CreateNewProductJPanel", cnpjp);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateNewProductActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        SearchForProductJPanel sfpjp = new SearchForProductJPanel(userProcessContainer, supplier);
        userProcessContainer.add("SearchForProductJPanel", sfpjp);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout= (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductActionPerformed
        // TODO add your handling code here:
        int row=tblProductCatalog.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(this, "Please select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Product p=(Product)tblProductCatalog.getValueAt(row, 0);
        supplier.getProductCatalog().removeProduct(p);
        refreshTable();
    }//GEN-LAST:event_btnDeleteProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateNewProduct;
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewProductDetail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductCatalog;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}