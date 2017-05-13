/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.management;

import java.awt.Color;
import javax.swing.SwingConstants;

/**
 *
 * @author User
 */
public class Employee extends javax.swing.JPanel {

    /**
     * Creates new form Employee
     */
    public Employee() {
        initComponents();
        lblHighlight.setBackground(new Color(147,193,120));
        lblHighlight.setOpaque(true);
        
        lblAddEmployee.setBackground(new Color(70,91,140));
        lblAddEmployee.setOpaque(true);
        lblAddEmployee.setHorizontalAlignment(SwingConstants.CENTER);
        
        lblUpdateEmployee.setBackground(new Color(147,193,120));
        lblUpdateEmployee.setOpaque(true);
        lblUpdateEmployee.setHorizontalAlignment(SwingConstants.CENTER);
        lblUpdateEmployee.setVisible(false);
        
        lblDellEmployee.setBackground(Color.red);
        lblDellEmployee.setOpaque(true);
        lblDellEmployee.setHorizontalAlignment(SwingConstants.CENTER);
        lblDellEmployee.setVisible(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblAddEmployee = new javax.swing.JLabel();
        lblUpdateEmployee = new javax.swing.JLabel();
        lblDellEmployee = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblHighlight = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1720, 2000));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"NV001", "Nguyên Văn A", "09888888", "Quản lý", "Sài Gòn"},
                {"NV002", "Trân văn B", "09333333", "Thu ngân ", "Sài Gòn"},
                {"NV003", "Trần Thị M", "094444444", "Lễ tân ", "Sài Gòn "},
                {"NV004", "Nguyễ Thị O", "012233333", "Chạy bàn", "Sài Gòn"},
                {"NV005 ", "Võ Lý Q", "0122922222", "Chạy bàn", "Sài Gòn "},
                {"NV006", "Văn Nguyễn D", "01213421", "Đầu bếp", "Sài Gòn"},
                {"NV007", "Lý Văn P", "098765427", "Phụ bếp", "Sài Gòn"},
                {"NV008", "Quý Thị N", "08987621", "Lao công", "Sài Gòn"},
                {"NV009", "Trần Tý U", "0902020202", "Bảo vệ", "Sài Gòn"}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Số điện thoại", "Chức vụ", "Địa chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(40);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 1640, 1150));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Danh Sách Nhân Viên");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã nhân viên", "Tên nhân viên ", "Chức vụ" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, 50));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1.setText("NV001");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 379, 320, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Search_50px.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, -1, -1));

        lblAddEmployee.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblAddEmployee.setForeground(new java.awt.Color(255, 255, 255));
        lblAddEmployee.setText("Thêm nhân viên");
        jPanel1.add(lblAddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 380, 200, 50));

        lblUpdateEmployee.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblUpdateEmployee.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdateEmployee.setText("Cập nhật");
        jPanel1.add(lblUpdateEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 380, 150, 50));

        lblDellEmployee.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDellEmployee.setForeground(new java.awt.Color(255, 255, 255));
        lblDellEmployee.setText("Xóa");
        jPanel1.add(lblDellEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 380, 150, 50));

        jSeparator1.setBackground(new java.awt.Color(70, 92, 139));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 131, 1610, 9));
        jPanel1.add(lblHighlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 10, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        lblUpdateEmployee.setVisible(true);
        lblDellEmployee.setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAddEmployee;
    private javax.swing.JLabel lblDellEmployee;
    private javax.swing.JLabel lblHighlight;
    private javax.swing.JLabel lblUpdateEmployee;
    // End of variables declaration//GEN-END:variables
}