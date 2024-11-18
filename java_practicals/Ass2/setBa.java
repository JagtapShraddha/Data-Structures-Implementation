import java.util.*;
class thread implements Runnable
{
            Thread t;
                        int i,no,sum;
                        int a[]=new int[1000];
                        thread(String s,int n)
                        {
                                    Random rs = new Random();
                                                t=new Thread(this,s);
                                                no=n;
                                                int j=0;
                                                for(i=1;i<=1000;i++)
                                                {
                                                            a[j]=rs.nextInt();
                                                                        j++;
                                                }
                                    t.start();
                        }
            public void run() {
                        for(i=0;i<100;i++)
                        {
                                    sum=sum+a[no];
                                                no++;
                        }
                        System.out.println("Sum = "+sum);
                        System.out.println("Avg ="+sum/100);
            }
           
}
public class setBa
{
            public static void main(String[] arg) throws InterruptedException
            {
                        thread t1=new thread("t1",1);
                                    t1.t.join();
                                    thread t2=new thread("t2",100);
                                    t2.t.join();
                                    thread t3=new thread("t3",200);
                                    t3.t.join();
                                    thread t4=new thread("t4",300);
                                    t4.t.join();
                                    thread t5=new thread("t5",400);
                                    t5.t.join();
                        thread t6=new thread("t6",500);
                                    t6.t.join();
                        thread t7=new thread("t7",600);
                                    t7.t.join();
                        thread t8=new thread("t8",700);
                                    t8.t.join();
                        thread t9=new thread("t9",800);
                                    t9.t.join();
                        thread t10=new thread("t10",900);
                                    t10.t.join();

            }
}
