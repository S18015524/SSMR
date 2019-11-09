
package menuPrincipals;

//Se necesitan los 4 para funcionar correctamente, cuando hagan su parte solo quitenlos de comentario.
import menuPrincipals.usuarios.*;
import menuPrincipals.menu.*;
//import menuPrincipals.recetas.*;
//import menuPrincipals.stock.*;


public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        BAgregarU = new javax.swing.JButton();
        BModificarU = new javax.swing.JButton();
        BEliminarU = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BAgregarI = new javax.swing.JButton();
        BModificarI = new javax.swing.JButton();
        BEliminarI = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BAgregarR = new javax.swing.JButton();
        BModificarR = new javax.swing.JButton();
        BEliminarR = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        BManual = new javax.swing.JButton();
        BAuto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MInfo = new javax.swing.JMenuItem();
        MCloseSes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SSMR");
        setPreferredSize(new java.awt.Dimension(800, 600));

        jTabbedPane6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        BAgregarU.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BAgregarU.setText("Agregar");
        BAgregarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgregarUActionPerformed(evt);
            }
        });

        BModificarU.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BModificarU.setText("Modificar");

        BEliminarU.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BEliminarU.setText("Eliminar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BEliminarU)
                    .addComponent(BAgregarU)
                    .addComponent(BModificarU))
                .addContainerGap(419, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(BAgregarU)
                .addGap(71, 71, 71)
                .addComponent(BModificarU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(BEliminarU)
                .addGap(94, 94, 94))
        );

        jTabbedPane6.addTab("Usuarios", jPanel1);

        BAgregarI.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BAgregarI.setText("Agregar");

        BModificarI.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BModificarI.setText("Modificar");

        BEliminarI.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BEliminarI.setText("Eliminar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BEliminarI)
                    .addComponent(BAgregarI)
                    .addComponent(BModificarI))
                .addContainerGap(419, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(BAgregarI)
                .addGap(71, 71, 71)
                .addComponent(BModificarI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(BEliminarI)
                .addGap(94, 94, 94))
        );

        jTabbedPane6.addTab("Ingredientes", jPanel2);

        BAgregarR.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BAgregarR.setText("Agregar");

        BModificarR.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BModificarR.setText("Modificar");

        BEliminarR.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BEliminarR.setText("Eliminar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BEliminarR)
                    .addComponent(BAgregarR)
                    .addComponent(BModificarR))
                .addContainerGap(419, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(BAgregarR)
                .addGap(71, 71, 71)
                .addComponent(BModificarR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(BEliminarR)
                .addGap(94, 94, 94))
        );

        jTabbedPane6.addTab("Recetas", jPanel3);

        BManual.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BManual.setText("Manualmente");

        BAuto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BAuto.setText("Automaticamente");
        BAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAutoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Generacion de menu's");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(BManual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(BAuto)
                .addGap(112, 112, 112))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(91, 91, 91)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BManual)
                    .addComponent(BAuto))
                .addContainerGap(257, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Menu's", jPanel4);

        jMenuBar1.setToolTipText("");

        jMenu1.setText("MiUser");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        MInfo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        MInfo.setText("Informacion");
        jMenu1.add(MInfo);

        MCloseSes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        MCloseSes.setText("Cerrar sesion");
        MCloseSes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCloseSesActionPerformed(evt);
            }
        });
        jMenu1.add(MCloseSes);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MCloseSesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCloseSesActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_MCloseSesActionPerformed

    private void BAgregarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgregarUActionPerformed
        // TODO add your handling code here:
        AgregarUsuario au = new AgregarUsuario();
        au.setVisible(true);
        dispose();
    }//GEN-LAST:event_BAgregarUActionPerformed

    private void BAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAutoActionPerformed
        // TODO add your handling code here:
        Automaticamente a = new Automaticamente();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_BAutoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAgregarI;
    private javax.swing.JButton BAgregarR;
    private javax.swing.JButton BAgregarU;
    private javax.swing.JButton BAuto;
    private javax.swing.JButton BEliminarI;
    private javax.swing.JButton BEliminarR;
    private javax.swing.JButton BEliminarU;
    private javax.swing.JButton BManual;
    private javax.swing.JButton BModificarI;
    private javax.swing.JButton BModificarR;
    private javax.swing.JButton BModificarU;
    private javax.swing.JMenuItem MCloseSes;
    private javax.swing.JMenuItem MInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane6;
    // End of variables declaration//GEN-END:variables
}
