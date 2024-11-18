import java.util.*;
import java.io.*;
class file
 {
  public static void main(String[] args) throws Exception
  {
   try
   {
    Scanner sc=new Scanner(System.in);
    ArrayList al=new ArrayList();
    FileReader fr=new FileReader(args[0]);
    BufferedReader br=new BufferedReader(fr);
   FileOutputStream fout=new FileOutputStream(args[0]);
    String line="";
    while((line=br.readLine())!=null)
    {
      al.add(line);
    }
  System.out.println("add content into file");
  String content=sc.nextLine();
  
  while(true)
  {
   System.out.println("1.insert");  
   System.out.println("2.delete");  
   System.out.println("3.append");  
   System.out.println("4.modify");  
   System.out.println("Enter our choice");
   int ch=sc.nextInt();
   switch(ch)
   {
   case 1:
  al.add(content);
 break;
 case 2:
  al.remove("content");
  break;
  case 3:
   al.add(content);
  break;
 case 4:
   int n=al.size()-1;
   al.set(n,"update Line");
   break;
 case 5:
   System.exit(0);
  break;
}
  Iterator it=al.iterator();
  while(it.hasNext())
  {
   String str=(String)it.next();
   byte b[]=str.getBytes();
   fout.write(b);
  }
  
 }
}
catch(Exception e)
  {
   System.out.println(e);
 }
} 
}
    
