import java.util.*;
import java.io.*;
public class Demo
{
 public static void main(String[] args)
  {
   try{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   ArrayList a=new ArrayList();
   System.out.println("how many city names");
   int n=Integer.parseInt(br.readLine());
    System.out.println("Enter names of the city");
   for(int i=0;i<n;i++)
    {
      a.add(br.readLine());
    }
   
     System.out.println("content of ArrayList city names are:"+a);
    a.clear();
    System.out.println("After removing elements content of ArrayList  are:"+a);
   }
  
  catch(Exception e)
   {
    System.out.println("Error"+e);
   }
    }
  }
   
