/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.management;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author User
 */
public class MainTemplate extends javax.swing.JFrame {

    public static int numOfTable = 60;
    public static int numOfFood = 11;
    
    public static String getTable = "" ;
    
    public static CardLayout layout = new CardLayout();
    
    private boolean clickDouble = false;
    
    private Component[] a = new Component[7];
    private JLabel[] current = new JLabel[7];
    private JPanel[] panelChild = new JPanel[4];
    
    
    
    
    public MainTemplate() {
        initComponents();
        
        
        
        layout = (CardLayout) pnlContent.getLayout();
        
        viSibleFalse();
        

        setStyleFont(lblLogo, 42);
        setStyleFont(lblTitleCurrent, 42);
        setStyleFont(lblOrder, 25);
        setStyleFont(lblGiaoDich, 25);
        setStyleFont(lblHangHoa, 25);
        setStyleFont(lblDoiTac, 25);
        setStyleFont(lblHoaDon, 25);
        setStyleFont(lblDatBan, 25);
        setStyleFont(lblNhanVien, 25);
        setStyleFont(lblKiemKho, 25);
        setStyleFont(lblNhapHang, 25);
        setStyleFont(lblNhaCungCap, 25);
        setStyleFont(lblKhachHang, 25);
        setStyleFont(lblBanAn, 25);
        setStyleFont(lblDanhMuc, 25);
        setStyleFont(lblBaoCao, 25);
        setStyleFont(lblCuoiNgayBC, 25);
        setStyleFont(lblHangHoaBC, 25);
        setStyleFont(lblKhachHangBC, 25);
        setStyleFont(lblNCCBC, 25);
        setStyleFont(lblKhachHangBC, 25);
        setStyleFont(lblNhanVienBC, 25);
        setStyleFont(lblTaiChinhBC, 25);
        
        
        a[0]= pnlOrder;
        a[1]= pnlDatBan;
        a[2]= pnlDoiTac;
        a[3]= pnlGiaoDich;
        a[4]= pnlHangHoa;
        a[5]= pnlNhanVien;
        a[6]= pnlBaoCao;
        
        current[0] = lblOrderCurrent;
        current[1] = lblDatBanCurrent;
        current[2] = lblDoiTacCurrent;
        current[3] = lblGiaoDichCurrent;
        current[4] = lblHangHoaCurrent;
        current[5] = lblNhanVienCurrent;
        current[6] = lblBaoCaoCurrent;
        
        panelChild[0] = pnlDoiTacChild;
        panelChild[1] = pnlGiaoDichChild;
        panelChild[2] = pnlHangHoaChild;
        panelChild[3] = pnlBaoCaoChild;
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        lblTitleCurrent = new javax.swing.JLabel();
        pnlControl = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlOrder = new javax.swing.JPanel();
        lblOrder = new javax.swing.JLabel();
        lblIconOrder = new javax.swing.JLabel();
        lblOrderCurrent = new javax.swing.JLabel();
        pnlDatBan = new javax.swing.JPanel();
        lblDatBan = new javax.swing.JLabel();
        lblIconDatBan = new javax.swing.JLabel();
        lblDatBanCurrent = new javax.swing.JLabel();
        pnlDoiTac = new javax.swing.JPanel();
        lblDoiTac = new javax.swing.JLabel();
        lblIconDoiTac = new javax.swing.JLabel();
        lblIconPlusDT = new javax.swing.JLabel();
        lblDoiTacCurrent = new javax.swing.JLabel();
        pnlDoiTacChild = new javax.swing.JPanel();
        pnlKhachHang = new javax.swing.JPanel();
        lblKhachHang = new javax.swing.JLabel();
        pnlNCC = new javax.swing.JPanel();
        lblNhaCungCap = new javax.swing.JLabel();
        pnlHangHoa = new javax.swing.JPanel();
        lblHangHoa = new javax.swing.JLabel();
        lblIconPlusHH = new javax.swing.JLabel();
        lblIconHangHoa = new javax.swing.JLabel();
        lblHangHoaCurrent = new javax.swing.JLabel();
        pnlHangHoaChild = new javax.swing.JPanel();
        pnlDanhMuc = new javax.swing.JPanel();
        lblDanhMuc = new javax.swing.JLabel();
        pnlBanAn = new javax.swing.JPanel();
        lblBanAn = new javax.swing.JLabel();
        pnlKiemKho = new javax.swing.JPanel();
        lblKiemKho = new javax.swing.JLabel();
        pnlNhanVien = new javax.swing.JPanel();
        lblNhanVien = new javax.swing.JLabel();
        lblIconNhanVien = new javax.swing.JLabel();
        lblNhanVienCurrent = new javax.swing.JLabel();
        pnlGiaoDich = new javax.swing.JPanel();
        lblGiaoDich = new javax.swing.JLabel();
        lblIconGiaoDich = new javax.swing.JLabel();
        lblPlusGD = new javax.swing.JLabel();
        lblGiaoDichCurrent = new javax.swing.JLabel();
        pnlGiaoDichChild = new javax.swing.JPanel();
        pnlHoaDon = new javax.swing.JPanel();
        lblHoaDon = new javax.swing.JLabel();
        pnlNhapHang = new javax.swing.JPanel();
        lblNhapHang = new javax.swing.JLabel();
        pnlBaoCao = new javax.swing.JPanel();
        lblBaoCao = new javax.swing.JLabel();
        lblPlusBC = new javax.swing.JLabel();
        lblIconBaoCao = new javax.swing.JLabel();
        lblBaoCaoCurrent = new javax.swing.JLabel();
        pnlBaoCaoChild = new javax.swing.JPanel();
        pnlCuoiNgayBC = new javax.swing.JPanel();
        lblCuoiNgayBC = new javax.swing.JLabel();
        pnlHangHoaBC = new javax.swing.JPanel();
        lblHangHoaBC = new javax.swing.JLabel();
        pnlKhachHangBC = new javax.swing.JPanel();
        lblKhachHangBC = new javax.swing.JLabel();
        pnlNCCBC = new javax.swing.JPanel();
        lblNCCBC = new javax.swing.JLabel();
        pnlNhanVienBC = new javax.swing.JPanel();
        lblNhanVienBC = new javax.swing.JLabel();
        pnlTaiChinhBC = new javax.swing.JPanel();
        lblTaiChinhBC = new javax.swing.JLabel();
        pnlWelcome = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(147, 193, 120));
        jPanel1.setForeground(new java.awt.Color(240, 255, 255));

        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Circled User Male_50px.png"))); // NOI18N

        lblTitleCurrent.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleCurrent.setText("Welcome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitleCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(542, 542, 542)
                .addComponent(lblUser)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblTitleCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlControl.setBackground(new java.awt.Color(70, 92, 139));

        jPanel2.setBackground(new java.awt.Color(70, 92, 139));

        lblLogo.setForeground(new java.awt.Color(240, 255, 255));
        lblLogo.setText("Rectangle");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(lblLogo)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(lblLogo)
                .addGap(33, 33, 33)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlControl.add(jPanel2);

        pnlOrder.setBackground(new java.awt.Color(70, 92, 139));
        pnlOrder.setPreferredSize(new java.awt.Dimension(410, 118));
        pnlOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlOrderMouseClicked(evt);
            }
        });

        lblOrder.setForeground(new java.awt.Color(240, 255, 255));
        lblOrder.setText("Order");

        lblIconOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Restaurant_50px.png"))); // NOI18N

        lblOrderCurrent.setBackground(new java.awt.Color(147, 193, 120));

        javax.swing.GroupLayout pnlOrderLayout = new javax.swing.GroupLayout(pnlOrder);
        pnlOrder.setLayout(pnlOrderLayout);
        pnlOrderLayout.setHorizontalGroup(
            pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOrderLayout.createSequentialGroup()
                .addComponent(lblOrderCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(lblIconOrder)
                .addGap(76, 76, 76)
                .addComponent(lblOrder)
                .addGap(65, 65, 65))
        );
        pnlOrderLayout.setVerticalGroup(
            pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderLayout.createSequentialGroup()
                .addGroup(pnlOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOrderLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblOrder))
                    .addGroup(pnlOrderLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblIconOrder)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addComponent(lblOrderCurrent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlControl.add(pnlOrder);

        pnlDatBan.setBackground(new java.awt.Color(70, 92, 139));
        pnlDatBan.setPreferredSize(new java.awt.Dimension(410, 118));
        pnlDatBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDatBanMouseClicked(evt);
            }
        });

        lblDatBan.setForeground(new java.awt.Color(240, 255, 255));
        lblDatBan.setText("Dat ban");

        lblIconDatBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Restaurant Table_50px.png"))); // NOI18N

        lblDatBanCurrent.setBackground(new java.awt.Color(147, 193, 120));

        javax.swing.GroupLayout pnlDatBanLayout = new javax.swing.GroupLayout(pnlDatBan);
        pnlDatBan.setLayout(pnlDatBanLayout);
        pnlDatBanLayout.setHorizontalGroup(
            pnlDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatBanLayout.createSequentialGroup()
                .addComponent(lblDatBanCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(lblIconDatBan)
                .addGap(76, 76, 76)
                .addComponent(lblDatBan)
                .addGap(66, 66, 66))
        );
        pnlDatBanLayout.setVerticalGroup(
            pnlDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatBanLayout.createSequentialGroup()
                .addGroup(pnlDatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatBanLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblIconDatBan))
                    .addGroup(pnlDatBanLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblDatBan)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addComponent(lblDatBanCurrent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlControl.add(pnlDatBan);

        pnlDoiTac.setBackground(new java.awt.Color(70, 92, 139));
        pnlDoiTac.setPreferredSize(new java.awt.Dimension(410, 118));
        pnlDoiTac.setRequestFocusEnabled(false);
        pnlDoiTac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDoiTacMouseClicked(evt);
            }
        });

        lblDoiTac.setForeground(new java.awt.Color(240, 255, 255));
        lblDoiTac.setText("Doi tac");

        lblIconDoiTac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Conference Call_50px.png"))); // NOI18N
        lblIconDoiTac.setToolTipText("");

        lblIconPlusDT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Plus Math_40px.png"))); // NOI18N

        lblDoiTacCurrent.setBackground(new java.awt.Color(147, 193, 120));

        javax.swing.GroupLayout pnlDoiTacLayout = new javax.swing.GroupLayout(pnlDoiTac);
        pnlDoiTac.setLayout(pnlDoiTacLayout);
        pnlDoiTacLayout.setHorizontalGroup(
            pnlDoiTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDoiTacLayout.createSequentialGroup()
                .addComponent(lblDoiTacCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(lblIconDoiTac)
                .addGap(82, 82, 82)
                .addComponent(lblDoiTac)
                .addGap(80, 80, 80)
                .addComponent(lblIconPlusDT)
                .addGap(8, 8, 8))
        );
        pnlDoiTacLayout.setVerticalGroup(
            pnlDoiTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoiTacLayout.createSequentialGroup()
                .addGroup(pnlDoiTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDoiTacLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblIconDoiTac))
                    .addGroup(pnlDoiTacLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(pnlDoiTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIconPlusDT)
                            .addComponent(lblDoiTac))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addComponent(lblDoiTacCurrent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlControl.add(pnlDoiTac);

        pnlDoiTacChild.setBackground(new java.awt.Color(34, 45, 68));
        pnlDoiTacChild.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlKhachHang.setBackground(new java.awt.Color(34, 45, 68));
        pnlKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlKhachHangMouseClicked(evt);
            }
        });

        lblKhachHang.setForeground(new java.awt.Color(240, 240, 240));
        lblKhachHang.setText("Khach hang");

        javax.swing.GroupLayout pnlKhachHangLayout = new javax.swing.GroupLayout(pnlKhachHang);
        pnlKhachHang.setLayout(pnlKhachHangLayout);
        pnlKhachHangLayout.setHorizontalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKhachHangLayout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addComponent(lblKhachHang)
                .addGap(104, 104, 104))
        );
        pnlKhachHangLayout.setVerticalGroup(
            pnlKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKhachHangLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblKhachHang)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pnlDoiTacChild.add(pnlKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 120));

        pnlNCC.setBackground(new java.awt.Color(34, 45, 68));
        pnlNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlNCCMouseClicked(evt);
            }
        });

        lblNhaCungCap.setForeground(new java.awt.Color(240, 240, 240));
        lblNhaCungCap.setText("Nha cung cap");

        javax.swing.GroupLayout pnlNCCLayout = new javax.swing.GroupLayout(pnlNCC);
        pnlNCC.setLayout(pnlNCCLayout);
        pnlNCCLayout.setHorizontalGroup(
            pnlNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNCCLayout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addComponent(lblNhaCungCap)
                .addGap(90, 90, 90))
        );
        pnlNCCLayout.setVerticalGroup(
            pnlNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNCCLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblNhaCungCap)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pnlDoiTacChild.add(pnlNCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 410, 120));

        pnlControl.add(pnlDoiTacChild);

        pnlHangHoa.setBackground(new java.awt.Color(70, 92, 139));
        pnlHangHoa.setPreferredSize(new java.awt.Dimension(410, 118));
        pnlHangHoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlHangHoaMouseClicked(evt);
            }
        });

        lblHangHoa.setForeground(new java.awt.Color(240, 240, 240));
        lblHangHoa.setText("Hang hoa");

        lblIconPlusHH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Plus Math_40px.png"))); // NOI18N

        lblIconHangHoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Cardboard Box_50px.png"))); // NOI18N

        lblHangHoaCurrent.setBackground(new java.awt.Color(147, 193, 120));

        javax.swing.GroupLayout pnlHangHoaLayout = new javax.swing.GroupLayout(pnlHangHoa);
        pnlHangHoa.setLayout(pnlHangHoaLayout);
        pnlHangHoaLayout.setHorizontalGroup(
            pnlHangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHangHoaLayout.createSequentialGroup()
                .addComponent(lblHangHoaCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(lblIconHangHoa)
                .addGap(76, 76, 76)
                .addComponent(lblHangHoa)
                .addGap(53, 53, 53)
                .addComponent(lblIconPlusHH, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        pnlHangHoaLayout.setVerticalGroup(
            pnlHangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHangHoaCurrent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlHangHoaLayout.createSequentialGroup()
                .addGroup(pnlHangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHangHoaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblIconHangHoa))
                    .addGroup(pnlHangHoaLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblHangHoa))
                    .addGroup(pnlHangHoaLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblIconPlusHH)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pnlControl.add(pnlHangHoa);

        pnlHangHoaChild.setBackground(new java.awt.Color(34, 45, 68));
        pnlHangHoaChild.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDanhMuc.setBackground(new java.awt.Color(34, 45, 68));
        pnlDanhMuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDanhMucMouseClicked(evt);
            }
        });

        lblDanhMuc.setForeground(new java.awt.Color(240, 240, 240));
        lblDanhMuc.setText("Danh muc");

        javax.swing.GroupLayout pnlDanhMucLayout = new javax.swing.GroupLayout(pnlDanhMuc);
        pnlDanhMuc.setLayout(pnlDanhMucLayout);
        pnlDanhMucLayout.setHorizontalGroup(
            pnlDanhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhMucLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(lblDanhMuc)
                .addGap(108, 108, 108))
        );
        pnlDanhMucLayout.setVerticalGroup(
            pnlDanhMucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhMucLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblDanhMuc)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pnlHangHoaChild.add(pnlDanhMuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 120));

        pnlBanAn.setBackground(new java.awt.Color(34, 45, 68));
        pnlBanAn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBanAnMouseClicked(evt);
            }
        });

        lblBanAn.setForeground(new java.awt.Color(240, 240, 240));
        lblBanAn.setText("Ban An");
        lblBanAn.setToolTipText("");

        javax.swing.GroupLayout pnlBanAnLayout = new javax.swing.GroupLayout(pnlBanAn);
        pnlBanAn.setLayout(pnlBanAnLayout);
        pnlBanAnLayout.setHorizontalGroup(
            pnlBanAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBanAnLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(lblBanAn)
                .addGap(95, 95, 95))
        );
        pnlBanAnLayout.setVerticalGroup(
            pnlBanAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBanAnLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblBanAn)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pnlHangHoaChild.add(pnlBanAn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 410, 120));

        pnlKiemKho.setBackground(new java.awt.Color(34, 45, 68));

        lblKiemKho.setForeground(new java.awt.Color(240, 240, 240));
        lblKiemKho.setText("Kiem kho");

        javax.swing.GroupLayout pnlKiemKhoLayout = new javax.swing.GroupLayout(pnlKiemKho);
        pnlKiemKho.setLayout(pnlKiemKhoLayout);
        pnlKiemKhoLayout.setHorizontalGroup(
            pnlKiemKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKiemKhoLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(lblKiemKho)
                .addGap(109, 109, 109))
        );
        pnlKiemKhoLayout.setVerticalGroup(
            pnlKiemKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKiemKhoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblKiemKho)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pnlHangHoaChild.add(pnlKiemKho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 410, 120));

        pnlControl.add(pnlHangHoaChild);

        pnlNhanVien.setBackground(new java.awt.Color(70, 92, 139));
        pnlNhanVien.setPreferredSize(new java.awt.Dimension(410, 120));
        pnlNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlNhanVienMouseClicked(evt);
            }
        });

        lblNhanVien.setForeground(new java.awt.Color(240, 240, 240));
        lblNhanVien.setText("Nhan vien");

        lblIconNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Restaurant Pickup_50px.png"))); // NOI18N

        lblNhanVienCurrent.setBackground(new java.awt.Color(147, 193, 120));

        javax.swing.GroupLayout pnlNhanVienLayout = new javax.swing.GroupLayout(pnlNhanVien);
        pnlNhanVien.setLayout(pnlNhanVienLayout);
        pnlNhanVienLayout.setHorizontalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNhanVienLayout.createSequentialGroup()
                .addComponent(lblNhanVienCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(lblIconNhanVien)
                .addGap(74, 74, 74)
                .addComponent(lblNhanVien)
                .addGap(106, 106, 106))
        );
        pnlNhanVienLayout.setVerticalGroup(
            pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhanVienLayout.createSequentialGroup()
                .addGroup(pnlNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNhanVienLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblIconNhanVien))
                    .addGroup(pnlNhanVienLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblNhanVien)))
                .addGap(40, 40, 40))
            .addComponent(lblNhanVienCurrent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        pnlControl.add(pnlNhanVien);

        pnlGiaoDich.setBackground(new java.awt.Color(70, 92, 139));
        pnlGiaoDich.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlGiaoDichMouseClicked(evt);
            }
        });

        lblGiaoDich.setForeground(new java.awt.Color(240, 240, 240));
        lblGiaoDich.setText("Giao dich");

        lblIconGiaoDich.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Coins_50px.png"))); // NOI18N

        lblPlusGD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Plus Math_40px.png"))); // NOI18N

        lblGiaoDichCurrent.setBackground(new java.awt.Color(147, 193, 120));

        javax.swing.GroupLayout pnlGiaoDichLayout = new javax.swing.GroupLayout(pnlGiaoDich);
        pnlGiaoDich.setLayout(pnlGiaoDichLayout);
        pnlGiaoDichLayout.setHorizontalGroup(
            pnlGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGiaoDichLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGiaoDichCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(lblIconGiaoDich)
                .addGap(72, 72, 72)
                .addComponent(lblGiaoDich)
                .addGap(58, 58, 58)
                .addComponent(lblPlusGD)
                .addGap(28, 28, 28))
        );
        pnlGiaoDichLayout.setVerticalGroup(
            pnlGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGiaoDichLayout.createSequentialGroup()
                .addGroup(pnlGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGiaoDichLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblIconGiaoDich))
                    .addGroup(pnlGiaoDichLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(pnlGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlusGD)
                            .addComponent(lblGiaoDich))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addComponent(lblGiaoDichCurrent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlControl.add(pnlGiaoDich);

        pnlGiaoDichChild.setBackground(new java.awt.Color(34, 45, 68));
        pnlGiaoDichChild.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHoaDon.setBackground(new java.awt.Color(34, 45, 68));
        pnlHoaDon.setPreferredSize(new java.awt.Dimension(410, 120));

        lblHoaDon.setForeground(new java.awt.Color(240, 240, 240));
        lblHoaDon.setText("Hoa don");

        javax.swing.GroupLayout pnlHoaDonLayout = new javax.swing.GroupLayout(pnlHoaDon);
        pnlHoaDon.setLayout(pnlHoaDonLayout);
        pnlHoaDonLayout.setHorizontalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(lblHoaDon)
                .addGap(121, 121, 121))
        );
        pnlHoaDonLayout.setVerticalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHoaDonLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblHoaDon)
                .addGap(43, 43, 43))
        );

        pnlGiaoDichChild.add(pnlHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, -1));

        pnlNhapHang.setBackground(new java.awt.Color(34, 45, 68));

        lblNhapHang.setForeground(new java.awt.Color(240, 240, 240));
        lblNhapHang.setText("Nhap hang");

        javax.swing.GroupLayout pnlNhapHangLayout = new javax.swing.GroupLayout(pnlNhapHang);
        pnlNhapHang.setLayout(pnlNhapHangLayout);
        pnlNhapHangLayout.setHorizontalGroup(
            pnlNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNhapHangLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(lblNhapHang)
                .addGap(112, 112, 112))
        );
        pnlNhapHangLayout.setVerticalGroup(
            pnlNhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhapHangLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblNhapHang)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pnlGiaoDichChild.add(pnlNhapHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 410, 120));

        pnlControl.add(pnlGiaoDichChild);

        pnlBaoCao.setBackground(new java.awt.Color(70, 92, 139));
        pnlBaoCao.setPreferredSize(new java.awt.Dimension(410, 118));
        pnlBaoCao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBaoCaoMouseClicked(evt);
            }
        });

        lblBaoCao.setForeground(new java.awt.Color(240, 240, 240));
        lblBaoCao.setText("Bao Cao");

        lblPlusBC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Plus Math_40px.png"))); // NOI18N

        lblIconBaoCao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Combo Chart_50px.png"))); // NOI18N

        lblBaoCaoCurrent.setBackground(new java.awt.Color(147, 193, 120));

        javax.swing.GroupLayout pnlBaoCaoLayout = new javax.swing.GroupLayout(pnlBaoCao);
        pnlBaoCao.setLayout(pnlBaoCaoLayout);
        pnlBaoCaoLayout.setHorizontalGroup(
            pnlBaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBaoCaoLayout.createSequentialGroup()
                .addComponent(lblBaoCaoCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(lblIconBaoCao)
                .addGap(74, 74, 74)
                .addComponent(lblBaoCao)
                .addGap(56, 56, 56)
                .addComponent(lblPlusBC)
                .addContainerGap())
        );
        pnlBaoCaoLayout.setVerticalGroup(
            pnlBaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBaoCaoCurrent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBaoCaoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblIconBaoCao)
                .addGap(37, 37, 37))
            .addGroup(pnlBaoCaoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pnlBaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlusBC)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBaoCaoLayout.createSequentialGroup()
                        .addComponent(lblBaoCao)
                        .addGap(9, 9, 9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlControl.add(pnlBaoCao);

        pnlBaoCaoChild.setBackground(new java.awt.Color(34, 45, 68));
        pnlBaoCaoChild.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCuoiNgayBC.setBackground(new java.awt.Color(34, 45, 68));
        pnlCuoiNgayBC.setPreferredSize(new java.awt.Dimension(410, 118));

        lblCuoiNgayBC.setForeground(new java.awt.Color(240, 240, 240));
        lblCuoiNgayBC.setText("Cuoi ngay");

        javax.swing.GroupLayout pnlCuoiNgayBCLayout = new javax.swing.GroupLayout(pnlCuoiNgayBC);
        pnlCuoiNgayBC.setLayout(pnlCuoiNgayBCLayout);
        pnlCuoiNgayBCLayout.setHorizontalGroup(
            pnlCuoiNgayBCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCuoiNgayBCLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(lblCuoiNgayBC)
                .addGap(121, 121, 121))
        );
        pnlCuoiNgayBCLayout.setVerticalGroup(
            pnlCuoiNgayBCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCuoiNgayBCLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblCuoiNgayBC)
                .addGap(43, 43, 43))
        );

        pnlBaoCaoChild.add(pnlCuoiNgayBC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 120));

        pnlHangHoaBC.setBackground(new java.awt.Color(34, 45, 68));
        pnlHangHoaBC.setPreferredSize(new java.awt.Dimension(410, 118));

        lblHangHoaBC.setForeground(new java.awt.Color(240, 240, 240));
        lblHangHoaBC.setText("Hang hoa");

        javax.swing.GroupLayout pnlHangHoaBCLayout = new javax.swing.GroupLayout(pnlHangHoaBC);
        pnlHangHoaBC.setLayout(pnlHangHoaBCLayout);
        pnlHangHoaBCLayout.setHorizontalGroup(
            pnlHangHoaBCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHangHoaBCLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(lblHangHoaBC)
                .addGap(119, 119, 119))
        );
        pnlHangHoaBCLayout.setVerticalGroup(
            pnlHangHoaBCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHangHoaBCLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblHangHoaBC)
                .addGap(43, 43, 43))
        );

        pnlBaoCaoChild.add(pnlHangHoaBC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 410, 120));

        pnlKhachHangBC.setBackground(new java.awt.Color(34, 45, 68));

        lblKhachHangBC.setForeground(new java.awt.Color(240, 240, 240));
        lblKhachHangBC.setText("Khach hang");

        javax.swing.GroupLayout pnlKhachHangBCLayout = new javax.swing.GroupLayout(pnlKhachHangBC);
        pnlKhachHangBC.setLayout(pnlKhachHangBCLayout);
        pnlKhachHangBCLayout.setHorizontalGroup(
            pnlKhachHangBCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKhachHangBCLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(lblKhachHangBC)
                .addGap(120, 120, 120))
        );
        pnlKhachHangBCLayout.setVerticalGroup(
            pnlKhachHangBCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKhachHangBCLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblKhachHangBC)
                .addGap(43, 43, 43))
        );

        pnlBaoCaoChild.add(pnlKhachHangBC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 410, 120));

        pnlNCCBC.setBackground(new java.awt.Color(34, 45, 68));

        lblNCCBC.setForeground(new java.awt.Color(240, 240, 240));
        lblNCCBC.setText("Nha cung cap");

        javax.swing.GroupLayout pnlNCCBCLayout = new javax.swing.GroupLayout(pnlNCCBC);
        pnlNCCBC.setLayout(pnlNCCBCLayout);
        pnlNCCBCLayout.setHorizontalGroup(
            pnlNCCBCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNCCBCLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(lblNCCBC)
                .addGap(114, 114, 114))
        );
        pnlNCCBCLayout.setVerticalGroup(
            pnlNCCBCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNCCBCLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblNCCBC)
                .addGap(43, 43, 43))
        );

        pnlBaoCaoChild.add(pnlNCCBC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 410, 120));

        pnlNhanVienBC.setBackground(new java.awt.Color(34, 45, 68));

        lblNhanVienBC.setForeground(new java.awt.Color(240, 240, 240));
        lblNhanVienBC.setText("Nhan vien");

        javax.swing.GroupLayout pnlNhanVienBCLayout = new javax.swing.GroupLayout(pnlNhanVienBC);
        pnlNhanVienBC.setLayout(pnlNhanVienBCLayout);
        pnlNhanVienBCLayout.setHorizontalGroup(
            pnlNhanVienBCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNhanVienBCLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(lblNhanVienBC)
                .addGap(112, 112, 112))
        );
        pnlNhanVienBCLayout.setVerticalGroup(
            pnlNhanVienBCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNhanVienBCLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblNhanVienBC)
                .addGap(43, 43, 43))
        );

        pnlBaoCaoChild.add(pnlNhanVienBC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 410, 120));

        pnlTaiChinhBC.setBackground(new java.awt.Color(34, 45, 68));

        lblTaiChinhBC.setForeground(new java.awt.Color(240, 240, 240));
        lblTaiChinhBC.setText("Tai chinh");

        javax.swing.GroupLayout pnlTaiChinhBCLayout = new javax.swing.GroupLayout(pnlTaiChinhBC);
        pnlTaiChinhBC.setLayout(pnlTaiChinhBCLayout);
        pnlTaiChinhBCLayout.setHorizontalGroup(
            pnlTaiChinhBCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTaiChinhBCLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(lblTaiChinhBC)
                .addGap(107, 107, 107))
        );
        pnlTaiChinhBCLayout.setVerticalGroup(
            pnlTaiChinhBCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTaiChinhBCLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblTaiChinhBC)
                .addGap(43, 43, 43))
        );

        pnlBaoCaoChild.add(pnlTaiChinhBC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 410, 120));

        pnlControl.add(pnlBaoCaoChild);

        pnlContent.setLayout(new java.awt.CardLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("PHẦN MỀM QUẢN LÝ NHÀ HÀNG");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logo.jpg"))); // NOI18N
        jLabel1.setText("\n");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        jLabel2.setText("Giáo viên hướng dẫn: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Nhóm 2:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("-Võ Quang Huy");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("-Nguyễn Cao Cường");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("-Trần Khách Nguyên");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        jLabel8.setText("Th.s Đỗ Thị Minh Phụng");

        javax.swing.GroupLayout pnlWelcomeLayout = new javax.swing.GroupLayout(pnlWelcome);
        pnlWelcome.setLayout(pnlWelcomeLayout);
        pnlWelcomeLayout.setHorizontalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addContainerGap(798, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(718, Short.MAX_VALUE))
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addContainerGap(500, Short.MAX_VALUE)
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWelcomeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(pnlWelcomeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 654, Short.MAX_VALUE))
        );
        pnlWelcomeLayout.setVerticalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap(1690, Short.MAX_VALUE))
        );

        pnlContent.add(pnlWelcome, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlControl, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlContent, javax.swing.GroupLayout.PREFERRED_SIZE, 1730, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlControl, javax.swing.GroupLayout.PREFERRED_SIZE, 2560, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(pnlContent, javax.swing.GroupLayout.PREFERRED_SIZE, 2430, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlDoiTacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDoiTacMouseClicked
        
        lblTitleCurrent.setText("Doi Tac");
        
        setBackgroupColor(a,current, pnlDoiTac, lblDoiTacCurrent);
        setClicked(pnlDoiTacChild, panelChild);
    }//GEN-LAST:event_pnlDoiTacMouseClicked

    private void pnlHangHoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHangHoaMouseClicked
        
        lblTitleCurrent.setText("Hang Hoa");
        setBackgroupColor(a,current, pnlHangHoa, lblHangHoaCurrent);
        setClicked(pnlHangHoaChild, panelChild);
    }//GEN-LAST:event_pnlHangHoaMouseClicked

    private void pnlGiaoDichMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlGiaoDichMouseClicked
        
        lblTitleCurrent.setText("Giao Dich");
        setBackgroupColor(a,current, pnlGiaoDich, lblGiaoDichCurrent);
        setClicked(pnlGiaoDichChild, panelChild);
        
    }//GEN-LAST:event_pnlGiaoDichMouseClicked

    private void pnlOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrderMouseClicked
        
        lblTitleCurrent.setText("Order");
        
        setBackgroupColor(a,current, pnlOrder, lblOrderCurrent);
        setClicked(null, panelChild);

        Tables t = new Tables();
        //Foods f = new Foods();
        pnlContent.add(t, "panel6");
        //pnlContent.add(f,"panel7");
        layout.show(pnlContent,"panel6");
        
    }//GEN-LAST:event_pnlOrderMouseClicked

    private void pnlDatBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDatBanMouseClicked
        
        lblTitleCurrent.setText("Dat Ban");
        setBackgroupColor(a,current, pnlDatBan, lblDatBanCurrent);
        setClicked(null, panelChild);
        
        BookTable bookTable = new BookTable();
        pnlContent.add(bookTable, "panel8");
        layout.show(pnlContent, "panel8");
        
    }//GEN-LAST:event_pnlDatBanMouseClicked

    private void pnlNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNhanVienMouseClicked
        
        lblTitleCurrent.setText("Nhan Vien");
        setBackgroupColor(a,current, pnlNhanVien, lblNhanVienCurrent);
        setClicked(null, panelChild);
        Employee employee = new Employee();
        pnlContent.add(employee,"panel11");
        layout.show(pnlContent, "panel11");
    }//GEN-LAST:event_pnlNhanVienMouseClicked

    private void pnlBaoCaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBaoCaoMouseClicked
        
        lblTitleCurrent.setText("Bao Cao");
         setBackgroupColor(a,current, pnlBaoCao, lblBaoCaoCurrent);
         setClicked(pnlBaoCaoChild, panelChild);
    }//GEN-LAST:event_pnlBaoCaoMouseClicked

    private void pnlKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKhachHangMouseClicked
        
        Customer customer = new Customer();
        pnlContent.add(customer,"panel9");
        layout.show(pnlContent, "panel9");
    }//GEN-LAST:event_pnlKhachHangMouseClicked

    private void pnlNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNCCMouseClicked
        
        System.out.println("ok 1");
        Supplier supplier = new Supplier();
        pnlContent.add(supplier, "panel0");
        layout.show(pnlContent, "panel0");
    }//GEN-LAST:event_pnlNCCMouseClicked

    private void pnlDanhMucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDanhMucMouseClicked
        
        Category category = new Category();
        pnlContent.add(category, "panel12");
        layout.show(pnlContent, "panel12");
    }//GEN-LAST:event_pnlDanhMucMouseClicked

    private void pnlBanAnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBanAnMouseClicked
        
        SetTheTable setTheTable = new SetTheTable();
        pnlContent.add(setTheTable, "panel13");
        layout.show(pnlContent, "panel13");
    }//GEN-LAST:event_pnlBanAnMouseClicked

    private void viSibleFalse ()
    {
        pnlDoiTacChild.setVisible(false);
        pnlHangHoaChild.setVisible(false);
        pnlGiaoDichChild.setVisible(false);
        pnlBaoCaoChild.setVisible(false);
        //pnlSoDo.setVisible(false);
        //pnlDanhMucContent.setVisible(false);
//        System.out.println(pnlSoDo.getVisibleRect().toString());
    }
    
    private void setClicked(JPanel c, JPanel[] panelChild )
    {
            for (JPanel i : panelChild )
            {
                if(i == c)
                {
                    i.setVisible(true);
                 
                }
                else
                {
                    i.setVisible(false);
                }
            }
    }
    
    public static void setStyleFont (Component c, float f)
    {
        try {
        //create the font to use. Specify the size!
        Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("bariol_regular-webfont.ttf")).deriveFont(f);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        //register the font
        ge.registerFont(customFont);
        
        c.setFont(customFont);
        
        } catch (IOException e) {
        e.printStackTrace();
        } catch(FontFormatException e) {
        e.printStackTrace();
        }   
    }
    
    private void setBackgroupColor (Component[] s, JLabel[] current, Component c, JLabel d)
    {
        for(Component i : s)
        {
            if(i == c)
            {
                c.setBackground(new Color(34, 45, 68));
                
            }
            else
            {
                i.setBackground(new Color(70, 92, 139));
            }
        }
        
        for (JLabel y : current)
        {
            if(y == d)
            {
                d.setBackground(new Color(147,193,120));
                d.setOpaque(true);
            }
            else
            {
                y.setBackground(new Color(70, 92, 139));
                y.setOpaque(true);
            }
        }
    }
    
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainTemplate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBanAn;
    private javax.swing.JLabel lblBaoCao;
    private javax.swing.JLabel lblBaoCaoCurrent;
    private javax.swing.JLabel lblCuoiNgayBC;
    private javax.swing.JLabel lblDanhMuc;
    private javax.swing.JLabel lblDatBan;
    private javax.swing.JLabel lblDatBanCurrent;
    private javax.swing.JLabel lblDoiTac;
    private javax.swing.JLabel lblDoiTacCurrent;
    private javax.swing.JLabel lblGiaoDich;
    private javax.swing.JLabel lblGiaoDichCurrent;
    private javax.swing.JLabel lblHangHoa;
    private javax.swing.JLabel lblHangHoaBC;
    private javax.swing.JLabel lblHangHoaCurrent;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblIconBaoCao;
    private javax.swing.JLabel lblIconDatBan;
    private javax.swing.JLabel lblIconDoiTac;
    private javax.swing.JLabel lblIconGiaoDich;
    private javax.swing.JLabel lblIconHangHoa;
    private javax.swing.JLabel lblIconNhanVien;
    private javax.swing.JLabel lblIconOrder;
    private javax.swing.JLabel lblIconPlusDT;
    private javax.swing.JLabel lblIconPlusHH;
    private javax.swing.JLabel lblKhachHang;
    private javax.swing.JLabel lblKhachHangBC;
    private javax.swing.JLabel lblKiemKho;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNCCBC;
    private javax.swing.JLabel lblNhaCungCap;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblNhanVienBC;
    private javax.swing.JLabel lblNhanVienCurrent;
    private javax.swing.JLabel lblNhapHang;
    private javax.swing.JLabel lblOrder;
    private javax.swing.JLabel lblOrderCurrent;
    private javax.swing.JLabel lblPlusBC;
    private javax.swing.JLabel lblPlusGD;
    private javax.swing.JLabel lblTaiChinhBC;
    private javax.swing.JLabel lblTitleCurrent;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlBanAn;
    private javax.swing.JPanel pnlBaoCao;
    private javax.swing.JPanel pnlBaoCaoChild;
    public static final javax.swing.JPanel pnlContent = new javax.swing.JPanel();
    private javax.swing.JPanel pnlControl;
    private javax.swing.JPanel pnlCuoiNgayBC;
    private javax.swing.JPanel pnlDanhMuc;
    private javax.swing.JPanel pnlDatBan;
    private javax.swing.JPanel pnlDoiTac;
    private javax.swing.JPanel pnlDoiTacChild;
    private javax.swing.JPanel pnlGiaoDich;
    private javax.swing.JPanel pnlGiaoDichChild;
    private javax.swing.JPanel pnlHangHoa;
    private javax.swing.JPanel pnlHangHoaBC;
    private javax.swing.JPanel pnlHangHoaChild;
    private javax.swing.JPanel pnlHoaDon;
    private javax.swing.JPanel pnlKhachHang;
    private javax.swing.JPanel pnlKhachHangBC;
    private javax.swing.JPanel pnlKiemKho;
    private javax.swing.JPanel pnlNCC;
    private javax.swing.JPanel pnlNCCBC;
    private javax.swing.JPanel pnlNhanVien;
    private javax.swing.JPanel pnlNhanVienBC;
    private javax.swing.JPanel pnlNhapHang;
    private javax.swing.JPanel pnlOrder;
    private javax.swing.JPanel pnlTaiChinhBC;
    private javax.swing.JPanel pnlWelcome;
    // End of variables declaration//GEN-END:variables
}
