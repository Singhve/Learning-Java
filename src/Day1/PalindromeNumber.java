package Day1;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String args[]) {
		System.out.println("Enter a number: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int n= num;
		
		int rev=0,rmd; //rev=reverse and rmd=remainder
		while(num>0)
		
		{
			rmd = num % 10;
			rev =rev * 10 + rmd;
			num = num / 10;
		}
		if(rev == n) 
	         System.out.println(n+" is a Palindrome Number!"); 
	    else
	         System.out.println(n+" is not a Palindrome Number!"); 
	}

}
