package menuPrincipals.usuarios;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import menuPrincipals.MenuPrincipal;
public class AgregarUsuario extends javax.swing.JFrame {

    public AgregarUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TUser = new javax.swing.JTextField();
        PPass1 = new javax.swing.JPasswordField();
        PPass2 = new javax.swing.JPasswordField();
        BGenerar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TNombre = new javax.swing.JTextField();
        TAM = new javax.swing.JTextField();
        TAP = new javax.swing.JTextField();
        BVaciar = new javax.swing.JButton();
        BCancelar = new javax.swing.JButton();
        TDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        LImagen = new javax.swing.JLabel();
        BImagen = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TTelefono = new javax.swing.JTextField();
        TCorreo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        CEstadoC = new javax.swing.JComboBox<>();
        CDia = new javax.swing.JComboBox<>();
        CMes = new javax.swing.JComboBox<>();
        CAnno = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SSMR");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Agregar usuario");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel3.setText("Contraseña");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel4.setText("Ingrese nuevamente la contraseña");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel5.setText("Nombre(s)");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel6.setText("Apellido paterno");

        TUser.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N

        PPass1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N

        PPass2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N

        BGenerar.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        BGenerar.setText("Generar");
        BGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGenerarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel7.setText("Apellido materno");

        TNombre.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N

        TAM.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N

        TAP.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N

        BVaciar.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        BVaciar.setText("Vaciar");
        BVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVaciarActionPerformed(evt);
            }
        });

        BCancelar.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        BCancelar.setText("Cancelar");
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });

        TDireccion.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel8.setText("Direccion");

        LImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuPrincipals/Extras/IconUser1.png"))); // NOI18N

        BImagen.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        BImagen.setText("Cargar imagen");
        BImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BImagenActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel10.setText("Correo");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel11.setText("Telefono");

        TTelefono.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N

        TCorreo.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel12.setText("Estado civil");

        CEstadoC.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        CEstadoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno", "Solter@", "Casad@", "Divorciad@", "Viud@" }));

        CDia.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        CDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia" }));

        CMes.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        CMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        CMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMesActionPerformed(evt);
            }
        });

        CAnno.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        CAnno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013" }));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel13.setText("Fecha de nacimiento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BGenerar)
                        .addGap(79, 79, 79)
                        .addComponent(BVaciar)
                        .addGap(78, 78, 78)
                        .addComponent(BCancelar)
                        .addGap(175, 175, 175))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel13))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(TAP, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TNombre)
                                    .addComponent(PPass1)
                                    .addComponent(TUser)
                                    .addComponent(PPass2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TAM, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BImagen)
                                .addGap(110, 110, 110))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(28, 28, 28)
                                                .addComponent(CEstadoC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 29, Short.MAX_VALUE)
                                                .addComponent(LImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel10))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(TCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                                    .addComponent(TTelefono)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(CDia, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(CAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(58, 58, 58))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(PPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(TUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(PPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BImagen))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(TTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(TCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(CEstadoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(CMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BGenerar)
                    .addComponent(BVaciar)
                    .addComponent(BCancelar))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGenerarActionPerformed
        // TODO add your handling code here:
        String nacer = CDia.getSelectedItem()+"/"+CMes.getSelectedItem() + "/"+CAnno.getSelectedItem();
        String fin = "Usuario: " + TUser.getText()
                + "\nContraseña: ********"
                + "\nNombre(s): " + TNombre.getText()
                + "\nApellido paterno: " + TAP.getText()
                + "\nApellido materno: " + TAM.getText()
                + "\nDireccion: " + TDireccion.getText()
                + "\nTelefono: " + TTelefono.getText()
                + "\nAño de nacimiento: " + nacer
                + "\nCorreo: " + TCorreo.getText()
                + "\nEstado civil: "+CEstadoC.getSelectedItem();

        if (!(TUser.getText().equals("") || PPass1.getText().equals("") || PPass2.getText().equals("") || TNombre.getText().equals("") || TAP.getText().equals("") || TAM.getText().equals("")
                || TDireccion.getText().equals("") || CAnno.getSelectedIndex()==0 || CMes.getSelectedIndex()==0 )) {
            if (PPass1.getText().equals(PPass2.getText())) {
                int choice=JOptionPane.showConfirmDialog(this, "Los datos ingresados son correctos?.\n"+fin, "Confirmacion", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if (choice == 0) {
                 JOptionPane.showMessageDialog(this, "Datos ingresado correctamente");
                 MenuPrincipal mp=new MenuPrincipal(1);
                 mp.setVisible(true);
                 dispose();
                }
            }else{
                JOptionPane.showMessageDialog(this, "Error, las contraseñas ingresadas no coinciden","Error",JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Algun campo obligatorio se encuentra vacio.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BGenerarActionPerformed

    private void BVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVaciarActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Estas seguro de querer vaciar los campos?", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == 0) {
            TUser.setText("");
            PPass1.setText("");
            PPass2.setText("");
            TNombre.setText("");
            TAP.setText("");
            TAM.setText("");
            TDireccion.setText("");
            TTelefono.setText("");
            TCorreo.setText("");
            CEstadoC.setSelectedIndex(0);
            CMes.setSelectedIndex(0);
            CAnno.setSelectedIndex(0);
            CDia.removeAllItems();
            CDia.addItem("Dia");
        }
    }//GEN-LAST:event_BVaciarActionPerformed

    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Estas seguro de cancelar el registro?", "Confirmacion",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == 0 ) {
            MenuPrincipal mp = new MenuPrincipal(1);
            mp.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_BCancelarActionPerformed

    private void BImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BImagenActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "En proceso ...");
        /*JFileChooser jf = new JFileChooser();
        jf.setDialogTitle("Buscar foto o imagen");
        
        if (jf.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File archivo = new File(jf.getSelectedFile().toString());
            
            LImagen.setIcon(jf.getSelectedFile().toString());
        }*/
    }//GEN-LAST:event_BImagenActionPerformed

    private void CMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMesActionPerformed
        // TODO add your handling code here:
        int choice = CMes.getSelectedIndex();

        if (CMes.getSelectedIndex() != 0) {
            if (choice == 2) {
                //Febrero 28 dias
                dias(28);
            } else {
                if (choice == 1 | choice == 3 | choice == 5 | choice == 7 | choice == 8 | choice == 10 | choice == 12) {
                    //31 Dias
                    dias(31);
                } else {
                    //30 Dias
                    dias(30);
                }
            }
        } else {
            CDia.removeAllItems();
            CDia.addItem("Dia");
        }
    }//GEN-LAST:event_CMesActionPerformed

    public void dias(int cantidad) {
        String aux = "";
        CDia.removeAllItems();
        for (int i = 1; i <= cantidad; i++) {
            aux = Integer.toString(i);
            CDia.addItem(aux);
        }
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
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BGenerar;
    private javax.swing.JButton BImagen;
    private javax.swing.JButton BVaciar;
    private javax.swing.JComboBox<String> CAnno;
    private javax.swing.JComboBox<String> CDia;
    private javax.swing.JComboBox<String> CEstadoC;
    private javax.swing.JComboBox<String> CMes;
    private javax.swing.JLabel LImagen;
    private javax.swing.JPasswordField PPass1;
    private javax.swing.JPasswordField PPass2;
    private javax.swing.JTextField TAM;
    private javax.swing.JTextField TAP;
    private javax.swing.JTextField TCorreo;
    private javax.swing.JTextField TDireccion;
    private javax.swing.JTextField TNombre;
    private javax.swing.JTextField TTelefono;
    private javax.swing.JTextField TUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
