class shop
{
 private boolean available=false;
 private int material;
 public synchronized int get()
 {
  while(available==false)
  {
   try
    {
     wait();
    }
    catch(Exception e)
    {
     System.out.println(e);
    }
  }
  available=false;
  notifyAll();
  return material;
}
 public synchronized void put(int value)
  {
   while(available==true)
    {
     try
     {
      wait();
     }
    catch(Exception e)
    {
     System.out.println(e);
   }
  }
   material=value;
   available=true;
   notifyAll();
  }
}
class producer extends Thread
{
 shop sh;
 producer(shop c)
 {
  sh=c;
 }
 public void run()
 {
  for(int i=0;i<10;i++)
   {
   sh.put(i);
   System.out.println("produced value is="+i);
    try
    {
     Thread.sleep(1000);
    }
    catch(Exception e)
    {
     System.out.println(e);
    }
   }
  }
}
class consumer extends Thread
 {
  shop sh;
 consumer(shop c)
  {
   sh=c;
  }
 public void run()
  {
   int value=0;
   for(int i=0;i<10;i++)
    {
     value=sh.get();
     System.out.println("consumed value is="+value);
    }
  }
}
class setAc
 {
  public static void main(String args[])
   {
     shop s=new shop();
     producer p=new producer(s);
     consumer s1=new consumer(s);
     p.start();
     s1.start();
   }
}
