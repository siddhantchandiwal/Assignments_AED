/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Resume;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author Siddhant
 */
public class CreateResumeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    private Resume resume;
    public CreateResumeJPanel(Resume resume) {                  //Parameterised Constructor
        initComponents();
      //  if(!checkbox1.getState())                               
        //{ 
         submitBtn.setVisible(false);                           //Setting "Submit" button not visible 
       // }
        this.resume=resume;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        contactNoTextField = new javax.swing.JTextField();
        emailIdTextField = new javax.swing.JTextField();
        streetLine1TextField = new javax.swing.JTextField();
        streetLine2TextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        zipCodeTextField = new javax.swing.JTextField();
        affiliationsTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        degreeName1TextField = new javax.swing.JTextField();
        degreeDate1TextField = new javax.swing.JTextField();
        gpa1TextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        degreeName2TextField = new javax.swing.JTextField();
        degreeDate2TextField = new javax.swing.JTextField();
        gpa2TextField = new javax.swing.JTextField();
        gpa3TextField = new javax.swing.JTextField();
        degreeDate3textField = new javax.swing.JTextField();
        degreeName3TextField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        careerObjectiveTextField = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        programmingLangTextField = new javax.swing.JTextArea();
        checkbox1 = new java.awt.Checkbox();
        submitBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        picBrowseBtn = new javax.swing.JButton();
        picPathTextField = new javax.swing.JTextField();
        picLabel = new javax.swing.JLabel();
        countryTextField = new javax.swing.JComboBox<>();
        workExperienceTextField = new javax.swing.JComboBox<>();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Create a Resume");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 24, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("First Name:");
        jLabel2.setPreferredSize(new java.awt.Dimension(143, 22));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 89, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Last Name:");
        jLabel3.setPreferredSize(new java.awt.Dimension(143, 22));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 129, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Contact No:");
        jLabel4.setPreferredSize(new java.awt.Dimension(143, 22));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 169, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Email id:");
        jLabel5.setPreferredSize(new java.awt.Dimension(143, 22));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 209, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Address");
        jLabel6.setPreferredSize(new java.awt.Dimension(143, 22));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 249, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Street Line 1:");
        jLabel7.setPreferredSize(new java.awt.Dimension(143, 22));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 289, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Street Line 2:");
        jLabel8.setPreferredSize(new java.awt.Dimension(143, 22));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 329, -1, -1));

        firstNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(firstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 85, 312, -1));

        lastNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(lastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 125, 312, -1));

        contactNoTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(contactNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 165, 312, -1));

        emailIdTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(emailIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 205, 312, -1));

        streetLine1TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(streetLine1TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 285, 312, -1));

        streetLine2TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(streetLine2TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 325, 312, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("City:");
        jLabel9.setPreferredSize(new java.awt.Dimension(143, 22));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 369, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Zip Code:");
        jLabel10.setPreferredSize(new java.awt.Dimension(143, 22));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 409, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Country:");
        jLabel11.setPreferredSize(new java.awt.Dimension(143, 22));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 449, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Affiliations:");
        jLabel12.setPreferredSize(new java.awt.Dimension(143, 22));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 489, -1, -1));

        cityTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(cityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 369, 312, -1));

        zipCodeTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(zipCodeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 312, -1));

        affiliationsTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(affiliationsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 489, 312, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Career Objectives:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Education Qualifications");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 661, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Name");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 701, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Date");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 701, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("GPA");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 701, -1, -1));

        degreeName1TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        degreeName1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreeName1TextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(degreeName1TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 703, 187, -1));

        degreeDate1TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(degreeDate1TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 703, 242, -1));

        gpa1TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gpa1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpa1TextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(gpa1TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 703, 45, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Name");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 743, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Date");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 743, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("GPA");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 743, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Name");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 785, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Date");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 785, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("GPA");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 785, -1, -1));

        degreeName2TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(degreeName2TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 745, 187, -1));

        degreeDate2TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(degreeDate2TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 745, 242, -1));

        gpa2TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(gpa2TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 745, 45, -1));

        gpa3TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(gpa3TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 787, 45, -1));

        degreeDate3textField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(degreeDate3textField, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 787, 242, -1));

        degreeName3TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(degreeName3TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 787, 187, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Work Experience:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 827, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("Languages Known:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 940, -1, -1));

        careerObjectiveTextField.setColumns(20);
        careerObjectiveTextField.setLineWrap(true);
        careerObjectiveTextField.setRows(5);
        careerObjectiveTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(careerObjectiveTextField);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 529, 312, -1));

        programmingLangTextField.setColumns(20);
        programmingLangTextField.setLineWrap(true);
        programmingLangTextField.setRows(5);
        programmingLangTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(programmingLangTextField);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 870, 309, -1));

        checkbox1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        checkbox1.setLabel("All the above information is true and correct to the best of my knowledge");
        checkbox1.setName(""); // NOI18N
        checkbox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkbox1ItemStateChanged(evt);
            }
        });
        jPanel1.add(checkbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 1019, -1, -1));

        submitBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 1088, -1, -1));

        resetBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        jPanel1.add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 1088, -1, -1));

        picBrowseBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        picBrowseBtn.setText("Browse Image");
        picBrowseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picBrowseBtnActionPerformed(evt);
            }
        });
        jPanel1.add(picBrowseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, -1, -1));

        picPathTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(picPathTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, 238, -1));

        picLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        picLabel.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel1.add(picLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 148, 176));

        countryTextField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USA", "India", "China", "United Kingdom" }));
        countryTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(countryTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 310, -1));

        workExperienceTextField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0-2 Years", "2-4 Years", "4-7 Years", "7 Years and Above" }));
        workExperienceTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(workExperienceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 830, 140, -1));

        jScrollPane3.setViewportView(jPanel1);

        add(jScrollPane3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void picBrowseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picBrowseBtnActionPerformed
        // TODO add your handling code here:
        //Choosing image from JFile Chooser
        JFileChooser chooseimage = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("jpg files", "jpg");   // Restricting filter for only jpg images
        chooseimage.setFileFilter(filter);
        int returnVal=chooseimage.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION){
            File f=chooseimage.getSelectedFile();
            String filename=f.getAbsolutePath();
            picPathTextField.setText(filename);
            ImageIcon icon=new ImageIcon(filename);
            resume.setImage(filename);
            picLabel.setIcon(new ImageIcon(icon.getImage().getScaledInstance(830, 130, Image.SCALE_DEFAULT)));
            picLabel.setIcon(icon);
        }
    }//GEN-LAST:event_picBrowseBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        //Making all the spaces blank in order to reset the fields
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        contactNoTextField.setText("");
        emailIdTextField.setText("");
        streetLine1TextField.setText("");
        streetLine2TextField.setText("");
        cityTextField.setText("");
        zipCodeTextField.setText("");
        countryTextField.setSelectedItem("US");
        affiliationsTextField.setText("");
        careerObjectiveTextField.setText("");
        degreeName1TextField.setText("");
        degreeDate1TextField.setText("");
        gpa1TextField.setText("");
        degreeName2TextField.setText("");
        degreeDate2TextField.setText("");
        gpa2TextField.setText("");
        degreeName3TextField.setText("");
        degreeDate3textField.setText("");
        gpa3TextField.setText("");
        workExperienceTextField.setSelectedItem("0-2 Years");
        programmingLangTextField.setText("");
        picPathTextField.setText("");
        ImageIcon icon=new ImageIcon();
        jLabel1.setIcon(icon);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // If Validate Field turns true then Call Set Text Method
        if (validateJFieldText()==1) {
            setTextFields();
            //JOptionPane.showMessageDialog(null,"");
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void checkbox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkbox1ItemStateChanged
        // TODO add your handling code here:
        //Now Checking the status of checkbox
        if(!checkbox1.getState()){
            submitBtn.setVisible(false);
        }
        else{
            submitBtn.setVisible(true);
        }
    }//GEN-LAST:event_checkbox1ItemStateChanged

    private void gpa1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpa1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa1TextFieldActionPerformed

    private void degreeName1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreeName1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degreeName1TextFieldActionPerformed

    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextFieldActionPerformed

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

       public int validateJFieldText(){                     //Method created to check if any field is empty
           
           // Accepting all the text fields in an array of size
        JTextField jField[]=new JTextField[18];
        jField[0]=firstNameTextField;
        jField[1]=lastNameTextField;
        jField[2]=contactNoTextField;
        jField[3]=emailIdTextField;
        jField[4]=streetLine1TextField;
        jField[5]=streetLine2TextField;
        jField[6]=cityTextField;
        jField[7]=zipCodeTextField;
        jField[8]=affiliationsTextField;
        //jTextField[9]=careerObjectiveTextField;
        jField[9]=degreeName1TextField;
        jField[10]=degreeDate1TextField;
        jField[11]=gpa1TextField;
        jField[12]=degreeName2TextField;
        jField[13]=degreeDate2TextField;
        jField[14]=gpa2TextField;
        jField[15]=degreeName3TextField;
        jField[16]=degreeDate3textField;
        jField[17]=gpa3TextField;
        //jTextField[18]=programmingLangTextField;
        
        int isValidationSuccessfull = 1;                 
        for (int i = 0; i < jField.length; i++) {                 // Traversing across the array length
            if (jField[i].getText().trim().isEmpty()) {
                //If any field is empty throw message
                JOptionPane.showMessageDialog(null, "All fields are mandatory");
                isValidationSuccessfull = 0;
                break;
            } else {
                isValidationSuccessfull = 1;
            }
        }
        return isValidationSuccessfull;
    }
       
       public void setTextFields(){
           // Setting all the attributes
        resume.setFirstName(firstNameTextField.getText());
        resume.setLastName(lastNameTextField.getText());
        resume.setContactNo(contactNoTextField.getText());
        resume.setEmailId(emailIdTextField.getText());
        resume.setStreetLn1(streetLine1TextField.getText());
        resume.setStreetLn2(streetLine2TextField.getText());
        resume.setCity(cityTextField.getText());
        resume.setZipCode(zipCodeTextField.getText());
        resume.setCountry(countryTextField.getSelectedItem().toString());
        resume.setAffiliations(affiliationsTextField.getText());
        resume.setCareerObjective(careerObjectiveTextField.getText());
        resume.setDegreeName1(degreeName1TextField.getText());
        resume.setDegreeDate1(degreeDate1TextField.getText());
        resume.setGpa1(gpa1TextField.getText());
        resume.setDegreeName2(degreeName2TextField.getText());
        resume.setDegreeDate2(degreeDate2TextField.getText());
        resume.setGpa2(gpa2TextField.getText());
        resume.setDegreeName3(degreeName3TextField.getText());
        resume.setDegreeDate3(degreeDate3textField.getText());
        resume.setGpa3(gpa3TextField.getText());
        resume.setWorkExperience(workExperienceTextField.getSelectedItem().toString());
        resume.setProgrammingLang(programmingLangTextField.getText());
        // Display Success Message to user
        JOptionPane.showMessageDialog(null, "Resume Submitted Successfully !!!");
       
       }       
       
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField affiliationsTextField;
    private javax.swing.JTextArea careerObjectiveTextField;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JTextField contactNoTextField;
    private javax.swing.JComboBox<String> countryTextField;
    private javax.swing.JTextField degreeDate1TextField;
    private javax.swing.JTextField degreeDate2TextField;
    private javax.swing.JTextField degreeDate3textField;
    private javax.swing.JTextField degreeName1TextField;
    private javax.swing.JTextField degreeName2TextField;
    private javax.swing.JTextField degreeName3TextField;
    private javax.swing.JTextField emailIdTextField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JTextField gpa1TextField;
    private javax.swing.JTextField gpa2TextField;
    private javax.swing.JTextField gpa3TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JButton picBrowseBtn;
    private javax.swing.JLabel picLabel;
    private javax.swing.JTextField picPathTextField;
    private javax.swing.JTextArea programmingLangTextField;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField streetLine1TextField;
    private javax.swing.JTextField streetLine2TextField;
    private javax.swing.JButton submitBtn;
    private javax.swing.JComboBox<String> workExperienceTextField;
    private javax.swing.JTextField zipCodeTextField;
    // End of variables declaration//GEN-END:variables
}
