
package restaurant.management;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import static restaurant.management.Foods.lblMustPay;
import static restaurant.management.Foods.lblTotal;
import static restaurant.management.Foods.mustPay;
import static restaurant.management.Foods.sale;
import static restaurant.management.MainTemplate.setStyleFont;
import static restaurant.management.Foods.total;



public class Bill extends javax.swing.JPanel {
    private String nameFood;
    private int priceFood;
    
    private int price;
    private int count;
    
    private int totalPrice = 0;
    public Bill() {
        initComponents();
    }

    public Bill(String nameFood, int priceFood) {
        initComponents();
        lblDown.setVisible(false);
        txtQuantity.setHorizontalAlignment(SwingConstants.CENTER);
        
        this.nameFood = nameFood;
        this.priceFood = priceFood;
        
        
        lblNameFood.setText(nameFood);
        lblPriceFood.setText(priceFood + " VNĐ");
        
        setStyleFont(lblNameFood, 24);
        setStyleFont(lblPriceFood, 24);
        
        
        
        total += priceFood;
        mustPay = total - sale;
        lblTotal.setText(total + " VNĐ");
        lblMustPay.setText(mustPay + " VNĐ");
        System.out.println("total :" +total);

    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public int getPriceFood() {
        return priceFood;
    }

    public void setPriceFood(int priceFood) {
        this.priceFood = priceFood;
    }

    public JLabel getLblPriceFood() {
        return lblPriceFood;
    }

    public void setLblPriceFood(JLabel lblPriceFood) {
        this.lblPriceFood = lblPriceFood;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNameFood = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblUp = new javax.swing.JLabel();
        lblDown = new javax.swing.JLabel();
        lblPriceFood = new javax.swing.JLabel();
        lblCancel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNameFood.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNameFood.setText("jLabel1");
        add(lblNameFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 19, 170, 48));

        txtQuantity.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtQuantity.setText("1");
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 110, 50));

        lblUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Up Squared_50px.png"))); // NOI18N
        lblUp.setToolTipText("");
        lblUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUpMouseClicked(evt);
            }
        });
        add(lblUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, 50));

        lblDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Down Squared_50px.png"))); // NOI18N
        lblDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDownMouseClicked(evt);
            }
        });
        add(lblDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, 50));

        lblPriceFood.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPriceFood.setText("jLabel4");
        add(lblPriceFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 160, 50));

        lblCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Close Window_50px.png"))); // NOI18N
        lblCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelMouseClicked(evt);
            }
        });
        add(lblCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lblUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpMouseClicked
        lblDown.setVisible(true);
  
        count = Integer.parseInt(txtQuantity.getText()) + 1;
        price = getPriceFood() * count ;
        
        txtQuantity.setText(count + "");
        
        
        lblPriceFood.setText(price + " VNĐ");
        

        total += getPriceFood();
        mustPay = total - sale;
        lblTotal.setText(total + " VNĐ");
        lblMustPay.setText(mustPay + " VNĐ");
        System.out.println("total: " + total);
        
    }//GEN-LAST:event_lblUpMouseClicked

    private void lblDownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDownMouseClicked
        
        count = Integer.parseInt(txtQuantity.getText()) - 1;
        price = getPriceFood() * count ;
        if( count == 1 )
        {
            lblDown.setVisible(false);
        }
        
        
        txtQuantity.setText(count + "");
        
        lblPriceFood.setText(price + " VNĐ");
        

        total -= getPriceFood();
        mustPay = total - sale;
        
        lblTotal.setText(total + " VNĐ");
        lblMustPay.setText(mustPay + " VNĐ");
        
        System.out.println("total: " + total);
    }//GEN-LAST:event_lblDownMouseClicked

    private void lblCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelMouseClicked
        
       //this.setVisible(false);
       
       
    }//GEN-LAST:event_lblCancelMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCancel;
    private javax.swing.JLabel lblDown;
    private javax.swing.JLabel lblNameFood;
    private javax.swing.JLabel lblPriceFood;
    private javax.swing.JLabel lblUp;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
