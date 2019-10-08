package Day1;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = sc.nextInt();
		boolean prime = false;
		for (int i=2; i<input; i++)//i will be any number from 2 and input and i++ increases after number is evaluated
			{
			if (input % i==0)//% means what ever is left 17/2 1 is left
				prime= true;
			
			
			
			}
		if (prime== true) 
			System.out.println(input + " is not prime.");
		
		else if (prime == false) 
			System.out.println(input + " is prime.");
	}
}
