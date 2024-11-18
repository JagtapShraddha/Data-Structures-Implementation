import java.util.*;
class cowid extends Thread
 {
  String name;
  int n;
  cowid(String name,int n)
  {
   this.name=name;
   this.n=n;
  }
  public void run()
  {
   try
   {
    for(int i=0;i<n;i++)
    {
      System.out.println(name+"\t"+this.getName());
    }
   }
  catch(Exception e)
  {
   System.out.println(e);
  }
}

public static void main(String[] args)
 {
    cowid c=new cowid("cowid19",10);
    
    cowid c2=new cowid("Lockdown2020",20);
    
    cowid c3=new cowid("Vaccinated2023",30)  ;
    c2.start();
    c.start();
    c3.start();
  }
}
