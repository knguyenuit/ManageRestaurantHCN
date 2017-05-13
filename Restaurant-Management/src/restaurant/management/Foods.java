
package restaurant.management;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import static restaurant.management.MainTemplate.getTable;
import static restaurant.management.MainTemplate.layout;
import static restaurant.management.MainTemplate.numOfFood;
import static restaurant.management.MainTemplate.pnlContent;
import static restaurant.management.MainTemplate.setStyleFont;

public class Foods extends javax.swing.JPanel {

    private JPanel pnlMonAn = new JPanel (new GridLayout(6,2,5,5));
    
    private String[] Url = new String[numOfFood];
    private String[] Name = new String[numOfFood];
    private int[] price = new int[numOfFood];
    
    private Food[] food = new Food[numOfFood];
    private JScrollPane scroll = new JScrollPane(pnlMonAn, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
    private JPanel pnlSetThePay = new JPanel(new AbsoluteLayout());
    
    
    private JPanel pnlBillContent = new JPanel(new GridLayout(6,1,5,5));
    private JScrollPane scroll1 = new JScrollPane(pnlBillContent, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    
    public static int total = 0;
    public static int mustPay = 0;
    public static int sale = 0;
    
    public Foods() {
        initComponents();
        
        lblGetTable.setText(getTable);
        
        
        lblPay.setBackground(new Color(147,193,120));
        lblPay.setOpaque(true);
        lblPay.setHorizontalAlignment(SwingConstants.CENTER);
        
        lblNotificationKitchen.setBackground(Color.red);
        lblNotificationKitchen.setOpaque(true);
        lblNotificationKitchen.setHorizontalAlignment(SwingConstants.CENTER);
        
        setStyleFont(jLabel3, 27);
        setStyleFont(jLabel4, 27);
        setStyleFont(jLabel5, 27);
        setStyleFont(jLabel6, 27);
        setStyleFont(jLabel7, 27);
        setStyleFont(jLabel8, 27);
        setStyleFont(lblMustPay, 27);
        setStyleFont(jLabel11, 27);
        setStyleFont(lblTotal, 27);
        setStyleFont(txtSale, 27);
        setStyleFont(txtPay, 27);
        
        
        FoodsImage();

    }
     public void FoodsImage ()
    {
        
        Url[0] = "/image/food-dinner-lemon-rice.jpg";
        Url[1] = "/image/food-salmon-teriyaki-cooking.jpg";
        Url[2] = "/image/pasta.jpg";
        Url[3] = "/image/thit_heo.jpeg"; 
        Url[4] = "/image/pexels-photo-109275.jpeg";
        Url[5] = "/image/pexels-photo-160150.jpeg";
        Url[6] = "/image/pexels-photo-262959.jpeg";
        Url[7] = "/image/pexels-photo-27433.jpg";
        Url[8] = "/image/pexels-photo-59053.jpeg";
        Url[9] = "/image/pexels-photo-65131.jpeg";
        Url[10] = "/image/pexels.jpeg";
        
        Name[0] = "Lemon rice";
        Name[1] = "Salmon teriyaki";
        Name[2] = "Pasta";
        Name[3] = "Pork";
        Name[4] = "Orange Juice";
        Name[5] = "Strawberry Juice";
        Name[6] = "Fish";
        Name[7] = "Watermelon Juice";
        Name[8] = "Blackberry Juice";
        Name[9] = "Noodles";
        Name[10] = "Guava Juice";
        

        price[0] = 150000;
        price[1] = 300000;
        price[2] = 500000;
        price[3] = 170000;
        price[4] = 30000;
        price[5] = 50000;
        price[6] = 60000;
        price[7] = 90000;
        price[8] = 110000;
        price[9] = 120000;
        price[10]= 70000;
        
        pnlOrderContent.add(scroll, new AbsoluteConstraints(10, 250, 1000, 1000));
        pnlBillContent.setBackground(new Color(255, 255, 128));
        for (int i = 0; i< numOfFood ; i ++)
        {
            
            food[i] = new Food(Url[i], Name[i], price[i]);
            food[i].setName(Name[i]);
            
            pnlMonAn.add(food[i]);
            
            pnlOrderContent.add(scroll1,new AbsoluteConstraints(1010, 250, 700, 650) );
            
            int s = (int) food[i].getFoodPrice();
            
            food[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked (MouseEvent e)
                {
                    
                    JPanel j = (JPanel)e.getSource();
                    System.out.println("Ten : " + j.getName());
                    System.out.println("Gia : " + s);
                    
                    
                            
                    Bill bill = new Bill(j.getName(), s);
                    
                    System.out.println("\nprice: " + bill.getLblPriceFood().getText());
                    
                    pnlBillContent.add(bill);
                    
                    pnlOrderContent.revalidate(); 
                    
                }
            
            });
            
        }
    }
    
     
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlOrderContent = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblBack = new javax.swing.JLabel();
        lblPay = new javax.swing.JLabel();
        lblNotificationKitchen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblGetTable = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtSale = new javax.swing.JTextField();
        txtPay = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(1720, 2000));

        pnlOrderContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Thực Đơn");
        pnlOrderContent.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 330, 80));

        jSeparator1.setBackground(new java.awt.Color(70, 92, 139));
        pnlOrderContent.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 124, 1600, 10));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Back_50px.png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        pnlOrderContent.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        lblPay.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPay.setForeground(new java.awt.Color(255, 255, 255));
        lblPay.setText("Thanh Toán");
        pnlOrderContent.add(lblPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 920, 180, 140));

        lblNotificationKitchen.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNotificationKitchen.setForeground(new java.awt.Color(255, 255, 255));
        lblNotificationKitchen.setText("Thông Báo Bếp");
        pnlOrderContent.add(lblNotificationKitchen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 1170, 180, 140));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Hóa đơn bàn số :");
        pnlOrderContent.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 170, -1, -1));

        lblGetTable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblGetTable.setForeground(new java.awt.Color(255, 102, 102));
        lblGetTable.setText("jLabel3");
        pnlOrderContent.add(lblGetTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 170, -1, 30));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Khai vị", "Đồ uống", "Đồ mặn", "Khác" }));
        pnlOrderContent.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 160, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Nhóm hàng :");
        pnlOrderContent.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jPanel1.setBackground(new java.awt.Color(223, 220, 227));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Tong tien :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 28, -1, -1));

        jLabel4.setText("Giam gia :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel5.setText("Can tra :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel6.setText("Thanh toan :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel8.setText("Tien thua");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(70, 92, 139));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 282, 390, 10));

        lblTotal.setText("0 VNĐ");
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        lblMustPay.setForeground(new java.awt.Color(255, 102, 102));
        lblMustPay.setText("0 VNĐ");
        jPanel1.add(lblMustPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        jLabel11.setText("0 VNĐ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        txtSale.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        txtSale.setText("0");
        txtSale.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSaleMouseClicked(evt);
            }
        });
        txtSale.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSaleKeyReleased(evt);
            }
        });
        jPanel1.add(txtSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 160, -1));

        txtPay.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        txtPay.setText("0");
        txtPay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 160, -1));

        pnlOrderContent.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 920, 450, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlOrderContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlOrderContent, javax.swing.GroupLayout.DEFAULT_SIZE, 2000, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        
        layout.show(pnlContent, "panel6");
        
    }//GEN-LAST:event_lblBackMouseClicked

    private void txtSaleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaleKeyReleased
        
        //System.out.println(evt.getKeyCode());
        if(evt.getKeyCode() != 8){
            sale = Integer.parseInt(txtSale.getText());
            mustPay = total - sale;
            
            lblMustPay.setText(mustPay + " VNĐ");
        }
    }//GEN-LAST:event_txtSaleKeyReleased

    private void txtSaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSaleMouseClicked
        
        txtSale.setText("");
    }//GEN-LAST:event_txtSaleMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblGetTable;
    public static final javax.swing.JLabel lblMustPay = new javax.swing.JLabel();
    private javax.swing.JLabel lblNotificationKitchen;
    private javax.swing.JLabel lblPay;
    public static final javax.swing.JLabel lblTotal = new javax.swing.JLabel();
    private javax.swing.JPanel pnlOrderContent;
    private javax.swing.JTextField txtPay;
    private javax.swing.JTextField txtSale;
    // End of variables declaration//GEN-END:variables
}
