class thread extends Thread
{
  public void run()
  {
   System.out.println("Thread Name="+Thread.currentThread().getName());
   System.out.println("Thread Priority="+Thread.currentThread().getPriority());
  }
public static void main(String[] args)
 {
  thread t=new thread();
  t.start();
}
}
