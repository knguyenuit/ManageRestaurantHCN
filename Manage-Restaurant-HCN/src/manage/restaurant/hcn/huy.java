/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manage.restaurant.hcn;


import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author voquanghuy
 */
public class huy extends javax.swing.JFrame {

    /**
     * Creates new form huy
     */
    
    public huy() {
        initComponents();
        
        
        
        try {
        //create the font to use. Specify the size!
        Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("bariol_regular-webfont.ttf")).deriveFont(25f);
        System.out.println(customFont.getFontName());
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        //register the font
        ge.registerFont(customFont);
        lblNameCompany.setFont(customFont);
        lblOrder.setFont(customFont);
        lblOrder.setFont(lblOrder.getFont().deriveFont(18f));
        
        lblDatBan.setFont(customFont);
        lblDatBan.setFont(lblDatBan.getFont().deriveFont(18f));
        
       
        lblNhanVien.setFont(customFont);
        lblNhanVien.setFont(lblDatBan.getFont().deriveFont(18f));
        lblDoiTac.setFont(customFont);
        lblDoiTac.setFont(lblDatBan.getFont().deriveFont(18f));
        lblGiaoDich.setFont(customFont);
        lblGiaoDich.setFont(lblDatBan.getFont().deriveFont(18f));
        
        } catch (IOException e) {
        e.printStackTrace();
        } catch(FontFormatException e) {
        e.printStackTrace();
        }   
        
        
        
//       Control order = new Control("Order");
//        
//        DefaultListModel<String> listModelControl = new DefaultListModel<>();
//        listModelControl.addElement("Nguyen");
//        listModelControl.addElement("Huy");
//        listModelControl.addElement("Cuong");
//       listView.setModel(listModelControl);
    
    
    
    
   
}
    

       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblNameCompany = new javax.swing.JLabel();
        pnlControl = new javax.swing.JPanel();
        pnlOrder = new javax.swing.JPanel();
        lblOrder = new javax.swing.JLabel();
        lblCurrent = new javax.swing.JLabel();
        pnlDoiTacCurrent = new javax.swing.JPanel();
        lblDoiTac = new javax.swing.JLabel();
        lblDoiTacCurrent = new javax.swing.JLabel();
        pnlDatBan = new javax.swing.JPanel();
        lblDatBan = new javax.swing.JLabel();
        lblDatBanCurrent = new javax.swing.JLabel();
        pnlGiaoDich = new javax.swing.JPanel();
        lblGiaoDich = new javax.swing.JLabel();
        lblGiaoDichCurrent = new javax.swing.JLabel();
        pnlNhanVien = new javax.swing.JPanel();
        lblNhanVien = new javax.swing.JLabel();
        lblNhanVienCurrent = new javax.swing.JLabel();
        lblTest = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(147, 193, 120));

        lblNameCompany.setForeground(new java.awt.Color(255, 255, 255));
        lblNameCompany.setText("Rectangle");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblNameCompany)
                .addContainerGap(813, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(lblNameCompany)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        pnlControl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlOrder.setBackground(new java.awt.Color(70, 92, 139));
        pnlOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlOrderMouseClicked(evt);
            }
        });

        lblOrder.setForeground(new java.awt.Color(255, 255, 255));
        lblOrder.setText("Order");

        lblCurrent.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout pnlOrderLayout = new javax.swing.GroupLayout(pnlOrder);
        pnlOrder.setLayout(pnlOrderLayout);
        pnlOrderLayout.setHorizontalGroup(
            pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOrderLayout.createSequentialGroup()
                .addComponent(lblCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(lblOrder)
                .addGap(72, 72, 72))
        );
        pnlOrderLayout.setVerticalGroup(
            pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblOrder)
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(lblCurrent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlControl.add(pnlOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        pnlDoiTacCurrent.setBackground(new java.awt.Color(70, 92, 139));
        pnlDoiTacCurrent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDoiTacCurrentMouseClicked(evt);
            }
        });

        lblDoiTac.setForeground(new java.awt.Color(255, 255, 255));
        lblDoiTac.setText("Doi Tac");

        lblDoiTacCurrent.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout pnlDoiTacCurrentLayout = new javax.swing.GroupLayout(pnlDoiTacCurrent);
        pnlDoiTacCurrent.setLayout(pnlDoiTacCurrentLayout);
        pnlDoiTacCurrentLayout.setHorizontalGroup(
            pnlDoiTacCurrentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDoiTacCurrentLayout.createSequentialGroup()
                .addComponent(lblDoiTacCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(lblDoiTac)
                .addGap(57, 57, 57))
        );
        pnlDoiTacCurrentLayout.setVerticalGroup(
            pnlDoiTacCurrentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoiTacCurrentLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblDoiTac)
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(lblDoiTacCurrent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlControl.add(pnlDoiTacCurrent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 210, 70));

        pnlDatBan.setBackground(new java.awt.Color(70, 92, 139));
        pnlDatBan.setForeground(new java.awt.Color(255, 255, 255));
        pnlDatBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDatBanMouseClicked(evt);
            }
        });

        lblDatBan.setForeground(new java.awt.Color(255, 255, 255));
        lblDatBan.setText("Dat ban");

        lblDatBanCurrent.setBackground(new java.awt.Color(153, 153, 255));
        lblDatBanCurrent.setSize(new java.awt.Dimension(45, 16));

        javax.swing.GroupLayout pnlDatBanLayout = new javax.swing.GroupLayout(pnlDatBan);
        pnlDatBan.setLayout(pnlDatBanLayout);
        pnlDatBanLayout.setHorizontalGroup(
            pnlDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatBanLayout.createSequentialGroup()
                .addComponent(lblDatBanCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(lblDatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        pnlDatBanLayout.setVerticalGroup(
            pnlDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatBanLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblDatBan)
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(lblDatBanCurrent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlControl.add(pnlDatBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 70));

        pnlGiaoDich.setBackground(new java.awt.Color(70, 92, 139));
        pnlGiaoDich.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlGiaoDichMouseClicked(evt);
            }
        });

        lblGiaoDich.setForeground(new java.awt.Color(255, 255, 255));
        lblGiaoDich.setText("Giao Dich");

        lblGiaoDichCurrent.setBackground(new java.awt.Color(153, 153, 255));
        lblGiaoDichCurrent.setSize(new java.awt.Dimension(45, 16));

        javax.swing.GroupLayout pnlGiaoDichLayout = new javax.swing.GroupLayout(pnlGiaoDich);
        pnlGiaoDich.setLayout(pnlGiaoDichLayout);
        pnlGiaoDichLayout.setHorizontalGroup(
            pnlGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGiaoDichLayout.createSequentialGroup()
                .addComponent(lblGiaoDichCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(lblGiaoDich, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        pnlGiaoDichLayout.setVerticalGroup(
            pnlGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGiaoDichLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblGiaoDich)
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(lblGiaoDichCurrent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlControl.add(pnlGiaoDich, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 210, 70));

        pnlNhanVien.setBackground(new java.awt.Color(70, 92, 139));
        pnlNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlNhanVienMouseClicked(evt);
            }
        });

        lblNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lblNhanVien.setText("Nhan Vien");

        lblNhanVienCurrent.setBackground(new java.awt.Color(153, 153, 255));
        lblNhanVienCurrent.setSize(new java.awt.Dimension(45, 16));

        javax.swing.GroupLayout pnlNhanVienLayout = new javax.swing.GroupLayout(pnlNhanVien);
        pnlNhanVien.setLayout(pnlNhanVienLayout);
        pnlNhanVienLayout.setHorizontalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNhanVienLayout.createSequentialGroup()
                .addComponent(lblNhanVienCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(lblNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        pnlNhanVienLayout.setVerticalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhanVienLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblNhanVien)
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(lblNhanVienCurrent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlControl.add(pnlNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 210, 70));

        getContentPane().add(pnlControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 460));

        lblTest.setText("jLabel2");
        getContentPane().add(lblTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrderMouseClicked
        // TODO add your handling code here:
        lblTest.setText("Order");
        lblCurrent.setBackground(new Color(146,193,120));
        lblCurrent.setOpaque(true);
        lblDatBanCurrent.setBackground(new Color(70, 92, 139));
        lblDoiTacCurrent.setBackground(new Color(70, 92, 139));
        lblGiaoDichCurrent.setBackground(new Color(70, 92, 139));
        lblNhanVienCurrent.setBackground(new Color(70, 92, 139));
    }//GEN-LAST:event_pnlOrderMouseClicked

    private void pnlDatBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDatBanMouseClicked
        // TODO add your handling code here:
        lblTest.setText("Dat ban");
        lblCurrent.setOpaque(false);
        lblDatBanCurrent.setBackground(new Color(146,193,120));
        lblDatBanCurrent.setOpaque(true);
        lblCurrent.setBackground(new Color(70, 92, 139));
        lblDoiTacCurrent.setBackground(new Color(70, 92, 139));
        lblGiaoDichCurrent.setBackground(new Color(70, 92, 139));
        lblNhanVienCurrent.setBackground(new Color(70, 92, 139));
    }//GEN-LAST:event_pnlDatBanMouseClicked

    private void pnlDoiTacCurrentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDoiTacCurrentMouseClicked
        // TODO add your handling code here:
        lblTest.setText("Doi Tac");
        lblDoiTacCurrent.setBackground(new Color(146,193,120));
        lblDoiTacCurrent.setOpaque(true);
        lblCurrent.setBackground(new Color(70, 92, 139));
        lblDatBanCurrent.setBackground(new Color(70, 92, 139));
        lblGiaoDichCurrent.setBackground(new Color(70, 92, 139));
        lblNhanVienCurrent.setBackground(new Color(70, 92, 139));
    }//GEN-LAST:event_pnlDoiTacCurrentMouseClicked

    private void pnlNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNhanVienMouseClicked
        // TODO add your handling code here:
        lblTest.setText("Nhan Vien");
        lblNhanVienCurrent.setBackground(new Color(146,193,120));
        lblNhanVienCurrent.setOpaque(true);
        lblCurrent.setBackground(new Color(70, 92, 139));
        lblDatBanCurrent.setBackground(new Color(70, 92, 139));
        lblGiaoDichCurrent.setBackground(new Color(70, 92, 139));
        lblDoiTacCurrent.setBackground(new Color(70, 92, 139));
    }//GEN-LAST:event_pnlNhanVienMouseClicked

    private void pnlGiaoDichMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlGiaoDichMouseClicked
        // TODO add your handling code here:
        lblTest.setText("Giao Dich");
        lblGiaoDichCurrent.setBackground(new Color(146,193,120));
        lblGiaoDichCurrent.setOpaque(true);
        lblCurrent.setBackground(new Color(70, 92, 139));
        lblDatBanCurrent.setBackground(new Color(70, 92, 139));
        lblDoiTacCurrent.setBackground(new Color(70, 92, 139));
        lblNhanVienCurrent.setBackground(new Color(70, 92, 139));
    }//GEN-LAST:event_pnlGiaoDichMouseClicked

    
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
            java.util.logging.Logger.getLogger(huy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(huy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(huy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(huy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new huy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCurrent;
    private javax.swing.JLabel lblDatBan;
    private javax.swing.JLabel lblDatBanCurrent;
    private javax.swing.JLabel lblDoiTac;
    private javax.swing.JLabel lblDoiTacCurrent;
    private javax.swing.JLabel lblGiaoDich;
    private javax.swing.JLabel lblGiaoDichCurrent;
    private javax.swing.JLabel lblNameCompany;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblNhanVienCurrent;
    private javax.swing.JLabel lblOrder;
    private javax.swing.JLabel lblTest;
    private javax.swing.JPanel pnlControl;
    private javax.swing.JPanel pnlDatBan;
    private javax.swing.JPanel pnlDoiTacCurrent;
    private javax.swing.JPanel pnlGiaoDich;
    private javax.swing.JPanel pnlNhanVien;
    private javax.swing.JPanel pnlOrder;
    // End of variables declaration//GEN-END:variables
}
