package Frame;
import java.awt.event.*;

import java.sql.*;
import java.lang.Class;
import javax.swing.JOptionPane;
public class Frame2 extends javax.swing.JFrame {
    private javax.swing.JLabel BachelorTickLable;
    private javax.swing.JLabel CollegeNameIntermediateLable;
    private javax.swing.JLabel CollegeNameMaster;
    private javax.swing.JLabel CourseNameMaster;
    private javax.swing.JPanel EducationPanel;
    private javax.swing.JPanel IntermediatePanel;
    private javax.swing.JLabel LocationIntermediateLable;
    private javax.swing.JLabel LocationMaster;
    private javax.swing.JLabel MasterTickLable;
    private javax.swing.JLabel PassingYearIntermediateLable;
    private javax.swing.JLabel PassingYearLableMaster;
    private javax.swing.JLabel Process2Lable;
    private javax.swing.JLabel ResultIntermediateLable;
    private javax.swing.JLabel ResultLableMaster;
    private javax.swing.JLabel StartingYearIntermediateLable;
    private javax.swing.JLabel StartingYearMasterLable;
    private javax.swing.JLabel StreamIntermediateLable;
    private javax.swing.JButton btnNextEducation;
    private javax.swing.JButton btnPrevIEducation;
    private javax.swing.JCheckBox jCheckBoxBachelor;
    private javax.swing.JCheckBox jCheckBoxMaster;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfpassingyear;
    private javax.swing.JTextField tfCollegeNameIntermediate;
    private javax.swing.JTextField tfCollegeNameMaster;
    private javax.swing.JTextField tfCourseNameMaster;
    private javax.swing.JTextField tfLocationIntermediate;
    private javax.swing.JTextField tfLocationMaster;
    private javax.swing.JTextField tfPassingYearIntermediate;
    private javax.swing.JPanel tfPassingYearMaster;
    private javax.swing.JTextField tfResultIntermediate;
    private javax.swing.JTextField tfResultMaster;
    private javax.swing.JTextField tfStartingYearIntermediate;
    private javax.swing.JTextField tfStartingYearMaster;
    private javax.swing.JTextField tfStreamIntermediate;

    public Frame2() {
       // new Frame1().setVisible(false);
      //  this.setVisible(true);
       // initComponents();
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        initComponents();
        btnPrevIEducation.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
               // String emaiL = tfEmailInroNewLable.getText();
                    
                         Frame1 frame1 = new Frame1();
                         frame1.setVisible(true);
                         dispose();
                  
            }  
            }); 
            jCheckBoxMaster.addItemListener(new ItemListener() {    
                public void itemStateChanged(ItemEvent e) {      
                    btnNextEducation.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e)
                        {
                            String CourseName = tfCourseNameMaster.getText();
                            String LocationM = tfLocationMaster.getText();
                            String  CollegeNameM = tfCollegeNameMaster.getText();
                            String StartingYeaarM = tfStartingYearMaster.getText();
                            String PassingYearM =  tfpassingyear.getText();
                            String ResultM = tfResultMaster.getText();
                            String Stream = tfStreamIntermediate.getText();
                            String PassingYearI = tfPassingYearIntermediate.getText();
                            String StartingYearI = tfStartingYearIntermediate.getText();
                            String ResultI = tfResultIntermediate.getText();
                            String LocationI = tfLocationIntermediate.getText();
                            String CollegeNameI = tfCollegeNameIntermediate.getText();
                            if(CourseName.isEmpty()|| LocationM.isEmpty()|| CollegeNameM.isEmpty()
                            || StartingYeaarM.isEmpty()|| PassingYearM.isEmpty()|| ResultM.isEmpty()
                            || Stream.isEmpty()|| PassingYearI.isEmpty()|| StartingYearI.isEmpty()||
                            ResultI.isEmpty()|| LocationI.isEmpty()|| CollegeNameI.isEmpty())
                            {
                                JOptionPane.showMessageDialog(new Frame2(), "* Enter the required fields", "Try again", JOptionPane.ERROR_MESSAGE);
                            }
                            else
                            {
                                try
                                {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Connection con = null;
                                    con =DriverManager.getConnection("jdbc:mysql://localhost:3306/techlearnhiringforsde", "root", "*******");
                                 PreparedStatement ps = null;
                                 String sql = "insert into education value (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                                 ps = con.prepareStatement(sql);
                                 ps.setString(1, MasterTickLable.getText());
                                 ps.setString(2, CourseName);
                                 ps.setString(3, CollegeNameM);
                                 ps.setString(4, LocationM);
                                 ps.setString(5, PassingYearM);
                                 ps.setString(6, StartingYeaarM);
                                 ps.setString(7, ResultM);
                                 ps.setString(8, Stream);
                                 ps.setString(9, LocationI);
                                 ps.setString(10, CollegeNameI);
                                 ps.setString(11, PassingYearI);
                                 ps.setString(12, StartingYearI);
                                 ps.setString(13, ResultI);
                                 ps.executeUpdate();
                                 JOptionPane.showMessageDialog(null, "Details saved");
                                 ps.close();
                                 con.close();
                                 Frame3 frame3 = new Frame3();
                                frame3.setVisible(true);
                                dispose();

                                }
                                catch(Exception E)
                                {
                                   JOptionPane.showMessageDialog(new Frame2(), "connection fail", "Try again", JOptionPane.ERROR_MESSAGE);

                                }
                                

                            }
                        }
                    });           
                     
                }    
             });   
             jCheckBoxBachelor.addItemListener(new ItemListener() {    
                public void itemStateChanged(ItemEvent e) {      
                    btnNextEducation.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e)
                        {
                            String CourseName = tfCourseNameMaster.getText();
                            String LocationM = tfLocationMaster.getText();
                            String  CollegeNameM = tfCollegeNameMaster.getText();
                            String StartingYeaarM = tfStartingYearMaster.getText();
                            String PassingYearM =  tfpassingyear.getText();
                            String ResultM = tfResultMaster.getText();
                            String Stream = tfStreamIntermediate.getText();
                            String PassingYearI = tfPassingYearIntermediate.getText();
                            String StartingYearI = tfStartingYearIntermediate.getText();
                            String ResultI = tfResultIntermediate.getText();
                            String LocationI = tfLocationIntermediate.getText();
                            String CollegeNameI = tfCollegeNameIntermediate.getText();
                            if(CourseName.isEmpty()|| LocationM.isEmpty()|| CollegeNameM.isEmpty()
                            || StartingYeaarM.isEmpty()|| PassingYearM.isEmpty()|| ResultM.isEmpty()
                            || Stream.isEmpty()|| PassingYearI.isEmpty()|| StartingYearI.isEmpty()||
                            ResultI.isEmpty()|| LocationI.isEmpty()|| CollegeNameI.isEmpty())
                            {
                                JOptionPane.showMessageDialog(new Frame2(), "* Enter the required fields", "Try again", JOptionPane.ERROR_MESSAGE);
                            }
                            else
                            {
                                try
                                {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Connection con = null;
                                    con =DriverManager.getConnection("jdbc:mysql://localhost:3306/techlearnhiringforsde", "root", "**********");
                                 PreparedStatement ps = null;
                                 String sql = "insert into education value (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                                 ps = con.prepareStatement(sql);
                                 ps.setString(1, BachelorTickLable.getText());
                                 ps.setString(2, CourseName);
                                 ps.setString(3, CollegeNameM);
                                 ps.setString(4, LocationM);
                                 ps.setString(5, PassingYearM);
                                 ps.setString(6, StartingYeaarM);
                                 ps.setString(7, ResultM);
                                 ps.setString(8, Stream);
                                 ps.setString(9, LocationI);
                                 ps.setString(10, CollegeNameI);
                                 ps.setString(11, PassingYearI);
                                 ps.setString(12, StartingYearI);
                                 ps.setString(13, ResultI);
                                 ps.executeUpdate();
                                 JOptionPane.showMessageDialog(null, "Details saved");
                                 ps.close();
                                 con.close();
                                 Frame3 frame3 = new Frame3();
                                frame3.setVisible(true);
                                dispose();

                                }
                                catch(Exception E)
                                {
                                   JOptionPane.showMessageDialog(new Frame2(), "connection fail", "Try again", JOptionPane.ERROR_MESSAGE);

                                }

                            }
                            tfCollegeNameIntermediate.setText("");
                            tfCollegeNameMaster.setText("");
                            tfCourseNameMaster.setText("");
                            tfLocationIntermediate.setText("");
                            tfLocationMaster.setText("");
                            tfPassingYearIntermediate.setText("");
                           tfpassingyear.setText("");
                           tfResultIntermediate.setText("");
                           tfResultMaster.setText("");
                           tfStartingYearIntermediate.setText("");
                           tfStartingYearMaster.setText("");
                           tfStreamIntermediate.setText("");

                        }
                    });           
                     
                }    
             });   
           

    }

  
   // @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Process2Lable = new javax.swing.JLabel();
        EducationPanel = new javax.swing.JPanel();
        tfPassingYearMaster = new javax.swing.JPanel();
        MasterTickLable = new javax.swing.JLabel();
        jCheckBoxMaster = new javax.swing.JCheckBox();
        BachelorTickLable = new javax.swing.JLabel();
        jCheckBoxBachelor = new javax.swing.JCheckBox();
        CourseNameMaster = new javax.swing.JLabel();
        tfCourseNameMaster = new javax.swing.JTextField();
        CollegeNameMaster = new javax.swing.JLabel();
        LocationMaster = new javax.swing.JLabel();
        tfLocationMaster = new javax.swing.JTextField();
        tfCollegeNameMaster = new javax.swing.JTextField();
        StartingYearMasterLable = new javax.swing.JLabel();
        tfStartingYearMaster = new javax.swing.JTextField();
        PassingYearLableMaster = new javax.swing.JLabel();
        tfpassingyear = new javax.swing.JTextField();
        ResultLableMaster = new javax.swing.JLabel();
        tfResultMaster = new javax.swing.JTextField();
        IntermediatePanel = new javax.swing.JPanel();
        StreamIntermediateLable = new javax.swing.JLabel();
        tfStreamIntermediate = new javax.swing.JTextField();
        LocationIntermediateLable = new javax.swing.JLabel();
        tfLocationIntermediate = new javax.swing.JTextField();
        StartingYearIntermediateLable = new javax.swing.JLabel();
        tfStartingYearIntermediate = new javax.swing.JTextField();
        PassingYearIntermediateLable = new javax.swing.JLabel();
        tfPassingYearIntermediate = new javax.swing.JTextField();
        ResultIntermediateLable = new javax.swing.JLabel();
        tfResultIntermediate = new javax.swing.JTextField();
        CollegeNameIntermediateLable = new javax.swing.JLabel();
        tfCollegeNameIntermediate = new javax.swing.JTextField();
        btnNextEducation = new javax.swing.JButton();
        btnPrevIEducation = new javax.swing.JButton();

        jLabel16.setText("jLabel16");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        Process2Lable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        Process2Lable.setForeground(new java.awt.Color(255, 153, 153));
        Process2Lable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Process2Lable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/circle (1).png"))); // NOI18N
        Process2Lable.setText("2/4");
        Process2Lable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        EducationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Education", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        EducationPanel.setOpaque(false);

        tfPassingYearMaster.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Master/Bachelor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        tfPassingYearMaster.setOpaque(false);

        MasterTickLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        MasterTickLable.setForeground(new java.awt.Color(204, 255, 255));
        MasterTickLable.setText("Master");
        // jCheckBoxMaster.setText("Master");
        // jCheckBoxMaster.setActionCommand("");

        BachelorTickLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        BachelorTickLable.setForeground(new java.awt.Color(204, 255, 255));
        BachelorTickLable.setText("Bachelor");

        jCheckBoxBachelor.setText("Bachelor");
        jCheckBoxBachelor.setActionCommand("");

        CourseNameMaster.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        CourseNameMaster.setForeground(new java.awt.Color(204, 255, 255));
        CourseNameMaster.setText("* Course Name ");

        tfCourseNameMaster.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N
        tfCourseNameMaster.setText("eg. CSE/IT etc.");

        CollegeNameMaster.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        CollegeNameMaster.setForeground(new java.awt.Color(204, 255, 255));
        CollegeNameMaster.setText("* College/University Name");

        LocationMaster.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        LocationMaster.setForeground(new java.awt.Color(204, 255, 255));
        LocationMaster.setText("* Location");

        tfLocationMaster.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N
        tfLocationMaster.setText("eg. New York");

        tfCollegeNameMaster.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N
        tfCollegeNameMaster.setForeground(new java.awt.Color(51, 51, 51));
        tfCollegeNameMaster.setText("eg. IIT Delhi");

        StartingYearMasterLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        StartingYearMasterLable.setForeground(new java.awt.Color(204, 255, 255));
        StartingYearMasterLable.setText("* Starting Year");

        tfStartingYearMaster.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N
        tfStartingYearMaster.setText("eg. 2020");

        PassingYearLableMaster.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        PassingYearLableMaster.setForeground(new java.awt.Color(204, 255, 255));
        PassingYearLableMaster.setText("* Passing Year");

        tfpassingyear.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N
        tfpassingyear.setText("eg. 2024/2020");

        ResultLableMaster.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        ResultLableMaster.setForeground(new java.awt.Color(204, 255, 255));
        ResultLableMaster.setText("* Result");

        tfResultMaster.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N
        tfResultMaster.setText("eg. Average10.00 cgpa / 90% upto 5th sem");

        javax.swing.GroupLayout tfPassingYearMasterLayout = new javax.swing.GroupLayout(tfPassingYearMaster);
        tfPassingYearMaster.setLayout(tfPassingYearMasterLayout);
        tfPassingYearMasterLayout.setHorizontalGroup(
            tfPassingYearMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tfPassingYearMasterLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(tfPassingYearMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tfPassingYearMasterLayout.createSequentialGroup()
                        .addComponent(MasterTickLable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BachelorTickLable)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxBachelor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))
                    .addGroup(tfPassingYearMasterLayout.createSequentialGroup()
                        .addGroup(tfPassingYearMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tfPassingYearMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfCollegeNameMaster, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CollegeNameMaster, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(tfPassingYearMasterLayout.createSequentialGroup()
                                    .addGroup(tfPassingYearMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CourseNameMaster, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                        .addComponent(tfCourseNameMaster))
                                    .addGap(55, 55, 55)
                                    .addGroup(tfPassingYearMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(LocationMaster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfLocationMaster, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))))
                            .addGroup(tfPassingYearMasterLayout.createSequentialGroup()
                                .addGroup(tfPassingYearMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StartingYearMasterLable, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfStartingYearMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tfPassingYearMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PassingYearLableMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfpassingyear, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(tfPassingYearMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ResultLableMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfResultMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        tfPassingYearMasterLayout.setVerticalGroup(
            tfPassingYearMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tfPassingYearMasterLayout.createSequentialGroup()
                .addGroup(tfPassingYearMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tfPassingYearMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MasterTickLable)
                        .addComponent(jCheckBoxMaster))
                    .addGroup(tfPassingYearMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BachelorTickLable)
                        .addComponent(jCheckBoxBachelor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tfPassingYearMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseNameMaster)
                    .addComponent(LocationMaster))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tfPassingYearMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCourseNameMaster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLocationMaster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CollegeNameMaster)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCollegeNameMaster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tfPassingYearMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StartingYearMasterLable)
                    .addComponent(PassingYearLableMaster)
                    .addComponent(ResultLableMaster))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tfPassingYearMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfStartingYearMaster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tfPassingYearMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfpassingyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfResultMaster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        IntermediatePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Intermediate", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        IntermediatePanel.setOpaque(false);

        StreamIntermediateLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        StreamIntermediateLable.setForeground(new java.awt.Color(204, 255, 255));
        StreamIntermediateLable.setText("* Stream");

        tfStreamIntermediate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N
        tfStreamIntermediate.setText("eg. PCM/PCB/PCMB");

        LocationIntermediateLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        LocationIntermediateLable.setForeground(new java.awt.Color(204, 255, 255));
        LocationIntermediateLable.setText("* Location");

        tfLocationIntermediate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N
        tfLocationIntermediate.setText("eg. Mysore");

        StartingYearIntermediateLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        StartingYearIntermediateLable.setForeground(new java.awt.Color(204, 255, 255));
        StartingYearIntermediateLable.setText("* Starting Year");

        tfStartingYearIntermediate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N
        tfStartingYearIntermediate.setText("eg. 2018");

        PassingYearIntermediateLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        PassingYearIntermediateLable.setForeground(new java.awt.Color(204, 255, 255));
        PassingYearIntermediateLable.setText("* Passing Year");

        tfPassingYearIntermediate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N
        tfPassingYearIntermediate.setText("eg . 2020");

        ResultIntermediateLable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        ResultIntermediateLable.setForeground(new java.awt.Color(204, 255, 255));
        ResultIntermediateLable.setText("Result");

        tfResultIntermediate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N
        tfResultIntermediate.setText("eg. 10.0 cgpa/ 90%");

        CollegeNameIntermediateLable.setForeground(new java.awt.Color(204, 255, 255));
        CollegeNameIntermediateLable.setText("* College Name");

        tfCollegeNameIntermediate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 10)); // NOI18N
        tfCollegeNameIntermediate.setText("eg. CM SCIENCE COLLEGE  DARBHANGA");

        javax.swing.GroupLayout IntermediatePanelLayout = new javax.swing.GroupLayout(IntermediatePanel);
        IntermediatePanel.setLayout(IntermediatePanelLayout);
        IntermediatePanelLayout.setHorizontalGroup(
            IntermediatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntermediatePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(IntermediatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IntermediatePanelLayout.createSequentialGroup()
                        .addGroup(IntermediatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StreamIntermediateLable, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfStreamIntermediate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(IntermediatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LocationIntermediateLable)
                            .addComponent(tfLocationIntermediate, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(IntermediatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(IntermediatePanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tfStartingYearIntermediate))
                            .addComponent(StartingYearIntermediateLable))
                        .addGap(40, 40, 40)
                        .addGroup(IntermediatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(IntermediatePanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tfPassingYearIntermediate))
                            .addComponent(PassingYearIntermediateLable))
                        .addGap(31, 31, 31)
                        .addGroup(IntermediatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(IntermediatePanelLayout.createSequentialGroup()
                                .addComponent(ResultIntermediateLable, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfResultIntermediate)))
                    .addGroup(IntermediatePanelLayout.createSequentialGroup()
                        .addGroup(IntermediatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CollegeNameIntermediateLable, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCollegeNameIntermediate, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        IntermediatePanelLayout.setVerticalGroup(
            IntermediatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntermediatePanelLayout.createSequentialGroup()
                .addGroup(IntermediatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StreamIntermediateLable)
                    .addComponent(LocationIntermediateLable)
                    .addComponent(StartingYearIntermediateLable)
                    .addComponent(PassingYearIntermediateLable)
                    .addComponent(ResultIntermediateLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IntermediatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IntermediatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfStreamIntermediate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfLocationIntermediate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfStartingYearIntermediate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IntermediatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfPassingYearIntermediate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfResultIntermediate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CollegeNameIntermediateLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfCollegeNameIntermediate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnNextEducation.setBackground(new java.awt.Color(0, 153, 153));
        btnNextEducation.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnNextEducation.setForeground(new java.awt.Color(255, 255, 255));
        btnNextEducation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/right-arrow (2).png"))); // NOI18N
        btnNextEducation.setText("Next");
        btnNextEducation.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNextEducation.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnNextEducation.setIconTextGap(20);

        btnPrevIEducation.setBackground(new java.awt.Color(0, 153, 153));
        btnPrevIEducation.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnPrevIEducation.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevIEducation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/left-arrow.png"))); // NOI18N
        btnPrevIEducation.setText("Prev");
        btnPrevIEducation.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPrevIEducation.setIconTextGap(20);
       

        javax.swing.GroupLayout EducationPanelLayout = new javax.swing.GroupLayout(EducationPanel);
        EducationPanel.setLayout(EducationPanelLayout);
        EducationPanelLayout.setHorizontalGroup(
            EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EducationPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnPrevIEducation, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNextEducation, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(EducationPanelLayout.createSequentialGroup()
                        .addComponent(IntermediatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EducationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfPassingYearMaster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EducationPanelLayout.setVerticalGroup(
            EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EducationPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tfPassingYearMaster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IntermediatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(EducationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNextEducation)
                    .addComponent(btnPrevIEducation))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Process2Lable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EducationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Process2Lable, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EducationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
 

    
    
}

