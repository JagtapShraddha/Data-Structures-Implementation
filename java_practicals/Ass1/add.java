
import java.util.*;
class add
 {
  public static void main(String [] args)
   {
    LinkedList ll=new LinkedList();
    ll.add("1");
    ll.addFirst("10");
    System.out.println(ll);
    ll.removeLast();
    System.out.println(ll);
    System.out.println(ll.size());
    }
}
