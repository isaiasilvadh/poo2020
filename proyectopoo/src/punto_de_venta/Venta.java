
package punto_de_venta;

/**
 *
 * @author isaia
 */
public class Venta extends javax.swing.JFrame {
     boolean bandera = false;
    double subtotal = 0;
    int contador = 0;
    VentaProducto aux = new VentaProducto();

    
    public Venta() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        labelNombreProdc = new javax.swing.JLabel();
        labelStock = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textcantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        txtprod = new javax.swing.JLabel();
        txtcant = new javax.swing.JLabel();
        TxtProducto = new javax.swing.JLabel();
        txtunit = new javax.swing.JLabel();
        txtsiniva = new javax.swing.JLabel();
        TxtCantidad = new javax.swing.JLabel();
        TxtSinIva = new javax.swing.JLabel();
        TxtUnitario = new javax.swing.JLabel();
        lblcantidad = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        Subtotal = new javax.swing.JLabel();
        Iva = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Punto de Venta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese nombre o inicial del producto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });
        getContentPane().add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 121, 220, 40));

        btnBuscar.setBackground(new java.awt.Color(0, 51, 102));
        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, -1, 40));

        labelNombreProdc.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        labelNombreProdc.setForeground(new java.awt.Color(255, 255, 255));
        labelNombreProdc.setText("Nombre Producto:");
        getContentPane().add(labelNombreProdc, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        labelStock.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        labelStock.setForeground(new java.awt.Color(255, 255, 255));
        labelStock.setText("Stock");
        getContentPane().add(labelStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 170, 30));

        labelPrecio.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        labelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        labelPrecio.setText("Precio");
        getContentPane().add(labelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        lblStock.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblStock.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 70, 30));

        lblPrecio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 50, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("$");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 16, 30));

        btnMenu.setBackground(new java.awt.Color(0, 51, 102));
        btnMenu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("Menú");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 90, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 102));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 70, 30));

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese cantidad de productos: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        textcantidad.setForeground(new java.awt.Color(0, 51, 102));
        textcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcantidadActionPerformed(evt);
            }
        });
        getContentPane().add(textcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, 70, 30));

        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar compra");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, -1, 30));

        txtprod.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        txtprod.setForeground(new java.awt.Color(255, 255, 255));
        txtprod.setText("Producto");
        getContentPane().add(txtprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        txtcant.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        txtcant.setForeground(new java.awt.Color(255, 255, 255));
        txtcant.setText("Cantidad");
        getContentPane().add(txtcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        TxtProducto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TxtProducto.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(TxtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 140, 30));

        txtunit.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        txtunit.setForeground(new java.awt.Color(255, 255, 255));
        txtunit.setText("Precio Unitario");
        getContentPane().add(txtunit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, 20));

        txtsiniva.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        txtsiniva.setForeground(new java.awt.Color(255, 255, 255));
        txtsiniva.setText("Precio sin IVA");
        getContentPane().add(txtsiniva, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, -1, -1));

        TxtCantidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TxtCantidad.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(TxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 170, 30));

        TxtSinIva.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TxtSinIva.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(TxtSinIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 379, 60, 30));

        TxtUnitario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TxtUnitario.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(TxtUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 80, 30));

        lblcantidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblcantidad.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(lblcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 200, 30));

        btnGenerar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGenerar.setText("Generar compra");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 540, 190, 40));

        Subtotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Subtotal.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 160, 30));

        Iva.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Iva.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, 160, 30));

        Total.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Total.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, 160, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3057.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      
        String nombre_buscar = txtBusqueda.getText();
       
        lblNombre.setText("No existe el producto");
        lblStock.setText("-----");
        lblPrecio.setText("------");
        bandera = false;
        for (Producto p : Registro.productos) {
            
            if (p.getNombre().contains(nombre_buscar.toLowerCase())) {
                contador++;
                bandera = true;
                lblNombre.setText(p.getNombre());
                lblStock.setText(String.valueOf(p.getCantidad()));
                lblPrecio.setText(String.valueOf(p.getPrecio()));
               
                aux.setNombre(p.getNombre());
                aux.setPrecio(p.getPrecio());

            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu objmenu = new Menu();
        objmenu.show();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textcantidadActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       
        if (bandera) {
            
            int cantidad = Integer.parseInt(textcantidad.getText());
            
            if (cantidad <= aux.getCantidad() || cantidad > 0) {
                // almacenamos en el objeto la cantidad
                aux.setCantidad(cantidad);
                // calculamos el subtotal
                aux.calcularSubtotal();
                // sumamos el subtotal para el total
                subtotal += aux.getSubtotal();
                // Datos regitrados
                txtprod.setText("Nombre del producto");
                txtcant.setText("Cantidad");
                txtunit.setText("Precio unitario");
                txtsiniva.setText("Precio sin iva");
                TxtProducto.setText(aux.getNombre());
                TxtCantidad.setText(String.valueOf(cantidad));
                TxtUnitario.setText(String.valueOf("$" + aux.getPrecio()));
                TxtSinIva.setText(String.valueOf("$" + aux.getSubtotal()));
              
                lblcantidad.setText("PRODUCTO AGREGADO");
               
            } else {
                
                lblcantidad.setText("No disponible");
                textcantidad.setText("");
            }
        }
    
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
         aux.setSubtotal(subtotal);
        aux.calcularIva();
        aux.calcularTotal();
        Subtotal.setText("Subtotal: $" + aux.getSubtotal());
        Iva.setText("Iva: $" + aux.getIva());
        Total.setText("Total: $" + aux.getTotal());
    }//GEN-LAST:event_btnGenerarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Iva;
    private javax.swing.JLabel Subtotal;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel TxtCantidad;
    private javax.swing.JLabel TxtProducto;
    private javax.swing.JLabel TxtSinIva;
    private javax.swing.JLabel TxtUnitario;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelNombreProdc;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelStock;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblcantidad;
    private javax.swing.JTextField textcantidad;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JLabel txtcant;
    private javax.swing.JLabel txtprod;
    private javax.swing.JLabel txtsiniva;
    private javax.swing.JLabel txtunit;
    // End of variables declaration//GEN-END:variables
}
