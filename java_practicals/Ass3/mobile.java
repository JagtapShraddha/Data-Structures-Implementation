import java.util.*;
import java.io.*;
import java.sql.*;
 class mobile
{
public static void main(String[] args)
 {
 try{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  Class.forName("org.postgresql.Driver");
  Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","");
  while(true)
  {
   System.out.println("Menu");
   System.out.println("1.Insert");
   System.out.println("2.Update");
   System.out.println("3.Delete");
   System.out.println("4.display");
   System.out.println("5.Exit");
 
  System.out.println("Enter u r choice");
  int ch=Integer.parseInt(br.readLine());
  switch(ch)
   {
    case 1:
    PreparedStatement ps=con.prepareStatement("insert into mobile values(?,?,?,?,?,?,?,?,?)");
    System.out.println("Ener model no");
     int no=Integer.parseInt(br.readLine());
    System.out.println("Ener model name");
    String name=br.readLine();
    System.out.println("Ener model color");
   String color=br.readLine();
    System.out.println("Ener sim type");
   String simtype=br.readLine();
    System.out.println("Enter the network type");
         String network=br.readLine();
          System.out.println("Enter the battery capacity");
         String capacity=br.readLine();
          System.out.println("Enter the internal storage");
         String storage=br.readLine();
          System.out.println("Enter the ram");
         String ram=br.readLine();

          System.out.println("Enter the Processor");
            String processor=br.readLine();
ps.setInt(1,no);
ps.setString(2,name);
ps.setString(3,color);
ps.setString(4,simtype);
ps.setString(5,network);
ps.setString(6,capacity);
ps.setString(7,storage);
ps.setString(8,ram);
ps.setString(9,processor);
 int ans=ps.executeUpdate();
 System.out.println(ans+"record inserted");
break;
  case 2:
   String sql="update mobile set model_name=? where mobile_no=?";
   ps=con.prepareStatement(sql);
   System.out.println("Enter the mobile_no to update");
   int mob_no=Integer.parseInt(br.readLine());
    System.out.println("Enter the model_name to update");
     String model=br.readLine();
    ps.setString(1,model);
    ps.setInt(2,mob_no);
    ps.executeUpdate();
     System.out.println("updated");
     break;
    case 3:
    ps=con.prepareStatement("delete from mobile where mobile_no=?");

   System.out.println("Enter the mobile_no to delete");
   int mobno=Integer.parseInt(br.readLine());
   ps.setInt(1,mobno);
   ps.executeUpdate();
  
   System.out.println("record deleted");
   
 break;
  case 4:
  ps=con.prepareStatement("select* from mobile");
  ResultSet rs=ps.executeQuery();
   while(rs.next())
       {
        System.out.println("\n");
        System.out.println(rs.getDouble(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)+"\t"+rs.getString(9));
       }
       break;
  case 5: 
 
 
  System.exit(0);
  
   default:
   System.out.println("Invalid");
 }
con.close();
}
}
  
 catch(Exception e)
     {
      System.out.println("ERROR"+e);
     }
   }
}






