import java.sql.*;
import java.util.Scanner;
public class mobile
 {
  public static void main(String[] args)
  {
   
   Scanner input=new Scanner(System.in);
   try
    {
     Class.forName("org.postgresql.Driver");
     Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","");

     while(true)
       {
        System.out.println("Menu");
        System.out.println("1.Insert");
        System.out.println("2.update");
        System.out.println("3.select");
        System.out.println("4.delete");
        System.out.println("5.Exit");
        System.out.println("Enter your choice");
        int ch=input.nextInt();

         
        switch(ch)
        {
         case 1:
         String sql="insert into mobile values(?,?,?,?,?,?,?,?,?)";
         PreparedStatement ps=con.prepareStatement(sql);
         System.out.println("Enter the mobile no");
         int no=input.nextInt();
         input.nextLine();
         System.out.println("Enter the model name");
         String modelname=input.nextLine();
          System.out.println("Enter the model color");
         String modelcolor=input.nextLine();
          System.out.println("Enter the sim type");
         String simtype=input.nextLine();
          System.out.println("Enter the network type");
         String network=input.nextLine();
          System.out.println("Enter the battery capacity");
         String capacity=input.nextLine();
          System.out.println("Enter the internal storage");
         String storage=input.nextLine();
          System.out.println("Enter the ram");
         String ram=input.nextLine();

          System.out.println("Enter the Processor");
            String processor=input.nextLine();
          ps.setInt(1,no);
          ps.setString(2,modelname);
          ps.setString(3,modelcolor);
             ps.setString(4,simtype);
             ps.setString(5,network);
             ps.setString(6,capacity);
             ps.setString(7,storage);
             ps.setString(8,ram);
             ps.setString(9,processor);
         int ans=ps.executeUpdate();
         System.out.println(ans+"record inserted..");
       con.close();
       break;

       case 2:
       sql="update mobile set ram=? where model_name=?";
       ps=con.prepareStatement(sql);
       
        System.out.println("Enter the model of mobile of which you want to update RAM:");
         input.nextLine();
         modelname=input.nextLine();
       System.out.println("Enter new RAM to update");
        ram=input.nextLine();
        ps.setString(1,ram);
        ps.setString(2,modelname);
       ps.executeUpdate();
        System.out.println("record updated..");
        break;

        case 3:
       sql="select * from mobile";
       ps=con.prepareStatement(sql);
       ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
        System.out.println("\n");
        System.out.println(rs.getDouble(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)+"\t"+rs.getString(9));
       }
       break;

      case 4:
       sql="delete from mobile where model_name=?";
       ps=con.prepareStatement(sql);
       System.out.println("Enter model of student to delete record:");
       modelname=input.nextLine();
       ps.setString(1,modelname);
       ps.executeUpdate();
       System.out.println("record deleted...");
       break;

      case 5:
       System.exit(0);

       default:
        System.out.println("invalid choice");
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
         

