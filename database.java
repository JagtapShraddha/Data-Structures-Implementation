import java.sql.*;
public class database
 {
  public static void main(String[] args)
   {
    try{
    Class.forName("org.postgresql.Driver");
    Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","");
    
    DatabaseMetaData dbmd=con.getMetaData();
 
      System.out.println("Driver Name :"+dbmd.getDriverName());
       System.out.println("Driver version:"+dbmd.getDriverVersion());
        System.out.println("Username:"+dbmd.getUserName());
         System.out.println("Dtabase Product Name :"+dbmd.getDatabaseProductName());
          System.out.println("Database produt version :"+dbmd.getDatabaseProductVersion());
    

   String table[]={"TABLE"};
   ResultSet rs=dbmd.getTables(null,null,null,table);
 while(rs.next())
  {
  System.out.println(rs.getString(3));
       
       con.close();
     }
}
   catch(Exception e)
     {
      System.out.println("ERROR"+e);
     }
   }
}
       
