/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Customersystemmanagement;
import javax.swing.JOptionPane;
/**
 *
 * @author Eugene Antwi
 */
public class Loginpage extends javax.swing.JFrame {
 
    /**
     * Creates new form Loginpage
     */
    public Loginpage() {
        initComponents();
       
        
    }
    
    public void clear(){
    txtemaill.setText("");
    txtpasswordd.setText("");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtemaill = new javax.swing.JTextField();
        txtpasswordd = new javax.swing.JPasswordField();
        btnloginn = new javax.swing.JButton();
        btnexitt = new javax.swing.JButton();
        btnclearr = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/normalise.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN PAGE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 223, 31));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EMAIL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 129, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASWORD");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 198, -1, -1));
        getContentPane().add(txtemaill, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 126, 189, -1));
        getContentPane().add(txtpasswordd, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 195, 189, -1));

        btnloginn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        btnloginn.setText("Login");
        btnloginn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginnActionPerformed(evt);
            }
        });
        getContentPane().add(btnloginn, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 278, -1, -1));

        btnexitt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnexitt.setText("Exit");
        btnexitt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexittActionPerformed(evt);
            }
        });
        getContentPane().add(btnexitt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        btnclearr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnclearr.setText("Clear");
        btnclearr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearrActionPerformed(evt);
            }
        });
        getContentPane().add(btnclearr, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/normalise.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnexittActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexittActionPerformed
       int a = JOptionPane.showConfirmDialog(null,"Do you want to exit","Select",JOptionPane.YES_NO_OPTION  );
     if (a==0)
     {
     System.exit(0);
     }
    }//GEN-LAST:event_btnexittActionPerformed

    private void btnloginnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginnActionPerformed
     String email = txtemaill.getText();
     String password = txtpasswordd.getText();
     
     if (email.equals("ugantwi4@gmail.com") && password.equals("123456")) {
    JOptionPane.showMessageDialog(null,"Login Successful");
    
    this.setVisible(false); 
    
    mainone hmmmFrame = new mainone();
    hmmmFrame.setVisible(true);
  
    } 
     else {
    JOptionPane.showMessageDialog(null, "Retry: Incorrect email or password");
    
    
 }
   
   
     
    }//GEN-LAST:event_btnloginnActionPerformed

    private void btnclearrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearrActionPerformed
        clear();
    }//GEN-LAST:event_btnclearrActionPerformed

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
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclearr;
    private javax.swing.JButton btnexitt;
    private javax.swing.JButton btnloginn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtemaill;
    private javax.swing.JPasswordField txtpasswordd;
    // End of variables declaration//GEN-END:variables
}
