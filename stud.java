import java.util.*;
import java.io.*;
class stud
 {
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    Hashtable ht=new Hashtable();
    Double per;
    String name;
    Enumeration names;
   String str;
   double bal;
    System.out.println("Enter no. of students:");
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
    System.out.println("Enter the name of student:");
    sc.nextLine();
    name=sc.nextLine();
    System.out.println("Enter percentage of student:");
    per=sc.nextDouble();
    ht.put(per,name);
     }
     System.out.println("The information in the hash table="+ht);
    names=ht.keys();
    System.out.println("Contact List :");
    System.out.println("Name\tPer");
    while(names.hasMoreElements())
   {
    str=(String)names.nextElement();
    System.out.println(str+"\t"+ht.get(str));
   }
  
  }
}
    
    
   
    
