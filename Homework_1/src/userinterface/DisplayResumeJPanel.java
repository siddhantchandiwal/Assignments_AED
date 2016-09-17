/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;
import business.Resume;                         //Importing Business Package
import javax.swing.ImageIcon;

/**
 * @author Siddhant
 */
public class DisplayResumeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public DisplayResumeJPanel(Resume resume) {     //Passing Parameters to constructors
        initComponents();
        displayResume(resume);
    }
    
    // Creating a Separate Method and passing resume as Parameter
    private void displayResume(Resume resume){
        String ResumeFirstName=resume.getFirstName();
        firstNameTextField.setText(ResumeFirstName);
        
        ImageIcon icon=new ImageIcon(resume.getImage());
        outputLabel.setIcon(icon);
        
        String ResumeLastName=resume.getLastName();
        lastNameTextField.setText(ResumeLastName);
        
        String ResumeContactNo=resume.getContactNo();
        contactNoTextField.setText(ResumeContactNo);
        
        String ResumeEmailId=resume.getEmailId();
        emailIdTextField.setText(ResumeEmailId);
        
        String ResumeStreetLine1=resume.getStreetLn1();
        streetLine1TextField.setText(ResumeStreetLine1);
        
        String ResumeStreetLine2=resume.getStreetLn2();
        streetLine2TextField.setText(ResumeStreetLine2);
        
        String ResumeCity=resume.getCity();
        cityTextField.setText(ResumeCity);
        
        String ResumeZipCode=resume.getZipCode();
        zipCodeTextField.setText(ResumeZipCode);
        
        String ResumeCountry=resume.getCountry();
        countryTextField.setText(ResumeCountry);
        
        String ResumeAffiliations=resume.getAffiliations();
        affiliationsTextField.setText(ResumeAffiliations);
        
        String ResumeCareerObjective=resume.getCareerObjective();
        careerObjectiveTextField.setText(ResumeCareerObjective);
        
        String ResumeDegreeName1=resume.getDegreeName1();
        degreeName1TextField.setText(ResumeDegreeName1);
        
        String ResumeDegreeDate1=resume.getDegreeDate1();
        degreeDate1TextField.setText(ResumeDegreeDate1);
        
        String ResumeGpa1=resume.getGpa1();
        gpa1TextField.setText(ResumeGpa1);
        
        String ResumeDegreeName2=resume.getDegreeName2();
        degreeName2TextField.setText(ResumeDegreeName2);
        
        String ResumeDegreeDate2=resume.getDegreeDate2();
        degreeDate2TextField.setText(ResumeDegreeDate2);
               
        String ResumeGpa2=resume.getGpa2();
        gpa2TextField.setText(ResumeGpa2);
        
        String ResumeDegreeName3=resume.getDegreeName3();
        degreeName3TextField.setText(ResumeDegreeName3);
        
        String ResumeDegreeDate3=resume.getDegreeDate3();
        degreeDate3TextField.setText(ResumeDegreeDate3);
        
        String ResumeGpa3=resume.getGpa3();
        gpa3TextField.setText(ResumeGpa3);
        
        String ResumeWorkExperience=resume.getWorkExperience();
        workExperienceTextField.setText(ResumeWorkExperience);
        
        String ResumeProgLanguages=resume.getProgrammingLang();
        programmingLangTextField.setText(ResumeProgLanguages);
        
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
        countryTextField = new javax.swing.JTextField();
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
        degreeDate3TextField = new javax.swing.JTextField();
        degreeName3TextField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        workExperienceTextField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        careerObjectiveTextField = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        programmingLangTextField = new javax.swing.JTextArea();
        picLabel = new javax.swing.JLabel();
        outputLabel = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Display Resume");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 24, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("First Name:");
        jLabel2.setPreferredSize(new java.awt.Dimension(143, 22));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

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

        firstNameTextField.setEditable(false);
        firstNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(firstNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 85, 312, -1));

        lastNameTextField.setEditable(false);
        lastNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(lastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 125, 312, -1));

        contactNoTextField.setEditable(false);
        contactNoTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(contactNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 165, 312, -1));

        emailIdTextField.setEditable(false);
        emailIdTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(emailIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 205, 312, -1));

        streetLine1TextField.setEditable(false);
        streetLine1TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(streetLine1TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 285, 312, -1));

        streetLine2TextField.setEditable(false);
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

        cityTextField.setEditable(false);
        cityTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(cityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 369, 312, -1));

        zipCodeTextField.setEditable(false);
        zipCodeTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(zipCodeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 409, 312, -1));

        countryTextField.setEditable(false);
        countryTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(countryTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 449, 312, -1));

        affiliationsTextField.setEditable(false);
        affiliationsTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(affiliationsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 489, 312, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Career Objectives:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, -1, -1));

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

        degreeName1TextField.setEditable(false);
        degreeName1TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        degreeName1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreeName1TextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(degreeName1TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 703, 187, -1));

        degreeDate1TextField.setEditable(false);
        degreeDate1TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(degreeDate1TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 703, 242, -1));

        gpa1TextField.setEditable(false);
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

        degreeName2TextField.setEditable(false);
        degreeName2TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(degreeName2TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 745, 187, -1));

        degreeDate2TextField.setEditable(false);
        degreeDate2TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(degreeDate2TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 745, 242, -1));

        gpa2TextField.setEditable(false);
        gpa2TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(gpa2TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 745, 45, -1));

        gpa3TextField.setEditable(false);
        gpa3TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(gpa3TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 787, 45, -1));

        degreeDate3TextField.setEditable(false);
        degreeDate3TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(degreeDate3TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 787, 242, -1));

        degreeName3TextField.setEditable(false);
        degreeName3TextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(degreeName3TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 787, 187, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Work Experience:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 827, -1, -1));

        workExperienceTextField.setEditable(false);
        workExperienceTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(workExperienceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 830, 309, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("Languages Known:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 940, -1, -1));

        careerObjectiveTextField.setEditable(false);
        careerObjectiveTextField.setColumns(20);
        careerObjectiveTextField.setLineWrap(true);
        careerObjectiveTextField.setRows(5);
        careerObjectiveTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(careerObjectiveTextField);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 310, -1));

        programmingLangTextField.setEditable(false);
        programmingLangTextField.setColumns(20);
        programmingLangTextField.setLineWrap(true);
        programmingLangTextField.setRows(5);
        programmingLangTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(programmingLangTextField);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 870, 310, -1));

        picLabel.setPreferredSize(new java.awt.Dimension(120, 120));
        jPanel1.add(picLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 148, 176));
        jPanel1.add(outputLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(934, 183, -1, -1));

        jScrollPane3.setViewportView(jPanel1);

        add(jScrollPane3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextFieldActionPerformed

    private void degreeName1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreeName1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degreeName1TextFieldActionPerformed

    private void gpa1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpa1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpa1TextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField affiliationsTextField;
    private javax.swing.JTextArea careerObjectiveTextField;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JTextField contactNoTextField;
    private javax.swing.JTextField countryTextField;
    private javax.swing.JTextField degreeDate1TextField;
    private javax.swing.JTextField degreeDate2TextField;
    private javax.swing.JTextField degreeDate3TextField;
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
    private javax.swing.JLabel outputLabel;
    private javax.swing.JLabel picLabel;
    private javax.swing.JTextArea programmingLangTextField;
    private javax.swing.JTextField streetLine1TextField;
    private javax.swing.JTextField streetLine2TextField;
    private javax.swing.JTextField workExperienceTextField;
    private javax.swing.JTextField zipCodeTextField;
    // End of variables declaration//GEN-END:variables
}