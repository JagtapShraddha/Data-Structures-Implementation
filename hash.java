import java.util.*;
import java.io.*;
class hash
 {
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    Hashtable ht=new Hashtable();
    Double mobno;
    String name;
    Enumeration names;
   String str;
   double bal;
    System.out.println("Enter no. of students:");
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
    System.out.println("Enter the name of studnt:");
    sc.nextLine();
    name=sc.nextLine();
    System.out.println("Enter the mobile no of student:");
    mobno=sc.nextDouble();
    ht.put(name,mobno);
     }
     System.out.println("The information in the hash table="+ht);
    names=ht.keys();
    System.out.println("Contact List :");
    System.out.println("Name\tnumber");
    while(names.hasMoreElements())
   {
    str=(String)names.nextElement();
    System.out.println(str+"\t"+ht.get(str));
   }
  }
}
    
    
   
