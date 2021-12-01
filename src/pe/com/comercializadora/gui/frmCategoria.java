/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.comercializadora.gui;

import java.awt.Color;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import pe.com.comercializadora.controllers.CategoriaController;
import pe.com.comercializadora.modelos.Categoria;

/**
 *
 * @author Andre
 */
public class frmCategoria extends javax.swing.JFrame {

    /**
     * Creates new form frmProducto
     */
    private Categoria categoria = new Categoria();
    private String palabra ="";
    public frmCategoria() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrar("");
        limpiar();
        txt_categoria.requestFocus();
    }
    private String accion = "save";

    void ocultar_columnas() {
        tabla_categoria.getColumnModel().getColumn(0).setMaxWidth(0);
        tabla_categoria.getColumnModel().getColumn(0).setMinWidth(0);
        tabla_categoria.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    void limpiar() {
        txt_categoria.setText("");
        btn_registrar.setText("Registrar");
        btn_cancelar.setEnabled(false);
        btn_eliminar.setEnabled(false);
        categoria.setNombre("");
        categoria.setId(0);
    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            CategoriaController controller = new CategoriaController();
            modelo = controller.mostrar(buscar);
            tabla_categoria.setModel(modelo);
            ocultar_columnas();

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_categoria = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btn_cancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_categoria = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txt_buscar_categoria = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(34, 105, 212));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/com/comercializadora/resources/categories.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Categorías");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 100));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(34, 105, 212));
        jLabel3.setText("Nombre la Categoría:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txt_categoria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_categoria.setForeground(new java.awt.Color(102, 102, 102));
        txt_categoria.setBorder(null);
        jPanel2.add(txt_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 230, 30));

        jSeparator2.setForeground(new java.awt.Color(34, 105, 212));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 230, 10));

        btn_cancelar.setBackground(new java.awt.Color(13, 55, 212));
        btn_cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 100, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Categorias"));

        tabla_categoria = new javax.swing.JTable(){
            public boolean isCellEditable(int row,int column){
                return false;
            }
        };
        tabla_categoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        )
    );
    tabla_categoria.setFocusable(false);
    tabla_categoria.getTableHeader().setResizingAllowed(false);
    tabla_categoria.getTableHeader().setReorderingAllowed(false);
    tabla_categoria.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tabla_categoriaMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tabla_categoria);

    jLabel4.setText("Buscar:");

    jSeparator3.setForeground(new java.awt.Color(34, 105, 212));

    txt_buscar_categoria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    txt_buscar_categoria.setForeground(new java.awt.Color(102, 102, 102));
    txt_buscar_categoria.setBorder(null);
    txt_buscar_categoria.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            txt_buscar_categoriaKeyPressed(evt);
        }
    });

    btn_buscar.setBackground(new java.awt.Color(13, 55, 212));
    btn_buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
    btn_buscar.setText("buscar");
    btn_buscar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_buscarActionPerformed(evt);
        }
    });

    btn_salir.setBackground(new java.awt.Color(13, 55, 212));
    btn_salir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    btn_salir.setForeground(new java.awt.Color(255, 255, 255));
    btn_salir.setText("salir");
    btn_salir.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_salirActionPerformed(evt);
        }
    });

    btn_eliminar.setBackground(new java.awt.Color(13, 55, 212));
    btn_eliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
    btn_eliminar.setText("eliminar");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_buscar_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btn_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(16, 16, 16))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txt_buscar_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4))
            .addGap(0, 0, 0)
            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btn_salir)
                .addComponent(btn_eliminar)
                .addComponent(btn_buscar))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
            .addContainerGap())
    );

    jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 340, 250));

    btn_registrar.setBackground(new java.awt.Color(13, 55, 212));
    btn_registrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
    btn_registrar.setText("Registrar");
    btn_registrar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_registrarActionPerformed(evt);
        }
    });
    jPanel2.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        limpiar();
        
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        mostrar(txt_buscar_categoria.getText());
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
        if (txt_categoria.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Se debe ingresar una categoria");
            txt_categoria.requestFocus();
            return;
        }
        CategoriaController categoriaController = new CategoriaController();
        if (btn_registrar.getText().equals("Registrar")) {
            
            categoria.setNombre(txt_categoria.getText());

            if (categoriaController.insertar(categoria)) {
                JOptionPane.showMessageDialog(rootPane, "Registro de Categoria Creado");
                limpiar();
                mostrar("");
                
            }
        } else if (btn_registrar.getText().equals("Editar")) {
            //al seleccionar una fila se completa el campo id y datos de la categoria
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Esta Seguro de actualizar este item","Confirmar",2);
            if(confirmacion==0){
                categoria.setNombre(txt_categoria.getText());
                if(categoriaController.editar(categoria)){
                    System.out.println(categoria.getNombre());
                    JOptionPane.showMessageDialog(rootPane, "el item se edito correctamente");
                    limpiar();
                    mostrar("");
                }
                
            }else{
                return;
            }
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void tabla_categoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_categoriaMouseClicked
        // TODO add your handling code here:
        //tabla_categoria.getColumnModel().getColumn(0).setMaxWidth(0);
        //tabla_categoria.getColumnModel().getColumn(0).setMinWidth(0);
        if(evt.getClickCount()==2){
            int id= Integer.parseInt(tabla_categoria.getValueAt(tabla_categoria.getSelectedRow(),0).toString());
            String nombre= tabla_categoria.getValueAt(tabla_categoria.getSelectedRow(),1).toString();
            categoria.setId(id);
            categoria.setNombre(nombre);
            txt_categoria.setText(nombre);
            btn_registrar.setText("Editar");
            btn_cancelar.setEnabled(true);
            btn_eliminar.setEnabled(true);
        }
        
    }//GEN-LAST:event_tabla_categoriaMouseClicked

    private void txt_buscar_categoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscar_categoriaKeyPressed
        // TODO add your handling code here:
        
        
        //palabra += evt.getKeyChar();
        //txt_buscar_categoria.setText(palabra);
        //JOptionPane.showMessageDialog(rootPane,palabra);
        mostrar(txt_buscar_categoria.getText());
        System.out.println(palabra);
    }//GEN-LAST:event_txt_buscar_categoriaKeyPressed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
    }//GEN-LAST:event_btn_salirActionPerformed

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
            java.util.logging.Logger.getLogger(frmCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tabla_categoria;
    private javax.swing.JTextField txt_buscar_categoria;
    private javax.swing.JTextField txt_categoria;
    // End of variables declaration//GEN-END:variables
}
