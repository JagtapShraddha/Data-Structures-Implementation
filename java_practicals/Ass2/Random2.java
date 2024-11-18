import java.util.*;
class Mythread implements Runnable
 {
  Thread t;
  int no,i;
  int a[]=new int[1000];
  Mythread(String s,int n)
  {
    Random rs=new Random();
     t=new Thread(this,s);
     no=n;
    int j=0;
    for( i=0;i<1000;i++)
     {
     a[j]=rs.nextInt();
     j++;
     }
     t.start();
   }
   public void run()
   {
    int sum=0;
    for(i=0;i<100;i++)
      {
         sum=sum+a[no];
        no++;
      }
        System.out.println("suum="+sum);
       System.out.println("avg="+sum/100);
   }
}    
   class Random2
   {
  public static void main(String[] args) throws InterruptedException
    {
    Mythread r=new Mythread("r",100);
     r.t.join();
    Mythread r1=new Mythread("r1",100);
     r1.t.join();
   Mythread r2=new Mythread("r2",100);
     r2.t.join();
   Mythread r3=new Mythread("r3",100);
     r3.t.join();
 Mythread r4=new Mythread("r4",100);
     r4.t.join();
   Mythread r5=new Mythread("r5",100);
     r5.t.join();
   Mythread r6=new Mythread("r6",100);
     r6.t.join();
   Mythread r7=new Mythread("r7",100);
     r7.t.join();
 Mythread r8=new Mythread("r8",100);
     r8.t.join();
   Mythread r9=new Mythread("r9",100);
     r9.t.join();
   }
 }
