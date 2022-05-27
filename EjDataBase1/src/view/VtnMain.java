/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.MyJFrame;
import dataBaseControl.Conexion;
import dataBaseControl.OperacionesDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author dam
 */
public class VtnMain extends MyJFrame {

    Conexion bd;
    OperacionesDAO operaciones;
    PanelAlta panelAlta;
    PanelBaja panelBaja;
  
    public VtnMain() {
        initComponents();
        centrar();
        int resultado;
        
        bd = new Conexion();
        resultado = bd.establecer("jdbc:mysql://localhost:3306/dam_programacion_listacompras");
        if (bd.registrarDriver() != 0) {
            JOptionPane.showMessageDialog(this, "Tiene un problema con el driver");
        }

        if (resultado != 0) {
            JOptionPane.showMessageDialog(this, "No conectado al server");
        }
        operaciones=new OperacionesDAO(bd);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuCategoriaAlta = new javax.swing.JMenuItem();
        mnuCategoriaBaja = new javax.swing.JMenuItem();
        mnuCategoriaConsulta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuProductoAlta = new javax.swing.JMenuItem();
        mnuProductobaja = new javax.swing.JMenuItem();
        mnuProductoConsulta = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuListaAlta = new javax.swing.JMenuItem();
        mnuListaBaja = new javax.swing.JMenuItem();
        mnuListaConsulta = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Listas de la compra");
        setMinimumSize(new java.awt.Dimension(300, 250));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.FlowLayout());

        jMenu1.setText("Categoria");

        mnuCategoriaAlta.setText("Alta");
        mnuCategoriaAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCategoriaAltaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCategoriaAlta);

        mnuCategoriaBaja.setText("Baja");
        mnuCategoriaBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCategoriaBajaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCategoriaBaja);

        mnuCategoriaConsulta.setText("Consulta");
        jMenu1.add(mnuCategoriaConsulta);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Producto");

        mnuProductoAlta.setText("Alta");
        jMenu2.add(mnuProductoAlta);

        mnuProductobaja.setText("Baja");
        jMenu2.add(mnuProductobaja);

        mnuProductoConsulta.setText("Consulta");
        mnuProductoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProductoConsultaActionPerformed(evt);
            }
        });
        jMenu2.add(mnuProductoConsulta);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Lista");

        mnuListaAlta.setText("Alta");
        jMenu3.add(mnuListaAlta);

        mnuListaBaja.setText("Baja");
        mnuListaBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListaBajaActionPerformed(evt);
            }
        });
        jMenu3.add(mnuListaBaja);

        mnuListaConsulta.setText("Consulta");
        jMenu3.add(mnuListaConsulta);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void mnuProductoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProductoConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuProductoConsultaActionPerformed

    private void mnuListaBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListaBajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuListaBajaActionPerformed

    private void mnuCategoriaAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCategoriaAltaActionPerformed
        clearPanels();
        panelAlta=new PanelAlta(bd);
        this.getContentPane().add(panelAlta);
        pack();
    }//GEN-LAST:event_mnuCategoriaAltaActionPerformed

    private void mnuCategoriaBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCategoriaBajaActionPerformed
        clearPanels();
        panelBaja=new PanelBaja(bd);
        this.getContentPane().add(panelBaja);
        pack();
    }//GEN-LAST:event_mnuCategoriaBajaActionPerformed

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
            java.util.logging.Logger.getLogger(VtnMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnMain().setVisible(true);
            }
        });
    }

    private void clearPanels(){
        try{
            this.remove(panelAlta);
        }catch(Exception ex){
            
        }
    }
            
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mnuCategoriaAlta;
    private javax.swing.JMenuItem mnuCategoriaBaja;
    private javax.swing.JMenuItem mnuCategoriaConsulta;
    private javax.swing.JMenuItem mnuListaAlta;
    private javax.swing.JMenuItem mnuListaBaja;
    private javax.swing.JMenuItem mnuListaConsulta;
    private javax.swing.JMenuItem mnuProductoAlta;
    private javax.swing.JMenuItem mnuProductoConsulta;
    private javax.swing.JMenuItem mnuProductobaja;
    // End of variables declaration//GEN-END:variables
}
