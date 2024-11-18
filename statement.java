import java.sql.*;
public class statement
{
 public static void main(String [] args)
  {
   try
      {
       Class.forName("org.postgresql.Driver");
       System.out.println("Driver Loaded Successfully");
      
       Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","");
       System.out.println("connection crated successfully");

       Statement stmt=con.createStatement();
       int result=stmt.executeUpdate("insert into student values(1,'tybcs',90)");
       System.out.println("1 row inserted..");
       con.close();
     }
   catch(Exception e)
     {
      System.out.println("ERROR"+e);
     }
   }
}
