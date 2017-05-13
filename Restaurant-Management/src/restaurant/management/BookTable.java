
package restaurant.management;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.JTableHeader;


public class BookTable extends javax.swing.JPanel {
    
    private JTableHeader tableHeader = new JTableHeader();
    
    public BookTable() {
        initComponents();
        lblHighlight.setBackground(new Color(147,193,120));
        lblHighlight.setOpaque(true);
        
        lblBookTable.setBackground(new Color(70,91,140));
        lblBookTable.setOpaque(true);
        lblBookTable.setHorizontalAlignment(SwingConstants.CENTER);
        
        lblUpdateBookTable.setBackground(new Color(147,193,120));
        lblUpdateBookTable.setOpaque(true);
        lblUpdateBookTable.setHorizontalAlignment(SwingConstants.CENTER);
        lblUpdateBookTable.setVisible(false);
        
        lblDellBookTable1.setBackground(Color.red);
        lblDellBookTable1.setOpaque(true);
        lblDellBookTable1.setHorizontalAlignment(SwingConstants.CENTER);
        lblDellBookTable1.setVisible(false);
        
        tableHeader = tblBookTable.getTableHeader();
        tableHeader.setPreferredSize(new Dimension(200, 42));
        
        tableHeader.setFont(new Font("Tahoma", Font.PLAIN, 24));
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBookTable = new javax.swing.JTable();
        lblBookTable = new javax.swing.JLabel();
        lblUpdateBookTable = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblDellBookTable1 = new javax.swing.JLabel();
        lblHighlight = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1600, 2000));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Tên khách hàng:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 353, 188, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField2.setText("Nguyễn Văn A");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 340, 310, 55));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Search_50px.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(899, 340, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Calendar_50px.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 340, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Ngày đặt:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 340, 122, 54));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1.setText("26/4/2017");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 341, 129, 54));

        tblBookTable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tblBookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"2", "10:00", "Trần Văn Tý",  new Integer(4), "Chưa nhận bàn",  new Double(0.0)},
                {"5", "10:00", "Nguyễn Văn A",  new Integer(2), "Chưa nhận bàn",  new Double(0.0)},
                {"10", "10:30", "Văn Trần B",  new Integer(8), "Chưa nhận bàn",  new Double(0.0)},
                {"14", "11:00", "Nguyễn C",  new Integer(5), "Đã nhận",  new Double(0.0)},
                {"18", "11:30", "Sơn Trùng MTP",  new Integer(4), "Chưa nhật bàn",  new Double(0.0)},
                {"20", "12:00", "Noo Phước Thịnh",  new Integer(6), "Chưa nhận bàn",  new Double(0.0)},
                {"32", "12:30", "Đông Nhi",  new Integer(5), "Đã nhận bàn",  new Double(0.0)},
                {"45", "17:30", "Tóc Tiên",  new Integer(7), "Đã nhận bàn",  new Double(0.0)},
                {"50", "18:00", "Only C",  new Integer(3), "Chưa nhận bàn", null}
            },
            new String [] {
                "Bàn ", "Giờ đến", "Tên khách hàng", "Số người", "Trạng thái", "Tiền đặt trước"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblBookTable.setEditingColumn(10);
        tblBookTable.setEditingRow(10);
        tblBookTable.setRowHeight(40);
        tblBookTable.setRowMargin(10);
        tblBookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBookTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBookTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 437, 1583, 608));

        lblBookTable.setBackground(new java.awt.Color(70, 91, 140));
        lblBookTable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblBookTable.setForeground(new java.awt.Color(255, 255, 255));
        lblBookTable.setText("Đặt bàn");
        jPanel1.add(lblBookTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(1007, 340, 153, 61));

        lblUpdateBookTable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblUpdateBookTable.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdateBookTable.setText("Cập Nhật");
        jPanel1.add(lblUpdateBookTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 340, 132, 61));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("Danh Sách Đặt Bàn");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 57, -1, 57));

        jSeparator1.setBackground(new java.awt.Color(70, 92, 139));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 125, 1501, 9));

        lblDellBookTable1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDellBookTable1.setForeground(new java.awt.Color(255, 255, 255));
        lblDellBookTable1.setText("Hủy bàn");
        jPanel1.add(lblDellBookTable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 340, 132, 61));
        jPanel1.add(lblHighlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 10, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 976, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblBookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookTableMouseClicked
        // TODO add your handling code here:
        lblUpdateBookTable.setVisible(true);
        lblDellBookTable1.setVisible(true);
    }//GEN-LAST:event_tblBookTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblBookTable;
    private javax.swing.JLabel lblDellBookTable1;
    private javax.swing.JLabel lblHighlight;
    private javax.swing.JLabel lblUpdateBookTable;
    private javax.swing.JTable tblBookTable;
    // End of variables declaration//GEN-END:variables
}
