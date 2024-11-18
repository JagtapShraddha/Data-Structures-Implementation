import java.util.*;
import java.io.*;
public class friends
 {
  public static void main(String[] args)
   {
    try{
    int n;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   LinkedList ll=new LinkedList();
   System.out.println("Enter number of friends:");
   n=Integer.parseInt(br.readLine());
   System.out.println("Enter names of friends");
   for(int i=0;i<n;i++)
   {
    ll.add(br.readLine());
   }
   System.out.println("Content of LinkedList:"+ll);
  }
catch(Exception e)
  {
   System.out.println("error"+e);
  }
}
}
