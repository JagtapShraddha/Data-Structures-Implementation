import java.util.*;
public class color
 {
 public static void main(String[] args)
  {
  TreeSet ts=new TreeSet();
  System.out.println("Content of tree set"+ts);
  Scanner sc=new Scanner(System.in);
  System.out.println("enter how many colors you want:");
   int n=sc.nextInt();
    System.out.println("Enter" + n +"colors");
    sc.nextLine();
    for(int i=0;i<n;i++)
    {
     ts.add(sc.nextLine());
    }
 
  
  System.out.println("content of tree set"+ts);
 }
}
