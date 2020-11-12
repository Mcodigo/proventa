/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import utilerias.modeloTabla;

/**
 *
 * @author BSISTEMAS
 */
public class frmVentas extends javax.swing.JInternalFrame {

    modeloTabla tabla = new modeloTabla();

    DefaultTableModel dtVentas = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public frmVentas() {
        initComponents();
        columnasVentas();
    }

    private void columnasVentas() {
        ArrayList<String> columnas = new ArrayList<>();
        columnas.add("Código de Barras");
        columnas.add("Descripción del Producto");
        columnas.add("Precio Venta");
        columnas.add("Cantidad");
        columnas.add("Importe");
        columnas.add("Existencia");
        tabla.mostrarColumas(tbVentas, dtVentas, columnas);
         

        tbVentas.getColumnModel().getColumn(0).setMaxWidth(135);
        tbVentas.getColumnModel().getColumn(0).setMinWidth(135);
        tbVentas.getColumnModel().getColumn(1).setMaxWidth(340);
        tbVentas.getColumnModel().getColumn(1).setMinWidth(340);
        tbVentas.getColumnModel().getColumn(2).setMaxWidth(135);
        tbVentas.getColumnModel().getColumn(2).setMinWidth(135);
        tbVentas.getColumnModel().getColumn(3).setMaxWidth(80);
        tbVentas.getColumnModel().getColumn(3).setMinWidth(80);
        tbVentas.getColumnModel().getColumn(4).setMaxWidth(135);
        tbVentas.getColumnModel().getColumn(4).setMinWidth(135);
        tbVentas.getColumnModel().getColumn(5).setMaxWidth(90);
        tbVentas.getColumnModel().getColumn(5).setMinWidth(90);

        tbVentas.getTableHeader().setBackground(Color.decode("#EBE9D8"));
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtBarras = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        tabVentas = new javax.swing.JTabbedPane();
        TabVentas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVentas = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        txtUtotal = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtUpago = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtUcambio = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("VENTAS");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/1ae7aa7b-a29d-4dba-b43c-550486d27399_200x200.png"))); // NOI18N

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel7.setBackground(new java.awt.Color(153, 204, 255));

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("VENTA - Ticket");

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("1");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Código del Producto:");

        jButton9.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/check_ok_accept_apply_1582.png"))); // NOI18N
        jButton9.setText("ENTER - Agregar Producto");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/barcode.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBarras)
                            .addComponent(jLabel10))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton10.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/xmag_search_find_export_locate_5984.png"))); // NOI18N
        jButton10.setText("F7 Buscar");

        jButton11.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/star_77949.png"))); // NOI18N
        jButton11.setText("F8 Mayoreo");

        jButton13.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/goprevious_103394.png"))); // NOI18N
        jButton13.setText("F9 Salidas");

        jButton12.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/gonext_103393.png"))); // NOI18N
        jButton12.setText("F10 Entradas");

        jButton14.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/32officeicons-3_89720.png"))); // NOI18N
        jButton14.setText("DEL Borrar Art.");

        tabVentas.setBackground(new java.awt.Color(235, 233, 216));
        tabVentas.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        tabVentas.setOpaque(true);

        TabVentas.setBackground(new java.awt.Color(255, 255, 255));
        TabVentas.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N

        tbVentas.setBackground(new java.awt.Color(221, 239, 239));
        tbVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"asxd", "sd", "sdsd", null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbVentas.setShowHorizontalLines(false);
        tbVentas.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tbVentas);

        javax.swing.GroupLayout TabVentasLayout = new javax.swing.GroupLayout(TabVentas);
        TabVentas.setLayout(TabVentasLayout);
        TabVentasLayout.setHorizontalGroup(
            TabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1295, Short.MAX_VALUE)
        );
        TabVentasLayout.setVerticalGroup(
            TabVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );

        tabVentas.addTab("Ticket 1", new javax.swing.ImageIcon(getClass().getResource("/recursos/ecommerce-ticket_98074.png")), TabVentas); // NOI18N

        jPanel5.setBackground(new java.awt.Color(221, 239, 239));

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txtUtotal.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtUtotal.setText("Total:");

        jLabel11.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 204));
        jLabel11.setText("$");

        jLabel12.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("0.00");

        jLabel14.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 204));
        jLabel14.setText("0.00");

        jLabel13.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 204));
        jLabel13.setText("$");

        txtUpago.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtUpago.setText("Pagó Con:");

        jLabel16.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 204));
        jLabel16.setText("0.00");

        jLabel15.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 204));
        jLabel15.setText("$");

        txtUcambio.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtUcambio.setText("Cambio:");

        jButton16.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Print_icon-icons.com_73705.png"))); // NOI18N
        jButton16.setText("Reimprimir el Último Ticket");

        jButton15.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/1492616984-7-docs-document-file-data-google-suits_83406.png"))); // NOI18N
        jButton15.setText("Ventas del día y Devoluciones");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtUtotal))
                .addGap(42, 42, 42)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUpago)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtUcambio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton16)
                .addGap(18, 18, 18)
                .addComponent(jButton15)
                .addGap(43, 43, 43))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUtotal)
                            .addComponent(txtUpago)
                            .addComponent(txtUcambio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton15)
                        .addComponent(jButton16)))
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("0");

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Productos en la venta actual");

        jLabel19.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 204));
        jLabel19.setText("$");

        jLabel20.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 204));
        jLabel20.setText("0.00");

        jLabel23.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 51, 204));
        jLabel23.setText("0.00");

        jLabel21.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 51, 204));
        jLabel21.setText("Subtotal:");

        jLabel22.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 51, 204));
        jLabel22.setText("$");

        jButton3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 51));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/1486564172-finance-loan-money_81492.png"))); // NOI18N
        jButton3.setText("F12 - Cobrar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(512, 512, 512)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel22)))
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabVentas)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton10)
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addGap(18, 18, 18)
                .addComponent(jButton13)
                .addGap(18, 18, 18)
                .addComponent(jButton12)
                .addGap(18, 18, 18)
                .addComponent(jButton14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TabVentas;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tabVentas;
    private javax.swing.JTable tbVentas;
    private javax.swing.JTextField txtBarras;
    private javax.swing.JLabel txtUcambio;
    private javax.swing.JLabel txtUpago;
    private javax.swing.JLabel txtUtotal;
    // End of variables declaration//GEN-END:variables
}
