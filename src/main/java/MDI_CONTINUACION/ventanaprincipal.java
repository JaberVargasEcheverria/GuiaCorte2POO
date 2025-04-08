/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MDI;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author JABER
 */
public class ventanaprincipal extends javax.swing.JFrame {

    /**
     * Creates new form ventanaprincipal
     */
    public ventanaprincipal() {
        initComponents();
    }

    public void ConfiguracionVentana() {
        this.setSize(800, 600);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInterno = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuArchivoAbrir = new javax.swing.JMenuItem();
        menuArchivoCerrar = new javax.swing.JMenuItem();
        menuCerrarTodo = new javax.swing.JMenuItem();
        menuInfo = new javax.swing.JMenuItem();
        separador1 = new javax.swing.JPopupMenu.Separator();
        menuArchivoSalir = new javax.swing.JMenuItem();
        menuVentana = new javax.swing.JMenu();
        menuCascada = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelInternoLayout = new javax.swing.GroupLayout(panelInterno);
        panelInterno.setLayout(panelInternoLayout);
        panelInternoLayout.setHorizontalGroup(
            panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelInternoLayout.setVerticalGroup(
            panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        getContentPane().add(panelInterno, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Archivo");

        menuArchivoAbrir.setText("Abrir");
        menuArchivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(menuArchivoAbrir);

        menuArchivoCerrar.setText("Cerrar");
        jMenu1.add(menuArchivoCerrar);

        menuCerrarTodo.setText("Cerrar Todo");
        menuCerrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerrarTodoActionPerformed(evt);
            }
        });
        jMenu1.add(menuCerrarTodo);

        menuInfo.setText("Info");
        jMenu1.add(menuInfo);
        jMenu1.add(separador1);

        menuArchivoSalir.setText("Salir");
        jMenu1.add(menuArchivoSalir);

        jMenuBar1.add(jMenu1);

        menuVentana.setText("Ventana");

        menuCascada.setText("Cascada");
        menuCascada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCascadaActionPerformed(evt);
            }
        });
        menuVentana.add(menuCascada);

        jMenuBar1.add(menuVentana);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuArchivoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoAbrirActionPerformed
        // TODO add your handling code here:
        JFileChooser abrir = new JFileChooser();
        int boton = abrir.showOpenDialog(null);
        if (boton == JFileChooser.APPROVE_OPTION);

        ventanainterna vi = new ventanainterna();
        vi.setResizable(true);
        vi.setMaximizable(true);
        vi.setIconifiable(true);
        vi.setClosable(true);

        panelInterno.add(vi);

        //Se asigna la imagen y se muestra la ventana interna
        String camino = abrir.getSelectedFile().toString();
        vi.setImagen(camino);
        vi.setTitle(camino);
        vi.setVisible(true);
    }//GEN-LAST:event_menuArchivoAbrirActionPerformed

    private void menuCerrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarTodoActionPerformed
        // TODO add your handling code here:
        int i;
        JInternalFrame v[] = panelInterno.getAllFrames();

        for (i = 0; i < v.length; i++) {
            v[i].dispose();
        }

    }//GEN-LAST:event_menuCerrarTodoActionPerformed

    private void menuCascadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCascadaActionPerformed
        // TODO add your handling code here:
        int i;
        int x, y; //posición de la ventana

        JInternalFrame v[] = panelInterno.getAllFrames();

        x = 0;
        y = 0;
        for (i = v.length - 1; i > 0; i--) {
            v[i].setSize(600, 400);
            v[i].setLocation(x, y);
            x = x + 30;
            y = y + 30;
        }
    }//GEN-LAST:event_menuCascadaActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuArchivoAbrir;
    private javax.swing.JMenuItem menuArchivoCerrar;
    private javax.swing.JMenuItem menuArchivoSalir;
    private javax.swing.JMenuItem menuCascada;
    private javax.swing.JMenuItem menuCerrarTodo;
    private javax.swing.JMenuItem menuInfo;
    private javax.swing.JMenu menuVentana;
    private javax.swing.JDesktopPane panelInterno;
    private javax.swing.JPopupMenu.Separator separador1;
    // End of variables declaration//GEN-END:variables
}
