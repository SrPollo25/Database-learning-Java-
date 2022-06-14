/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.MyJFrame;
import dataBaseControl.Conexion;
import dataBaseControl.OperacionesDAO;

/**
 *
 * @author dam
 */
public class VtnOperaciones extends MyJFrame {

    Conexion bd;
    OperacionesDAO operaciones;
    PanelPrestamo panelPrestamo;
    PanelRenovacion panelRenovacion;
    String codigo_usuario;
    char tipoUsuario;
    
    public VtnOperaciones(char tipoUsuario,String codigo_usuario, Conexion bd) {
        initComponents();
        centrar();
        this.bd=bd;
        this.codigo_usuario=codigo_usuario;
        this.tipoUsuario=tipoUsuario;
        operaciones=new OperacionesDAO(bd);
        
        if (tipoUsuario=='s') {
            mnuPrestamo.setVisible(false);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuPrestamo = new javax.swing.JMenuItem();
        mnuRenovacion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuDesconectar = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.FlowLayout());

        jMenu1.setText("Opciones");

        mnuPrestamo.setText("Prestamo");
        mnuPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrestamoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuPrestamo);

        mnuRenovacion.setText("Renovación");
        mnuRenovacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRenovacionActionPerformed(evt);
            }
        });
        jMenu1.add(mnuRenovacion);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");

        mnuDesconectar.setText("Desconectar");
        mnuDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDesconectarActionPerformed(evt);
            }
        });
        jMenu2.add(mnuDesconectar);

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu2.add(mnuSalir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuRenovacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRenovacionActionPerformed
        cleanPanels();
        panelRenovacion=new PanelRenovacion(bd, codigo_usuario,tipoUsuario);
        this.getContentPane().add(panelRenovacion);
        pack();
    }//GEN-LAST:event_mnuRenovacionActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        cerrar();
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDesconectarActionPerformed
        new VtnLogin().setVisible(true);
        dispose();
        pack();
    }//GEN-LAST:event_mnuDesconectarActionPerformed

    private void mnuPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrestamoActionPerformed
        cleanPanels();
        panelPrestamo=new PanelPrestamo(bd);
        this.getContentPane().add(panelPrestamo);
        pack();
    }//GEN-LAST:event_mnuPrestamoActionPerformed

    private void cleanPanels(){
        try{
            this.remove(panelPrestamo);
        }catch(Exception ex){
            
        }try{
            this.remove(panelRenovacion);
        }catch(Exception ex){
            
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuDesconectar;
    private javax.swing.JMenuItem mnuPrestamo;
    private javax.swing.JMenuItem mnuRenovacion;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables
}
