/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab6prograii_carlosnoe;

public class FranFran extends javax.swing.JFrame {

    /**
     * Creates new form FranFran
     */
    public FranFran() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        Principal.setVisible(true);
        Principal.setSize(1220, 610);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        POPMenu_Consolas = new javax.swing.JPopupMenu();
        Agregar = new javax.swing.JMenuItem();
        Modificar = new javax.swing.JMenuItem();
        Listar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        Principal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaConsolas = new javax.swing.JTable();

        Agregar.setText("jMenuItem1");
        POPMenu_Consolas.add(Agregar);

        Modificar.setText("jMenuItem1");
        POPMenu_Consolas.add(Modificar);

        Listar.setText("jMenuItem1");
        POPMenu_Consolas.add(Listar);

        Eliminar.setText("jMenuItem1");
        POPMenu_Consolas.add(Eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Principal.setBackground(new java.awt.Color(204, 255, 255));
        Principal.setForeground(new java.awt.Color(153, 255, 255));
        Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaConsolas.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaConsolas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaConsolasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaConsolas);

        Principal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaConsolasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaConsolasMouseClicked
         if (evt.isPopupTrigger() && TablaConsolas.getSelectedRow() != -1) {
        POPMenu_Consolas.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_TablaConsolasMouseClicked

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
            java.util.logging.Logger.getLogger(FranFran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FranFran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FranFran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FranFran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FranFran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Agregar;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Listar;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JPopupMenu POPMenu_Consolas;
    private javax.swing.JPanel Principal;
    private javax.swing.JTable TablaConsolas;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}