
package vistas;

import rojeru_san.RSPanelsSlider;


public class frmCompras extends javax.swing.JInternalFrame {

   
    public frmCompras() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel18 = new javax.swing.JPanel();
        jLabel130 = new javax.swing.JLabel();
        mComprasSugeridas = new javax.swing.JButton();
        mListaCompras = new javax.swing.JButton();
        mOrdenesCompra = new javax.swing.JButton();
        mProveedores = new javax.swing.JButton();
        mHistoricoCompras = new javax.swing.JButton();
        pSliderCompras = new rojeru_san.RSPanelsSlider();
        pComprasSugeridas = new javax.swing.JPanel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox<>();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        pHistoricoCompras = new javax.swing.JPanel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        rSMTextFull11 = new rojeru_san.RSMTextFull();
        jButton48 = new javax.swing.JButton();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        pProveedores = new javax.swing.JPanel();
        jLabel138 = new javax.swing.JLabel();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        rSMTextFull10 = new rojeru_san.RSMTextFull();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        pOrdenesCompra = new javax.swing.JPanel();
        jLabel136 = new javax.swing.JLabel();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jComboBox14 = new javax.swing.JComboBox<>();
        jLabel137 = new javax.swing.JLabel();
        rSMTextFull9 = new rojeru_san.RSMTextFull();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        pListaCompras = new javax.swing.JPanel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        rSMTextFull8 = new rojeru_san.RSMTextFull();
        jLabel135 = new javax.swing.JLabel();
        jButton37 = new javax.swing.JButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("COMPRAS");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/1ae7aa7b-a29d-4dba-b43c-550486d27399_200x200.png"))); // NOI18N

        jPanel18.setBackground(new java.awt.Color(90, 145, 190));

        jLabel130.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(255, 255, 255));
        jLabel130.setText("COMPRAS");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel130)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel130)
        );

        mComprasSugeridas.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        mComprasSugeridas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/tick-box-with-check-mark_icon-icons.com_70357.png"))); // NOI18N
        mComprasSugeridas.setText("Compras sugeridas");
        mComprasSugeridas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mComprasSugeridasActionPerformed(evt);
            }
        });

        mListaCompras.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        mListaCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/result_clipboard_check_mark_list_icon_153875.png"))); // NOI18N
        mListaCompras.setText("Lista de compras");
        mListaCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mListaComprasActionPerformed(evt);
            }
        });

        mOrdenesCompra.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        mOrdenesCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/construction_project_plan_building_architect_design_develop-61_icon-icons.com_60253.png"))); // NOI18N
        mOrdenesCompra.setText("Órdenes de compra");
        mOrdenesCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mOrdenesCompraActionPerformed(evt);
            }
        });

        mProveedores.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        mProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/prov.png"))); // NOI18N
        mProveedores.setText("Proveedores");
        mProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mProveedoresActionPerformed(evt);
            }
        });

        mHistoricoCompras.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        mHistoricoCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/3925428-cashbox-cashier-shop-icon_111576.png"))); // NOI18N
        mHistoricoCompras.setText("Histórico de compras");
        mHistoricoCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mHistoricoComprasActionPerformed(evt);
            }
        });

        pSliderCompras.setBackground(new java.awt.Color(255, 255, 255));

        pComprasSugeridas.setBackground(new java.awt.Color(255, 255, 255));
        pComprasSugeridas.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pComprasSugeridas.setName("pComprasSugeridas"); // NOI18N

        jLabel131.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(90, 145, 190));
        jLabel131.setText("Compras sugeridas");

        jLabel132.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel132.setText("Los siguientes productos tienen bajo inventario o bien, dado su ritmo de venta están por agotarse, selecciona aquellos que desees re-ordenar");

        jComboBox12.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Todos -" }));
        jComboBox12.setPreferredSize(new java.awt.Dimension(56, 22));

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane16.setViewportView(jTable10);

        javax.swing.GroupLayout pComprasSugeridasLayout = new javax.swing.GroupLayout(pComprasSugeridas);
        pComprasSugeridas.setLayout(pComprasSugeridasLayout);
        pComprasSugeridasLayout.setHorizontalGroup(
            pComprasSugeridasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16)
            .addGroup(pComprasSugeridasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pComprasSugeridasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel132)
                    .addComponent(jLabel131))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pComprasSugeridasLayout.setVerticalGroup(
            pComprasSugeridasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pComprasSugeridasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel131)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel132)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
        );

        pSliderCompras.add(pComprasSugeridas, "card2");

        pHistoricoCompras.setBackground(new java.awt.Color(255, 255, 255));
        pHistoricoCompras.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pHistoricoCompras.setName("pHistoricoCompras"); // NOI18N

        jLabel139.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(90, 145, 190));
        jLabel139.setText("HISTORICO DE COMPRAS POR PRODUCTO");

        jLabel140.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel140.setText("Por favor ingresa el código del producto para el que deseas analizar el historial de precios de compra con los diversos proveedores:");

        jLabel141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/barcode.png"))); // NOI18N

        rSMTextFull11.setForeground(new java.awt.Color(102, 102, 102));
        rSMTextFull11.setBordeColorFocus(new java.awt.Color(90, 145, 190));
        rSMTextFull11.setBotonColor(new java.awt.Color(90, 145, 190));
        rSMTextFull11.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        rSMTextFull11.setPlaceholder("Ingresa o busca o un Código de Barras");

        jButton48.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/solicit_accept_check_ok_theaction_6340.png"))); // NOI18N
        jButton48.setText("ENTER - Buscar Producto");

        jTable14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane20.setViewportView(jTable14);

        javax.swing.GroupLayout pHistoricoComprasLayout = new javax.swing.GroupLayout(pHistoricoCompras);
        pHistoricoCompras.setLayout(pHistoricoComprasLayout);
        pHistoricoComprasLayout.setHorizontalGroup(
            pHistoricoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHistoricoComprasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pHistoricoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pHistoricoComprasLayout.createSequentialGroup()
                        .addComponent(jLabel141)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSMTextFull11, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton48))
                    .addComponent(jLabel140)
                    .addComponent(jLabel139))
                .addContainerGap(65, Short.MAX_VALUE))
            .addComponent(jScrollPane20)
        );
        pHistoricoComprasLayout.setVerticalGroup(
            pHistoricoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHistoricoComprasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel139)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel140)
                .addGap(18, 18, 18)
                .addGroup(pHistoricoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pHistoricoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rSMTextFull11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel141))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
        );

        pSliderCompras.add(pHistoricoCompras, "card6");

        pProveedores.setBackground(new java.awt.Color(255, 255, 255));
        pProveedores.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pProveedores.setName("pProveedores"); // NOI18N

        jLabel138.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(90, 145, 190));
        jLabel138.setText("PROVEEDORES");

        jButton44.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        jButton44.setText("Nuevo Proveedor");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/businessapplication_edit_male_user_thepencil_theclient_negocio_2321.png"))); // NOI18N
        jButton45.setText("Modificar Proveedor");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/delete_delete_deleteusers_delete_male_user_maleclient_2348.png"))); // NOI18N
        jButton46.setText("Eliminar Proveedor");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        rSMTextFull10.setForeground(new java.awt.Color(102, 102, 102));
        rSMTextFull10.setBordeColorFocus(new java.awt.Color(90, 145, 190));
        rSMTextFull10.setBotonColor(new java.awt.Color(90, 145, 190));
        rSMTextFull10.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        rSMTextFull10.setPlaceholder("Buscar proveedores...");

        jTable13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane19.setViewportView(jTable13);

        javax.swing.GroupLayout pProveedoresLayout = new javax.swing.GroupLayout(pProveedores);
        pProveedores.setLayout(pProveedoresLayout);
        pProveedoresLayout.setHorizontalGroup(
            pProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProveedoresLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pProveedoresLayout.createSequentialGroup()
                        .addComponent(jLabel138)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pProveedoresLayout.createSequentialGroup()
                        .addComponent(jButton44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                        .addComponent(rSMTextFull10, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addComponent(jScrollPane19)
        );
        pProveedoresLayout.setVerticalGroup(
            pProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProveedoresLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel138)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton44)
                    .addComponent(jButton45)
                    .addComponent(jButton46)
                    .addComponent(rSMTextFull10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
        );

        pSliderCompras.add(pProveedores, "card5");

        pOrdenesCompra.setBackground(new java.awt.Color(255, 255, 255));
        pOrdenesCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pOrdenesCompra.setName("pOrdenesCompra"); // NOI18N

        jLabel136.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(90, 145, 190));
        jLabel136.setText("ORDENES DE COMPRA");

        jButton38.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/3298601-document-new-new-document-plus_106996.png"))); // NOI18N
        jButton38.setText("Nueva orden de compra...");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/mimetypes_excel_611.png"))); // NOI18N
        jButton39.setText("Archivar orden de compra...");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jComboBox14.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Todos -" }));
        jComboBox14.setPreferredSize(new java.awt.Dimension(56, 22));

        jLabel137.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel137.setText("Mostrar órdenes desde");

        rSMTextFull9.setForeground(new java.awt.Color(102, 102, 102));
        rSMTextFull9.setBordeColorFocus(new java.awt.Color(90, 145, 190));
        rSMTextFull9.setBotonColor(new java.awt.Color(90, 145, 190));
        rSMTextFull9.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        rSMTextFull9.setPlaceholder("Buscar órdenes de compra...");

        jButton40.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/mail.png"))); // NOI18N
        jButton40.setText("Enviar por correo");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Print_icon-icons.com_73705.png"))); // NOI18N
        jButton41.setText("Imprimir");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/save_14949.png"))); // NOI18N
        jButton42.setText("Guardar orden");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/3298601-document-new-new-document-plus_106996.png"))); // NOI18N
        jButton43.setText("Ver orden de compra...");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane18.setViewportView(jTable12);

        javax.swing.GroupLayout pOrdenesCompraLayout = new javax.swing.GroupLayout(pOrdenesCompra);
        pOrdenesCompra.setLayout(pOrdenesCompraLayout);
        pOrdenesCompraLayout.setHorizontalGroup(
            pOrdenesCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOrdenesCompraLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pOrdenesCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pOrdenesCompraLayout.createSequentialGroup()
                        .addComponent(jButton40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton43))
                    .addGroup(pOrdenesCompraLayout.createSequentialGroup()
                        .addGroup(pOrdenesCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel136)
                            .addGroup(pOrdenesCompraLayout.createSequentialGroup()
                                .addComponent(jButton38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton39)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addGroup(pOrdenesCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel137)
                            .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rSMTextFull9, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jScrollPane18)
        );
        pOrdenesCompraLayout.setVerticalGroup(
            pOrdenesCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOrdenesCompraLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pOrdenesCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pOrdenesCompraLayout.createSequentialGroup()
                        .addComponent(jLabel137)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pOrdenesCompraLayout.createSequentialGroup()
                        .addComponent(jLabel136)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pOrdenesCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton38)
                            .addComponent(jButton39)
                            .addComponent(rSMTextFull9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pOrdenesCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton40)
                    .addComponent(jButton41)
                    .addComponent(jButton42)
                    .addComponent(jButton43))
                .addContainerGap())
        );

        pSliderCompras.add(pOrdenesCompra, "card4");

        pListaCompras.setBackground(new java.awt.Color(255, 255, 255));
        pListaCompras.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pListaCompras.setName("pListaCompras"); // NOI18N

        jLabel133.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(90, 145, 190));
        jLabel133.setText("LISTA DE COMPRAS");

        jLabel134.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel134.setText("Por favor captura todos los productos que desees resurtir, cuando termines haz click en \"Crear órdenes de compra\"");

        jComboBox13.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Todos -" }));
        jComboBox13.setPreferredSize(new java.awt.Dimension(56, 22));

        rSMTextFull8.setForeground(new java.awt.Color(102, 102, 102));
        rSMTextFull8.setBordeColorFocus(new java.awt.Color(90, 145, 190));
        rSMTextFull8.setBotonColor(new java.awt.Color(90, 145, 190));
        rSMTextFull8.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        rSMTextFull8.setPlaceholder("Escanéa o ingresa el código del producto que desees ordenar");

        jLabel135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/barcode.png"))); // NOI18N

        jButton37.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/undoarrow_undo_1534.png"))); // NOI18N
        jButton37.setText("Agregar...");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane17.setViewportView(jTable11);

        javax.swing.GroupLayout pListaComprasLayout = new javax.swing.GroupLayout(pListaCompras);
        pListaCompras.setLayout(pListaComprasLayout);
        pListaComprasLayout.setHorizontalGroup(
            pListaComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pListaComprasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pListaComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel134)
                    .addComponent(jLabel133)
                    .addGroup(pListaComprasLayout.createSequentialGroup()
                        .addComponent(jLabel135)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSMTextFull8, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                        .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jScrollPane17)
        );
        pListaComprasLayout.setVerticalGroup(
            pListaComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pListaComprasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel133)
                .addGap(18, 18, 18)
                .addComponent(jLabel134)
                .addGap(18, 18, 18)
                .addGroup(pListaComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pListaComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rSMTextFull8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton37)
                        .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel135))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
        );

        pSliderCompras.add(pListaCompras, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mComprasSugeridas)
                .addGap(18, 18, 18)
                .addComponent(mListaCompras)
                .addGap(18, 18, 18)
                .addComponent(mOrdenesCompra)
                .addGap(18, 18, 18)
                .addComponent(mProveedores)
                .addGap(18, 18, 18)
                .addComponent(mHistoricoCompras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pSliderCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mComprasSugeridas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mListaCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mOrdenesCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mHistoricoCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pSliderCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mComprasSugeridasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mComprasSugeridasActionPerformed
        if (!this.mComprasSugeridas.isSelected()) {
            this.mComprasSugeridas.setSelected(true);
            this.mHistoricoCompras.setSelected(false);
            this.mOrdenesCompra.setSelected(false);
            this.mProveedores.setSelected(false);
            this.mListaCompras.setSelected(false);

            pSliderCompras.setPanelSlider(10, pComprasSugeridas, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_mComprasSugeridasActionPerformed

    private void mListaComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mListaComprasActionPerformed
        if (!this.mListaCompras.isSelected()) {
            this.mListaCompras.setSelected(true);
            this.mHistoricoCompras.setSelected(false);
            this.mOrdenesCompra.setSelected(false);
            this.mProveedores.setSelected(false);
            this.mComprasSugeridas.setSelected(false);

            pSliderCompras.setPanelSlider(10, pListaCompras, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_mListaComprasActionPerformed

    private void mOrdenesCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mOrdenesCompraActionPerformed
        if (!this.mOrdenesCompra.isSelected()) {
            this.mOrdenesCompra.setSelected(true);
            this.mHistoricoCompras.setSelected(false);
            this.mListaCompras.setSelected(false);
            this.mProveedores.setSelected(false);
            this.mComprasSugeridas.setSelected(false);

            pSliderCompras.setPanelSlider(10, pOrdenesCompra, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_mOrdenesCompraActionPerformed

    private void mProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mProveedoresActionPerformed
        if (!this.mProveedores.isSelected()) {
            this.mProveedores.setSelected(true);
            this.mHistoricoCompras.setSelected(false);
            this.mListaCompras.setSelected(false);
            this.mOrdenesCompra.setSelected(false);
            this.mComprasSugeridas.setSelected(false);

            pSliderCompras.setPanelSlider(10, pProveedores, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_mProveedoresActionPerformed

    private void mHistoricoComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mHistoricoComprasActionPerformed
        if (!this.mHistoricoCompras.isSelected()) {
            this.mHistoricoCompras.setSelected(true);
            this.mProveedores.setSelected(false);
            this.mListaCompras.setSelected(false);
            this.mOrdenesCompra.setSelected(false);
            this.mComprasSugeridas.setSelected(false);

            pSliderCompras.setPanelSlider(10, pHistoricoCompras, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_mHistoricoComprasActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton37ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton48;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable14;
    private javax.swing.JButton mComprasSugeridas;
    private javax.swing.JButton mHistoricoCompras;
    private javax.swing.JButton mListaCompras;
    private javax.swing.JButton mOrdenesCompra;
    private javax.swing.JButton mProveedores;
    private javax.swing.JPanel pComprasSugeridas;
    private javax.swing.JPanel pHistoricoCompras;
    private javax.swing.JPanel pListaCompras;
    private javax.swing.JPanel pOrdenesCompra;
    private javax.swing.JPanel pProveedores;
    private rojeru_san.RSPanelsSlider pSliderCompras;
    private rojeru_san.RSMTextFull rSMTextFull10;
    private rojeru_san.RSMTextFull rSMTextFull11;
    private rojeru_san.RSMTextFull rSMTextFull8;
    private rojeru_san.RSMTextFull rSMTextFull9;
    // End of variables declaration//GEN-END:variables
}
