import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
class Mythread extends Thread
 {
  String str;
  String filename;
  Mythread(String str,String filename)
  {
   this.str=str;
   this.filename=filename;
  }
  public void run()
  {
  try
   {
    int flag=0;
   FileReader fr=new FileReader(filename);
   BufferedReader br=new BufferedReader(fr);
   String line="";
   while((line=br.readLine())!=null)
    {
     if(line.contains(str)==true)
       {
         flag=1;
       }
     break;
    }
  if(flag==1)
  {
  System.out.println("String Found");
  }
  else{
  System.out.println("String not Found");
   }
 }
  catch(Exception e)
   {
  System.out.println(e);
   }
 }
}
class setBb
 {
   public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter directory name");
     String dname=sc.next();
     System.out.println("Enter string to be Searched:");
     String search=sc.next();
     File d=new File(dname);
     if(d.isDirectory())
      {
        System.out.println("is Directory");
        String filename[]=d.list();
        for(int i=0;i<filename.length;i++)
        {
         File f=new File(filename[i]);
         if(f.isFile() && filename[i].endsWith(".txt"));

          {
            Mythread m=new Mythread(search,filename[i]);
            m.start();
          }
         }
       }
}
}


