
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.ImageIcon;
import java.sql.*;
import java.util.Scanner;
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
public class BudgetUI extends javax.swing.JFrame {

    ImageIcon logo = new ImageIcon("Logo_icon.png");
    
    
    /**
     * Creates new form BudgetUI
     */
    public BudgetUI() {
        initComponents();
        
        //Creating/displaying finbud logo
        lblLogo.setText("");
        lblLogo.setIcon(logo);
        
       
        try
        {
            //getting current user from textfile
        Scanner scf = new Scanner(new File("/Users/SebastiandeRooy/FinBud/CurrentUser.txt"));
        String u = scf.nextLine();
        
        //getting current budget from textfile
        Scanner scfi = new Scanner(new File("/Users/SebastiandeRooy/FinBud/CurrentBudget.txt"));
        String b = scfi.nextLine();
        
        //setting user and budget in GUI equal to names
        lblUser.setText("User: " + u);
        lblBudgetName.setText("Budget: " + b);
        
        //creating user and budget objects
        User user = new User(u);
        Budget budget = new Budget(b);
        
            //setting type label equal to budget type
            String type = budget.getType();
            lblBudgetType.setText("Type: " + type);
            
            //settting/displaying incomes 
            int i = budget.getIncomes();
            txtIncomes.setText("" + i);
            
            //setting/displaying expenses
            int e = budget.getExpenses();
            txtExpenses.setText("" + e);
          
        
        
        } catch (FileNotFoundException e)
        {
            System.out.println("File not found");
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

        pnlBackground = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblBudgetName = new javax.swing.JLabel();
        lblIncomes = new javax.swing.JLabel();
        lblExpenses = new javax.swing.JLabel();
        lblProfit = new javax.swing.JLabel();
        txtIncomes = new javax.swing.JTextField();
        txtExpenses = new javax.swing.JTextField();
        txtProfit = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        btnIncomes = new javax.swing.JButton();
        btnExpenses = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        lblBudgetType = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));

        lblLogo.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        lblLogo.setText("jLabel1");

        lblBudgetName.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        lblBudgetName.setForeground(new java.awt.Color(102, 102, 255));
        lblBudgetName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBudgetName.setText("BUDGET NAME");

        lblIncomes.setFont(new java.awt.Font("Avenir Next", 0, 16)); // NOI18N
        lblIncomes.setForeground(new java.awt.Color(0, 0, 204));
        lblIncomes.setText("Incomes");

        lblExpenses.setFont(new java.awt.Font("Avenir Next", 0, 16)); // NOI18N
        lblExpenses.setForeground(new java.awt.Color(0, 0, 204));
        lblExpenses.setText("Expenses");

        lblProfit.setFont(new java.awt.Font("Avenir Next", 0, 16)); // NOI18N
        lblProfit.setForeground(new java.awt.Color(0, 0, 204));
        lblProfit.setText("Profit");

        txtIncomes.setEditable(false);
        txtIncomes.setFont(new java.awt.Font("Avenir Next", 0, 16)); // NOI18N
        txtIncomes.setForeground(new java.awt.Color(51, 102, 255));
        txtIncomes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIncomes.setText("0");
        txtIncomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIncomesActionPerformed(evt);
            }
        });

        txtExpenses.setEditable(false);
        txtExpenses.setFont(new java.awt.Font("Avenir Next", 0, 16)); // NOI18N
        txtExpenses.setForeground(new java.awt.Color(51, 102, 255));
        txtExpenses.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtExpenses.setText("0");
        txtExpenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpensesActionPerformed(evt);
            }
        });

        txtProfit.setEditable(false);
        txtProfit.setFont(new java.awt.Font("Avenir Next", 0, 16)); // NOI18N
        txtProfit.setForeground(new java.awt.Color(51, 102, 255));
        txtProfit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProfit.setText("0");

        btnCalculate.setBackground(new java.awt.Color(51, 51, 255));
        btnCalculate.setFont(new java.awt.Font("Avenir Next", 0, 16)); // NOI18N
        btnCalculate.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnIncomes.setBackground(new java.awt.Color(51, 153, 255));
        btnIncomes.setFont(new java.awt.Font("Avenir Next", 0, 16)); // NOI18N
        btnIncomes.setForeground(new java.awt.Color(255, 255, 255));
        btnIncomes.setText("Incomes");
        btnIncomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncomesActionPerformed(evt);
            }
        });

        btnExpenses.setBackground(new java.awt.Color(51, 153, 255));
        btnExpenses.setFont(new java.awt.Font("Avenir Next", 0, 16)); // NOI18N
        btnExpenses.setForeground(new java.awt.Color(255, 255, 255));
        btnExpenses.setText("expenses");
        btnExpenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpensesActionPerformed(evt);
            }
        });

        lblUser.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(51, 51, 255));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("USER NAME");

        lblBudgetType.setBackground(new java.awt.Color(255, 255, 255));
        lblBudgetType.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        lblBudgetType.setForeground(new java.awt.Color(51, 51, 255));
        lblBudgetType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBudgetType.setText("Budget Type");

        btnBack.setBackground(new java.awt.Color(0, 0, 255));
        btnBack.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalculate)
                        .addGap(619, 619, 619))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(407, 407, 407))))
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(lblUser)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProfit)
                            .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblIncomes, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblExpenses, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(txtProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBudgetName)
                                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtIncomes, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnExpenses)
                                            .addComponent(btnIncomes)))))))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(lblBudgetType)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblUser)
                        .addGap(4, 4, 4)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBudgetName)
                            .addComponent(lblLogo)))
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(lblBudgetType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIncomes)
                    .addComponent(txtIncomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncomes))
                .addGap(14, 14, 14)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExpenses)
                    .addComponent(btnExpenses)
                    .addComponent(txtExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalculate)
                .addGap(22, 22, 22)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfit)
                    .addComponent(txtProfit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
      //calculating profit
        int i = Integer.parseInt(txtIncomes.getText());
       int e = Integer.parseInt(txtExpenses.getText());
       
       int p = i - e;
       txtProfit.setText("" + p);
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpensesActionPerformed
        //opens expenses jframe
        ExpensesUI exp = new ExpensesUI();
        exp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnExpensesActionPerformed

    private void btnIncomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncomesActionPerformed
        //opens incomes jframe
        IncomesUI inc = new IncomesUI();
        inc.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIncomesActionPerformed

    private void txtIncomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIncomesActionPerformed
        
    }//GEN-LAST:event_txtIncomesActionPerformed

    private void txtExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpensesActionPerformed
        
    }//GEN-LAST:event_txtExpensesActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        //opens profile jframe
        Profile profile = new Profile();
        profile.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    public void setBudgetInfo(String un, String bn, String bt)
    {
        //sets title labels to correct/relevant information
        lblUser.setText(un);
        lblBudgetName.setText(bn);
        lblBudgetType.setText(bt);
    }
   
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(BudgetUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BudgetUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BudgetUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BudgetUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BudgetUI().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExpenses;
    private javax.swing.JButton btnIncomes;
    private javax.swing.JLabel lblBudgetName;
    private javax.swing.JLabel lblBudgetType;
    private javax.swing.JLabel lblExpenses;
    private javax.swing.JLabel lblIncomes;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblProfit;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JTextField txtExpenses;
    private javax.swing.JTextField txtIncomes;
    private javax.swing.JTextField txtProfit;
    // End of variables declaration//GEN-END:variables
}
