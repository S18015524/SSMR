package menuPrincipals;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BLogin = new javax.swing.JButton();
        TUser = new javax.swing.JTextField();
        PPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SSMR");
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, -1));

        BLogin.setBackground(new java.awt.Color(255, 204, 0));
        BLogin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BLogin.setText("Iniciar Sesión");
        BLogin.setBorderPainted(false);
        BLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLoginActionPerformed(evt);
            }
        });
        getContentPane().add(BLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, -1, -1));

        TUser.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(TUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 240, 30));

        PPass.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        PPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(PPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 240, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuPrincipals/Extras/ssmr-guilog.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLoginActionPerformed
        // TODO add your handling code here:
        String usuario = "Admin";
        String contra = "password";

        if (TUser.getText().equals(usuario) && PPass.getText().equals(contra)) {
            JOptionPane.showMessageDialog(this, "Bienvenido\nUser, que tengas un bonito dia.", "Ingreso correcto", JOptionPane.INFORMATION_MESSAGE);
            MenuPrincipal mp = new MenuPrincipal(0);
            mp.setVisible(true);
            dispose();
        } else {
            if (TUser.getText().equals(usuario) && !(PPass.getText().equals(contra))) {
                JOptionPane.showMessageDialog(this, "Combinacion usuario/contraseña es incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (TUser.getText().equals("") && PPass.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Por favor ingrese todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, "Esta cuenta no existe", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_BLoginActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BLogin;
    private javax.swing.JPasswordField PPass;
    private javax.swing.JTextField TUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
