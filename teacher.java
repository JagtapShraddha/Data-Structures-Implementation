import java.util.*;
import java.sql.*;
class teacher
 {
  public static void main(String[] args)
   {
   try
   {
   Class.forName("org.postgresql.Driver");
   Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","");
   
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter how many records u want to insert:");
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
    System.out.println("Enter teacher no:");
    int no=sc.nextInt();
     sc.nextLine();
    System.out.println("Enter teacher name:");
    String name=sc.nextLine();
    System.out.println("Enter teacher subject:");
    String subject=sc.nextLine();
     
     PreparedStatement ps=con.prepareStatement("insert into teacher values(?,?,?)");
    ps.setInt(1,no);
    ps.setString(2,name);
    ps.setString(3,subject);
    int ans=ps.executeUpdate();
    System.out.println(ans+"record inserted"); 
     }
      Statement stmt=con.createStatement();
      ResultSet rs=stmt.executeQuery("select * from teacher");
     while(rs.next())
     {
     System.out.println(rs.getInt("no")+"\t"+rs.getString("name")+"\t"+rs.getString("qua")); 
    }
    con.close();
    }
    catch(Exception e)
    {
     System.out.println(e);
   }
 }
}
   
    
