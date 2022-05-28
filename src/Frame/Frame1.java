package Frame;
//import Frame.Frame2;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.lang.Class;
public class Frame1 extends javax.swing.JFrame {

    
    private javax.swing.JPanel AddressPanel;
    private javax.swing.JButton Button1;
    private javax.swing.JLabel CityLable;
    private javax.swing.JLabel CountryLable;
    private javax.swing.JLabel CurrentStatusLable;
    private javax.swing.JLabel DetailsLable;
    private javax.swing.JLabel EmailLable;
    private javax.swing.JLabel FirstNameLable;
    private javax.swing.JLabel LastNameLable;
    private javax.swing.JPanel PerSonalDetailsPanel;
    private javax.swing.JLabel PhoneLable;
    private javax.swing.JLabel ProcessLable;
    private javax.swing.JLabel RequriedLable;
    private javax.swing.JLabel StateLable;
    private javax.swing.JLabel YourGoalLable;
    private javax.swing.JLabel ZipCodeLable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfCity;
    private javax.swing.JTextField tfCountry;
    private javax.swing.JTextField tfCurrentStatus;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfGoal;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfState;
    private javax.swing.JTextField tfZipCode;
   
    public Frame1() {
        
        //this.setVisible(true);
        initComponents();
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        Button1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                String City = tfCity.getText();
                String country = tfCountry.getText();
                String status = tfCurrentStatus.getText();
                String emailframe1 = tfEmail.getText();
                String FirstName = tfFirstName.getText();
                String LastName = tfLastName.getText();
                String Phone = tfPhone.getText();
                String State = tfState.getText();
                String ZipCode = tfZipCode.getText();
                String goal = tfGoal.getText();
                    if(emailframe1.isEmpty() || City.isEmpty()|| country.isEmpty() || status.isEmpty() || FirstName.isEmpty()|| LastName.isEmpty() 
                    || Phone.isEmpty() || State.isEmpty()|| ZipCode.isEmpty())
                    {
                        JOptionPane.showMessageDialog(new Frame1(), "* Enter the required fields", "Try again", JOptionPane.ERROR_MESSAGE);
                    
                    }
                    else
                    {
                        try {
                            
                             Class.forName("com.mysql.jdbc.Driver");
                             Connection con = null;
                             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techlearnhiringforsde","root","*********");
                             PreparedStatement ps = null;
                             String sql = "insert into personal value (?,?,?,?,?,?,?,?,?,?)";
                             ps = con.prepareStatement(sql);
                             ps.setString(1, FirstName);
                             ps.setString(2, LastName);
                             ps.setString(3, emailframe1);
                             ps.setString(4, Phone);
                             ps.setString(5, status);
                             if(goal.isEmpty())
                             {
                             ps.setString(6,"N/A");
                             }
                             else
                             {
                              ps.setString(6, goal);
                             }
                             ps.setString(7, City);
                             ps.setString(8, State);
                             ps.setString(9, country);
                             ps.setString(10, ZipCode);
                             ps.executeUpdate();
                             JOptionPane.showMessageDialog(null, "Your detailes saved");
                             ps.close();
                             con.close();
    
                        } catch (Exception E) {

                            JOptionPane.showMessageDialog(null, "Error");
                        }
                       
                         Frame2 frame2 = new Frame2();
                         frame2.setVisible(true);
                         dispose();
                       // this. setDefaultCloseOperation(javax.swing.JFrame.HIDE_ON_CLOSE);
                      //  new Frame1().setVisible(false);
                    }
                    tfCity.setText("");
                    tfCountry.setText("");
                    tfCurrentStatus.setText("");
                    tfEmail.setText("");
                    tfFirstName.setText("");
                    tfLastName.setText("");
                    tfPhone.setText("");
                    tfState.setText("t");
                    tfZipCode.setText("");
                    tfGoal.setText("");


                 
                  
            }  
            }); 
           // if(Frame2.set)
            
        this.pack();
        
    }

    
    
 //   @SuppressWarnings("unchecked")
   
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DetailsLable = new javax.swing.JLabel();
        RequriedLable = new javax.swing.JLabel();
        PerSonalDetailsPanel = new javax.swing.JPanel();
        FirstNameLable = new javax.swing.JLabel();
        LastNameLable = new javax.swing.JLabel();
        tfFirstName = new javax.swing.JTextField();
        tfLastName = new javax.swing.JTextField();
        EmailLable = new javax.swing.JLabel();
        PhoneLable = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        CurrentStatusLable = new javax.swing.JLabel();
        tfCurrentStatus = new javax.swing.JTextField();
        YourGoalLable = new javax.swing.JLabel();
        tfGoal = new javax.swing.JTextField();
        AddressPanel = new javax.swing.JPanel();
        CityLable = new javax.swing.JLabel();
        StateLable = new javax.swing.JLabel();
        CountryLable = new javax.swing.JLabel();
        ZipCodeLable = new javax.swing.JLabel();
        tfCity = new javax.swing.JTextField();
        tfState = new javax.swing.JTextField();
        tfCountry = new javax.swing.JTextField();
        tfZipCode = new javax.swing.JTextField();
        Button1 = new javax.swing.JButton();
        ProcessLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        DetailsLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        DetailsLable.setForeground(new java.awt.Color(255, 255, 255));
        DetailsLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DetailsLable.setText("Enter the details");

        RequriedLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        RequriedLable.setForeground(new java.awt.Color(204, 255, 255));
        RequriedLable.setText("* Indicate required field");

        PerSonalDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 0, 12), new java.awt.Color(204, 255, 255))); // NOI18N
        PerSonalDetailsPanel.setForeground(new java.awt.Color(204, 255, 255));
        PerSonalDetailsPanel.setOpaque(false);

        FirstNameLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        FirstNameLable.setForeground(new java.awt.Color(204, 255, 255));
        FirstNameLable.setText("* First Name");

        LastNameLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        LastNameLable.setForeground(new java.awt.Color(204, 255, 255));
        LastNameLable.setText("* Last Name");

        EmailLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        EmailLable.setForeground(new java.awt.Color(204, 255, 255));
        EmailLable.setText("* Email");

        PhoneLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        PhoneLable.setForeground(new java.awt.Color(204, 255, 255));
        PhoneLable.setText("* Phone");

        CurrentStatusLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        CurrentStatusLable.setForeground(new java.awt.Color(204, 255, 255));
        CurrentStatusLable.setText("* Current Status");

        YourGoalLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        YourGoalLable.setForeground(new java.awt.Color(204, 255, 255));
        YourGoalLable.setText("Your Goal");

        AddressPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(204, 255, 255))); // NOI18N
        AddressPanel.setOpaque(false);

        CityLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        CityLable.setForeground(new java.awt.Color(204, 255, 255));
        CityLable.setText("* City");

        StateLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        StateLable.setForeground(new java.awt.Color(204, 255, 255));
        StateLable.setText("* State");

        CountryLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        CountryLable.setForeground(new java.awt.Color(204, 255, 255));
        CountryLable.setText("* Country");

        ZipCodeLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        ZipCodeLable.setForeground(new java.awt.Color(204, 255, 255));
        ZipCodeLable.setText("* Zip Code");

        javax.swing.GroupLayout AddressPanelLayout = new javax.swing.GroupLayout(AddressPanel);
        AddressPanel.setLayout(AddressPanelLayout);
        AddressPanelLayout.setHorizontalGroup(
            AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddressPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CityLable, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCity, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddressPanelLayout.createSequentialGroup()
                        .addComponent(StateLable, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(CountryLable, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddressPanelLayout.createSequentialGroup()
                        .addComponent(tfState, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddressPanelLayout.createSequentialGroup()
                        .addComponent(ZipCodeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(tfZipCode))
                .addContainerGap())
        );
        AddressPanelLayout.setVerticalGroup(
            AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddressPanelLayout.createSequentialGroup()
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CityLable)
                    .addComponent(StateLable)
                    .addComponent(CountryLable)
                    .addComponent(ZipCodeLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        Button1.setBackground(new java.awt.Color(0, 153, 153));
        Button1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        Button1.setForeground(new java.awt.Color(255, 255, 255));
        Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/right-arrow (2).png"))); // NOI18N
        Button1.setText("Next");
        Button1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Button1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Button1.setIconTextGap(20);

        javax.swing.GroupLayout PerSonalDetailsPanelLayout = new javax.swing.GroupLayout(PerSonalDetailsPanel);
        PerSonalDetailsPanel.setLayout(PerSonalDetailsPanelLayout);
        PerSonalDetailsPanelLayout.setHorizontalGroup(
            PerSonalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PerSonalDetailsPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PerSonalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PerSonalDetailsPanelLayout.createSequentialGroup()
                        .addGroup(PerSonalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CurrentStatusLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PerSonalDetailsPanelLayout.createSequentialGroup()
                                .addGroup(PerSonalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FirstNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailLable, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PerSonalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PerSonalDetailsPanelLayout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(LastNameLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(PerSonalDetailsPanelLayout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(PhoneLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(PerSonalDetailsPanelLayout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(PerSonalDetailsPanelLayout.createSequentialGroup()
                                .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PerSonalDetailsPanelLayout.createSequentialGroup()
                        .addGroup(PerSonalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AddressPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(YourGoalLable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PerSonalDetailsPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(PerSonalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfCurrentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfGoal, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(16, 16, 16))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PerSonalDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        PerSonalDetailsPanelLayout.setVerticalGroup(
            PerSonalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PerSonalDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PerSonalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameLable)
                    .addComponent(LastNameLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PerSonalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PerSonalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailLable, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PerSonalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CurrentStatusLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCurrentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(YourGoalLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfGoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Button1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        ProcessLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        ProcessLable.setForeground(new java.awt.Color(255, 204, 204));
        ProcessLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProcessLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circle (1).png"))); // NOI18N
        ProcessLable.setText("1/4");
        ProcessLable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PerSonalDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DetailsLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ProcessLable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RequriedLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DetailsLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RequriedLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProcessLable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PerSonalDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

     //   pack();
    }
}

