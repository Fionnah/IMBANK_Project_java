package view;

import controller.AccountController;
import controller.AuthController;
import controller.TransactionController;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author Admin
 */
public class SignUpWin extends javax.swing.JFrame {

    private final AccountController accountController;
    private final AuthController authController;
    private final TransactionController transactionController;
    
    private String genderSelection = "";
    private String bankAccountTypeSelection = "";
    
    /**
     * Creates new form SignUpWin
     * @param accountController 
     * @param authController
     * @param transactionController
     */
    public SignUpWin(AccountController accountController, AuthController authController, TransactionController transactionController) {
        this.accountController = accountController;
        this.authController = authController;
        this.transactionController = transactionController;
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderButtonGroup = new javax.swing.ButtonGroup();
        BankAccountTypeBtnGrp = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        phoneNumField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        zipCodeField = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JToggleButton();
        jLabel14 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        provinceField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        SignUpButton = new javax.swing.JToggleButton();
        checkingsButton = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        savingsButton = new javax.swing.JRadioButton();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(35, 35, 77));

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE AN ACCOUNT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(13, 13, 13))
        );

        jLabel2.setFont(new java.awt.Font("MS UI Gothic", 1, 28)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Contacts");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("MS UI Gothic", 1, 28)); // NOI18N
        jLabel3.setText("Personal Information");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 1, 28)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Security");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel5.setText("First Name:");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel6.setText("Last Name:");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel7.setText("Age:");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel8.setText("Gender:");
        jLabel8.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel9.setText("Date of Birth:");
        jLabel9.setToolTipText("");

        firstNameField.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N

        lastNameField.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N

        ageField.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        ageField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ageFieldKeyTyped(evt);
            }
        });

        GenderButtonGroup.add(maleButton);
        maleButton.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        maleButton.setText("Male");
        maleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleButtonActionPerformed(evt);
            }
        });

        GenderButtonGroup.add(femaleButton);
        femaleButton.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        femaleButton.setText("Female");
        femaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel10.setText("Phone No.:");
        jLabel10.setToolTipText("");

        phoneNumField.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        phoneNumField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneNumFieldKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel11.setText("Address");
        jLabel11.setToolTipText("");

        addressField.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N

        jLabel12.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel12.setText("City");
        jLabel12.setToolTipText("");

        cityField.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N

        jLabel13.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel13.setText("ZIP Code");
        jLabel13.setToolTipText("");

        zipCodeField.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        zipCodeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipCodeFieldActionPerformed(evt);
            }
        });
        zipCodeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                zipCodeFieldKeyTyped(evt);
            }
        });

        SubmitButton.setBackground(new java.awt.Color(35, 35, 77));
        SubmitButton.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel14.setText("Email:");
        jLabel14.setToolTipText("");

        emailField.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N

        usernameField.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N

        jLabel15.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel15.setText("Username:");
        jLabel15.setToolTipText("");

        jLabel16.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel16.setText("Password:");
        jLabel16.setToolTipText("");

        jLabel17.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel17.setText("Confirm Password:");
        jLabel17.setToolTipText("");

        jLabel18.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        jLabel18.setText("Already have an account?");
        jLabel18.setToolTipText("");

        provinceField.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N

        jLabel19.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel19.setText("Province");
        jLabel19.setToolTipText("");

        SignUpButton.setBackground(new java.awt.Color(35, 35, 77));
        SignUpButton.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        SignUpButton.setForeground(new java.awt.Color(255, 255, 255));
        SignUpButton.setText("Sign In");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });

        BankAccountTypeBtnGrp.add(checkingsButton);
        checkingsButton.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        checkingsButton.setText("Checkings");
        checkingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkingsButtonActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel20.setText("Type of Bank Account");
        jLabel20.setToolTipText("");

        BankAccountTypeBtnGrp.add(savingsButton);
        savingsButton.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        savingsButton.setText("Savings");
        savingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savingsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(206, 206, 206)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(192, 192, 192))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(lastNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addComponent(firstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(maleButton)
                                        .addGap(47, 47, 47)
                                        .addComponent(femaleButton))
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(ageField))
                                .addGap(117, 117, 117)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel10)
                                    .addComponent(phoneNumField, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addComponent(jLabel11)
                                    .addComponent(addressField, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addComponent(jLabel12)
                                    .addComponent(provinceField)
                                    .addComponent(jLabel19)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(SubmitButton))
                                    .addComponent(zipCodeField)
                                    .addComponent(cityField))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14)
                            .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(jLabel15)
                            .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel20)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(checkingsButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(savingsButton))
                            .addComponent(passwordField)
                            .addComponent(confirmPasswordField))
                        .addGap(64, 64, 64))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignUpButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cityField)
                            .addComponent(passwordField))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(confirmPasswordField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(provinceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(checkingsButton)
                                    .addComponent(savingsButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maleButton)
                            .addComponent(femaleButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)))
                .addComponent(SubmitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(SignUpButton))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void femaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleButtonActionPerformed
         if(evt.getSource() == femaleButton){
            genderSelection = femaleButton.getText();
        } else {
            genderSelection = "";
        }
    }//GEN-LAST:event_femaleButtonActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        LogInWindow logIn = new LogInWindow(accountController, authController, transactionController);
        logIn.pack();
        logIn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void savingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savingsButtonActionPerformed
       if(evt.getSource() == savingsButton){
            bankAccountTypeSelection = savingsButton.getText();
        } else {
            bankAccountTypeSelection = "";
        }
    }//GEN-LAST:event_savingsButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        String[] data = getRegistrationInput().trim().split(" ");
        
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword()); // Correct reference for confirm password

        try {
            if (password.length() != 8) {
                throw new IllegalArgumentException("Password must be exactly 8 characters.");
            }
            if (!password.equals(confirmPassword)) {
                throw new IllegalArgumentException("Password and Confirm Password do not match.");
            }
            if (confirmPassword.length() != 8) {
                throw new IllegalArgumentException("Confirm Password must be exactly 8 characters.");
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Password Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        //authController.getData(data);
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void maleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleButtonActionPerformed
        if(evt.getSource() == maleButton){
            genderSelection = maleButton.getText();
        } else {
            genderSelection = "";
        }
    }//GEN-LAST:event_maleButtonActionPerformed

    private void checkingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkingsButtonActionPerformed
       if(evt.getSource() == checkingsButton){
            bankAccountTypeSelection = checkingsButton.getText();
        } else {
            bankAccountTypeSelection = "";
        }
    }//GEN-LAST:event_checkingsButtonActionPerformed

    private void phoneNumFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNumFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();      
        if (!Character.isDigit(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Please enter only numeric values", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_phoneNumFieldKeyTyped

    private void zipCodeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipCodeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipCodeFieldActionPerformed

    private void zipCodeFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zipCodeFieldKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();      
        if (!Character.isDigit(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Please enter only numeric values", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_zipCodeFieldKeyTyped

    private void ageFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageFieldKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();      
        if (!Character.isDigit(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Please enter only numeric values", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ageFieldKeyTyped

    public String getRegistrationInput(){
        
        String data = 
        
        firstNameField.getText() + " " + 
        lastNameField.getText() + " " + 
        ageField.getText()+ " " + 
        //dtOfBirthField.getText()+ " " + 
        genderSelection+ " " + 
        
        phoneNumField.getText()+ " " + 
        addressField.getText()+ " " + 
        cityField.getText()+ " " + 
        provinceField.getText()+ " " + 
        zipCodeField.getText()+ " " + 
        
        emailField.getText()+ " " + 
        usernameField.getText()+ " " + 
        passwordField.getText()+ " " + 
        confirmPasswordField.getText()+ " " + 
        bankAccountTypeSelection;
        
        return data;
    }
    
    public void showRegistrationError(){
        JOptionPane.showMessageDialog(rootPane, "");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BankAccountTypeBtnGrp;
    private javax.swing.ButtonGroup GenderButtonGroup;
    private javax.swing.JToggleButton SignUpButton;
    private javax.swing.JToggleButton SubmitButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField ageField;
    private javax.swing.JRadioButton checkingsButton;
    private javax.swing.JTextField cityField;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JTextField emailField;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.JTextField firstNameField;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField phoneNumField;
    private javax.swing.JTextField provinceField;
    private javax.swing.JRadioButton savingsButton;
    private javax.swing.JTextField usernameField;
    private javax.swing.JTextField zipCodeField;
    // End of variables declaration//GEN-END:variables
}