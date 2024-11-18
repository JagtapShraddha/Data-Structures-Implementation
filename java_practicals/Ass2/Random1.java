import java.util.*;
class Square extends Thread
 {
  int n;
  Square(int n)
   {
    this.n=n;
   }
  public void run()
  {
   int square=n*n;
   System.out.println("Square="+square);
  }
}
class Cube extends Thread
 {
  int n;
  Cube(int n)
   {
    this.n=n;
   }
  public void run()
  {
   int cube=n*n*n;
   System.out.println("Cube="+cube);
   
  }
}
class Mythread extends Thread
  {
   public void run()
  {
   Random r=new Random(100);
   for(int i=0;i<5;i++)
   {
   int rn=r.nextInt();
   
System.out.println("random integer="+rn);
  if(rn%2==0)
  {
   Square s=new Square(rn);
   s.start();
   }
  else
{
  Cube c=new Cube(rn);
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
class Random1
 {
  public static void main(String[] args)
  {
   Mythread r1=new Mythread();
   r1.start();
 }
}

   
  

