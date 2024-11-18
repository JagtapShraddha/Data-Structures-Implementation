import java.util.*;
class square extends Thread
 {
  int n;
  square(int n)
  {
   this.n=n;
  }
public void run()
  {
   int square=n*n;
    System.out.println("square of"+n+"is"+square);
  }
}
class cube extends Thread
 {
  int n;
  cube(int n)
   {
    this.n=n;
   }
 public void run()
  {
   int cube=n*n*n;
   System.out.println("Cube of"+n+"is"+cube);
  
  }
 }
class Mythread extends Thread
 {
  public void run()
   {
    Random r=new Random();
    for(int i=0;i<10;i++)
    {
     int rs=r.nextInt(100);
     System.out.println("random int="+rs);
    if(rs%2==0)
    {
    square s=new square(rs);
    s.start();
    }
    else
    {
     cube c=new cube(rs);
     c.start();
    }
   try{
     Thread.sleep(1000);
     }
    catch(Exception e)
   {
   System.out.println(e);
  }
  }
}
}
class setBc
 {
  public static void main(String args[])
   {
   Mythread m=new Mythread(); 
   m.start();
   }
}
    

