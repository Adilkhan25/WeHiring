import Frame.*;

// // import java.sql.Connection;
// // import java.sql.DriverManager;
// // import java.sql.PreparedStatement;
// // import java.sql.ResultSet;
// import javax.swing.JOptionPane;
// import java.sql.*;
// import java.lang.Class;
public class App {

    public static void main(String[] args)  {
        // new Frame2().setVisible(true);
        // int a;
        // try {
            
        //     // Class.forName("com.mysql.jdbc.Driver");
        //     Class.forName("com.mysql.jdbc.Driver");

         
        
        //     Connection con = null;
            
        //     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techlearnhiringforsde", "root", "Asznrk#fsara1");
           
        //     PreparedStatement ps  = null;
           
        //     ps = con.prepareStatement("select *from employeelist where list = ? ");
            
        //     ResultSet rs = null;
        //     ps.setInt(1, 1);
            
        //       rs  = ps.executeQuery();
            
          
        //     while(rs.next())
        //     {
        //          a = rs.getInt(1);
        //         System.out.println(a);
        //     }
        //     JOptionPane.showMessageDialog(null, "ho gya");
            
        // } catch (Exception e) {
        //     JOptionPane.showMessageDialog(null, "error hai");
        // }
      
   
      try
      {

      IntroductionFrame  IntroPage = new IntroductionFrame();
        IntroPage.setVisible(true);
      }
      catch(Exception e)
      {
          System.out.println("Exception error found in main");
      }
   



    }
}
