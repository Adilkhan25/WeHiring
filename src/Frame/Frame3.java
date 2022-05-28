package Frame;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.*;
import java.lang.Class;
public class Frame3 extends javax.swing.JFrame {
    private javax.swing.JLabel EnterYourSkillLable;
    private javax.swing.JPanel Page3Panel;
    private javax.swing.JLabel Process3Lable;
    private javax.swing.JTable SkillTable;
    private javax.swing.JButton btn3Next;
    private javax.swing.JButton btn3Prev;
    private javax.swing.JButton btnAddSkill;
    private javax.swing.JButton btnClearSkill;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfEnterYourSkill;

    public Frame3() {
     //   this.setVisible(true);
     this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        initComponents();
        btn3Prev.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
               // String emaiL = tfEmailInroNewLable.getText();
                    
                         Frame2 frame2 = new Frame2();
                         frame2.setVisible(true);
                         dispose();
                  
            }  
            }); 
            btnAddSkill.addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                   String Skills = tfEnterYourSkill.getText();
                   if(Skills.isEmpty())
                   {
                    JOptionPane.showMessageDialog(new Frame3(), "please Enter the Skill", "Try again", JOptionPane.ERROR_MESSAGE);
                   }
                   else
                   {
                       try 
                       {
                        Class.forName("com.mysql.jdbc.Driver");
                         Connection con = null;
                         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techlearnhiringforsde", "root", "*********");
                         PreparedStatement ps = null;
                         String sql = "insert into skill_name values (?)";
                         ps = con.prepareStatement(sql);
                         ps.setString(1, Skills);
                         ps.executeUpdate();
                         JOptionPane.showMessageDialog(null, "Inserted successfully"); 
                         
                         ps.close();
                         con.close();


                       }
                       catch(Exception E)
                       {
                        JOptionPane.showMessageDialog(null, "Error in connecting");      
                       }
                       DefaultTableModel model = (DefaultTableModel) SkillTable.getModel();
                       model.addRow(new Object[] {Skills});
                   } 
                }  
                });
                btn3Next.addActionListener(new ActionListener(){  
                    public void actionPerformed(ActionEvent e){  
                       String Skills = tfEnterYourSkill.getText();
                       if(Skills.isEmpty())
                       {
                        JOptionPane.showMessageDialog(new Frame3(), "please Enter the Skill", "Try again", JOptionPane.ERROR_MESSAGE);
                       }
                       else
                       {
                           Frame4 frame4 = new Frame4();
                           frame4.setVisible(true);
                           tfEnterYourSkill.setText("");
                           dispose();
                       }
                    }  
                    });
                    btnClearSkill.addActionListener(new ActionListener(){  
                        public void actionPerformed(ActionEvent e){  
                          int row = SkillTable.getSelectedRow();
                          if(row<0)
                          {
                            JOptionPane.showMessageDialog(null, "Select row to clear skill");    
                          }
                          else
                          {
                              DefaultTableModel model = (DefaultTableModel)SkillTable.getModel();
                              model.removeRow(row);
                          }
                        tfEnterYourSkill.setText("");
                        

                        }  
                        });
       
          
        this.pack();
    }

   
  //  @SuppressWarnings("unchecked")
   
    private void initComponents() {

        Page3Panel = new javax.swing.JPanel();
        btn3Prev = new javax.swing.JButton();
        btn3Next = new javax.swing.JButton();
        EnterYourSkillLable = new javax.swing.JLabel();
        tfEnterYourSkill = new javax.swing.JTextField();
        Process3Lable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SkillTable = new javax.swing.JTable();
        btnClearSkill = new javax.swing.JButton();
        btnAddSkill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(866, 476));

        Page3Panel.setBackground(new java.awt.Color(0, 153, 153));

        btn3Prev.setBackground(new java.awt.Color(0, 153, 153));
        btn3Prev.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btn3Prev.setForeground(new java.awt.Color(255, 255, 255));
        btn3Prev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/left-arrow.png"))); // NOI18N
        btn3Prev.setText("Prev");
        btn3Prev.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn3Prev.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn3Prev.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn3Prev.setIconTextGap(20);

        btn3Next.setBackground(new java.awt.Color(0, 153, 153));
        btn3Next.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btn3Next.setForeground(new java.awt.Color(255, 255, 255));
        btn3Next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/right-arrow (2).png"))); // NOI18N
        btn3Next.setText("Next");
        btn3Next.setActionCommand("");
        btn3Next.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn3Next.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn3Next.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn3Next.setIconTextGap(20);

        EnterYourSkillLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        EnterYourSkillLable.setForeground(new java.awt.Color(204, 255, 255));
        EnterYourSkillLable.setText("* Enter Your Skill with your first name");

        tfEnterYourSkill.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N
        tfEnterYourSkill.setText("eg . Cprogramming , adil");

        Process3Lable.setForeground(new java.awt.Color(255, 153, 153));
        Process3Lable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Process3Lable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circle (1).png"))); // NOI18N
        Process3Lable.setText("3/4");
        Process3Lable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        SkillTable.setBackground(new java.awt.Color(0, 153, 153));
        SkillTable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        SkillTable.setForeground(new java.awt.Color(204, 255, 255));
        SkillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Skills"
            }
        ));
        SkillTable.setOpaque(false);
        jScrollPane1.setViewportView(SkillTable);

        btnClearSkill.setBackground(new java.awt.Color(0, 153, 153));
        btnClearSkill.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnClearSkill.setForeground(new java.awt.Color(255, 255, 255));
        btnClearSkill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eraser.png"))); // NOI18N
        btnClearSkill.setText("Clear");
        btnClearSkill.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAddSkill.setBackground(new java.awt.Color(0, 153, 153));
        btnAddSkill.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnAddSkill.setForeground(new java.awt.Color(255, 255, 255));
        btnAddSkill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnAddSkill.setText("Add");
        btnAddSkill.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Page3PanelLayout = new javax.swing.GroupLayout(Page3Panel);
        Page3Panel.setLayout(Page3PanelLayout);
        Page3PanelLayout.setHorizontalGroup(
            Page3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Page3PanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Process3Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Page3PanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btn3Prev, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn3Next, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(Page3PanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(Page3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Page3PanelLayout.createSequentialGroup()
                        .addComponent(btnAddSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(btnClearSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfEnterYourSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterYourSkillLable))
                .addGap(84, 84, 84)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        Page3PanelLayout.setVerticalGroup(
            Page3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Page3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Process3Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(Page3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Page3PanelLayout.createSequentialGroup()
                        .addComponent(EnterYourSkillLable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfEnterYourSkill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(Page3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClearSkill)
                            .addComponent(btnAddSkill))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(Page3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn3Prev)
                    .addComponent(btn3Next))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Page3Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Page3Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        //pack();
    }
    
}
