import java.util.*;
import java.io.*;
class setAd
 {
  public static void main(String [] args)
   {
    String name;
    double mobno;
    Hashtable ht=new Hashtable();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of students");
    int n=sc.nextInt();
   sc.nextLine();
    for(int i=0;i<n;i++)
    {
    sc.nextLine();
    System.out.println("Enter names of student");
    
     name=sc.nextLine();
    System.out.println("Enter Mobile no");
     mobno=sc.nextDouble();
     ht.put(name,mobno);
    }
    
    System.out.println("info in hash table:"+ht);
    System.out.println("Names"+"\t"+"MobNo");
    Enumeration names=ht.keys();
    while(names.hasMoreElements())
    {
    String  str=(String)names.nextElement();
    System.out.println(str+"\t"+ht.get(str));
    } 
  }
}
    
