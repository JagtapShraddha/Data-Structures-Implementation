import java.sql.*;
import java.util.Scanner;
public class menu
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
         String sql="insert into student values(?,?,?)";
         PreparedStatement ps=con.prepareStatement(sql);
         System.out.println("Enter the roll no");
         int rollno=input.nextInt();
         input.nextLine();
         System.out.println("Enter the class");
         String classname=input.nextLine();
          System.out.println("Enter the percentage");
          double per=input.nextDouble();
          ps.setInt(1,rollno);
          ps.setString(2,classname);
          ps.setDouble(3,per);
         int ans=ps.executeUpdate();
         System.out.println(ans+"record inserted..");
       con.close();
       break;

       case 2:
       sql="update student set per=? where rollno=?";
       ps=con.prepareStatement(sql);
        System.out.println("Enter the roll no of student of which you want to update percentage:");
         rollno=input.nextInt();
       System.out.println("Enter new percentage to update");
        per=input.nextDouble();
        ps.setDouble(1,per);
        ps.setInt(2,rollno);
       ps.executeUpdate();
        System.out.println("record updated..");
        break;

        case 3:
       sql="select * from student";
       ps=con.prepareStatement(sql);
       ResultSet rs=ps.executeQuery();
       while(rs.next())
       {
        System.out.println("\n");
        System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
       }
       break;

      case 4:
       sql="delete from student where rollno=?";
       ps=con.prepareStatement(sql);
       System.out.println("Enter rollno of student to delete record:");
       rollno=input.nextInt();
       ps.setInt(1,rollno);
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
         

