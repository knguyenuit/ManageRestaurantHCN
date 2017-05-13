
package restaurant.management;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import javax.swing.SwingConstants;

public class Login extends javax.swing.JFrame {

    private String Id = "Giamdoc";
    private char[] Pass = {'1','2'};
    public Login() {
        initComponents();
        
        this.setLocation(500, 200);
        
        lblLogin.setBackground(new Color(223, 220, 227));
        lblLogin.setOpaque(true);
        lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
        
        lblWanning.setVisible(false);
        
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        lblLogin = new javax.swing.JLabel();
        lblWanning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginImage/pexels-photo-115021.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(70, 92, 139));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Restaurant Management");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 132, -1, -1));

        txtId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 289, 520, 70));

        txtPass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 520, 70));

        lblLogin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(70, 92, 139));
        lblLogin.setText("Login");
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });
        jPanel1.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 610, 140, 60));

        lblWanning.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblWanning.setForeground(new java.awt.Color(255, 153, 153));
        lblWanning.setText("Tài khoản hoặc mật khẩu không đúng.");
        jPanel1.add(lblWanning, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 390, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 960));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked

        if(txtId.getText().equals(Id) && Arrays.equals(txtPass.getPassword(), Pass))
        {
            this.dispose(); //tat man hinh login
            
            MainTemplate main = new MainTemplate();
            main.setVisible(true);
            
        }
        else
        {
            lblWanning.setVisible(true);
        }
    }//GEN-LAST:event_lblLoginMouseClicked

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        
        if(evt.getKeyCode() == 10 ) // su kien enter
        {
                    if(txtId.getText().equals(Id) && Arrays.equals(txtPass.getPassword(), Pass))
                    {
                        this.dispose(); //tat man hinh login
            
                    MainTemplate main = new MainTemplate();
                    main.setVisible(true);
            
                    }
                    else
                    {
                        lblWanning.setVisible(true);
                    }
        }
    }//GEN-LAST:event_txtPassKeyPressed

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        
        if(evt.getKeyCode() == 10 )
        {
                    if(txtId.getText().equals(Id) && Arrays.equals(txtPass.getPassword(), Pass))
                    {
                        this.dispose(); //tat man hinh login
            
                    MainTemplate main = new MainTemplate();
                    main.setVisible(true);
            
                    }
                    else
                    {
                        lblWanning.setVisible(true);
                    }
        }
    }//GEN-LAST:event_txtIdKeyPressed

    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblWanning;
    private javax.swing.JTextField txtId;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
