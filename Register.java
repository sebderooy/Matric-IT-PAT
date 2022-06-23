
import javax.swing.ImageIcon;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebastianderooy
 */
public class Register extends javax.swing.JFrame {

    ImageIcon logo = new ImageIcon("Logo2.png");
    
    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        //sets up jframe
        lblLogo.setText("");
        lblLogo.setIcon(logo);
        lblNError.setText("");
        lblPError.setText("");
        lblCPError.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblRegister = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblConfirmP = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblNError = new javax.swing.JLabel();
        lblPError = new javax.swing.JLabel();
        lblCPError = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnLogIn = new javax.swing.JButton();
        lblLogIn = new javax.swing.JLabel();
        pswrdConfirmPassword = new javax.swing.JPasswordField();
        pswrdPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));

        lblRegister.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(0, 102, 255));
        lblRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegister.setText("REGISTER");

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setText("jLabel1");

        lblName.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 51, 255));
        lblName.setText("Name");

        lblPassword.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 51, 255));
        lblPassword.setText("Password");

        lblConfirmP.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        lblConfirmP.setForeground(new java.awt.Color(0, 51, 255));
        lblConfirmP.setText("Confirm Password");

        txtName.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 153, 255));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblNError.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        lblNError.setForeground(new java.awt.Color(255, 0, 51));
        lblNError.setText("jLabel5");

        lblPError.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        lblPError.setForeground(new java.awt.Color(255, 0, 51));
        lblPError.setText("jLabel7");

        lblCPError.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        lblCPError.setForeground(new java.awt.Color(255, 0, 51));
        lblCPError.setText("jLabel8");

        btnRegister.setBackground(new java.awt.Color(0, 153, 255));
        btnRegister.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnLogIn.setBackground(new java.awt.Color(0, 51, 255));
        btnLogIn.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.setText("Log in");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        lblLogIn.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        lblLogIn.setForeground(new java.awt.Color(0, 51, 255));
        lblLogIn.setText("Back to Log in");

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(btnRegister))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLogIn)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblName)
                        .addGap(84, 84, 84)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(pswrdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPError, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(lblRegister))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPassword))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblConfirmP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pswrdConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCPError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogo)
                .addGap(36, 36, 36)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNError)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(pswrdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPError))
                .addGap(17, 17, 17)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmP)
                    .addComponent(pswrdConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPError))
                .addGap(18, 18, 18)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(btnRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLogIn))
                    .addComponent(lblLogIn))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        //opens log in jframe
        LogIn login = new LogIn();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogInActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        //gets inputs from GUI
        String name = txtName.getText().toLowerCase();
        String password = pswrdPassword.getText().toLowerCase();
        String cpassword = pswrdConfirmPassword.getText().toLowerCase();
        
        boolean nvalid = true;
        boolean pvalid = true;
        boolean cpvalid = true;
        boolean exists = false;
        
        //validates presence
        if (name.length() == 0)
        {
            nvalid = false;
        }
       
        //validates presence
        if (password.length() == 0)
        {
            pvalid = false;
        }
        
        
        //validates name
        for (int i = 0; i < name.length(); i++) 
        {
            if (nvalid)
            {
            char c = name.charAt(i);
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || c == 32)
            {
                nvalid = true;
            } else {
                nvalid = false;
            }
            }
        }
        
        
        //validates password
        for (int i = 0; i < password.length(); i++) 
        {
            if (pvalid)
            {
            char c = password.charAt(i);
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c >= 48 && c <= 57) || c == 32)
            {
                pvalid = true;
            } else {
                pvalid = false;
            }
            }
        }
        
        //checks that both passwords match
         if (cpassword.equals(password))
        {
            cpvalid = true;
        } else {
            cpvalid = false;
        }
        
         //displays whether it name is valid
        if (nvalid)
        {
            lblNError.setText("");
        } else {
            lblNError.setText("Incorrect characters entered");
        }
        
        //displays whether password is valid
         if (pvalid)
        {
            lblPError.setText("");
        } else {
            lblPError.setText("Incorrect characters entered");
        }
       
         //displays whether confirm password is correct
        if (cpvalid)
        {
            lblCPError.setText("");
        } else {
            lblCPError.setText("Passwords don't match");
        }
        
        if (nvalid && pvalid && cpvalid)
        {
           
            String databaseURL = "jdbc:ucanaccess:///Users/SebastiandeRooy/FinBud/FinBudDB.accdb";
        
        try {
            Connection connection = DriverManager.getConnection(databaseURL);
            
            System.out.println("Connected");
            
            //gets all usernames from database
             String sql = "Select * from tblUser";
          
             Statement state = connection.createStatement();
             ResultSet result = state.executeQuery(sql);
        
             String[] str = new String[100];
             int i = 0;
            
             //enters usernames into array
            while (result.next())
            {
                String n = result.getString("UserName").toLowerCase();
                if (!n.isEmpty())
                {
                str[i] = n;
                    System.out.println(str[i]);
                i++;
                }
            }    
            
            
            
            //checks whether the username is already taken
                for (int j = 0; j < str.length; j++) 
                {
                    if (name.equals(str[j]))
                    {
                        exists = true;
                    }
                        
                }
                
                if (!exists)
                {
            
                    //inserts user into database
            sql = "INSERT INTO tblUser (Username, Password) VALUES ('" + name + "', '" + password + "')";
            
            
            
            
            int rows = state.executeUpdate(sql);
            
            if (rows > 0)
            {
                System.out.println("Completed");
            }
            
            
            //opens log in jframe
             LogIn login = new LogIn();
             login.setVisible(true);
             dispose();   
                } else {
                    lblNError.setText("Name already taken");
                }
           
            
           
                
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
            
          
        
         
        
            
            
        }
            
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel lblCPError;
    private javax.swing.JLabel lblConfirmP;
    private javax.swing.JLabel lblLogIn;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNError;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPError;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPasswordField pswrdConfirmPassword;
    private javax.swing.JPasswordField pswrdPassword;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
