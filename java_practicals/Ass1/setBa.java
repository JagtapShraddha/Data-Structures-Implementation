import java.util.*;
public class setBa
 {
  public static void main(String[] args)
  {
  Scanner sc=new Scanner(System.in);
  LinkedList ll=new LinkedList();
  System.out.println("Enter how many integers you want");
  int n=sc.nextInt();
  sc.nextLine();
  System.out.println("Enter integers");
  for(int i=0;i<n;i++)
   {
    ll.add(sc.nextLine());
   }
  System.out.println("Integers before sorting are:"+ll);
   TreeSet ts=new TreeSet(ll);
   System.out.println("Integers after sorting are:"+ts);
 }
}
