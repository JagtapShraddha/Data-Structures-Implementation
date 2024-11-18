import java.sql.*;
public class setAc
 {
  public static void main(String [] args)
   {
     try
      {
       Class.forName("org.postgresql.Driver");
       Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","");
       PreparedStatement ps=con.prepareStatement("select * from student");
       ResultSet rs=ps.executeQuery();
       ResultSetMetaData rsmd=rs.getMetaData();
       System.out.println("Total Columns:"+rsmd.getColumnCount());
       for(int i=1;i<=rsmd.getColumnCount();i++)
        {
         System.out.println("Column Name:"+rsmd.getColumnName(i));
         System.out.println("Column Type:"+rsmd.getColumnTypeName(i));
        }
      con.close();
      }
     catch(Exception e)
     {
      System.out.println(e);
     }
    }
}
