import java.util.*;
import java.io.*;
public class sc
{
 public static void main(String[] args)
  {
   
   Scanner sc=new Scanner(System.in);
   ArrayList a=new ArrayList();
   System.out.println("how many city names");
   int n=sc.nextInt();
    System.out.println("Enter names of the city");
     sc.nextLine();
   for(int i=0;i<n;i++)
    {
      a.add(sc.nextLine());
    }
   
     System.out.println("content of ArrayList city names are:"+a);
    a.clear();
    System.out.println("After removing elements content of ArrayList  are:"+a);
  
    }
}
