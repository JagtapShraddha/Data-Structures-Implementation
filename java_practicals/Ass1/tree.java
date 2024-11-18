import java.util.*;
class tree
 {
  public static void main(String[] args)
    {
     TreeSet ts=new TreeSet();
    Scanner sc=new Scanner(System.in);
        System.out.println("enter no of color");
        int n=sc.nextInt();
sc.nextLine();
        for(int i=0;i<n;i++)
       {
        
         System.out.println("enter color");
         ts.add(sc.nextLine());
       }
  System.out.println("color"+ts);
 }
}
       
