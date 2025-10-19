import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public class miventana extends javax.swing.JFrame {
    private final ArticulosManager manager = new ArticulosManager(); // Reemplazo de ObjectContainer
    private final List<Articulos> productList = new ArrayList<>();  // Lista que contiene los productos

    public miventana() {
        initComponents();
        cargarProductos();  // Cargar los productos al iniciar la aplicación
    }

    private void cargarProductos() {
        List<Articulos> productos = manager.getAllArticulos();
        productList.clear();
        productList.addAll(productos);  // Cargar todos los productos a la lista
    }

    private void guardarProductoEnBaseDeDatos(Articulos product) {
        try {
            manager.saveArticulo(product);  // Usar ArticulosManager
            JOptionPane.showMessageDialog(null, "Producto guardado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el producto en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_codigo = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();
        lb_cantidad = new javax.swing.JLabel();
        lb_descripcion = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        tf_cantidad = new javax.swing.JTextField();
        tf_descripcion = new javax.swing.JTextField();
        bt_insertar = new javax.swing.JButton();
        bt_buscar = new javax.swing.JButton();
        bt_borrar = new javax.swing.JButton();
        bt_modificar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lb_listado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_mostrar = new javax.swing.JTextArea();
        bt_mostrar = new javax.swing.JButton();
        bt_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb_codigo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lb_codigo.setText("Código");

        lb_nombre.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lb_nombre.setText("Nombre");

        lb_cantidad.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lb_cantidad.setText("Cantidad");

        lb_descripcion.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lb_descripcion.setText("Descripción");

        bt_insertar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bt_insertar.setText("Insertar");
        bt_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_insertarActionPerformed(evt);
            }
        });

        bt_buscar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bt_buscar.setText("Buscar");
        bt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscarActionPerformed(evt);
            }
        });

        bt_borrar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bt_borrar.setText("Borrar");
        bt_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_borrarActionPerformed(evt);
            }
        });

        bt_modificar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bt_modificar.setText("Modificar");
        bt_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_codigo)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lb_nombre)
                                        .addComponent(lb_cantidad)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lb_descripcion)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(tf_descripcion)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_codigo, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_insertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                        .addGap(12, 12, 12)))
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_codigo)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nombre))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cantidad)
                    .addComponent(tf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_descripcion)
                    .addComponent(tf_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_insertar)
                    .addComponent(bt_buscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(bt_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb_listado.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lb_listado.setText("Listado de productos");
        lb_listado.setToolTipText("");

        ta_mostrar.setColumns(20);
        ta_mostrar.setRows(5);
        jScrollPane1.setViewportView(ta_mostrar);

        bt_mostrar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bt_mostrar.setText("Mostrar");
        bt_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mostrarActionPerformed(evt);
            }
        });

        bt_salir.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bt_salir.setText("Salir");
        bt_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(lb_listado)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(bt_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lb_listado)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_mostrar)
                    .addComponent(bt_salir))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_insertarActionPerformed
        // TODO add your handling code here:
         try {
            String codigoStr = tf_codigo.getText();
            String nombre = tf_nombre.getText();
            String cantidadStr = tf_cantidad.getText();
            String descripcion = tf_descripcion.getText();

            if (codigoStr.isEmpty() || nombre.isEmpty() || cantidadStr.isEmpty() || descripcion.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int codigo = Integer.parseInt(codigoStr);
            int cantidad = Integer.parseInt(cantidadStr);

            if (!nombre.matches(".*[a-zA-Z]+.*")) {
                JOptionPane.showMessageDialog(null, "El nombre debe contener letras.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!descripcion.matches(".*[a-zA-Z]+.*")) {
                JOptionPane.showMessageDialog(null, "La descripción debe contener letras.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Articulos product = new Articulos(codigo, nombre, cantidad, descripcion);
            guardarProductoEnBaseDeDatos(product);
            productList.add(product);  // Añadir a la lista local

            JOptionPane.showMessageDialog(null, "Producto insertado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

            tf_codigo.setText("");
            tf_nombre.setText("");
            tf_cantidad.setText("");
            tf_descripcion.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Código y cantidad deben ser números.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al insertar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_insertarActionPerformed

    
    private void bt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarActionPerformed
        // TODO add your handling code here:
        try {
            String codigoStr = tf_codigo.getText();
            if (codigoStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un código para buscar.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int codigo = Integer.parseInt(codigoStr);
            Articulos productToFind = manager.findArticuloByCodigo(codigo);

            if (productToFind != null) {
                ta_mostrar.setText(productToFind.toString());
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un producto con ese código.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El código debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al buscar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_buscarActionPerformed

    private void bt_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mostrarActionPerformed
        // TODO add your handling code here:
        cargarProductos();  // Actualizar la lista desde BD
        if (productList.isEmpty()) {
            ta_mostrar.setText("No hay productos para mostrar.");
        } else {
            showAllProducts();
        }
    }//GEN-LAST:event_bt_mostrarActionPerformed

    private void bt_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salirActionPerformed
         // Cerrar la aplicación
        manager.close();  // Cerrar conexión a la BD
        System.exit(0);
    }//GEN-LAST:event_bt_salirActionPerformed

    private void bt_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modificarActionPerformed
        // TODO add your handling code here:
        try {
            String codigoStr = tf_codigo.getText();
            if (codigoStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un código para modificar.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int codigo = Integer.parseInt(codigoStr);
            Articulos existing = manager.findArticuloByCodigo(codigo);

            if (existing != null) {
                existing.setNombre(tf_nombre.getText());
                existing.setCantidad(Integer.parseInt(tf_cantidad.getText()));
                existing.setDescripcion(tf_descripcion.getText());

                manager.updateArticulo(existing);

                JOptionPane.showMessageDialog(this, "Producto modificado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Producto no encontrado para modificar.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El código y la cantidad deben ser números.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_modificarActionPerformed

    private void bt_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_borrarActionPerformed
        // TODO add your handling code here:
        try {
            String codigoStr = tf_codigo.getText();
            if (codigoStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese un código para borrar.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int codigo = Integer.parseInt(codigoStr);
            Articulos producto = manager.findArticuloByCodigo(codigo);

            if (producto != null) {
                int response = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar el producto?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    manager.deleteArticulo(codigo);
                    productList.removeIf(p -> p.getCodigo() == codigo);  // Actualizar lista local

                    JOptionPane.showMessageDialog(this, "Producto eliminado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    tf_codigo.setText("");
                    tf_nombre.setText("");
                    tf_cantidad.setText("");
                    tf_descripcion.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Producto no encontrado para borrar.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El código debe ser un número.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_borrarActionPerformed

    private void showAllProducts() {
        StringBuilder sb = new StringBuilder();
        for (Articulos p : productList) {
            sb.append(p.toString()).append("\n");
        }
        ta_mostrar.setText(sb.toString());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new miventana().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_borrar;
    private javax.swing.JButton bt_buscar;
    private javax.swing.JButton bt_insertar;
    private javax.swing.JButton bt_modificar;
    private javax.swing.JButton bt_mostrar;
    private javax.swing.JButton bt_salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_cantidad;
    private javax.swing.JLabel lb_codigo;
    private javax.swing.JLabel lb_descripcion;
    private javax.swing.JLabel lb_listado;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JTextArea ta_mostrar;
    private javax.swing.JTextField tf_cantidad;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_descripcion;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
}
