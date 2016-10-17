/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.OrderItem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Zerel
 */
public class ViewOrderItemDetailJPanel extends javax.swing.JPanel {

    
    /**
     * Creates new form ViewOrderItemDetailJPanel
     */
   private JPanel userProcessContainer;
   OrderItem oi;

    ViewOrderItemDetailJPanel(JPanel userProcessContainer, OrderItem oi) {
        
        
        
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.oi=oi;
        txtProductName.setText(oi.getProduct().getProdName());
        txtProductId.setText(String.valueOf(oi.getProduct().getModelNumber()));
        txtPaidPrice.setText(String.valueOf(oi.getSalesPrice()));
        txtQuantity.setText(String.valueOf(oi.getQuantity()));
        txtSalesPrice.setText(String.valueOf(oi.getProduct().getPrice()));
        
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
        jLabel2 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        backButton1 = new javax.swing.JButton();
        txtProductId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSalesPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPaidPrice = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Order Item Detail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 66, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Product Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 131, -1, 30));

        txtProductName.setEditable(false);
        txtProductName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProductName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 131, 159, -1));

        backButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton1.setText("<< BACK");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 367, -1, -1));

        txtProductId.setEditable(false);
        txtProductId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProductId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 179, 159, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Product ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 179, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Price:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 227, -1, -1));

        txtSalesPrice.setEditable(false);
        add(txtSalesPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 227, 160, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Quantity:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 267, -1, -1));

        txtQuantity.setEditable(false);
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 267, 160, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Paid Price:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 307, -1, -1));

        txtPaidPrice.setEditable(false);
        add(txtPaidPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 307, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
      userProcessContainer.remove(this);
CardLayout layout=(CardLayout) userProcessContainer.getLayout();
layout.previous(userProcessContainer);  
    }//GEN-LAST:event_backButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtPaidPrice;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSalesPrice;
    // End of variables declaration//GEN-END:variables
}
