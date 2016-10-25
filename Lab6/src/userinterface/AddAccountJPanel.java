/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.Business;
import Business.Person;
import Business.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Siddhant
 */
public class AddAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddAccountJPanel
     */
    private JPanel upc;
    private Business business;

    public AddAccountJPanel(JPanel upc, Business business) {
        initComponents();
        this.upc = upc;
        this.business =business;
        populateperson();
        populateRole();

    }

    public void populateperson() {
        personjComboBox.removeAllItems();
        for (Person p : business.getEmployeeDirectory().getEmployeelist()) {
            personjComboBox.addItem(p);

        }

    }

    public void populateRole() {
        RolejComboBox.removeAllItems();
        RolejComboBox.addItem(UserAccount.EMPLOYEE_ROLE);

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
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rbtnActive = new javax.swing.JRadioButton();
        rbtnNotActive = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        personjComboBox = new javax.swing.JComboBox();
        RolejComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("UserName:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Password:");

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Active:");

        rbtnActive.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rbtnActive.setText("Yes");
        rbtnActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnActiveActionPerformed(evt);
            }
        });

        rbtnNotActive.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rbtnNotActive.setText("No");
        rbtnNotActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNotActiveActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Add New User Account");

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Person:");

        personjComboBox.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        personjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        personjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personjComboBoxActionPerformed(evt);
            }
        });

        RolejComboBox.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        RolejComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Role:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(123, 123, 123)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtnActive)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbtnNotActive))
                                    .addComponent(txtPassword)
                                    .addComponent(personjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RolejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(btnAdd)))))))
                .addContainerGap(465, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPassword, txtUserName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addComponent(jLabel4))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbtnActive)
                    .addComponent(rbtnNotActive))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RolejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addComponent(btnAdd)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, txtPassword, txtUserName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, rbtnActive});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel5, personjComboBox});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {RolejComboBox, jLabel6});

    }// </editor-fold>//GEN-END:initComponents

    private void personjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personjComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personjComboBoxActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String uname = txtUserName.getText().trim();
        String password = txtPassword.getText().trim();

        if (uname.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter all the fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        UserAccount e = business.getUserAccountDirectory().addUserAccount();
        e.setUserName(uname);
        e.setPassword(password);
        e.setPerson((Person) personjComboBox.getSelectedItem());
        e.setRole((String.valueOf(RolejComboBox.getSelectedItem())));

        if (rbtnActive.isSelected()) {
            e.setIsactive(true);
        } else {
            e.setIsactive(false);
        }

        JOptionPane.showMessageDialog(null, "Employee has been Added scuessfully");

        txtUserName.setText("");
        txtPassword.setText("");


    }//GEN-LAST:event_btnAddActionPerformed

    private void rbtnNotActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNotActiveActionPerformed
        // TODO add your handling code here:
        if (rbtnNotActive.isSelected()) {
            rbtnActive.setSelected(false);
        }


    }//GEN-LAST:event_rbtnNotActiveActionPerformed

    private void rbtnActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnActiveActionPerformed
        // TODO add your handling code here:
        if (rbtnActive.isSelected()) {
            rbtnNotActive.setSelected(false);
        }

    }//GEN-LAST:event_rbtnActiveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         upc.remove(this);
        Component[] componentArray = upc.getComponents();
        Component com = componentArray[componentArray.length - 1];
        ManageUserAccountJPanel m = (ManageUserAccountJPanel) com;
        m.refereshtable();
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);
        
        
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox RolejComboBox;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox personjComboBox;
    private javax.swing.JRadioButton rbtnActive;
    private javax.swing.JRadioButton rbtnNotActive;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
