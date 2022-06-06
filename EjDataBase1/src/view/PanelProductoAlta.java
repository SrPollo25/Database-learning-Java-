/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dataBaseControl.Conexion;
import dataBaseControl.OperacionesDAO;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Categoria;

/**
 *
 * @author dam
 */
public class PanelProductoAlta extends javax.swing.JPanel {

    Conexion bd;
    OperacionesDAO operaciones;
    DefaultComboBoxModel comboModel;

    public PanelProductoAlta(Conexion bd) {
        initComponents();
        this.bd = bd;
        operaciones = new OperacionesDAO(bd);
        comboModel = new DefaultComboBoxModel();
        comboCategorias.setModel(comboModel);
        cargarCategorias();

    }

    private void cargarCategorias() {
        comboModel.addElement("Seleciona categoria");
        comboModel.addAll(operaciones.getCategorias());
    }

    private void borrarTxt() {
        txtCodigo.setText("");
        txtDenominacion.setText("");
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
        txtCodigo = new javax.swing.JTextField();
        txtDenominacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAlta = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblErrorCodigo = new javax.swing.JLabel();
        lblErrorDenominacion = new javax.swing.JLabel();
        comboCategorias = new javax.swing.JComboBox<>();
        lblErrorCombo = new javax.swing.JLabel();

        jLabel1.setText("Codigo:");

        jLabel2.setText("Denominacion:");

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });

        txtDenominacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDenominacionKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setText("Alta producto");

        btnAlta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAlta.setText("Dar de alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblErrorCodigo.setBackground(java.awt.Color.red);
        lblErrorCodigo.setForeground(java.awt.Color.red);

        lblErrorDenominacion.setBackground(java.awt.Color.red);
        lblErrorDenominacion.setForeground(java.awt.Color.red);

        comboCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblErrorCombo.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlta)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDenominacion, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblErrorDenominacion, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblErrorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(comboCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDenominacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblErrorDenominacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(comboCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlta)
                    .addComponent(btnCancelar))
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        //int codigo=Integer.parseInt(txtCodigo.getText());
        String codigo = txtCodigo.getText();
        int codigoInt = 0;
        String denominacion = txtDenominacion.getText();
        boolean error = false;
        Categoria categoriaSeleccionada = null;

        //comprueba si los campos estan en blanco
        try {//Comprueba que se introdujo un numero
            codigoInt = Integer.parseInt(codigo);
            if (codigoInt < 0) {
                lblErrorCodigo.setText("Introduzca un número positivo");
                error = true;
            } else {
                lblErrorCodigo.setText("");
            }
        } catch (NumberFormatException ex) {
            lblErrorCodigo.setText("No se introdujo numero");
            error = true;
        }

        if (denominacion.isBlank()) {
            error = true;
            lblErrorDenominacion.setText("*");
        } else {
            lblErrorDenominacion.setText("");
        }

        if (comboCategorias.getSelectedIndex() == 0) {
            error = true;
            lblErrorCombo.setText("*");
        } else {
            lblErrorCombo.setText("");
            categoriaSeleccionada = (Categoria) comboModel.getElementAt(
                    comboCategorias.getSelectedIndex());
        }

        if (!error) {

            if (operaciones.insertarProducto(codigoInt, denominacion,
                    categoriaSeleccionada.getCodigo()) == -1) {
                lblErrorCodigo.setText("Codigo ya utilizado");

            } else {
                borrarTxt();
                JOptionPane.showMessageDialog(this, "Categoria creada", "Creado", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnAltaActionPerformed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDenominacion.requestFocus();
        }
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void txtDenominacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominacionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnAlta.doClick();
        }
    }//GEN-LAST:event_txtDenominacionKeyPressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        borrarTxt();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> comboCategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblErrorCodigo;
    private javax.swing.JLabel lblErrorCombo;
    private javax.swing.JLabel lblErrorDenominacion;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDenominacion;
    // End of variables declaration//GEN-END:variables
}
