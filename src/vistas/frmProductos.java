package vistas;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import utilerias.modeloTabla;
import rojeru_san.RSPanelsSlider;
import utilerias.fuenteTabla;

public class frmProductos extends javax.swing.JInternalFrame {

    public frmProductos() {
        initComponents();
        columnasDep();
    }

    modeloTabla tabla = new modeloTabla();
    fuenteTabla fuente = new fuenteTabla();
   

    DefaultTableModel dtDep = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    private void columnasDep() {
        ArrayList<String> columnas = new ArrayList<>();
        columnas.add("ID");
        columnas.add("DEPARTAMENTOS");
        tabla.mostrarColumas(JtDepartamentos, dtDep, columnas);
        fuente.cargarFuente(JtDepartamentos);

        JtDepartamentos.getColumnModel().getColumn(0).setMaxWidth(0);
        JtDepartamentos.getColumnModel().getColumn(0).setMinWidth(0);
        JtDepartamentos.getColumnModel().getColumn(0).setPreferredWidth(0);
        JtDepartamentos.getColumnModel().getColumn(1).setMaxWidth(315);
        JtDepartamentos.getColumnModel().getColumn(1).setMinWidth(315);

        JtDepartamentos.getTableHeader().setBackground(Color.decode("#EBE9D8"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mNuevoProducto = new javax.swing.JButton();
        mMproducto = new javax.swing.JButton();
        mEproducto = new javax.swing.JButton();
        mDepartamentos = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        mVentasPeriodo = new javax.swing.JButton();
        mPromociones = new javax.swing.JButton();
        mImportar = new javax.swing.JButton();
        mCatalogo = new javax.swing.JButton();
        pSliderProductos = new rojeru_san.RSPanelsSlider();
        pNProducto = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tbProductos = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel69 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        tbImpuestos = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        pEProducto = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        rSMTextFull2 = new rojeru_san.RSMTextFull();
        pDepartamentos = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        txtBuscarDep = new rojeru_san.RSMTextFull();
        jScrollPane9 = new javax.swing.JScrollPane();
        JtDepartamentos = new javax.swing.JTable();
        btnNuevoDep = new javax.swing.JButton();
        btnEliminarDep = new javax.swing.JButton();
        txtDep = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        txtNombreDep = new javax.swing.JTextField();
        btnGuardarDep = new javax.swing.JButton();
        btnCancelarDep = new javax.swing.JButton();
        pVPeriodo = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        pPromociones = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jLabel102 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton27 = new javax.swing.JButton();
        pCatalogo = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel105 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jComboBox7 = new javax.swing.JComboBox<>();
        rSMTextFull12 = new rojeru_san.RSMTextFull();
        pMProducto = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        rSMTextFull4 = new rojeru_san.RSMTextFull();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("PRODUCTOS");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/1ae7aa7b-a29d-4dba-b43c-550486d27399_200x200.png"))); // NOI18N

        mNuevoProducto.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        mNuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/3298601-document-new-new-document-plus_106996.png"))); // NOI18N
        mNuevoProducto.setText("Nuevo");
        mNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNuevoProductoActionPerformed(evt);
            }
        });

        mMproducto.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        mMproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/application_edit_12962.png"))); // NOI18N
        mMproducto.setText("Modificar");
        mMproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMproductoActionPerformed(evt);
            }
        });

        mEproducto.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        mEproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/36_104857.png"))); // NOI18N
        mEproducto.setText("Eliminar");
        mEproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mEproductoActionPerformed(evt);
            }
        });

        mDepartamentos.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        mDepartamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/1486395291-08-sales_80583.png"))); // NOI18N
        mDepartamentos.setText("Departamentos");
        mDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDepartamentosActionPerformed(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(255, 204, 51));

        jLabel58.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("PRODUCTOS");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel58)
        );

        mVentasPeriodo.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        mVentasPeriodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/calendar_office_day_1474.png"))); // NOI18N
        mVentasPeriodo.setText("Ventas por Período");
        mVentasPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mVentasPeriodoActionPerformed(evt);
            }
        });

        mPromociones.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        mPromociones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/star_77949.png"))); // NOI18N
        mPromociones.setText("Promociones");
        mPromociones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPromocionesActionPerformed(evt);
            }
        });

        mImportar.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        mImportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/import_icon-icons.com_52387.png"))); // NOI18N
        mImportar.setText("Importar");
        mImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mImportarActionPerformed(evt);
            }
        });

        mCatalogo.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        mCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/table_1061.png"))); // NOI18N
        mCatalogo.setText("Catálogo");
        mCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCatalogoActionPerformed(evt);
            }
        });

        pNProducto.setBackground(new java.awt.Color(255, 255, 255));
        pNProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pNProducto.setName("pNProducto"); // NOI18N

        jLabel59.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 204, 51));
        jLabel59.setText("NUEVO PRODUCTO");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        jTabbedPane1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jLabel60.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel60.setText("Código de Barras:");

        jLabel61.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel61.setText("Descripción:");

        jLabel62.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel62.setText("Se vende:");

        jLabel63.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel63.setText("Precio Costo:");

        jLabel64.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel64.setText("Ganancia:");

        jLabel65.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel65.setText("Precio Venta:");

        jLabel66.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel66.setText("Precio Mayoreo:");

        jLabel67.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel67.setText("Departamento:");

        jLabel68.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel68.setText("Proveedor:");

        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        jTextField6.setPreferredSize(new java.awt.Dimension(6, 22));

        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        jTextField7.setPreferredSize(new java.awt.Dimension(6, 22));

        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        jTextField11.setPreferredSize(new java.awt.Dimension(6, 22));
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        jTextField13.setPreferredSize(new java.awt.Dimension(6, 22));
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jSpinner1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        jRadioButton1.setText("Por Unididad / Pza");

        jRadioButton2.setText("A Granel (Usa Decimales)");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Como paquete (kit)");

        jLabel69.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel69.setText("Unidad de Medida:");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setText("Este producto SI utiliza inventario.");
        jCheckBox1.setBorder(null);

        jLabel70.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel70.setText("Hay:");

        jLabel71.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel71.setText("Mínimo:");

        jLabel72.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel72.setText("Máximo:");

        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        jTextField12.setPreferredSize(new java.awt.Dimension(6, 22));
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jTextField14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        jTextField14.setPreferredSize(new java.awt.Dimension(6, 22));
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jTextField15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        jTextField15.setPreferredSize(new java.awt.Dimension(6, 22));
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jTextField16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        jTextField16.setPreferredSize(new java.awt.Dimension(6, 22));
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        jComboBox3.setPreferredSize(new java.awt.Dimension(56, 22));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        jComboBox4.setPreferredSize(new java.awt.Dimension(56, 22));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        jComboBox5.setPreferredSize(new java.awt.Dimension(56, 22));

        jLabel73.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel73.setText("en este momento.");

        jLabel74.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel74.setText("%");

        javax.swing.GroupLayout tbProductosLayout = new javax.swing.GroupLayout(tbProductos);
        tbProductos.setLayout(tbProductosLayout);
        tbProductosLayout.setHorizontalGroup(
            tbProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tbProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tbProductosLayout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addGap(58, 58, 58)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tbProductosLayout.createSequentialGroup()
                        .addGroup(tbProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tbProductosLayout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addGap(90, 90, 90)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tbProductosLayout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addGap(58, 58, 58)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tbProductosLayout.createSequentialGroup()
                                .addGroup(tbProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel61)
                                    .addComponent(jLabel62)
                                    .addComponent(jLabel60))
                                .addGap(26, 26, 26)
                                .addGroup(tbProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tbProductosLayout.createSequentialGroup()
                                        .addGroup(tbProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton1)
                                            .addGroup(tbProductosLayout.createSequentialGroup()
                                                .addGap(94, 94, 94)
                                                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(tbProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(tbProductosLayout.createSequentialGroup()
                                                .addComponent(jRadioButton2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton3))
                                            .addGroup(tbProductosLayout.createSequentialGroup()
                                                .addGroup(tbProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel70)
                                                    .addComponent(jLabel71)
                                                    .addComponent(jLabel72))
                                                .addGap(24, 24, 24)
                                                .addGroup(tbProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(tbProductosLayout.createSequentialGroup()
                                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel73))))))
                                    .addGroup(tbProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(tbProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addGroup(tbProductosLayout.createSequentialGroup()
                                .addGroup(tbProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel66)
                                    .addComponent(jLabel67)
                                    .addComponent(jLabel68)
                                    .addComponent(jLabel69))
                                .addGap(41, 41, 41)
                                .addGroup(tbProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(203, 203, 203))))
        );
        tbProductosLayout.setVerticalGroup(
            tbProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tbProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60)
                    .addComponent(jLabel66)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(tbProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61)
                    .addComponent(jLabel67)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(tbProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jLabel68)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(tbProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63)
                    .addComponent(jLabel69)
                    .addComponent(jLabel70)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73))
                .addGap(27, 27, 27)
                .addGroup(tbProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel71)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(tbProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Producto", new javax.swing.ImageIcon(getClass().getResource("/recursos/application_edit_12962.png")), tbProductos); // NOI18N

        jLabel77.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel77.setText("Este producto maneja los sigueintes impuestos:");

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane8.setViewportView(jList2);

        javax.swing.GroupLayout tbImpuestosLayout = new javax.swing.GroupLayout(tbImpuestos);
        tbImpuestos.setLayout(tbImpuestosLayout);
        tbImpuestosLayout.setHorizontalGroup(
            tbImpuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbImpuestosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(tbImpuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane8))
                .addContainerGap(894, Short.MAX_VALUE))
        );
        tbImpuestosLayout.setVerticalGroup(
            tbImpuestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbImpuestosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Impuestos", new javax.swing.ImageIcon(getClass().getResource("/recursos/62876moneybag_109253.png")), tbImpuestos); // NOI18N

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/solicit_accept_check_ok_theaction_6340.png"))); // NOI18N
        jButton18.setText("Guardar Producto");

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cancel_77947.png"))); // NOI18N
        jButton19.setText("Cancelar");

        javax.swing.GroupLayout pNProductoLayout = new javax.swing.GroupLayout(pNProducto);
        pNProducto.setLayout(pNProductoLayout);
        pNProductoLayout.setHorizontalGroup(
            pNProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pNProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pNProductoLayout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pNProductoLayout.createSequentialGroup()
                        .addComponent(jButton18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jTabbedPane1)
        );
        pNProductoLayout.setVerticalGroup(
            pNProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNProductoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel59)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pNProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18)
                    .addComponent(jButton19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pSliderProductos.add(pNProducto, "card2");

        pEProducto.setBackground(new java.awt.Color(255, 255, 255));
        pEProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pEProducto.setName("pEProducto"); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel78.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel78.setText("Eliminar Producto");

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/barcode.png"))); // NOI18N

        jButton21.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/solicit_accept_check_ok_theaction_6340.png"))); // NOI18N
        jButton21.setText("Aceptar");

        rSMTextFull2.setForeground(new java.awt.Color(102, 102, 102));
        rSMTextFull2.setBordeColorFocus(new java.awt.Color(255, 204, 51));
        rSMTextFull2.setBotonColor(new java.awt.Color(255, 204, 51));
        rSMTextFull2.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        rSMTextFull2.setPlaceholder("Escanéa, teclea o busca el código del producto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel78))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rSMTextFull2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel78)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSMTextFull2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79))
                .addGap(10, 10, 10)
                .addComponent(jButton21)
                .addContainerGap())
        );

        javax.swing.GroupLayout pEProductoLayout = new javax.swing.GroupLayout(pEProducto);
        pEProducto.setLayout(pEProductoLayout);
        pEProductoLayout.setHorizontalGroup(
            pEProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEProductoLayout.createSequentialGroup()
                .addGap(381, 381, 381)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(462, Short.MAX_VALUE))
        );
        pEProductoLayout.setVerticalGroup(
            pEProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEProductoLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        pSliderProductos.add(pEProducto, "card4");

        pDepartamentos.setBackground(new java.awt.Color(255, 255, 255));
        pDepartamentos.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pDepartamentos.setName("pDepartamentos"); // NOI18N

        jLabel80.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 204, 51));
        jLabel80.setText("DEPARTAMENTOS");

        txtBuscarDep.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscarDep.setBordeColorFocus(new java.awt.Color(255, 204, 51));
        txtBuscarDep.setBotonColor(new java.awt.Color(255, 204, 51));
        txtBuscarDep.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        txtBuscarDep.setPlaceholder("BUSCAR...");

        JtDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane9.setViewportView(JtDepartamentos);

        btnNuevoDep.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnNuevoDep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/tag.png"))); // NOI18N
        btnNuevoDep.setText("Nuevo Departamento");
        btnNuevoDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoDepActionPerformed(evt);
            }
        });

        btnEliminarDep.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        btnEliminarDep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/36_104857.png"))); // NOI18N
        btnEliminarDep.setText("Eliminar");
        btnEliminarDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDepActionPerformed(evt);
            }
        });

        txtDep.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        txtDep.setForeground(new java.awt.Color(255, 204, 51));
        txtDep.setText("BEDIDAS");

        jLabel82.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel82.setText("Nombre");

        txtNombreDep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        txtNombreDep.setPreferredSize(new java.awt.Dimension(65, 30));

        btnGuardarDep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/solicit_accept_check_ok_theaction_6340.png"))); // NOI18N
        btnGuardarDep.setText("Guardar Departamento");

        btnCancelarDep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cancel_77947.png"))); // NOI18N
        btnCancelarDep.setText("Cancelar");

        javax.swing.GroupLayout pDepartamentosLayout = new javax.swing.GroupLayout(pDepartamentos);
        pDepartamentos.setLayout(pDepartamentosLayout);
        pDepartamentosLayout.setHorizontalGroup(
            pDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDepartamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel80)
                    .addComponent(txtBuscarDep, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(pDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel82)
                    .addGroup(pDepartamentosLayout.createSequentialGroup()
                        .addComponent(btnGuardarDep)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarDep, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNombreDep, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addGroup(pDepartamentosLayout.createSequentialGroup()
                        .addComponent(btnNuevoDep)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarDep))
                    .addComponent(txtDep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(537, Short.MAX_VALUE))
        );
        pDepartamentosLayout.setVerticalGroup(
            pDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDepartamentosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBuscarDep, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNuevoDep, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminarDep, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDepartamentosLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(txtDep)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel82)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pDepartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarDep)
                            .addComponent(btnCancelarDep))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
                .addContainerGap())
        );

        pSliderProductos.add(pDepartamentos, "card5");

        pVPeriodo.setBackground(new java.awt.Color(255, 255, 255));
        pVPeriodo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pVPeriodo.setName("pVPeriodo"); // NOI18N

        jLabel83.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 204, 51));
        jLabel83.setText("REPORTE DE PRODUCTOS VENDIDOS");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "1", "2", "3", "4"
            }
        ));
        jScrollPane10.setViewportView(jTable3);

        jLabel84.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel84.setText("No se encontraron productos vendidos para el periodo seleccionado");

        jLabel85.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel85.setText("Mostrar ventas de ");

        jComboBox6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Elegir periodo -", "Hoy", "Esta semana", "De un periodo en particular..." }));
        jComboBox6.setPreferredSize(new java.awt.Dimension(56, 22));

        jLabel86.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel86.setText("Desde el");

        jLabel87.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel87.setText("Hasta el");

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/file_type_excel_icon_130611.png"))); // NOI18N
        jButton24.setText("Exportar");

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Print_icon-icons.com_73705.png"))); // NOI18N
        jButton25.setText("Imprimir");

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/warning.png"))); // NOI18N
        jLabel88.setText("-");

        javax.swing.GroupLayout pVPeriodoLayout = new javax.swing.GroupLayout(pVPeriodo);
        pVPeriodo.setLayout(pVPeriodoLayout);
        pVPeriodoLayout.setHorizontalGroup(
            pVPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pVPeriodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane10)
            .addGroup(pVPeriodoLayout.createSequentialGroup()
                .addGroup(pVPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pVPeriodoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel88)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel84)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 514, Short.MAX_VALUE)
                        .addComponent(jButton24)
                        .addGap(18, 18, 18)
                        .addComponent(jButton25))
                    .addGroup(pVPeriodoLayout.createSequentialGroup()
                        .addGroup(pVPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pVPeriodoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel83))
                            .addGroup(pVPeriodoLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel85)
                                .addGap(123, 123, 123)
                                .addComponent(jLabel86)
                                .addGap(137, 137, 137)
                                .addComponent(jLabel87)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pVPeriodoLayout.setVerticalGroup(
            pVPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pVPeriodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel83)
                .addGroup(pVPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pVPeriodoLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pVPeriodoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pVPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel87, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel86))))
                .addGap(17, 17, 17)
                .addGroup(pVPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(pVPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pVPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton25)
                        .addComponent(jButton24))
                    .addGroup(pVPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel84)
                        .addComponent(jLabel88)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
        );

        pSliderProductos.add(pVPeriodo, "card6");

        pPromociones.setBackground(new java.awt.Color(255, 255, 255));
        pPromociones.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pPromociones.setName("pPromociones"); // NOI18N

        jLabel91.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 204, 51));
        jLabel91.setText("NUEVA PROMOCION");

        jLabel75.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel75.setText("Nombre de la promoción:");

        jLabel76.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel76.setText("Código de Barras:");

        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        jTextField10.setPreferredSize(new java.awt.Dimension(6, 22));

        jTextField18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        jTextField18.setPreferredSize(new java.awt.Dimension(6, 22));

        jLabel92.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel92.setText("Hasta:");

        jLabel93.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel93.setText("vaya desde:");

        jTextField19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        jTextField19.setPreferredSize(new java.awt.Dimension(6, 22));

        jLabel94.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel94.setText("Cuando la cantidad");

        jTextField20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        jTextField20.setPreferredSize(new java.awt.Dimension(6, 22));

        jLabel95.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel95.setText("Usar precio Unitario:");

        jTextField21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        jTextField21.setPreferredSize(new java.awt.Dimension(6, 22));

        jLabel96.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        jLabel96.setText("Precio Normal:");

        jLabel97.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        jLabel97.setText("Precio Costo:");

        jLabel98.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        jLabel98.setText("0.00");

        jLabel99.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        jLabel99.setText("0.00");

        jLabel100.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        jLabel100.setText("$");

        jLabel101.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        jLabel101.setText("$");

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/solicit_accept_check_ok_theaction_6340.png"))); // NOI18N
        jButton20.setText("Guardar Promoción");

        jLabel102.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 204, 51));
        jLabel102.setText("PROMOCIONES VIGENTES");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane11.setViewportView(jTable5);

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/32officeicons-3_89720.png"))); // NOI18N
        jButton27.setText("Eliminar");

        javax.swing.GroupLayout pPromocionesLayout = new javax.swing.GroupLayout(pPromociones);
        pPromociones.setLayout(pPromocionesLayout);
        pPromocionesLayout.setHorizontalGroup(
            pPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPromocionesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPromocionesLayout.createSequentialGroup()
                        .addComponent(jLabel102)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton27)
                        .addContainerGap())
                    .addGroup(pPromocionesLayout.createSequentialGroup()
                        .addGroup(pPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pPromocionesLayout.createSequentialGroup()
                                .addComponent(jLabel75)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pPromocionesLayout.createSequentialGroup()
                                .addGroup(pPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel91)
                                    .addGroup(pPromocionesLayout.createSequentialGroup()
                                        .addGroup(pPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel76)
                                            .addComponent(jLabel93)
                                            .addComponent(jLabel94))
                                        .addGap(53, 53, 53)
                                        .addGroup(pPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(pPromocionesLayout.createSequentialGroup()
                                                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel92)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 75, Short.MAX_VALUE)))
                        .addGap(42, 42, 42)
                        .addGroup(pPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pPromocionesLayout.createSequentialGroup()
                                .addComponent(jLabel95)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pPromocionesLayout.createSequentialGroup()
                                .addGroup(pPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel96)
                                    .addComponent(jLabel97))
                                .addGap(18, 18, 18)
                                .addGroup(pPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pPromocionesLayout.createSequentialGroup()
                                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pPromocionesLayout.createSequentialGroup()
                                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(408, 408, 408))))
            .addComponent(jScrollPane11)
        );
        pPromocionesLayout.setVerticalGroup(
            pPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPromocionesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel91)
                .addGap(29, 29, 29)
                .addGroup(pPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel75)
                    .addGroup(pPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel95)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel76)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel96)
                        .addComponent(jLabel98)
                        .addComponent(jLabel100)))
                .addGroup(pPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPromocionesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pPromocionesLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel93))
                            .addGroup(pPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel92)
                                .addComponent(jLabel94)
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pPromocionesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel97)
                            .addComponent(jLabel99)
                            .addComponent(jLabel101))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton20)))
                .addGap(12, 12, 12)
                .addGroup(pPromocionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel102)
                    .addComponent(jButton27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
        );

        pSliderProductos.add(pPromociones, "card7");

        pCatalogo.setBackground(new java.awt.Color(255, 255, 255));
        pCatalogo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pCatalogo.setName("pCatalogo"); // NOI18N

        jLabel103.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 204, 51));
        jLabel103.setText("CATÁLOGO DE PRODUCTOS");

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/xmag_search_find_export_locate_5984.png"))); // NOI18N

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane12.setViewportView(jTable6);

        jLabel105.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel105.setText("Departamento");

        jButton28.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/file_type_excel_icon_130611.png"))); // NOI18N
        jButton28.setText("Exportar");

        jButton29.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/application_edit_12962.png"))); // NOI18N
        jButton29.setText("Modificar...");

        jButton30.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/edit_icon_129126.png"))); // NOI18N
        jButton30.setText("Actualizar varios...");

        jComboBox7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Todos -" }));
        jComboBox7.setPreferredSize(new java.awt.Dimension(56, 22));

        rSMTextFull12.setForeground(new java.awt.Color(102, 102, 102));
        rSMTextFull12.setBordeColorFocus(new java.awt.Color(255, 204, 51));
        rSMTextFull12.setBotonColor(new java.awt.Color(255, 204, 51));
        rSMTextFull12.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        rSMTextFull12.setPlaceholder("Escanéa, teclea o busca el código del producto");

        javax.swing.GroupLayout pCatalogoLayout = new javax.swing.GroupLayout(pCatalogo);
        pCatalogo.setLayout(pCatalogoLayout);
        pCatalogoLayout.setHorizontalGroup(
            pCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCatalogoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel103)
                    .addGroup(pCatalogoLayout.createSequentialGroup()
                        .addComponent(jLabel104)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSMTextFull12, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(213, 213, 213)
                .addGroup(pCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pCatalogoLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel105)))
                .addGap(46, 46, 46)
                .addComponent(jButton30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane12)
        );
        pCatalogoLayout.setVerticalGroup(
            pCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCatalogoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton28)
                        .addComponent(jButton29)
                        .addComponent(jButton30))
                    .addGroup(pCatalogoLayout.createSequentialGroup()
                        .addComponent(jLabel103)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSMTextFull12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pCatalogoLayout.createSequentialGroup()
                        .addComponent(jLabel105)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
        );

        pSliderProductos.add(pCatalogo, "card8");

        pMProducto.setBackground(new java.awt.Color(255, 255, 255));
        pMProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pMProducto.setName("pMProducto"); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel89.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel89.setText("Modificar Producto");

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/barcode.png"))); // NOI18N

        jButton26.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/solicit_accept_check_ok_theaction_6340.png"))); // NOI18N
        jButton26.setText("Aceptar");

        rSMTextFull4.setForeground(new java.awt.Color(102, 102, 102));
        rSMTextFull4.setBordeColorFocus(new java.awt.Color(255, 204, 51));
        rSMTextFull4.setBotonColor(new java.awt.Color(255, 204, 51));
        rSMTextFull4.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        rSMTextFull4.setPlaceholder("Escanéa, teclea o busca el código del producto");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel89))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel90)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rSMTextFull4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSMTextFull4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel90))
                .addGap(10, 10, 10)
                .addComponent(jButton26)
                .addContainerGap())
        );

        javax.swing.GroupLayout pMProductoLayout = new javax.swing.GroupLayout(pMProducto);
        pMProducto.setLayout(pMProductoLayout);
        pMProductoLayout.setHorizontalGroup(
            pMProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMProductoLayout.createSequentialGroup()
                .addGap(381, 381, 381)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(462, Short.MAX_VALUE))
        );
        pMProductoLayout.setVerticalGroup(
            pMProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMProductoLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        pSliderProductos.add(pMProducto, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mMproducto)
                .addGap(18, 18, 18)
                .addComponent(mEproducto)
                .addGap(18, 18, 18)
                .addComponent(mDepartamentos)
                .addGap(18, 18, 18)
                .addComponent(mVentasPeriodo)
                .addGap(18, 18, 18)
                .addComponent(mPromociones)
                .addGap(18, 18, 18)
                .addComponent(mImportar)
                .addGap(18, 18, 18)
                .addComponent(mCatalogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pSliderProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mMproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mEproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mVentasPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mPromociones, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pSliderProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 475, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNuevoProductoActionPerformed
        if (!this.mNuevoProducto.isSelected()) {
            this.mNuevoProducto.setSelected(true);
            this.mEproducto.setSelected(false);
            this.mMproducto.setSelected(false);
            this.mVentasPeriodo.setSelected(false);
            this.mDepartamentos.setSelected(false);
            this.mPromociones.setSelected(false);
            this.mImportar.setSelected(false);
            this.mCatalogo.setSelected(false);

            pSliderProductos.setPanelSlider(10, pNProducto, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_mNuevoProductoActionPerformed

    private void mMproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMproductoActionPerformed
        if (!this.mMproducto.isSelected()) {
            this.mMproducto.setSelected(true);
            this.mEproducto.setSelected(false);
            this.mNuevoProducto.setSelected(false);
            this.mVentasPeriodo.setSelected(false);
            this.mDepartamentos.setSelected(false);
            this.mPromociones.setSelected(false);
            this.mImportar.setSelected(false);
            this.mCatalogo.setSelected(false);

            pSliderProductos.setPanelSlider(10, pMProducto, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_mMproductoActionPerformed

    private void mEproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mEproductoActionPerformed
        if (!this.mEproducto.isSelected()) {
            this.mEproducto.setSelected(true);
            this.mMproducto.setSelected(false);
            this.mNuevoProducto.setSelected(false);
            this.mVentasPeriodo.setSelected(false);
            this.mDepartamentos.setSelected(false);
            this.mPromociones.setSelected(false);
            this.mImportar.setSelected(false);
            this.mCatalogo.setSelected(false);

            pSliderProductos.setPanelSlider(10, pEProducto, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_mEproductoActionPerformed

    private void mDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDepartamentosActionPerformed
        if (!this.mDepartamentos.isSelected()) {
            this.mDepartamentos.setSelected(true);
            this.mMproducto.setSelected(false);
            this.mEproducto.setSelected(false);
            this.mNuevoProducto.setSelected(false);
            this.mVentasPeriodo.setSelected(false);
            this.mPromociones.setSelected(false);
            this.mImportar.setSelected(false);
            this.mCatalogo.setSelected(false);

            pSliderProductos.setPanelSlider(10, pDepartamentos, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_mDepartamentosActionPerformed

    private void mVentasPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mVentasPeriodoActionPerformed
        if (!this.mVentasPeriodo.isSelected()) {
            this.mVentasPeriodo.setSelected(true);
            this.mDepartamentos.setSelected(false);
            this.mMproducto.setSelected(false);
            this.mEproducto.setSelected(false);
            this.mNuevoProducto.setSelected(false);
            this.mPromociones.setSelected(false);
            this.mImportar.setSelected(false);
            this.mCatalogo.setSelected(false);

            pSliderProductos.setPanelSlider(10, pVPeriodo, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_mVentasPeriodoActionPerformed

    private void mPromocionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPromocionesActionPerformed
        if (!this.mPromociones.isSelected()) {
            this.mPromociones.setSelected(true);
            this.mMproducto.setSelected(false);
            this.mEproducto.setSelected(false);
            this.mNuevoProducto.setSelected(false);
            this.mVentasPeriodo.setSelected(false);
            this.mDepartamentos.setSelected(false);
            this.mImportar.setSelected(false);
            this.mCatalogo.setSelected(false);

            pSliderProductos.setPanelSlider(10, pPromociones, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_mPromocionesActionPerformed

    private void mImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mImportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mImportarActionPerformed

    private void mCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCatalogoActionPerformed
        if (!this.mCatalogo.isSelected()) {
            this.mCatalogo.setSelected(true);
            this.mMproducto.setSelected(false);
            this.mEproducto.setSelected(false);
            this.mNuevoProducto.setSelected(false);
            this.mVentasPeriodo.setSelected(false);
            this.mDepartamentos.setSelected(false);
            this.mImportar.setSelected(false);
            this.mPromociones.setSelected(false);

            pSliderProductos.setPanelSlider(10, pCatalogo, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_mCatalogoActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void btnNuevoDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoDepActionPerformed

    private void btnEliminarDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarDepActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtDepartamentos;
    private javax.swing.JButton btnCancelarDep;
    private javax.swing.JButton btnEliminarDep;
    private javax.swing.JButton btnGuardarDep;
    private javax.swing.JButton btnNuevoDep;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton mCatalogo;
    private javax.swing.JButton mDepartamentos;
    private javax.swing.JButton mEproducto;
    private javax.swing.JButton mImportar;
    private javax.swing.JButton mMproducto;
    private javax.swing.JButton mNuevoProducto;
    private javax.swing.JButton mPromociones;
    private javax.swing.JButton mVentasPeriodo;
    private javax.swing.JPanel pCatalogo;
    private javax.swing.JPanel pDepartamentos;
    private javax.swing.JPanel pEProducto;
    private javax.swing.JPanel pMProducto;
    private javax.swing.JPanel pNProducto;
    private javax.swing.JPanel pPromociones;
    private rojeru_san.RSPanelsSlider pSliderProductos;
    private javax.swing.JPanel pVPeriodo;
    private rojeru_san.RSMTextFull rSMTextFull12;
    private rojeru_san.RSMTextFull rSMTextFull2;
    private rojeru_san.RSMTextFull rSMTextFull4;
    private javax.swing.JPanel tbImpuestos;
    private javax.swing.JPanel tbProductos;
    private rojeru_san.RSMTextFull txtBuscarDep;
    private javax.swing.JLabel txtDep;
    private javax.swing.JTextField txtNombreDep;
    // End of variables declaration//GEN-END:variables
}
