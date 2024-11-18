import java.sql.*;
public class command
{
 public static void main(String[] args)
  {
   try
    {
     Class.forName("org.postgresql.Driver");
      System.out.println("Driver Loaded Successfully");
      
     Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","");
    System.out.println("connection crated successfully");
  
    PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
    ps.setInt(1,Integer.parseInt(args[0]));
    ps.setString(2,args[1]);
    ps.setDouble(3,Double.parseDouble(args[2]));
    int ans=ps.executeUpdate();

    System.out.println(ans+"record inserted..");
    con.close();
     }
   catch(Exception e)
     {
      System.out.println("ERROR"+e);
     }
   }
}
