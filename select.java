import java.sql.*;
public class select
{
 public static void main(String[] args)
   {
    try
      {
       Class.forName("org.postgresql.Driver");
       System.out.println("Driver loaded successfully");

       Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","");
        System.out.println("Connection created sccessfully successfully");

      Statement stmt=con.createStatement();
      ResultSet rs=stmt.executeQuery("select * from student");
      while(rs.next())
      {
       System.out.println(rs.getInt("rollno")+"\t"+rs.getString(2)+"\t"+rs.getDouble("per"));
       con.close();
      }
     }
     catch(Exception e)
      {
       System.out.println("ERROR"+e);
      }
   }
}
   
