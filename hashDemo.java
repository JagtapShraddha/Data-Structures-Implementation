import java.util.*;
public class hashDemo
{
 public static void main(String[] args)
  {
  
    
   TreeSet ts=new TreeSet();
   Scanner sc=new Scanner(System.in);
   System.out.println("enter how many integer you want:");
   int n=sc.nextInt();
    System.out.println("Enter" + n +"numbers");
    for(int i=0;i<n;i++)
    {
     ts.add(sc.nextInt());
    }
   System.out.println("integers in sorted order"+ts);
  
  }
}
    
