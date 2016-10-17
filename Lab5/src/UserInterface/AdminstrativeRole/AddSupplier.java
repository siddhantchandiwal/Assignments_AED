package UserInterface.AdminstrativeRole;

import Business.Supplier;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class AddSupplier extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    
    public AddSupplier(JPanel upc, SupplierDirectory sd) {
        initComponents();
        userProcessContainer = upc;
        supplierDirectory = sd;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setText("Name");

        jLabel5.setText("NEW SUPPLIER");

        btnAdd.setText("ADD SUPPLIER");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBack.setText("<<BACK");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel5)))
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(199, 199, 199)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String sname=txtName.getText();
         if ((sname.isEmpty()) || (sname.startsWith(" "))) {
            JOptionPane.showMessageDialog(this, "Please fill Supplier Name first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
         
          /*if (!(Pattern.matches("^[a-zA-Z]+$", txtName.getText().trim()))) {
            JOptionPane.showMessageDialog(this, "Please enter only alphabets", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }*/
        Supplier supplier = supplierDirectory.addSupplier();
        supplier.setSupplyName(txtName.getText());
        JOptionPane.showMessageDialog(null, "Supplier added successfully!!", "Info", JOptionPane.INFORMATION_MESSAGE);
        
        
        
        ManageSuppliers ms = new ManageSuppliers(userProcessContainer, supplierDirectory);
        userProcessContainer.add("ManageSupplierAdministrative", ms);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void backAction(){
        userProcessContainer.remove(this);
        Component [] componentArray = userProcessContainer.getComponents();
        Component c = componentArray[componentArray.length-1];
        ManageSuppliers ms = (ManageSuppliers) c;
        ms.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

}
