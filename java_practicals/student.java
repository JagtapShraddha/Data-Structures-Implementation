import java.util.*;
class student
 {
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   LinkedList ll=new LinkedList();
   System.out.println("Enter how many student names");
   int n=sc.nextInt();
  sc.nextLine();
   System.out.println("Enter students name");
     for(int i=0;i<n;i++)
    {
     ll.add(sc.nextLine());
    }
   Iterator it=ll.iterator();
    System.out.println("students name");
  
   while(it.hasNext())
   {
    String str=(String)it.next();
    System.out.println(str);
   }
System.out.println("Size of linked list="+ll.size());
 
  }
}
