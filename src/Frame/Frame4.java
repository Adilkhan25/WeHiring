package Frame;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.lang.Class;

public class Frame4 extends javax.swing.JFrame {
    private javax.swing.JLabel AchievementsLable;
    private javax.swing.JPanel CodingPracticePanel;
    private javax.swing.JLabel HomelogoLable;
    private javax.swing.JLabel InstaLogoLable;
    private javax.swing.JLabel InstructionLableinCodingPracticePanel;
    private javax.swing.JLabel InterestLable;
    private javax.swing.JLabel LinkdinLogoLable;
    private javax.swing.JLabel Process4Lable;
    private javax.swing.JPanel SocialMediaPanel;
    private javax.swing.JButton btnPrev4;
    private javax.swing.JButton btnSumbit;
    private javax.swing.JCheckBox chkbx4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfAchievements;
    private javax.swing.JTextField tfHomelink;
    private javax.swing.JTextField tfInsta;
    private javax.swing.JTextField tfInterests;
    private javax.swing.JTextField tfLinkdin;
    private javax.swing.JTextField tfName1;
    private javax.swing.JTextField tfName2;
    private javax.swing.JTextField tfName2url;
    private javax.swing.JTextField tfurlName1;
    


    public Frame4() {
        initComponents();
        btnPrev4.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                Frame3 frame3 = new Frame3();
                frame3.setVisible(true);
                dispose();
                  
            }  
            }); 
            chkbx4.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent e)
                {
                    btnSumbit.addActionListener(new ActionListener(){  
                        public void actionPerformed(ActionEvent e){  
                            String achv = tfAchievements.getText();
                            String intrst = tfInterests.getText();
                            String linkdin = tfLinkdin.getText();
                            String name1 = tfName1.getText();
                            String name2 = tfName2.getText();
                            String url1 = tfurlName1.getText();
                            String url2 = tfName2url.getText();
                            String insta = tfInsta.getText();
                            String ysite = tfHomelink.getText();
                            if(achv.isEmpty()|| intrst.isEmpty()|| linkdin.isEmpty()
                            || name1.isEmpty()|| name2.isEmpty()|| url1.isEmpty()|| url2.isEmpty())
                            {
                                   JOptionPane.showMessageDialog(new Frame4(), "please all the required fields", "try again", JOptionPane.ERROR_MESSAGE);
                            }
                            else
                            {
                                try{
                                 Class.forName("com.mysql.jdbc.Driver");
                                 Connection con = null;
                                 con =DriverManager.getConnection("jdbc:mysql://localhost:3306/techlearnhiringforsde", "root", "*******");
                                 String sql = "insert into extrainfo value (?,?,?,?,?,?,?,?,?)";
                                 PreparedStatement ps = null;
                                 ps = con.prepareStatement(sql);
                                 ps.setString(1, achv);
                                 ps.setString(2, intrst);
                                 ps.setString(3, linkdin);
                                 if(insta.isEmpty()) ps.setString(4, "N/A");
                                 else ps.setString(4, insta);
                                 if(ysite.isEmpty()) ps.setString(5, "N/A");
                                 else ps.setString(5, ysite);
                                 ps.setString(6, name1);
                                 ps.setString(7, url1);
                                 ps.setString(8, name2);
                                 ps.setString(9, url2);
                                 ps.executeUpdate();

                                JOptionPane.showMessageDialog(null, "oohoo!!");

                                }
                                catch(Exception E)
                                {
                                    JOptionPane.showMessageDialog(new Frame4(), "Connection not proepr", "try again", JOptionPane.ERROR_MESSAGE);
                                }

                                Frame5 frame5 = new Frame5();
                                frame5.setVisible(true);
                                tfAchievements.setText("");
                                tfInterests.setText("");
                                tfLinkdin.setText("");
                                tfHomelink.setText("");
                                tfName1.setText("");
                                tfName2.setText("");
                                tfurlName1.setText("");
                                tfName2url.setText("");
                                tfInsta.setText("");
                               // tf
                                dispose();
                            }
                        
                              
                        }  
                        }); 

                }
                
            });
            
    }

  //  @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Process4Lable = new javax.swing.JLabel();
        AchievementsLable = new javax.swing.JLabel();
        tfAchievements = new javax.swing.JTextField();
        InterestLable = new javax.swing.JLabel();
        tfInterests = new javax.swing.JTextField();
        SocialMediaPanel = new javax.swing.JPanel();
        LinkdinLogoLable = new javax.swing.JLabel();
        tfLinkdin = new javax.swing.JTextField();
        InstaLogoLable = new javax.swing.JLabel();
        tfInsta = new javax.swing.JTextField();
        HomelogoLable = new javax.swing.JLabel();
        tfHomelink = new javax.swing.JTextField();
        CodingPracticePanel = new javax.swing.JPanel();
        InstructionLableinCodingPracticePanel = new javax.swing.JLabel();
        tfName1 = new javax.swing.JTextField();
        tfurlName1 = new javax.swing.JTextField();
        tfName2 = new javax.swing.JTextField();
        tfName2url = new javax.swing.JTextField();
        btnPrev4 = new javax.swing.JButton();
        chkbx4 = new javax.swing.JCheckBox();
        btnSumbit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        Process4Lable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        Process4Lable.setForeground(new java.awt.Color(255, 153, 153));
        Process4Lable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circle (1).png"))); // NOI18N
        Process4Lable.setText("4/4");
        Process4Lable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        AchievementsLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AchievementsLable.setForeground(new java.awt.Color(204, 255, 255));
        AchievementsLable.setText("* Achievements");

        tfAchievements.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        tfAchievements.setText("eg. Olympiad , Rank 1 to 10 in 10th or 12th etc");

        InterestLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        InterestLable.setForeground(new java.awt.Color(204, 255, 255));
        InterestLable.setText("* Interests");

        tfInterests.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        tfInterests.setText("Gaming, Book Reading rtc");

        SocialMediaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Social Media", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        SocialMediaPanel.setForeground(new java.awt.Color(255, 255, 255));
        SocialMediaPanel.setOpaque(false);

        LinkdinLogoLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linkedin.png"))); // NOI18N

        tfLinkdin.setText("* UserName/Url ");

        InstaLogoLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instagram.png"))); // NOI18N

        tfInsta.setText("username");

        HomelogoLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N

        tfHomelink.setText("Url of Your own Site");

        javax.swing.GroupLayout SocialMediaPanelLayout = new javax.swing.GroupLayout(SocialMediaPanel);
        SocialMediaPanel.setLayout(SocialMediaPanelLayout);
        SocialMediaPanelLayout.setHorizontalGroup(
            SocialMediaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SocialMediaPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(SocialMediaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(SocialMediaPanelLayout.createSequentialGroup()
                        .addComponent(HomelogoLable)
                        .addGap(34, 34, 34)
                        .addComponent(tfHomelink))
                    .addGroup(SocialMediaPanelLayout.createSequentialGroup()
                        .addComponent(LinkdinLogoLable)
                        .addGap(18, 18, 18)
                        .addComponent(tfLinkdin, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(InstaLogoLable)
                        .addGap(18, 18, 18)
                        .addComponent(tfInsta, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        SocialMediaPanelLayout.setVerticalGroup(
            SocialMediaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SocialMediaPanelLayout.createSequentialGroup()
                .addGroup(SocialMediaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SocialMediaPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(SocialMediaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SocialMediaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfLinkdin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(InstaLogoLable))
                            .addComponent(LinkdinLogoLable)))
                    .addGroup(SocialMediaPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(tfInsta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(SocialMediaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HomelogoLable)
                    .addComponent(tfHomelink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        CodingPracticePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Coding Practice/Project Online Platfrom", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        CodingPracticePanel.setOpaque(false);

        InstructionLableinCodingPracticePanel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        InstructionLableinCodingPracticePanel.setForeground(new java.awt.Color(204, 255, 255));
        InstructionLableinCodingPracticePanel.setText("* Enter the Name and url in col1 and col2 respectively like github, codeforces etc");

        tfName1.setText("Name1");

        tfurlName1.setText("url");

        tfName2.setText("Name2");

        tfName2url.setText("url");

        javax.swing.GroupLayout CodingPracticePanelLayout = new javax.swing.GroupLayout(CodingPracticePanel);
        CodingPracticePanel.setLayout(CodingPracticePanelLayout);
        CodingPracticePanelLayout.setHorizontalGroup(
            CodingPracticePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CodingPracticePanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(CodingPracticePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(InstructionLableinCodingPracticePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CodingPracticePanelLayout.createSequentialGroup()
                        .addGroup(CodingPracticePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfName1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(tfName2))
                        .addGap(107, 107, 107)
                        .addGroup(CodingPracticePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfName2url)
                            .addComponent(tfurlName1))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        CodingPracticePanelLayout.setVerticalGroup(
            CodingPracticePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CodingPracticePanelLayout.createSequentialGroup()
                .addComponent(InstructionLableinCodingPracticePanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CodingPracticePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfurlName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CodingPracticePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfName2url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        btnPrev4.setBackground(new java.awt.Color(0, 153, 153));
        btnPrev4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnPrev4.setForeground(new java.awt.Color(255, 255, 255));
        btnPrev4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/left-arrow.png"))); // NOI18N
        btnPrev4.setText("Prev");
        btnPrev4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        chkbx4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N
        chkbx4.setForeground(new java.awt.Color(204, 50, 25));
        chkbx4.setText("accept terms and conditions");

        btnSumbit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/submit (1).png"))); // NOI18N
        btnSumbit.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CodingPracticePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(350, 350, 350)
                                .addComponent(Process4Lable))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AchievementsLable, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(InterestLable, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SocialMediaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfInterests, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfAchievements, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnPrev4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(chkbx4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSumbit)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Process4Lable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AchievementsLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAchievements, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InterestLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfInterests, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SocialMediaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CodingPracticePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrev4)
                    .addComponent(chkbx4)
                    .addComponent(btnSumbit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
   
}
