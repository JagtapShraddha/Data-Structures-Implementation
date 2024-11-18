
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

 public class Myframe extends JFrame implements ActionListener
 {
  JLabel l1,l2,l3,l4,l5,l6,l7,l8;
  JRadioButton r1,r2,r3,r4,r5,r6,r7,r8;
  JTextField adhartxt,birthtxt,mobtxt,hosptxt;
  JButton btnadd,btnupdate,btndelete,btnview,btnsearch;
 
  static JPanel p=new JPanel();
   static JPanel p1=new JPanel();
   static JPanel p2=new JPanel();
  static JPanel  p3=new JPanel();
   static JPanel p4=new JPanel();
   static JPanel p5=new JPanel();
   static JPanel p6=new JPanel();
  static JPanel p7=new JPanel();



  public static void main(String[] args)
     {
      Myframe f=new Myframe();
      f.add(p4);
      f.add(p5);
      f.add(p6);
      f.add(p7);
      f.add(p);
      f.add(p1);
      f.add(p2);
      f.add(p3);
     }
   Myframe()
    {
     setSize(500,500);
     setTitle("COWIN Registration");
     setLayout(new GridLayout(11,1));

     
     l1=new JLabel("Adhar Card No:");
     
     p4.add(l1);
     adhartxt=new JTextField(10);
     
     p4.add(adhartxt);
     

     l2=new JLabel("Birth year");
    
     p5.add(l2);
     birthtxt=new JTextField(10);
     
     p5.add(birthtxt);

     l3=new JLabel("Mobile No");
      
     p6.add(l3);
     mobtxt=new JTextField(10);
     
     p6.add(mobtxt);
 
     l6=new JLabel("select hospital");     
     
     p7.add(l6);
     hosptxt=new JTextField(10);
     
     p7.add(hosptxt);

      l4=new JLabel("Age group:");
     
       p.add(l4);
       r1=new JRadioButton("18 and above");
      
       p.add(r1);
      r2=new JRadioButton("45 and above");
      
       p.add(r2);
 
       l7=new JLabel("Vaccine :");
       
       p1.add(l7);
       r3=new JRadioButton("covishield");
       
       p1.add(r3);
       r4=new JRadioButton("covaxin");
     
       p1.add(r4);
       r5=new JRadioButton("Spunik.V");
      
       p1.add(r5);

      l8=new JLabel("Time sloat :");
      
      p2.add(l8);
      r6=new JRadioButton("morning");
      
       p2.add(r6);
      r7=new JRadioButton("afternoon");
       
       p2.add(r7);
       r8=new JRadioButton("evening");
      
       p2.add(r8);
  
       btnadd=new JButton("ADD");
       
       p3.add(btnadd);
       btnadd.addActionListener(this);

       btnupdate=new JButton("UPDATE");
     
       p3.add(btnupdate);
       btnupdate.addActionListener(this);    
  
      btndelete=new JButton("DELETE");
       add(btndelete);
       p3.add(btndelete);
       btndelete.addActionListener(this);  
  
      btnview=new JButton("VIEW");
       add(btnview);
       p3.add(btnview);
       btnview.addActionListener(this);  

       btnsearch=new JButton("SEARCH");
       
       p3.add(btnsearch);
       btnsearch.addActionListener(this);  

      setVisible(true);
     }
  public void actionPerformed(ActionEvent ae)
   {
    
      if (ae.getSource()==btnadd)
      {
      
            
      }
     else if(ae.getSource()==btnupdate)
     {



      }
    else if(ae.getSource()==btndelete)
    {



    }
   else if(ae.getSource()==btnview)
    {


   }
    else if(ae.getSource()==btnsearch)
     {


      }
  }

 }



















      
