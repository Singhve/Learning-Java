package Day1;

import java.util.Scanner;

public class MathScan {
	public static void main(String args[]) {
		int a,b,c,d,e,f;
		Scanner ms=new Scanner(System.in);
		
		System.out.println("Please enter a value for a");
		a=ms.nextInt();
		
		System.out.println("Please enter a value for b");
		b=ms.nextInt();
		
		c=a+b;
		System.out.println(c);
		
		d=c-a+b;
		System.out.println(d);
		
		e=d-a+b*c;
		System.out.println(e);
		
		f=a%d/c-b*e;
		System.out.println(f);
				
				
	}
	

}
