/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dataBaseControl.Conexion;
import dataBaseControl.OperacionesDAO;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import model.Libro;

/**
 *
 * @author dam
 */
public class PanelPrestamo extends javax.swing.JPanel {

    Conexion bd;
    OperacionesDAO operaciones;
    DefaultComboBoxModel cmbLibrosModel;

    public PanelPrestamo(Conexion bd) {
        initComponents();
        this.bd = bd;
        operaciones = new OperacionesDAO(bd);

        cmbLibrosModel = new DefaultComboBoxModel();
        cmbLibros.setModel(cmbLibrosModel);
        cargarLibros();

    }

    private void cargarLibros() {
        cmbLibrosModel.addElement("Elige un libro");
        cmbLibrosModel.addAll(operaciones.getLibros());
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
        txtSocio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblSocio = new javax.swing.JLabel();
        cmbLibros = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setText("PANEL PRESTAMO");

        txtSocio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSocioKeyPressed(evt);
            }
        });

        jLabel2.setText("Nº Socio");

        cmbLibros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jToggleButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jToggleButton1.setText("Prestar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        String codEjemplar;
        String isbn;
        String codSocio = txtSocio.getText().trim();
        String nombre;
        Libro libro;
        boolean error = false;

        try {
            nombre = operaciones.nombreSocio(Integer.parseInt(codSocio));
            if (nombre.isEmpty()) {
                lblSocio.setText("Socio no existe");
                lblSocio.setForeground(Color.red);
            }else{
                lblSocio.setText(nombre);
                lblSocio.setForeground(Color.black);
            }
        } catch (NumberFormatException ex) {
            lblSocio.setText("Escriba un número");
            lblSocio.setForeground(Color.red);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void txtSocioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSocioKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            String nombre;
            try {
            nombre = operaciones.nombreSocio(
                    Integer.parseInt(txtSocio.getText().trim()));
            if (nombre.isEmpty()) {
                lblSocio.setText("Socio no existe");
                lblSocio.setForeground(Color.red);
            }else{
                lblSocio.setText(nombre);
                lblSocio.setForeground(Color.black);
            }
        } catch (NumberFormatException ex) {
            lblSocio.setText("Escriba un número");
            lblSocio.setForeground(Color.red);
        }
        }
    }//GEN-LAST:event_txtSocioKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbLibros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblSocio;
    private javax.swing.JTextField txtSocio;
    // End of variables declaration//GEN-END:variables
}
