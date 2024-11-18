import java.sql.*;
import java.util.*;
class emp
{
 public static void main(String[] args)
 {
   try{


   Class.forName("org.postgresql.Driver");
   Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","");
   int id=Integer.parseInt(args[0]);
   PreparedStatement ps=con.prepareStatement("delete from student where rollno=?");
   ps.setInt(1,id);
   int ans=ps.executeUpdate();
  System.out.println(ans+"ecord deleted");
  }
 catch(Exception e)
  {
System.out.println(e);  
}
 }
}
