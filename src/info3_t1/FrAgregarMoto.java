/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info3_t1;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class FrAgregarMoto extends javax.swing.JFrame {

    /**
     * Creates new form FrAgregarMoto
     */
    public FrAgregarMoto() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxTipoCaja = new javax.swing.JComboBox<>();
        jTextFieldCilindraje = new javax.swing.JTextField();
        jTextFieldColor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPlaca = new javax.swing.JTextField();
        jButtonAgregarMoto = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Placa");

        jLabel2.setText("Color");

        jLabel3.setText("Cilindraje");

        jLabel4.setText("Tipo de caja");

        jComboBoxTipoCaja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "2 tiempos", "4 tiempos" }));
        jComboBoxTipoCaja.setToolTipText("");
        jComboBoxTipoCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoCajaActionPerformed(evt);
            }
        });

        jTextFieldColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldColorActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Agregar Moto");

        jButtonAgregarMoto.setText("Agregar");
        jButtonAgregarMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarMotoActionPerformed(evt);
            }
        });

        jButtonAtras.setText("Atras");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jComboBoxTipoCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(jTextFieldColor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldCilindraje, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jButtonAgregarMoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAtras)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxTipoCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregarMoto)
                    .addComponent(jButtonAtras)
                    .addComponent(jButton1))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipoCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoCajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoCajaActionPerformed

    private void jButtonAgregarMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarMotoActionPerformed
        // TODO add your handling code here:
         if (!jTextFieldPlaca.getText().isEmpty() && !jTextFieldColor.getText().isEmpty()
                && !jTextFieldCilindraje.getText().isEmpty() && !jComboBoxTipoCaja.getSelectedItem().equals("")){            
            try{
                String placa = jTextFieldPlaca.getText();
                String color = jTextFieldColor.getText();
                String cilindraje = jTextFieldCilindraje.getText();
                String tcaja = jComboBoxTipoCaja.getSelectedItem().toString();
                Moto unaMoto = new Moto(tcaja, jTextFieldPlaca.getText().trim(), color, cilindraje);
                Vehiculo unVehiculo= new Vehiculo(placa, color,cilindraje);
                if (gestionParqueadero.existeVehiculo(jTextFieldPlaca.getText())==false){
                    gestionParqueadero.agregarMoto(unaMoto);
                    gestionParqueadero.agregarVehiculo(unVehiculo);
                    JOptionPane.showMessageDialog(null, "Moto Agregada");
                    jTextFieldPlaca.setText("");
                    jTextFieldColor.setText("");
                    jTextFieldCilindraje.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "Ya existe un vehiculo con esa placa");
                }
            }catch(NumberFormatException | HeadlessException ex){
                JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Faltan Datos");
        }
    }//GEN-LAST:event_jButtonAgregarMotoActionPerformed

    private void jTextFieldColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldColorActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        // TODO add your handling code here:
        FrAgregarVehiculo frm = new FrAgregarVehiculo();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FrParqueadero frm = new FrParqueadero();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrAgregarMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrAgregarMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrAgregarMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrAgregarMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrAgregarMoto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgregarMoto;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JComboBox<String> jComboBoxTipoCaja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldCilindraje;
    private javax.swing.JTextField jTextFieldColor;
    private javax.swing.JTextField jTextFieldPlaca;
    // End of variables declaration//GEN-END:variables
}
