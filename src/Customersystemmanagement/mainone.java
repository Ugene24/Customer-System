/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Customersystemmanagement;

import javax.swing.JOptionPane;
import Model.User;
import dao.Userdao;



/**
 *
 * @author Eugene Antwi
 */
public class mainone extends javax.swing.JFrame {
    
    public String emailpattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String numberpattern ="^[0-9]*$";


    /**
     * Creates new form mainone
     */
    public mainone() {
        initComponents();
        btnsave.setEnabled(false);
    }
    
            public void clear(){
        txtname.setText("");
        txtemail.setText("");
        txtpassword.setText("");
        txtmobilenum.setText("");
        txtproductbought.setText("");
        txtamount.setText("");
        btnsave.setEnabled(false);

    }
        public void checker(){
        String name = txtname.getText();
        String email = txtemail.getText();
        String password = txtpassword.getText();
        String mobilenumber = txtmobilenum.getText();
        String securityquestion = txtproductbought.getText();
        String answer = txtamount.getText();
        if (!name.equals("") && email.matches(emailpattern) && mobilenumber.matches(numberpattern) && mobilenumber.length()==10 && !password.equals("") && !securityquestion.equals("") && !answer.equals("") )
            btnsave.setEnabled(true);
        else
            btnsave.setEnabled(false);


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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtmobilenum = new javax.swing.JTextField();
        txtproductbought = new javax.swing.JTextField();
        txtamount = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btnexit1 = new javax.swing.JButton();
        btnview = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("CUSTOMER INFORMATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 127, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EMAIL");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 186, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 251, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MOBILE NUMBER");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 127, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PRODUCT BOUGHT");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 186, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("AMOUNT");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 251, -1, -1));

        btnsave.setForeground(new java.awt.Color(102, 0, 102));
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));

        btnclear.setForeground(new java.awt.Color(102, 0, 102));
        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnameKeyReleased(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 124, 246, -1));

        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 183, 247, -1));

        txtmobilenum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmobilenumKeyReleased(evt);
            }
        });
        getContentPane().add(txtmobilenum, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 124, 242, -1));

        txtproductbought.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductboughtActionPerformed(evt);
            }
        });
        txtproductbought.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtproductboughtKeyReleased(evt);
            }
        });
        getContentPane().add(txtproductbought, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 183, 242, -1));

        txtamount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtamountKeyReleased(evt);
            }
        });
        getContentPane().add(txtamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 240, 242, -1));

        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 247, -1));

        btnexit1.setForeground(new java.awt.Color(102, 0, 102));
        btnexit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit small.png"))); // NOI18N
        btnexit1.setText("Exit");
        btnexit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexit1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, -1, -1));

        btnview.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnview.setForeground(new java.awt.Color(102, 0, 102));
        btnview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view edit delete product.png"))); // NOI18N
        btnview.setText("View Database");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        getContentPane().add(btnview, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 160, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/normalise.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        User user = new User();
        user.setName(txtname.getText());
        user.setEmail(txtemail.getText());
        user.setPassword(txtpassword.getText());
        user.setMobilenumber(txtmobilenum.getText());
        user.setSecurityquestion(txtproductbought.getText());
        user.setAnswer(txtamount.getText());
        Userdao.save(user);
        clear();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        clear();
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyReleased
        checker();
    }//GEN-LAST:event_txtnameKeyReleased

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
        checker();
    }//GEN-LAST:event_txtemailKeyReleased

    private void txtmobilenumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmobilenumKeyReleased
        checker();
    }//GEN-LAST:event_txtmobilenumKeyReleased

    private void txtproductboughtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductboughtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductboughtActionPerformed

    private void txtproductboughtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtproductboughtKeyReleased
        checker();
    }//GEN-LAST:event_txtproductboughtKeyReleased

    private void txtamountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtamountKeyReleased
        checker();
    }//GEN-LAST:event_txtamountKeyReleased

    private void txtpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyReleased
        checker();
    }//GEN-LAST:event_txtpasswordKeyReleased

    private void btnexit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexit1ActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"Do you want to exit","Select",JOptionPane.YES_NO_OPTION  );
        if (a==0)
        {
            System.exit(0 );
        }
    }//GEN-LAST:event_btnexit1ActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        this.setVisible(false);
        
        ViewDB view = new ViewDB();
        view.setVisible(true);
    }//GEN-LAST:event_btnviewActionPerformed

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
            java.util.logging.Logger.getLogger(mainone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainone().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnexit1;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmobilenum;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtproductbought;
    // End of variables declaration//GEN-END:variables
}
