
package restaurant.management;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import static restaurant.management.MainTemplate.layout;
import static restaurant.management.MainTemplate.numOfTable;
import static restaurant.management.MainTemplate.pnlContent;
import static restaurant.management.MainTemplate.setStyleFont;
import static restaurant.management.MainTemplate.getTable;

public class Tables extends javax.swing.JPanel {

    private JPanel[] p = new JPanel[numOfTable];
    private JLabel table ;
    private JLabel ten;
    
    private JPanel pnlTables = new JPanel(new GridLayout(7,8,5,5));
    private JScrollPane scroll = new JScrollPane(pnlTables, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
    
    private Foods f = new Foods();
    public Tables() {
        initComponents();
        lblHighlight.setBackground(new Color(147,193,120));
        lblHighlight.setOpaque(true);
        
        SoDoBan();
       
        
        
        
    }

    public void SoDoBan()
    {       
        pnlSoDo.add(scroll, new AbsoluteConstraints(0, 300, 1720, 1000));
        
        
        
        ImageIcon image =new ImageIcon(getClass().getResource("/asset/Restaurant Table_100px.png"));
        
        for(int i =0; i < numOfTable ; i++){
            String name = "Bàn " + i;
            
            p[i] = new JPanel(new BorderLayout());
            p[i].setName(""+i);
            table = new JLabel(image);
            ten = new JLabel(name);
            setStyleFont(ten, 27);
            
            
            p[i].setPreferredSize(new Dimension(200,200));
            
            if(i == 7 ||  i == 12 || i == 15 || i == 20)
            {
            p[i].setBackground(Color.red);
            }
            else{
            p[i].setBackground(Color.yellow);
            }
            
            table.setSize(200,90);
            table.setHorizontalAlignment(JLabel.CENTER);
            table.setVerticalAlignment(JLabel.CENTER);
            
            p[i].add(table,BorderLayout.CENTER);
            
            
            
            
            ten.setHorizontalAlignment(JLabel.CENTER);
            ten.setVerticalAlignment(JLabel.CENTER);
            p[i].add(ten, BorderLayout.CENTER);
            
            p[i].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e){
                       JPanel j = (JPanel)e.getSource();
                       getTable = j.getName(); // Lấy số bàn đã chọn
                       Foods f = new Foods();
                       pnlContent.add(f,"panel7");
                       
                        
                       //showPanel(pnlContent, "panel7");
                       layout.show(pnlContent, "panel7");
                   }

            });
            
            
            pnlTables.add(p[i]);
            
            
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSoDo = new javax.swing.JPanel();
        lblTableUsed = new javax.swing.JLabel();
        lblDisplay = new javax.swing.JLabel();
        cmbDisplay = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblHighlight = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1600, 2000));
        setPreferredSize(new java.awt.Dimension(1720, 2000));
        setRequestFocusEnabled(false);

        pnlSoDo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTableUsed.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        lblTableUsed.setText("Đang được sử dụng : 4/ 50 ");
        pnlSoDo.add(lblTableUsed, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 350, 30));

        lblDisplay.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        lblDisplay.setText("Hiển Thị:");
        pnlSoDo.add(lblDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 120, 30));

        cmbDisplay.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        cmbDisplay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Chưa sử dụng", "Đang sử dụng" }));
        pnlSoDo.add(cmbDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 190, 220, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Sơ Đồ Bàn");
        pnlSoDo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 330, 80));

        jSeparator1.setBackground(new java.awt.Color(70, 92, 139));
        pnlSoDo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 124, 1600, 10));
        pnlSoDo.add(lblHighlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 10, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSoDo, javax.swing.GroupLayout.PREFERRED_SIZE, 1721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSoDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbDisplay;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JLabel lblHighlight;
    private javax.swing.JLabel lblTableUsed;
    private javax.swing.JPanel pnlSoDo;
    // End of variables declaration//GEN-END:variables
}
