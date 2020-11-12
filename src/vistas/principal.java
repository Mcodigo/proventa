package vistas;

import utilerias.modeloTabla;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class principal extends javax.swing.JFrame {

    modeloTabla tabla = new modeloTabla();
    frmVentas frmVentas;
    frmCompras frmCompras;
    frmClientes frmClientes;
    frmInventario frmInventario;
    frmProductos frmProductos;
    frmConfiguracion frmConfiguracion;
    frmCorte frmCorte;
    frmReportes frmReportes;

    public principal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mostrarVentas();
        cargarEstadoCuenta();
        cargarReporteSaldos();
        //mostrarVentas();
        /*Font font = lbSemana.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lbSemana.setFont(font.deriveFont(attributes));*/
    }

    private void mostrarVentas() {
        if (frmVentas == null) {
            frmVentas = new frmVentas();
            JDeskMain.add(frmVentas);
            frmVentas.setVisible(true);
        } else {
            frmVentas.dispose();
            frmVentas = new frmVentas();
            JDeskMain.add(frmVentas);
            frmVentas.setVisible(true);
        }
    }

    private void mostrarCompras() {
        if (frmCompras == null) {
            frmCompras = new frmCompras();
            JDeskMain.add(frmCompras);
            frmCompras.setVisible(true);
        } else {
            frmCompras.dispose();
            frmCompras = new frmCompras();
            JDeskMain.add(frmCompras);
            frmVentas.setVisible(true);
        }
    }

    private void mostrarClientes() {
        if (frmClientes == null) {
            frmClientes = new frmClientes();
            JDeskMain.add(frmClientes);
            frmClientes.setVisible(true);
        } else {
            frmClientes.dispose();
            frmClientes = new frmClientes();
            JDeskMain.add(frmClientes);
            frmClientes.setVisible(true);
        }
    }

    private void mostrarInventario() {
        if (frmInventario == null) {
            frmInventario = new frmInventario();
            JDeskMain.add(frmInventario);
            frmInventario.setVisible(true);
        } else {
            frmInventario.dispose();
            frmInventario = new frmInventario();
            JDeskMain.add(frmInventario);
            frmInventario.setVisible(true);
        }
    }

    private void mostrarProductos() {
        if (frmProductos == null) {
            frmProductos = new frmProductos();
            JDeskMain.add(frmProductos);
            frmProductos.setVisible(true);
        } else {
            frmProductos.dispose();
            frmProductos = new frmProductos();
            JDeskMain.add(frmProductos);
            frmProductos.setVisible(true);
        }
    }

    private void mostrarConfiguracion() {
        if (frmConfiguracion == null) {
            frmConfiguracion = new frmConfiguracion();
            JDeskMain.add(frmConfiguracion);
            frmConfiguracion.setVisible(true);
        } else {
            frmConfiguracion.dispose();
            frmConfiguracion = new frmConfiguracion();
            JDeskMain.add(frmConfiguracion);
            frmConfiguracion.setVisible(true);
        }
    }

    private void mostrarCorte() {
        if (frmCorte == null) {
            frmCorte = new frmCorte();
            JDeskMain.add(frmCorte);
            frmCorte.setVisible(true);
        } else {
            frmCorte.dispose();
            frmCorte = new frmCorte();
            JDeskMain.add(frmCorte);
            frmCorte.setVisible(true);
        }
    }
    
    private void mostrarReportes() {
        if (frmReportes == null) {
            frmReportes = new frmReportes();
            JDeskMain.add(frmReportes);
            frmReportes.setVisible(true);
        } else {
            frmReportes.dispose();
            frmReportes = new frmReportes();
            JDeskMain.add(frmReportes);
            frmReportes.setVisible(true);
        }
    }

    DefaultTableModel dtEstadoCuenta = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    DefaultTableModel dtReporteSaldos = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    private void cargarEstadoCuenta() {
        /*ArrayList<String> columnas = new ArrayList<>();
        columnas.add("Descripción del producto");
        columnas.add("Precio venta");
        columnas.add("Cantidad");
        columnas.add("Importe");*/
        //tabla.mostrarColumas(JtEstadoCuenta, dtEstadoCuenta, columnas);
    }

    private void cargarReporteSaldos() {

        /*ArrayList<String> columnas = new ArrayList<>();
        columnas.add("Número");
        columnas.add("Nombre / Cliente");
        columnas.add("Teléfono");
        columnas.add("Límite de Crédito");
        columnas.add("Saldo Actual");
        columnas.add("Último Pago");*/
        //tabla.mostrarColumas(JtSaldosPendientes, dtReporteSaldos, columnas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu6 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        JpPrincipal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JDeskMain = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mVentas = new javax.swing.JMenu();
        mClientes = new javax.swing.JMenu();
        mProductos = new javax.swing.JMenu();
        mInventario = new javax.swing.JMenu();
        mCompras = new javax.swing.JMenu();
        mConfiguracion = new javax.swing.JMenu();
        mCajas = new javax.swing.JMenu();
        mReportes = new javax.swing.JMenu();
        mSalir = new javax.swing.JMenu();

        jMenu6.setText("jMenu6");

        jMenu8.setText("jMenu8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROVENTA");
        setBackground(new java.awt.Color(255, 255, 255));

        JpPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Le atiende:");

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel7.setText("ADMIN");

        JDeskMain.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout JDeskMainLayout = new javax.swing.GroupLayout(JDeskMain);
        JDeskMain.setLayout(JDeskMainLayout);
        JDeskMainLayout.setHorizontalGroup(
            JDeskMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        JDeskMainLayout.setVerticalGroup(
            JDeskMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel45.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel45.setText("20 - Oct");

        jLabel46.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel46.setText("11:47 am");

        jLabel18.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel18.setText(". Derechos reservados (2020-2021)");

        jLabel17.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel17.setText("(1.1.2)");

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel6.setText("Proventa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(10, 10, 10)
                .addComponent(jLabel17)
                .addGap(16, 16, 16)
                .addComponent(jLabel18)
                .addGap(682, 682, 682)
                .addComponent(jLabel45)
                .addGap(18, 18, 18)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JpPrincipalLayout = new javax.swing.GroupLayout(JpPrincipal);
        JpPrincipal.setLayout(JpPrincipalLayout);
        JpPrincipalLayout.setHorizontalGroup(
            JpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
            .addComponent(JDeskMain)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JpPrincipalLayout.setVerticalGroup(
            JpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpPrincipalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(JpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JpPrincipalLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(JpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JDeskMain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(801, 40));

        mVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/1486395300-03-trolley_80567.png"))); // NOI18N
        mVentas.setText("Ventas");
        mVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mVentasMouseClicked(evt);
            }
        });
        jMenuBar1.add(mVentas);

        mClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/User_Group-80_icon-icons.com_57247.png"))); // NOI18N
        mClientes.setText("Clientes");
        mClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mClientesMouseClicked(evt);
            }
        });
        jMenuBar1.add(mClientes);

        mProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/shoppaymentorderbuy-10_icon-icons.com_73874.png"))); // NOI18N
        mProductos.setText("Productos");
        mProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mProductosMouseClicked(evt);
            }
        });
        jMenuBar1.add(mProductos);

        mInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/application_edit_12962.png"))); // NOI18N
        mInventario.setText("Inventario");
        mInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mInventarioMouseClicked(evt);
            }
        });
        jMenuBar1.add(mInventario);

        mCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/truck_moving_vehicle_transport_transportation_shipping_icon_142014.png"))); // NOI18N
        mCompras.setText("Compras");
        mCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mComprasMouseClicked(evt);
            }
        });
        jMenuBar1.add(mCompras);

        mConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/file_type_light_config_icon_130470.png"))); // NOI18N
        mConfiguracion.setText("Configuración");
        mConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mConfiguracionMouseClicked(evt);
            }
        });
        jMenuBar1.add(mConfiguracion);

        mCajas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cashier_icon-icons.com_53629.png"))); // NOI18N
        mCajas.setText("Corte");
        mCajas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mCajasMouseClicked(evt);
            }
        });
        jMenuBar1.add(mCajas);

        mReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/business_salesreport_salesreport_negocio_2353.png"))); // NOI18N
        mReportes.setText("Reportes");
        mReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mReportesMouseClicked(evt);
            }
        });
        jMenuBar1.add(mReportes);

        mSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/close_remove_delete_1332.png"))); // NOI18N
        mSalir.setText("Salir");
        jMenuBar1.add(mSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mVentasMouseClicked
        mostrarVentas();
    }//GEN-LAST:event_mVentasMouseClicked

    private void mComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mComprasMouseClicked
        mostrarCompras();
    }//GEN-LAST:event_mComprasMouseClicked

    private void mClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mClientesMouseClicked
        mostrarClientes();
    }//GEN-LAST:event_mClientesMouseClicked

    private void mInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mInventarioMouseClicked
        mostrarInventario();
    }//GEN-LAST:event_mInventarioMouseClicked

    private void mProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mProductosMouseClicked
        mostrarProductos();
    }//GEN-LAST:event_mProductosMouseClicked

    private void mConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mConfiguracionMouseClicked
        mostrarConfiguracion();
    }//GEN-LAST:event_mConfiguracionMouseClicked

    private void mCajasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mCajasMouseClicked
        mostrarCorte();
    }//GEN-LAST:event_mCajasMouseClicked

    private void mReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mReportesMouseClicked
        mostrarReportes();
    }//GEN-LAST:event_mReportesMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/looka ndfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDeskMain;
    private javax.swing.JPanel JpPrincipal;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mCajas;
    private javax.swing.JMenu mClientes;
    private javax.swing.JMenu mCompras;
    private javax.swing.JMenu mConfiguracion;
    private javax.swing.JMenu mInventario;
    private javax.swing.JMenu mProductos;
    private javax.swing.JMenu mReportes;
    private javax.swing.JMenu mSalir;
    private javax.swing.JMenu mVentas;
    // End of variables declaration//GEN-END:variables
}
