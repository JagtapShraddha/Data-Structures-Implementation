import java.util.*;
class negative
 {
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   LinkedList ll=new LinkedList();
   System.out.println("Enter how many integers");
   int n=sc.nextInt();
  sc.nextLine();
   System.out.println("Enter integers");
     for(int i=0;i<n;i++)
    {
     ll.add(sc.nextInt());
    }

   Iterator it=ll.iterator();
    System.out.println("Integers");
   
   while(it.hasNext())
   {
    
    int no=(int)it.next();
    if(no<0)
    {
    System.out.println(no);
    }
    ll.addFirst("88");
    System.out.println(ll);  
    ll.removeLast();
    System.out.println(ll);

   }
  }
}
