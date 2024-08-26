/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prestamo.mantenimiento;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author erikr
 */
public class MantenimientoUsuarios extends javax.swing.JFrame {

    private boolean isModifying = false;

    /**
     * Creates new form MantenimientoUsuarios
     */
    public MantenimientoUsuarios() {
        initComponents();
        // Obtener el tamaño de la pantalla
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension pantalla = toolkit.getScreenSize();

        // Obtener el tamaño de la ventana
        Dimension ventanaSize = getSize();

        // Calcular la posición para centrar la ventana
        int x = (pantalla.width - ventanaSize.width) / 2;
        int y = (pantalla.height - ventanaSize.height) / 2;

        // Establecer la posición de la ventana
        setLocation(x, y);
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
        txtLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbNivelAcceso = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Mantenimiento Usuarios");

        jLabel2.setText("USUARIO");

        txtLogin.setName("txtLogin"); // NOI18N
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        jLabel3.setText("CONTRASEÑA");

        jLabel4.setText("NOMBRES");

        jLabel5.setText("APELLIDOS");

        jLabel6.setText("NIVEL DE USUARIO");

        cbNivelAcceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));

        jLabel7.setText("CORREO ELECTRONICO");

        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)))
                        .addGap(0, 106, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLogin)
                            .addComponent(cbNivelAcceso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbNivelAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String login = txtLogin.getText();
        String password = txtPassword.getText();
        String nivelAcceso = (String) cbNivelAcceso.getSelectedItem();
        String nombre = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        String email = txtEmail.getText();
        

        // Validación de entradas
        if (login.isEmpty() || password.isEmpty() || nombre.isEmpty() || apellidos.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben ser llenados.");
            return;
        }

        if (password.length() < 6) {
            JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 6 caracteres.");
            return;
        }

        if (!email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) {
            JOptionPane.showMessageDialog(this, "El email no es válido.");
            return;
        }

        boolean userExists = false;
        File originalFile = new File("usuarios.txt");
        File tempFile = new File("usuarios_temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(originalFile)); BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(login)) {
                    // Modificar usuario existente
                    writer.write(login + "," + password + "," + nivelAcceso + "," + nombre + "," + apellidos + "," + email);
                    userExists = true;
                } else {
                    writer.write(line);
                }
                writer.newLine();
            }

            if (!userExists) {
                // Crear nuevo usuario si no existe
                writer.write(login + "," + password + "," + nivelAcceso + "," + nombre + "," + apellidos + "," + email);
                writer.newLine();
                JOptionPane.showMessageDialog(this, "Usuario creado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(this, "Usuario modificado exitosamente.");
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el usuario: " + e.getMessage());
            return;
        }

        // Renombrar el archivo temporal al original
        if (!originalFile.delete()) {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar el archivo original.");
            return;
        }
        if (!tempFile.renameTo(originalFile)) {
            JOptionPane.showMessageDialog(this, "No se pudo renombrar el archivo temporal.");
        }

        limpiarCampos();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        String login = txtLogin.getText();

        if (login.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un login.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"))) {
            String line;
            boolean userFound = false;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(login)) {
                    // Usuario encontrado, cargar los datos y cambiar a modo modificación
                    txtPassword.setText(data[1]);
                    cbNivelAcceso.setSelectedItem(data[2]);
                    txtNombre.setText(data[3]);
                    txtApellidos.setText(data[4]);
                    txtEmail.setText(data[5]);
                    

                    isModifying = true;
                    JOptionPane.showMessageDialog(this, "Usuario encontrado. Modo modificación activado.");
                    userFound = true;
                    break;
                }
            }

            if (!userFound) {
                // Usuario no encontrado, se creará un nuevo usuario
                JOptionPane.showMessageDialog(this, "Usuario no encontrado. Modo creación activado.");
                isModifying = false;
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo de usuarios: " + e.getMessage());
        }
    }//GEN-LAST:event_txtLoginActionPerformed

    private void limpiarCampos() {
        txtLogin.setText("");
        txtPassword.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtEmail.setText("");
        cbNivelAcceso.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(MantenimientoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimientoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimientoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimientoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenimientoUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbNivelAcceso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}