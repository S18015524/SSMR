package menuPrincipals.usuarios;

import java.awt.Image;
import java.io.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
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
        BImagen1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SSMR");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 227, 173));
        jLabel1.setText("Agregar usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 12, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 84, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese nuevamente la contraseña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre(s)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 271, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apellido paterno");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 315, -1, -1));

        TUser.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        getContentPane().add(TUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 84, 171, -1));

        PPass1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        getContentPane().add(PPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 138, 171, -1));

        PPass2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        getContentPane().add(PPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 218, 171, -1));

        BGenerar.setBackground(new java.awt.Color(229, 178, 47));
        BGenerar.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        BGenerar.setText("Generar");
        BGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(BGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 517, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellido materno");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 362, -1, -1));

        TNombre.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        getContentPane().add(TNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 269, 171, -1));

        TAM.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        getContentPane().add(TAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 360, 171, -1));

        TAP.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        getContentPane().add(TAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 313, 171, -1));

        BVaciar.setBackground(new java.awt.Color(229, 178, 47));
        BVaciar.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        BVaciar.setText("Vaciar");
        BVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVaciarActionPerformed(evt);
            }
        });
        getContentPane().add(BVaciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 517, -1, -1));

        BCancelar.setBackground(new java.awt.Color(229, 178, 47));
        BCancelar.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        BCancelar.setText("Cancelar");
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 517, -1, -1));

        TDireccion.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        getContentPane().add(TDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 404, 171, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Direccion");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 406, -1, -1));

        LImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuPrincipals/Extras/IconUser1.png"))); // NOI18N
        getContentPane().add(LImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        BImagen.setBackground(new java.awt.Color(229, 178, 47));
        BImagen.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        BImagen.setText("Cargar imagen");
        BImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BImagenActionPerformed(evt);
            }
        });
        getContentPane().add(BImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Correo");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 362, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Telefono");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 315, -1, -1));

        TTelefono.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        getContentPane().add(TTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 313, 149, -1));

        TCorreo.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        getContentPane().add(TCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 360, 149, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Estado civil");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 406, -1, -1));

        CEstadoC.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        CEstadoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno", "Solter@", "Casad@", "Divorciad@", "Viud@" }));
        getContentPane().add(CEstadoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 402, 179, -1));

        CDia.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        CDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia" }));
        getContentPane().add(CDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 449, 129, -1));

        CMes.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        CMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        CMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMesActionPerformed(evt);
            }
        });
        getContentPane().add(CMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 449, -1, -1));

        CAnno.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        CAnno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013" }));
        getContentPane().add(CAnno, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 449, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha de nacimiento");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 453, -1, -1));

        BImagen1.setBackground(new java.awt.Color(229, 178, 47));
        BImagen1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        BImagen1.setText("Eliminar imagen");
        BImagen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BImagen1ActionPerformed(evt);
            }
        });
        getContentPane().add(BImagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuPrincipals/Extras/ssmr-gui.png"))); // NOI18N
        jLabel9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGenerarActionPerformed
        // TODO add your handling code here:
        String nacer = CDia.getSelectedItem() + "/" + CMes.getSelectedItem() + "/" + CAnno.getSelectedItem();
        String fin = "Usuario: " + TUser.getText()
                + "\nContraseña: ********"
                + "\nNombre(s): " + TNombre.getText()
                + "\nApellido paterno: " + TAP.getText()
                + "\nApellido materno: " + TAM.getText()
                + "\nDireccion: " + TDireccion.getText()
                + "\nTelefono: " + TTelefono.getText()
                + "\nAño de nacimiento: " + nacer
                + "\nCorreo: " + TCorreo.getText()
                + "\nEstado civil: " + CEstadoC.getSelectedItem();

        if (!(TUser.getText().equals("") || PPass1.getText().equals("") || PPass2.getText().equals("") || TNombre.getText().equals("") || TAP.getText().equals("") || TAM.getText().equals("")
                || TDireccion.getText().equals("") || CAnno.getSelectedIndex() == 0 || CMes.getSelectedIndex() == 0 || CEstadoC.getSelectedIndex()==0)) {
            if (PPass1.getText().equals(PPass2.getText())) {
                int choice = JOptionPane.showConfirmDialog(this, "Los datos ingresados son correctos?.\n" + fin, "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (choice == 0) {
                    JOptionPane.showMessageDialog(this, "Datos ingresado correctamente");
                    ingresarDatos();
                    MenuPrincipal mp = new MenuPrincipal(1);
                    mp.setVisible(true);
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Error, las contraseñas ingresadas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
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
            ImageIcon imagenInterna = new ImageIcon(
                    getClass().getResource("/menuPrincipals/Extras/IconUser1.png")
            );
            LImagen.setIcon(imagenInterna);
        }
    }//GEN-LAST:event_BVaciarActionPerformed

    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Estas seguro de cancelar el registro?", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == 0) {
            MenuPrincipal mp = new MenuPrincipal(1);
            mp.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_BCancelarActionPerformed

    private void BImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BImagenActionPerformed
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();
        jf.setDialogTitle("Buscar foto o imagen");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG", "jpg", "png");
        jf.setFileFilter(filtro);
        if (jf.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File archivo = new File(jf.getSelectedFile().toString());
            ImageIcon icono = new ImageIcon(archivo.toString());
            Icon icono2 = new ImageIcon(icono.getImage().getScaledInstance(LImagen.getWidth(), LImagen.getHeight(), Image.SCALE_DEFAULT));
            LImagen.setText(null);
            LImagen.setIcon(icono2);
        }
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

    private void BImagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BImagen1ActionPerformed
        // TODO add your handling code here:aa
        ImageIcon imagenInterna = new ImageIcon(
                getClass().getResource("/menuPrincipals/Extras/IconUser1.png")
        );
        LImagen.setIcon(imagenInterna);
    }//GEN-LAST:event_BImagen1ActionPerformed

    public void dias(int cantidad) {
        String aux = "";
        CDia.removeAllItems();
        for (int i = 1; i <= cantidad; i++) {
            aux = Integer.toString(i);
            CDia.addItem(aux);
        }
    }

    public void ingresarDatos() {
        String nacer = CDia.getSelectedItem() + "/" + CMes.getSelectedItem() + "/" + CAnno.getSelectedItem();
        Usuario usuario = new Usuario(TNombre.getText(),
                 TAP.getText(),
                 TAM.getText(),
                 TDireccion.getText(),
                 TTelefono.getText(),
                 nacer,
                 TCorreo.getText(),
                 String.valueOf(CEstadoC.getSelectedItem()));

        char[] pass = PPass1.getPassword();
        String pass2 = "";
        for (int i = 0; i < pass.length; i++) {
            pass2 = pass2 + pass[i];
        }
        String userPass = TUser.getText() + "," + pass2;
        
        FileWriter archivo = null;
        PrintWriter pw;

        FileWriter archivo2 = null;
        PrintWriter pw2;

        try {
            archivo = new FileWriter("Empleados.txt", true);
            pw = new PrintWriter(archivo);

            pw.println(usuario.toString());

        } catch (IOException e) {

        } finally {
            try {
                if (archivo != null) {
                    archivo.close();
                }
            } catch (IOException e2) {
                JOptionPane.showMessageDialog(this, "Error al crear el archivo de texto", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        try {
            archivo2 = new FileWriter("Usuarios.txt", true);
            pw2 = new PrintWriter(archivo2);

            pw2.println(userPass);

        } catch (IOException e) {

        } finally {
            try {
                if (archivo2 != null) {
                    archivo2.close();
                }
            } catch (IOException e2) {
                JOptionPane.showMessageDialog(this, "Error al crear el archivo de texto", "Error", JOptionPane.ERROR_MESSAGE);
            }
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
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JButton BImagen1;
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
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
