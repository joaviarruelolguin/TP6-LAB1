package com.mycompany.trabajopractico6.lab1.SuperDeTodoSA;

import java.util.TreeSet;

public class Menu extends javax.swing.JFrame {

    public static TreeSet<Producto> listaProductos = new TreeSet<>();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Menu.class.getName());

    public Menu() {
        initComponents();
        cargarProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 600));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );

        jMenu1.setText("Administración");

        jMenuItem1.setText("Productos");
        jMenuItem1.addActionListener(this::jMenuItem1ActionPerformed);
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        jMenuItem2.setText("Por rubro...");
        jMenu2.add(jMenuItem2);

        jMenuItem4.setText("Por nombre...");
        jMenuItem4.addActionListener(this::jMenuItem4ActionPerformed);
        jMenu2.add(jMenuItem4);

        jMenuItem3.setText("Por precio...");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll();
        escritorio.repaint();
        BusquedaPorNombreView bpn = new BusquedaPorNombreView();
        bpn.setVisible(true);
        escritorio.add(bpn);
        escritorio.moveToFront(bpn);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Menu().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables

    private void cargarProductos() {
        listaProductos.add(new Producto(10, "Azucar x 1kg", 180.75, 5, Categoria.COMESTIBLE));
        listaProductos.add(new Producto(11, "Yerba Mate x 1kg", 3500.50, 12, Categoria.COMESTIBLE));
        listaProductos.add(new Producto(12, "Arroz x 1kg", 950.00, 8, Categoria.COMESTIBLE));
        listaProductos.add(new Producto(13, "Fideos x 500g", 780.25, 15, Categoria.COMESTIBLE));

        listaProductos.add(new Producto(14, "Detergente x 500ml", 1200.00, 10, Categoria.LIMPIEZA));
        listaProductos.add(new Producto(15, "Lavandina x 1L", 850.50, 8, Categoria.LIMPIEZA));
        listaProductos.add(new Producto(16, "Jabon en polvo x 800g", 2500.75, 6, Categoria.LIMPIEZA));

        listaProductos.add(new Producto(17, "Shampoo x 400ml", 3200.00, 7, Categoria.PERFUMERIA));
        listaProductos.add(new Producto(18, "Jabon de tocador", 750.25, 15, Categoria.PERFUMERIA));
        listaProductos.add(new Producto(19, "Desodorante", 2100.50, 9, Categoria.PERFUMERIA));
    }

}
