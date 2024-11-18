import java.util.*;
public class Lcm{
	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		
		int b=sc.nextInt();
		
		int lcm;
		int amul=a;
		int bmul=b;
		
		while(amul!=bmul){
		
			if(amul<bmul){
				amul+=a;
				
			}
			else{
				bmul+=b;
				
			}
			
		}
		lcm=amul;
		System.out.println("LCM="+lcm);
		
	}
}
