/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import baseDeDatos.Conexion;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import modelo.Enfermo;
import modelo.Medicamento;
import modelo.OperacionesDAO;

/**
 *
 * @author dam
 */
public class PanelConsulta extends javax.swing.JPanel {

    DefaultComboBoxModel modelCombo;
    DefaultTableModel modelTable;
    Conexion bd;
    OperacionesDAO operaciones;

    public PanelConsulta(Conexion bd) {
        initComponents();
        this.bd = bd;
        operaciones = new OperacionesDAO(bd);
        //Asigno los modelos
        modelCombo = new DefaultComboBoxModel();
        modelTable = new DefaultTableModel();
        cmbPaciente.setModel(modelCombo);
        tblMedicacion.setModel(modelTable);
        cargarPacientes();
        //Se indican los identificadores de las columnas
        String[] titulos = new String[]{"Codigo", "Denominacion", "Indicaciones"};
        modelTable.setColumnIdentifiers(titulos);
    }

    private void cargarPacientes() {
        modelCombo.addElement("Seleccione un paciente");
        modelCombo.addAll(operaciones.getEnfermos());
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
        cmbPaciente = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedicacion = new javax.swing.JTable();

        jLabel1.setText("Paciente");

        cmbPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPacienteActionPerformed(evt);
            }
        });

        tblMedicacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblMedicacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPacienteActionPerformed
        eliminarFilas();
        int pos = cmbPaciente.getSelectedIndex();
        if (pos != 0) {
            String numPaciente=((Enfermo)modelCombo.getElementAt(pos))
                    .getNumeroSeguridadSocial();
            ArrayList<Medicamento> medi=operaciones.consultMedicamento(numPaciente);
            for (int i = 0; i < medi.size(); i++) {
                Vector v=new Vector();
                v.add(medi.get(i).getCodeMedicamento());
                v.add(medi.get(i).getDenominacion());
                v.add(medi.get(i).getIndicaciones());
                modelTable.addRow(v);
            }
        }
    }//GEN-LAST:event_cmbPacienteActionPerformed

    /**
     * Limpia la tabla 
     */
    private void eliminarFilas() {
        int f=tblMedicacion.getRowCount();
        for (int i = 0; i < f; i++) {
            modelTable.removeRow(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMedicacion;
    // End of variables declaration//GEN-END:variables

}
