package Frame;
import javax.swing.JOptionPane;
import java.awt.event.*;  

public class IntroductionFrame extends javax.swing.JFrame {
    private javax.swing.JLabel CreateYourAcountLable;
    private javax.swing.JLabel EmailIntroLable;
    private javax.swing.JPanel IntroductionPanel;
    private javax.swing.JLabel NewCandidateLable;
    private javax.swing.JLabel PasswordintroLable;
    private javax.swing.JLabel SDELable;
    private javax.swing.JLabel UserNameIntroLable;
    private javax.swing.JLabel WelcomeLable;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignup;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField tfEmailInroNewLable;
    private javax.swing.JTextField tfUserid;

    public IntroductionFrame() {
        // this.setVisible(true);
        initComponents();
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
       // this.setUndecorated(true);
       btnSignup.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            String emaiL = tfEmailInroNewLable.getText();
                if(emaiL.isEmpty())
                {
                    JOptionPane.showMessageDialog(new IntroductionFrame(), "please Enter the email", "Try again", JOptionPane.ERROR_MESSAGE);
                
                }
                else
                {
                
                     Frame1 frame1 = new Frame1();
                     frame1.setVisible(true);
                     dispose();
                   
                }
                tfEmailInroNewLable.setText("");
              
        }  
        }); 
        // btnLogin.addActionListener(new ActionListener(){  
        //     public void actionPerformed(ActionEvent e){  
        //        String userID = tfUserid.getText();
        //        String Password = jPasswordField1.getPassword().toString();

                  
                  
        //     }  
        //     }); 
        this.pack();
    }

   
   // @SuppressWarnings("unchecked")
  
    private void initComponents() {

        IntroductionPanel = new javax.swing.JPanel();
        UserNameIntroLable = new javax.swing.JLabel();
        tfUserid = new javax.swing.JTextField();
        PasswordintroLable = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        NewCandidateLable = new javax.swing.JLabel();
        CreateYourAcountLable = new javax.swing.JLabel();
        EmailIntroLable = new javax.swing.JLabel();
        tfEmailInroNewLable = new javax.swing.JTextField();
        btnSignup = new javax.swing.JButton();
        WelcomeLable = new javax.swing.JLabel();
        SDELable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FrmInrtoduction");

        IntroductionPanel.setBackground(new java.awt.Color(0, 153, 153));
        IntroductionPanel.setForeground(new java.awt.Color(204, 255, 255));

        UserNameIntroLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        UserNameIntroLable.setForeground(new java.awt.Color(204, 255, 255));
        UserNameIntroLable.setText("Username");

        tfUserid.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        tfUserid.setText("eg.Adilkingkhan2");

        PasswordintroLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        PasswordintroLable.setForeground(new java.awt.Color(204, 255, 255));
        PasswordintroLable.setText("Password");

        jPasswordField1.setText("jPasswordField1");

        btnLogin.setBackground(new java.awt.Color(51, 153, 255));
        btnLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Log in");
        btnLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        NewCandidateLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        NewCandidateLable.setForeground(new java.awt.Color(204, 255, 255));
        NewCandidateLable.setText("New candidate");

        CreateYourAcountLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        CreateYourAcountLable.setForeground(new java.awt.Color(204, 255, 255));
        CreateYourAcountLable.setText("Create your acount");

        EmailIntroLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        EmailIntroLable.setForeground(new java.awt.Color(204, 255, 255));
        EmailIntroLable.setText("Email");

        tfEmailInroNewLable.setText("eg. 2020is_adilkhan.nie.ac.in");

        btnSignup.setBackground(new java.awt.Color(51, 153, 255));
        btnSignup.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup.setText("Sign Up");
        btnSignup.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        WelcomeLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        WelcomeLable.setForeground(new java.awt.Color(255, 255, 255));
        WelcomeLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeLable.setText("Welcome to TechLearn hiring Process");

        SDELable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        SDELable.setForeground(new java.awt.Color(255, 255, 255));
        SDELable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SDELable.setText("For the SDE");

        javax.swing.GroupLayout IntroductionPanelLayout = new javax.swing.GroupLayout(IntroductionPanel);
        IntroductionPanel.setLayout(IntroductionPanelLayout);
        IntroductionPanelLayout.setHorizontalGroup(
            IntroductionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IntroductionPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(IntroductionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(IntroductionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UserNameIntroLable)
                        .addComponent(PasswordintroLable, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(IntroductionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IntroductionPanelLayout.createSequentialGroup()
                        .addGroup(IntroductionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewCandidateLable, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(IntroductionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(EmailIntroLable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CreateYourAcountLable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(tfEmailInroNewLable, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IntroductionPanelLayout.createSequentialGroup()
                        .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
            .addGroup(IntroductionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IntroductionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WelcomeLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SDELable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        IntroductionPanelLayout.setVerticalGroup(
            IntroductionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntroductionPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(WelcomeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SDELable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(IntroductionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNameIntroLable)
                    .addComponent(NewCandidateLable, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(IntroductionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreateYourAcountLable))
                .addGap(18, 18, 18)
                .addGroup(IntroductionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordintroLable)
                    .addComponent(EmailIntroLable))
                .addGap(38, 38, 38)
                .addGroup(IntroductionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEmailInroNewLable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(IntroductionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnSignup))
                .addGap(134, 134, 134))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IntroductionPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IntroductionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        //pack();
    }
    // private void btnSignupActionPerformed(java.awt.event.ActionEvent event)
    // {
    //     String emaiL = tfEmailInroNewLable.getText();
    //     if(emaiL.isEmpty())
    //     {
    //         JOptionPane.showMessageDialog(this, "please Enter the email", "Try again", JOptionPane.ERROR_MESSAGE);
    //     }
    //     else
    //     {
    //         new Frame1();
    //     }
    // }
  
    
}

