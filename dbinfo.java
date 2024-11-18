import java.sql.*;
public class dbinfo
 {
  public static void main(String[] args)
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
       System.out.println("Column name of first column :"+rsmd.getColumnName(i));
       System.out.println("Column type of 1st column:"+rsmd.getColumnTypeName(i));
        
        }
       con.close();
     }
   catch(Exception e)
     {
      System.out.println("ERROR"+e);
     }
   }
}
       
