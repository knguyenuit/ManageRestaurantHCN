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
public class SetTheTable extends javax.swing.JPanel {

    /**
     * Creates new form SetThePrice
     */
    public SetTheTable() {
        initComponents();
        lblHighlight.setBackground(new Color(147,193,120));
        lblHighlight.setOpaque(true);
        
        lblAddTable.setBackground(new Color(70,91,140));
        lblAddTable.setOpaque(true);
        lblAddTable.setHorizontalAlignment(SwingConstants.CENTER);
        
        lblUpdateTable.setBackground(new Color(147,193,120));
        lblUpdateTable.setOpaque(true);
        lblUpdateTable.setHorizontalAlignment(SwingConstants.CENTER);
        lblUpdateTable.setVisible(false);
        
        lblDellTable.setBackground(Color.red);
        lblDellTable.setOpaque(true);
        lblDellTable.setHorizontalAlignment(SwingConstants.CENTER);
        lblDellTable.setVisible(false);
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblAddTable = new javax.swing.JLabel();
        lblUpdateTable = new javax.swing.JLabel();
        lblDellTable = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        lblHighlight = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1720, 2000));
        setName(""); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"MB001", "Bàn 1", "", ""},
                {"MB002 ", "Bàn 2", "", ""},
                {"MB003", "Bàn 3", "Đang sửa chữa", "26/4 Nhận bàn"},
                {"MB004", "Bàn 4", "", ""},
                {"MB005", "Bàn 5", "", ""},
                {"MB006", "Bàn 6", "", ""},
                {"MB007", "Bàn 7", "", ""},
                {"MB008", "Bàn 8 ", "", ""},
                {"MB009", "Bàn 9", "Đang sửa chữa", "26/4 Nhận bàn"}
            },
            new String [] {
                "Mã bàn", "Tên bàn", "Trạng thái", "Ghi chú"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 522, 1644, 751));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã bàn", "Tên bàn", "" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, 50));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1.setText("NB001");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 320, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Search_50px.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, -1, -1));

        lblAddTable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblAddTable.setForeground(new java.awt.Color(255, 255, 255));
        lblAddTable.setText("Thêm mới");
        jPanel1.add(lblAddTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 380, 200, 50));

        lblUpdateTable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblUpdateTable.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdateTable.setText("Cập nhật");
        jPanel1.add(lblUpdateTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 380, 150, 50));

        lblDellTable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDellTable.setForeground(new java.awt.Color(255, 255, 255));
        lblDellTable.setText("Xóa");
        jPanel1.add(lblDellTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 380, 150, 50));

        jSeparator1.setBackground(new java.awt.Color(70, 92, 139));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 131, 1610, 9));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Danh Sách Bàn");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));
        jPanel1.add(lblHighlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 10, 80));

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
        lblUpdateTable.setVisible(true);
        lblDellTable.setVisible(true);
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
    private javax.swing.JLabel lblAddTable;
    private javax.swing.JLabel lblDellTable;
    private javax.swing.JLabel lblHighlight;
    private javax.swing.JLabel lblUpdateTable;
    // End of variables declaration//GEN-END:variables
}