/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.comercializadora.gui;

/**
 *
 * @author Andre
 */
public class frmVenta extends javax.swing.JFrame {

    /**
     * Creates new form frmKardex
     */
    frmBuscarCliente frmBuscarCliente = new frmBuscarCliente();
    public frmVenta() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxt_nombreProducto = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jtxt_precioCompra = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jtxt_precioVenta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jtxt_nombreProducto1 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        btn_buscar_producto = new javax.swing.JButton();
        jtxt_precioCompra1 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        btn_buscar_cliente = new javax.swing.JButton();
        jtxt_precioVenta1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jtxt_precioVenta2 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(34, 105, 212));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/com/comercializadora/resources/producto_form.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Venta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 100));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(34, 105, 212));
        jLabel3.setText("Cliente");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jtxt_nombreProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtxt_nombreProducto.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_nombreProducto.setBorder(null);
        jtxt_nombreProducto.setEnabled(false);
        jPanel2.add(jtxt_nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, 30));

        jSeparator2.setForeground(new java.awt.Color(34, 105, 212));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 110, 10));

        jtxt_precioCompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtxt_precioCompra.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_precioCompra.setBorder(null);
        jtxt_precioCompra.setEnabled(false);
        jPanel2.add(jtxt_precioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 120, 30));

        jSeparator3.setForeground(new java.awt.Color(34, 105, 212));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 120, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(34, 105, 212));
        jLabel4.setText("Producto:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(34, 105, 212));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 200, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(34, 105, 212));
        jLabel5.setText("Precio de Unitario:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        jtxt_precioVenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtxt_precioVenta.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_precioVenta.setBorder(null);
        jtxt_precioVenta.setEnabled(false);
        jPanel2.add(jtxt_precioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 170, 30));

        jButton1.setBackground(new java.awt.Color(13, 55, 212));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 130, -1));

        jtxt_nombreProducto1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtxt_nombreProducto1.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_nombreProducto1.setBorder(null);
        jtxt_nombreProducto1.setEnabled(false);
        jPanel2.add(jtxt_nombreProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 210, 30));

        jSeparator7.setForeground(new java.awt.Color(34, 105, 212));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 210, 10));

        btn_buscar_producto.setBackground(new java.awt.Color(13, 55, 212));
        btn_buscar_producto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_buscar_producto.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar_producto.setText("Buscar");
        btn_buscar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_productoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_buscar_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 44, -1));

        jtxt_precioCompra1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtxt_precioCompra1.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_precioCompra1.setBorder(null);
        jtxt_precioCompra1.setEnabled(false);
        jPanel2.add(jtxt_precioCompra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 210, 30));

        jSeparator8.setForeground(new java.awt.Color(34, 105, 212));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 210, 10));

        btn_buscar_cliente.setBackground(new java.awt.Color(13, 55, 212));
        btn_buscar_cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_buscar_cliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar_cliente.setText("Buscar");
        btn_buscar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_clienteActionPerformed(evt);
            }
        });
        jPanel2.add(btn_buscar_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 44, -1));

        jtxt_precioVenta1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtxt_precioVenta1.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_precioVenta1.setBorder(null);
        jPanel2.add(jtxt_precioVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 130, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(34, 105, 212));
        jLabel6.setText("Cantidad:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 80, -1));

        jSeparator5.setForeground(new java.awt.Color(34, 105, 212));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 140, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(34, 105, 212));
        jLabel7.setText("Total del Producto:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 170, -1));

        jtxt_precioVenta2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxt_precioVenta2.setForeground(new java.awt.Color(102, 102, 102));
        jtxt_precioVenta2.setBorder(null);
        jtxt_precioVenta2.setEnabled(false);
        jPanel2.add(jtxt_precioVenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 320, 30));

        jSeparator6.setForeground(new java.awt.Color(34, 105, 212));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 350, 10));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(34, 105, 212));
        jLabel8.setText("Cantidad:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 80, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("S/.");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 285, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("S/.");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 352, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos"));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jButton3.setBackground(new java.awt.Color(13, 55, 212));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Quitar Producto");

        jButton7.setBackground(new java.awt.Color(13, 55, 212));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Salir");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Total:0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton7))
                .addGap(23, 23, 23))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 400, 390));

        jButton6.setBackground(new java.awt.Color(13, 55, 212));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Agregar Producto");
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_buscar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_clienteActionPerformed
        // TODO add your handling code here:
        
        frmBuscarCliente.toFront();
        frmBuscarCliente.setVisible(true);
    }//GEN-LAST:event_btn_buscar_clienteActionPerformed

    private void btn_buscar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_productoActionPerformed
        // TODO add your handling code here:
        frmBuscarProducto frmBuscarProducto=new frmBuscarProducto();
        frmBuscarProducto.toFront();
        frmBuscarProducto.setVisible(true);
    }//GEN-LAST:event_btn_buscar_productoActionPerformed

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
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar_cliente;
    private javax.swing.JButton btn_buscar_producto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField jtxt_nombreProducto;
    public static javax.swing.JTextField jtxt_nombreProducto1;
    private javax.swing.JTextField jtxt_precioCompra;
    private javax.swing.JTextField jtxt_precioCompra1;
    private javax.swing.JTextField jtxt_precioVenta;
    private javax.swing.JTextField jtxt_precioVenta1;
    private javax.swing.JTextField jtxt_precioVenta2;
    // End of variables declaration//GEN-END:variables
}