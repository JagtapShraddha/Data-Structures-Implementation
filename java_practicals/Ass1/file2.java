import java.util.*;
import java.io.*;
class file2
 {
  public static void main(String[] args) throws Exception
   {
    Scanner sc=new Scanner(System.in);
    ArrayList al=new ArrayList();
   FileReader fr=new FileReader(args[0]);
   BufferedReader br=new BufferedReader(fr);
   String line=" ";
   while((line=br.readLine())!=null)
   {
    al.add(line);
   }
  System.out.println(al);
 }
}
