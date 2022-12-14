/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BLL.OrderBLL;
import DAL.Order;
import DAL.OrderDetail;
import DAL.Product;
import DAL.User;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author phamt
 */
public class AddOrderGUI extends javax.swing.JFrame {

    /**
     * Creates new form OrderGUI
     */
    private OrderGUI orderGUI;
    private User user = new User();
    private Product product = new Product();

    private OrderBLL orderBLL = new OrderBLL();
    private Order order = new Order();
    private ArrayList<OrderDetail> odList = new ArrayList<>();
    private int totalQty = 0;
    private Double totalPrice = 0.0;

    private DefaultTableModel modelDetail = new DefaultTableModel();
    private int[] headerDetail = {100, 250, 150, 150, 150};
    private String[] headerTitleDetail = {"ProdID", "Name", "Qty", "Price", "Subtotal"};

    public AddOrderGUI() {
        initComponents();
    }

    public AddOrderGUI(OrderGUI orderGUI) {
        initComponents();
        this.orderGUI = orderGUI;
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnHelpUser = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        txtTotalQty = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtTotalqty = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtProduct = new javax.swing.JTextField();
        btnHelpProd = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jPanel32 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDetail = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        btnConfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(34, 39, 54));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 594));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel6.setBackground(new java.awt.Color(42, 48, 66));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Order Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(737, 180));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.Y_AXIS));

        jPanel13.setBackground(new java.awt.Color(42, 48, 66));
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));

        jPanel7.setBackground(new java.awt.Color(42, 48, 66));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer");
        jPanel7.add(jLabel1);

        txtUser.setEnabled(false);
        txtUser.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel7.add(txtUser);

        btnHelpUser.setBackground(new java.awt.Color(98, 110, 212));
        btnHelpUser.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnHelpUser.setForeground(new java.awt.Color(255, 255, 255));
        btnHelpUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dots.png"))); // NOI18N
        btnHelpUser.setPreferredSize(new java.awt.Dimension(40, 25));
        btnHelpUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpUserActionPerformed(evt);
            }
        });
        jPanel7.add(btnHelpUser);

        jPanel13.add(jPanel7);

        jPanel6.add(jPanel13);

        jPanel12.setBackground(new java.awt.Color(42, 48, 66));
        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));

        jPanel8.setBackground(new java.awt.Color(42, 48, 66));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Address");

        txtAddress.setPreferredSize(new java.awt.Dimension(180, 25));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel12.add(jPanel8);

        jPanel10.setBackground(new java.awt.Color(42, 48, 66));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("City");

        txtCity.setPreferredSize(new java.awt.Dimension(180, 25));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(24, 24, 24)
                .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel12.add(jPanel10);

        jPanel6.add(jPanel12);

        jPanel17.setBackground(new java.awt.Color(42, 48, 66));
        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 25, 5));

        txtTotalQty.setBackground(new java.awt.Color(42, 48, 66));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Quantity");

        txtTotalqty.setEnabled(false);
        txtTotalqty.setPreferredSize(new java.awt.Dimension(180, 25));

        javax.swing.GroupLayout txtTotalQtyLayout = new javax.swing.GroupLayout(txtTotalQty);
        txtTotalQty.setLayout(txtTotalQtyLayout);
        txtTotalQtyLayout.setHorizontalGroup(
            txtTotalQtyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtTotalQtyLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalqty, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        txtTotalQtyLayout.setVerticalGroup(
            txtTotalQtyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtTotalQtyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtTotalQtyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTotalqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel17.add(txtTotalQty);

        jPanel18.setBackground(new java.awt.Color(42, 48, 66));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Price");

        txtTotalPrice.setEnabled(false);
        txtTotalPrice.setPreferredSize(new java.awt.Dimension(180, 25));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(66, 66, 66))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel17.add(jPanel18);

        jPanel6.add(jPanel17);

        jPanel1.add(jPanel6);

        jPanel26.setBackground(new java.awt.Color(42, 48, 66));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Order Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel26.setPreferredSize(new java.awt.Dimension(737, 120));
        jPanel26.setLayout(new javax.swing.BoxLayout(jPanel26, javax.swing.BoxLayout.Y_AXIS));

        jPanel27.setBackground(new java.awt.Color(42, 48, 66));
        jPanel27.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));

        jPanel28.setBackground(new java.awt.Color(42, 48, 66));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Product");
        jPanel28.add(jLabel12);

        txtProduct.setEnabled(false);
        txtProduct.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel28.add(txtProduct);

        btnHelpProd.setBackground(new java.awt.Color(98, 110, 212));
        btnHelpProd.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnHelpProd.setForeground(new java.awt.Color(255, 255, 255));
        btnHelpProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dots.png"))); // NOI18N
        btnHelpProd.setPreferredSize(new java.awt.Dimension(40, 25));
        btnHelpProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpProdActionPerformed(evt);
            }
        });
        jPanel28.add(btnHelpProd);

        jPanel27.add(jPanel28);

        jPanel29.setBackground(new java.awt.Color(42, 48, 66));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Quantity");

        txtQty.setPreferredSize(new java.awt.Dimension(180, 25));
        txtQty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtyFocusLost(evt);
            }
        });
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(txtQty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel27.add(jPanel29);

        jPanel26.add(jPanel27);

        jPanel30.setBackground(new java.awt.Color(42, 48, 66));
        jPanel30.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 25, 5));

        jPanel31.setBackground(new java.awt.Color(42, 48, 66));
        jPanel31.setPreferredSize(new java.awt.Dimension(250, 42));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Price");

        txtPrice.setEnabled(false);
        txtPrice.setPreferredSize(new java.awt.Dimension(180, 25));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel30.add(jPanel31);

        jPanel32.setBackground(new java.awt.Color(42, 48, 66));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Subtotal");

        txtSubtotal.setEnabled(false);
        txtSubtotal.setPreferredSize(new java.awt.Dimension(180, 25));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel30.add(jPanel32);

        jPanel26.add(jPanel30);

        jPanel1.add(jPanel26);

        jPanel14.setBackground(new java.awt.Color(42, 48, 66));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel14.setPreferredSize(new java.awt.Dimension(564, 50));
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        btnAdd.setBackground(new java.awt.Color(98, 110, 212));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setPreferredSize(new java.awt.Dimension(100, 30));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel14.add(btnAdd);

        btnEdit.setBackground(new java.awt.Color(98, 110, 212));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setPreferredSize(new java.awt.Dimension(100, 30));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel14.add(btnEdit);

        btnDelete.setBackground(new java.awt.Color(98, 110, 212));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setPreferredSize(new java.awt.Dimension(100, 30));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel14.add(btnDelete);

        btnReset.setBackground(new java.awt.Color(98, 110, 212));
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.setPreferredSize(new java.awt.Dimension(100, 30));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel14.add(btnReset);

        jPanel1.add(jPanel14);

        jScrollPane3.setPreferredSize(new java.awt.Dimension(452, 500));

        tableDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Name", "Quantity", "Price", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableDetail.setFillsViewportHeight(true);
        tableDetail.setGridColor(new java.awt.Color(0, 117, 217));
        tableDetail.setRowHeight(30);
        tableDetail.setSelectionBackground(new java.awt.Color(0, 117, 217));
        tableDetail.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableDetail.setShowGrid(true);
        tableDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDetailMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableDetail);

        jPanel1.add(jScrollPane3);

        jPanel16.setBackground(new java.awt.Color(34, 39, 54));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel16.setPreferredSize(new java.awt.Dimension(268, 50));

        btnConfirm.setBackground(new java.awt.Color(98, 110, 212));
        btnConfirm.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnConfirm.setText("Confirm");
        btnConfirm.setPreferredSize(new java.awt.Dimension(120, 30));
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        jPanel16.add(btnConfirm);

        jPanel1.add(jPanel16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHelpProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpProdActionPerformed
        ProductHelper prodHelp = new ProductHelper(this);
    }//GEN-LAST:event_btnHelpProdActionPerformed

    private void btnHelpUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpUserActionPerformed
        UserHelper userHelp = new UserHelper(this);
    }//GEN-LAST:event_btnHelpUserActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int i = tableDetail.getSelectedRow();
        if (i == -1) {
            try {
                Double price = Double.parseDouble(txtPrice.getText());
                int qty = Integer.parseInt(txtQty.getText());

                totalQty += qty;
                txtTotalqty.setText(totalQty + "");

                Double subtotal = price * qty;
                totalPrice += subtotal;
                txtTotalPrice.setText(totalPrice + "");

                OrderDetail od = new OrderDetail(order, product, price, qty, subtotal);
                odList.add(od);

                JOptionPane.showMessageDialog(this, "Add detail success");
                resetDetailForm();
                setDetailToTable();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "This product had aldready existed in detail");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtQtyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtyFocusLost

    }//GEN-LAST:event_txtQtyFocusLost

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased
        try {
            int qty = Integer.parseInt(txtQty.getText());
            if (product.getStock() < qty) {
                JOptionPane.showMessageDialog(this, "Your input qty is greater than stock!!!");
                txtQty.setText("");
            } else {
                Double subtotal = product.getPrice() * qty;
                txtSubtotal.setText(subtotal + "");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Your in put must be number");
            txtQty.setText("");
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_txtQtyKeyReleased

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int i = tableDetail.getSelectedRow();
        if (i != -1) {
            int choice = JOptionPane.showConfirmDialog(this, "Are you sure want to delete it", "Confirm Dialog", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                this.totalDown(odList.get(i));

                odList.remove(i);
                setDetailToTable();

            }
        } else {
            JOptionPane.showMessageDialog(this, "Please choose record you want to delete first");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int i = tableDetail.getSelectedRow();
        if (i != -1) {
            try {
                Double price = Double.parseDouble(txtPrice.getText());
                int qty = Integer.parseInt(txtQty.getText());
                Double subtotal = price * qty;

                OrderDetail od = new OrderDetail(order, odList.get(i).getProduct(), price, qty, subtotal);

                totalDown(odList.get(i));
                totalUp(od);

                odList.set(i, od);

                JOptionPane.showMessageDialog(this, "Edit detail success");
                setDetailToTable();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please choose record you want to edit first");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void tableDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDetailMouseClicked
        int i = tableDetail.getSelectedRow();
        if (i != -1) {
            txtProduct.setText(tableDetail.getModel().getValueAt(i, 1).toString());
            txtQty.setText(tableDetail.getModel().getValueAt(i, 2).toString());
            txtPrice.setText(tableDetail.getModel().getValueAt(i, 3).toString());
            txtSubtotal.setText(tableDetail.getModel().getValueAt(i, 4).toString());
        }
    }//GEN-LAST:event_tableDetailMouseClicked

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        java.util.Date dt = new java.util.Date();
//        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(dt);

        order.setUser(user);
        order.setDate(currentTime);
        order.setAddress(txtAddress.getText());
        order.setCity(txtCity.getText());
        order.setTotalQty(Integer.parseInt(txtTotalqty.getText()));
        order.setTotalPrice(Double.parseDouble(txtTotalPrice.getText()));
        order.setOrderDetails(odList);

//        System.out.println(odList.get(0).getOrder().getTotalPrice());
        if (orderBLL.saveOrder(order)) {
            JOptionPane.showMessageDialog(this, "Add order successfully");
            this.setVisible(false);
            this.orderGUI.loadAllOrders();
        } else {
            JOptionPane.showMessageDialog(this, "Add order fail");
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        resetDetailForm();
        resetOrderForm();
    }//GEN-LAST:event_btnResetActionPerformed

    public void setDetailToTable() {

//        modelDetail = this.initTableModel(modelDetail, headerTitleDetail);
        modelDetail = (DefaultTableModel) tableDetail.getModel();
        modelDetail.setRowCount(0);

        for (OrderDetail od : odList) {
            System.out.println(odList.size());
            Vector row = new Vector();
            row.add(od.getProduct().getProductID());
            row.add(od.getProduct().getName());
            row.add(od.getQty());
            row.add(od.getPrice());
            row.add(od.getSubtotal());

            modelDetail.addRow(row);

        }
        tableDetail.setModel(modelDetail);
        setColumnWidth(tableDetail, headerDetail);

    }

    public DefaultTableModel initTableModel(DefaultTableModel model, String[] name) {
        Vector header = new Vector();
        for (String s : name) {
            header.add(s);
        }
        model = new DefaultTableModel(header, 0);
        return model;
    }

    public void setColumnWidth(JTable tbl, int[] width) {
        tbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        TableColumnModel columnModel = tbl.getColumnModel();
        for (int i = 0; i < width.length; i++) {
            if (i < columnModel.getColumnCount()) {
                columnModel.getColumn(i).setMaxWidth(width[i]);
            } else {
                break;
            }
        }

    }

    public void totalDown(OrderDetail od) {
        totalQty -= od.getQty();
        txtTotalqty.setText(totalQty + "");

        totalPrice -= od.getPrice() * od.getQty();
        txtTotalPrice.setText(totalPrice + "");

    }

    public void totalUp(OrderDetail od) {
        totalQty += od.getQty();
        txtTotalqty.setText(totalQty + "");

        totalPrice += od.getPrice() * od.getQty();
        txtTotalPrice.setText(totalPrice + "");
    }

    public void setUser(User user) {
        this.user = user;
        txtUser.setText(user.getFirstName() + " " + user.getLastName());
    }

    public boolean setProduct(Product product) {
        for (OrderDetail od : odList) {
            if (od.getProduct().getProductID() == product.getProductID()) {
                return false;
            }
        }

        this.product = product;
        txtProduct.setText(product.getName());
        txtPrice.setText(product.getPrice() + "");
        return true;
    }

    public void resetDetailForm() {
        txtProduct.setText("");
        txtQty.setText("");
        txtPrice.setText("");
        txtSubtotal.setText("");

    }

    public void resetOrderForm() {
        txtUser.setText("");
        txtCity.setText("");
        txtAddress.setText("");
        txtTotalqty.setText("");
        txtTotalPrice.setText("");
    }

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
            java.util.logging.Logger.getLogger(AddOrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddOrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddOrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddOrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddOrderGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHelpProd;
    private javax.swing.JButton btnHelpUser;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableDetail;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProduct;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JPanel txtTotalQty;
    private javax.swing.JTextField txtTotalqty;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
