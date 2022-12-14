/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BLL.OrderBLL;
import DAL.Order;
import DAL.User;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author phamt
 */
public class EditOrderGUI extends javax.swing.JFrame {

    /**
     * Creates new form EditOrderGUI
     */
    private OrderGUI orderGUI;
    private Order order;
    private User user;
    private OrderBLL orderBLL = new OrderBLL();
    
    public EditOrderGUI() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public EditOrderGUI(OrderGUI orderGUI, Order order) {
        
        initComponents();
        this.orderGUI = orderGUI;
        this.order = order;
        this.setUserToForm();
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
        jPanel14 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(34, 39, 54));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 594));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel6.setBackground(new java.awt.Color(42, 48, 66));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Order Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(737, 150));
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

        jPanel1.add(jPanel6);

        jPanel14.setBackground(new java.awt.Color(42, 48, 66));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel14.setPreferredSize(new java.awt.Dimension(564, 30));
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        btnUpdate.setBackground(new java.awt.Color(98, 110, 212));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setPreferredSize(new java.awt.Dimension(120, 30));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel14.add(btnUpdate);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHelpUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpUserActionPerformed
        UserHelper userHelp = new UserHelper(this);
    }//GEN-LAST:event_btnHelpUserActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        resetOrderForm();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        java.util.Date dt = new java.util.Date();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(dt);
        
        if (user != null) {
            order.setUser(user);
        }
        
        order.setDate(currentTime);
        order.setAddress(txtAddress.getText());
        order.setCity(txtCity.getText());
        
        if (orderBLL.updateOrder(order)) {
            JOptionPane.showMessageDialog(this, "Update order successfully");
            orderGUI.loadAllOrders();
            orderGUI.setDetailToTable(new ArrayList(new Order().getOrderDetails()));
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Update order fail");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed
    
    public void setUserToForm() {
        
        txtUser.setText(order.getUser().getFirstName() + " " + order.getUser().getLastName());
        txtCity.setText(order.getCity());
        txtAddress.setText(order.getAddress());
    }
    
    public void resetOrderForm() {
        txtUser.setText("");
        txtCity.setText("");
        txtAddress.setText("");
        
    }
    
    public void setUser(User user) {
        this.user = user;
        txtUser.setText(user.getFirstName() + " " + user.getLastName());
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
            java.util.logging.Logger.getLogger(EditOrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditOrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditOrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditOrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditOrderGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHelpUser;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
