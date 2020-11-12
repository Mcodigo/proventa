
package vistas;

import rojeru_san.RSPanelsSlider;


public class frmClientes extends javax.swing.JInternalFrame {

   
    public frmClientes() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        mEstadoCuenta = new javax.swing.JButton();
        mNuevoCliente = new javax.swing.JButton();
        mEditarCliente = new javax.swing.JButton();
        mEliminarCliente = new javax.swing.JButton();
        mReporteSaldos = new javax.swing.JButton();
        pSliderClientes = new rojeru_san.RSPanelsSlider();
        pEcuenta = new javax.swing.JPanel();
        pEstado = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEstadoCuenta = new javax.swing.JButton();
        rSMTextFull2 = new rojeru_san.RSMTextFull();
        jLabel79 = new javax.swing.JLabel();
        pNuevoCliente = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        btnInsertarCliente = new javax.swing.JButton();
        btnCancelarNcliente = new javax.swing.JButton();
        pMcliente = new javax.swing.JPanel();
        pEstado3 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        btnEditarCliente = new javax.swing.JButton();
        rSMTextFull3 = new rojeru_san.RSMTextFull();
        jLabel80 = new javax.swing.JLabel();
        pEcliente = new javax.swing.JPanel();
        pEstado4 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        JtEliminarCliente = new javax.swing.JTable();
        btnEliminarCliente = new javax.swing.JButton();
        rSMTextFull4 = new rojeru_san.RSMTextFull();
        jLabel81 = new javax.swing.JLabel();
        pEstadoCuenta = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JtEstadoCuenta = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel15 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        pSaldos = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        JtSaldosPendientes = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("CLIENTES");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/1ae7aa7b-a29d-4dba-b43c-550486d27399_200x200.png"))); // NOI18N

        jPanel12.setBackground(new java.awt.Color(0, 204, 51));

        jLabel24.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("CREDITO A CLIENTES");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24)
        );

        mEstadoCuenta.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        mEstadoCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/construction_project_plan_building_architect_design_develop-61_icon-icons.com_60253.png"))); // NOI18N
        mEstadoCuenta.setText("Estado de cuenta");
        mEstadoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEstadoCuentaActionPerformed(evt);
            }
        });

        mNuevoCliente.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        mNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Add_User-80_icon-icons.com_57380.png"))); // NOI18N
        mNuevoCliente.setText("Nuevo Cliente");
        mNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNuevoClienteActionPerformed(evt);
            }
        });

        mEditarCliente.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        mEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Edit_User-80_icon-icons.com_57329.png"))); // NOI18N
        mEditarCliente.setText("Modificar Cliente");
        mEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEditarClienteActionPerformed(evt);
            }
        });

        mEliminarCliente.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        mEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Remove_User-80_icon-icons.com_57283.png"))); // NOI18N
        mEliminarCliente.setText("Eliminar Cliente");
        mEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEliminarClienteActionPerformed(evt);
            }
        });

        mReporteSaldos.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        mReporteSaldos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/book_120714.png"))); // NOI18N
        mReporteSaldos.setText("Reporte de Saldos");
        mReporteSaldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mReporteSaldosActionPerformed(evt);
            }
        });

        pSliderClientes.setBackground(new java.awt.Color(255, 255, 255));

        pEcuenta.setBackground(new java.awt.Color(255, 255, 255));
        pEcuenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pEcuenta.setName("pEcuenta"); // NOI18N

        pEstado.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel25.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel25.setText("Estado de Cuenta");

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
        jScrollPane2.setViewportView(jTable1);

        btnEstadoCuenta.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnEstadoCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/solicit_accept_check_ok_theaction_6340.png"))); // NOI18N
        btnEstadoCuenta.setText("Aceptar");
        btnEstadoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoCuentaActionPerformed(evt);
            }
        });

        rSMTextFull2.setForeground(new java.awt.Color(102, 102, 102));
        rSMTextFull2.setBordeColorFocus(new java.awt.Color(0, 204, 51));
        rSMTextFull2.setBotonColor(new java.awt.Color(0, 204, 51));
        rSMTextFull2.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        rSMTextFull2.setPlaceholder("Teclee el Número o el Nombre del Cliente");

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/barcode.png"))); // NOI18N

        javax.swing.GroupLayout pEstadoLayout = new javax.swing.GroupLayout(pEstado);
        pEstado.setLayout(pEstadoLayout);
        pEstadoLayout.setHorizontalGroup(
            pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pEstadoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEstadoLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(93, 93, 93))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEstadoLayout.createSequentialGroup()
                                .addGroup(pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pEstadoLayout.createSequentialGroup()
                                        .addComponent(jLabel79)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rSMTextFull2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))))
                    .addGroup(pEstadoLayout.createSequentialGroup()
                        .addComponent(btnEstadoCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31))))
        );
        pEstadoLayout.setVerticalGroup(
            pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addGroup(pEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rSMTextFull2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEstadoCuenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pEcuentaLayout = new javax.swing.GroupLayout(pEcuenta);
        pEcuenta.setLayout(pEcuentaLayout);
        pEcuentaLayout.setHorizontalGroup(
            pEcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEcuentaLayout.createSequentialGroup()
                .addGap(398, 398, 398)
                .addComponent(pEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(389, Short.MAX_VALUE))
        );
        pEcuentaLayout.setVerticalGroup(
            pEcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEcuentaLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(pEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pSliderClientes.add(pEcuenta, "card2");

        pNuevoCliente.setBackground(new java.awt.Color(255, 255, 255));
        pNuevoCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pNuevoCliente.setName("pNuevoCliente"); // NOI18N

        jLabel27.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 153, 0));
        jLabel27.setText("NUEVO CLIENTE");

        jLabel28.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 153, 0));
        jLabel28.setText("- Llene la siguiente información acerca del Nuevo Cliente:");

        jLabel29.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel29.setText("Nombre Completo:");

        jLabel30.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel30.setText("Dirección:");

        jLabel31.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel31.setText("Telefono:");

        jLabel32.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel32.setText("Limite de Crédito:");

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        jTextField2.setPreferredSize(new java.awt.Dimension(2, 21));

        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        jTextField3.setPreferredSize(new java.awt.Dimension(2, 21));

        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        jTextField4.setPreferredSize(new java.awt.Dimension(2, 21));

        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33.setText("(Si es cero, no tiene limite de crédito)");

        btnInsertarCliente.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnInsertarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/solicit_accept_check_ok_theaction_6340.png"))); // NOI18N
        btnInsertarCliente.setText("Guardar Cliente");

        btnCancelarNcliente.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnCancelarNcliente.setForeground(new java.awt.Color(204, 0, 51));
        btnCancelarNcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cancel_77947.png"))); // NOI18N
        btnCancelarNcliente.setText("Cancelar");

        javax.swing.GroupLayout pNuevoClienteLayout = new javax.swing.GroupLayout(pNuevoCliente);
        pNuevoCliente.setLayout(pNuevoClienteLayout);
        pNuevoClienteLayout.setHorizontalGroup(
            pNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNuevoClienteLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addGroup(pNuevoClienteLayout.createSequentialGroup()
                        .addGroup(pNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30))
                        .addGap(18, 18, 18)
                        .addGroup(pNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pNuevoClienteLayout.createSequentialGroup()
                                .addComponent(btnInsertarCliente)
                                .addGap(29, 29, 29)
                                .addComponent(btnCancelarNcliente))
                            .addGroup(pNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1)
                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pNuevoClienteLayout.createSequentialGroup()
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel33))))))
                .addContainerGap(634, Short.MAX_VALUE))
        );
        pNuevoClienteLayout.setVerticalGroup(
            pNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNuevoClienteLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addGap(24, 24, 24)
                .addGroup(pNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addGroup(pNuevoClienteLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(19, 19, 19)
                .addGroup(pNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertarCliente)
                    .addComponent(btnCancelarNcliente))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        pSliderClientes.add(pNuevoCliente, "card3");

        pMcliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pMcliente.setName("pMcliente"); // NOI18N

        pEstado3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel38.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel38.setText("Modificar Cliente");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable4);

        btnEditarCliente.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/solicit_accept_check_ok_theaction_6340.png"))); // NOI18N
        btnEditarCliente.setText("Aceptar");

        rSMTextFull3.setForeground(new java.awt.Color(102, 102, 102));
        rSMTextFull3.setBordeColorFocus(new java.awt.Color(0, 204, 51));
        rSMTextFull3.setBotonColor(new java.awt.Color(0, 204, 51));
        rSMTextFull3.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        rSMTextFull3.setPlaceholder("Teclee el Número o el Nombre del Cliente");

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/barcode.png"))); // NOI18N

        javax.swing.GroupLayout pEstado3Layout = new javax.swing.GroupLayout(pEstado3);
        pEstado3.setLayout(pEstado3Layout);
        pEstado3Layout.setHorizontalGroup(
            pEstado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstado3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEstado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pEstado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEstado3Layout.createSequentialGroup()
                            .addComponent(jLabel38)
                            .addGap(93, 93, 93))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEstado3Layout.createSequentialGroup()
                            .addGroup(pEstado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pEstado3Layout.createSequentialGroup()
                                    .addComponent(jLabel80)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rSMTextFull3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(31, 31, 31)))
                    .addGroup(pEstado3Layout.createSequentialGroup()
                        .addComponent(btnEditarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31))))
        );
        pEstado3Layout.setVerticalGroup(
            pEstado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstado3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel38)
                .addGap(18, 18, 18)
                .addGroup(pEstado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rSMTextFull3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pMclienteLayout = new javax.swing.GroupLayout(pMcliente);
        pMcliente.setLayout(pMclienteLayout);
        pMclienteLayout.setHorizontalGroup(
            pMclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMclienteLayout.createSequentialGroup()
                .addGap(398, 398, 398)
                .addComponent(pEstado3, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(389, Short.MAX_VALUE))
        );
        pMclienteLayout.setVerticalGroup(
            pMclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMclienteLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(pEstado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pSliderClientes.add(pMcliente, "card4");

        pEcliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pEcliente.setName("pEcliente"); // NOI18N

        pEstado4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel40.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel40.setText("Eliminar Cliente");

        JtEliminarCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        JtEliminarCliente.setSelectionBackground(new java.awt.Color(253, 207, 90));
        jScrollPane6.setViewportView(JtEliminarCliente);

        btnEliminarCliente.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/solicit_accept_check_ok_theaction_6340.png"))); // NOI18N
        btnEliminarCliente.setText("Aceptar");

        rSMTextFull4.setForeground(new java.awt.Color(102, 102, 102));
        rSMTextFull4.setBordeColorFocus(new java.awt.Color(0, 204, 51));
        rSMTextFull4.setBotonColor(new java.awt.Color(0, 204, 51));
        rSMTextFull4.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        rSMTextFull4.setPlaceholder("Teclee el Número o el Nombre del Cliente");

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/barcode.png"))); // NOI18N

        javax.swing.GroupLayout pEstado4Layout = new javax.swing.GroupLayout(pEstado4);
        pEstado4.setLayout(pEstado4Layout);
        pEstado4Layout.setHorizontalGroup(
            pEstado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstado4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEstado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pEstado4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pEstado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEstado4Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addGap(93, 93, 93))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEstado4Layout.createSequentialGroup()
                                .addGroup(pEstado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pEstado4Layout.createSequentialGroup()
                                        .addComponent(jLabel81)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rSMTextFull4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))))
                    .addGroup(pEstado4Layout.createSequentialGroup()
                        .addComponent(btnEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31))))
        );
        pEstado4Layout.setVerticalGroup(
            pEstado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstado4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel40)
                .addGap(18, 18, 18)
                .addGroup(pEstado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rSMTextFull4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminarCliente)
                .addContainerGap())
        );

        javax.swing.GroupLayout pEclienteLayout = new javax.swing.GroupLayout(pEcliente);
        pEcliente.setLayout(pEclienteLayout);
        pEclienteLayout.setHorizontalGroup(
            pEclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEclienteLayout.createSequentialGroup()
                .addGap(398, 398, 398)
                .addComponent(pEstado4, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(385, Short.MAX_VALUE))
        );
        pEclienteLayout.setVerticalGroup(
            pEclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEclienteLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(pEstado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pSliderClientes.add(pEcliente, "card5");

        pEstadoCuenta.setBackground(new java.awt.Color(255, 255, 255));
        pEstadoCuenta.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pEstadoCuenta.setName("pEstadoCuenta"); // NOI18N

        jLabel34.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 153, 0));
        jLabel34.setText("ESTADO DE CUENTA");

        jLabel35.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("JUAN ACEVES BARAJAS");

        jLabel36.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 153, 0));
        jLabel36.setText("Saldo Actual:");

        jLabel37.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 204, 0));
        jLabel37.setText("$");

        jLabel42.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 204, 0));
        jLabel42.setText("(Sin Límite)");

        jPanel13.setBackground(new java.awt.Color(204, 255, 153));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Print_icon-icons.com_73705.png"))); // NOI18N
        jButton1.setText("Imprimir Estado");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Print_icon-icons.com_73705.png"))); // NOI18N
        jButton2.setText("Imprimir Edo. Cuenta completo");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/coins_money_bank_currency_dollar_icon_150733.png"))); // NOI18N
        jButton4.setText("Abonar");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconfinder-document03-1622833_121957.png"))); // NOI18N
        jButton5.setText("Liquidar Adeudo");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/mimetypes_excel_611.png"))); // NOI18N
        jButton6.setText("Detalle de abonos");

        JtEstadoCuenta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(JtEstadoCuenta);

        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel47.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel47.setText("Mostrar ventas");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setPreferredSize(new java.awt.Dimension(56, 22));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, 0, 183, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jList1.setBackground(new java.awt.Color(153, 153, 153));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList1);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane4)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel48.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel48.setText("Impuestos:");

        jLabel49.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 153, 0));
        jLabel49.setText("0.00");

        jLabel50.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 153, 0));
        jLabel50.setText("$");

        jLabel51.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel51.setText("Total:");

        jLabel52.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 153, 0));
        jLabel52.setText("0.00");

        jLabel53.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 153, 0));
        jLabel53.setText("$");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/delete-file_40456.png"))); // NOI18N
        jButton7.setText("Eliminar");

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Print_icon.png"))); // NOI18N
        jButton8.setText("Imprimir");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49)
                .addGap(344, 344, 344)
                .addComponent(jLabel51)
                .addGap(18, 18, 18)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addGap(24, 24, 24))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel48)
                        .addComponent(jLabel49)
                        .addComponent(jLabel50)
                        .addComponent(jLabel51)
                        .addComponent(jLabel52)
                        .addComponent(jLabel53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton7)
                        .addComponent(jButton8)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel43.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 153, 0));
        jLabel43.setText("Límite de Crédito:");

        jLabel44.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 204, 0));
        jLabel44.setText("10000");

        javax.swing.GroupLayout pEstadoCuentaLayout = new javax.swing.GroupLayout(pEstadoCuenta);
        pEstadoCuenta.setLayout(pEstadoCuentaLayout);
        pEstadoCuentaLayout.setHorizontalGroup(
            pEstadoCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoCuentaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pEstadoCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pEstadoCuentaLayout.createSequentialGroup()
                        .addGroup(pEstadoCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel34))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pEstadoCuentaLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel43)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))))
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pEstadoCuentaLayout.setVerticalGroup(
            pEstadoCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoCuentaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel35)
                .addGap(18, 18, 18)
                .addGroup(pEstadoCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pSliderClientes.add(pEstadoCuenta, "card6");

        pSaldos.setBackground(new java.awt.Color(255, 255, 255));
        pSaldos.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pSaldos.setName("pSaldos"); // NOI18N

        jLabel54.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 153, 0));
        jLabel54.setText("REPORTE DE SALDOS");

        jLabel55.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 102, 0));
        jLabel55.setText("Total de Créditos Pendientes:");

        jLabel56.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(102, 204, 0));
        jLabel56.setText("$");

        jLabel57.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(102, 204, 0));
        jLabel57.setText("10000");

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Print_icon-icons.com_73705.png"))); // NOI18N
        jButton17.setText("Imprimir Reporte");

        JtSaldosPendientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(JtSaldosPendientes);

        javax.swing.GroupLayout pSaldosLayout = new javax.swing.GroupLayout(pSaldos);
        pSaldos.setLayout(pSaldosLayout);
        pSaldosLayout.setHorizontalGroup(
            pSaldosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSaldosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pSaldosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pSaldosLayout.createSequentialGroup()
                        .addComponent(jScrollPane7)
                        .addContainerGap())
                    .addGroup(pSaldosLayout.createSequentialGroup()
                        .addGroup(pSaldosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addGroup(pSaldosLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 623, Short.MAX_VALUE)
                        .addComponent(jButton17)
                        .addGap(25, 25, 25))))
        );
        pSaldosLayout.setVerticalGroup(
            pSaldosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSaldosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel54)
                .addGap(20, 20, 20)
                .addGroup(pSaldosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57)
                    .addComponent(jButton17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pSliderClientes.add(pSaldos, "card7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mEstadoCuenta)
                .addGap(18, 18, 18)
                .addComponent(mNuevoCliente)
                .addGap(18, 18, 18)
                .addComponent(mEditarCliente)
                .addGap(18, 18, 18)
                .addComponent(mEliminarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mReporteSaldos)
                .addContainerGap())
            .addComponent(pSliderClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mEstadoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mReporteSaldos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pSliderClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mEstadoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEstadoCuentaActionPerformed
        if (!this.mEstadoCuenta.isSelected()) {
            this.mEstadoCuenta.setSelected(true);
            this.mNuevoCliente.setSelected(false);
            this.mEditarCliente.setSelected(false);
            this.mEliminarCliente.setSelected(false);

            pSliderClientes.setPanelSlider(10, pEcuenta, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_mEstadoCuentaActionPerformed

    private void mNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNuevoClienteActionPerformed
        if (!this.mNuevoCliente.isSelected()) {
            this.mNuevoCliente.setSelected(true);
            this.mEstadoCuenta.setSelected(false);
            this.mEditarCliente.setSelected(false);
            this.mEliminarCliente.setSelected(false);

            pSliderClientes.setPanelSlider(10, pNuevoCliente, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_mNuevoClienteActionPerformed

    private void mEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEditarClienteActionPerformed
        if (!this.mEditarCliente.isSelected()) {
            this.mEditarCliente.setSelected(true);
            this.mEstadoCuenta.setSelected(false);
            this.mNuevoCliente.setSelected(false);
            this.mEliminarCliente.setSelected(false);

            pSliderClientes.setPanelSlider(10, pMcliente, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_mEditarClienteActionPerformed

    private void mEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEliminarClienteActionPerformed
        if (!this.mEliminarCliente.isSelected()) {
            this.mEliminarCliente.setSelected(true);
            this.mEstadoCuenta.setSelected(false);
            this.mNuevoCliente.setSelected(false);
            this.mEditarCliente.setSelected(false);

            pSliderClientes.setPanelSlider(10, pEcliente, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_mEliminarClienteActionPerformed

    private void mReporteSaldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mReporteSaldosActionPerformed
        if (!this.mReporteSaldos.isSelected()) {
            this.mReporteSaldos.setSelected(true);
            this.mEliminarCliente.setSelected(false);
            this.mEstadoCuenta.setSelected(false);
            this.mNuevoCliente.setSelected(false);
            this.mEditarCliente.setSelected(false);

            pSliderClientes.setPanelSlider(10, pSaldos, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_mReporteSaldosActionPerformed

    private void btnEstadoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoCuentaActionPerformed
        pSliderClientes.setPanelSlider(10, pEstadoCuenta, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnEstadoCuentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtEliminarCliente;
    private javax.swing.JTable JtEstadoCuenta;
    private javax.swing.JTable JtSaldosPendientes;
    private javax.swing.JButton btnCancelarNcliente;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEstadoCuenta;
    private javax.swing.JButton btnInsertarCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton mEditarCliente;
    private javax.swing.JButton mEliminarCliente;
    private javax.swing.JButton mEstadoCuenta;
    private javax.swing.JButton mNuevoCliente;
    private javax.swing.JButton mReporteSaldos;
    private javax.swing.JPanel pEcliente;
    private javax.swing.JPanel pEcuenta;
    private javax.swing.JPanel pEstado;
    private javax.swing.JPanel pEstado3;
    private javax.swing.JPanel pEstado4;
    private javax.swing.JPanel pEstadoCuenta;
    private javax.swing.JPanel pMcliente;
    private javax.swing.JPanel pNuevoCliente;
    private javax.swing.JPanel pSaldos;
    private rojeru_san.RSPanelsSlider pSliderClientes;
    private rojeru_san.RSMTextFull rSMTextFull2;
    private rojeru_san.RSMTextFull rSMTextFull3;
    private rojeru_san.RSMTextFull rSMTextFull4;
    // End of variables declaration//GEN-END:variables
}
