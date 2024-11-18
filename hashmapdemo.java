import java.util.*;
import java.io.*;
class hashmapdemo
 {
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    HashMap hm=new HashMap();
    Double mobno;
    String name;
   
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
    hm.put(name,mobno);
     }
     System.out.println("before sorting:"+hm);
     TreeMap tm=new TreeMap(hm);
      System.out.println("before sorting:"+tm);
  }
}

