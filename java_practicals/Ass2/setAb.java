class setAb extends Thread
 {
  public static void main(String [] args)
   {
    Thread t=Thread.currentThread();
     t.setName("reverse order thread");
     System.out.println(t);
     try
     {
      for(int i=100;i>=1;i--)
      {
        System.out.println(i);
        Thread.sleep(6);
      }
     }
    catch(Exception e)
     {
      System.out.println(e);
     }
   }
 }

    

