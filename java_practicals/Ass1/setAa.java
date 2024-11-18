import java.util.*;
import java.io.*;
public class setAa
 {
  public static void main(String args[])
  {
   LinkedList a=new LinkedList();
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter how many city names you want:");
    int n=sc.nextInt();
    
    sc.nextLine();
   System.out.println("Enter names of the city");
   for(int i=1;i<=n;i++)
  {
   a.add(sc.nextLine());
  }
  System.out.println("Contents of LinkedList are"+a);
  a.clear();
  System.out.println("after removing elements"+a);
  }
}
