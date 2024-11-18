class dmo extends Thread
{

 int n;
 dmo(int n)
  {
   this.n=n;
  }
 public void run()
 {
  try{
  for(int i=1;i<=n;i++)
    {
     System.out.println(Thread.currentThread().getName()+"\t"+i);
Thread.sleep(100);
    }
   
 }

catch(Exception e)
 {
 System.out.println(e);
}
}
public static void main(String[] args)
  {
   dmo d1=new dmo(10);
   d1.start();
   
  }
}
