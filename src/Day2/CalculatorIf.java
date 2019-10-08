package Day2;

import java.util.Scanner;

public class CalculatorIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		String op;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number:");
		num1= sc.nextInt();
		
		System.out.println("Enter second number:");
		num2=sc.nextInt();
		
		System.out.println("Enter operation: +, -, *, / ");
		op=sc.next();
		
		if (op.equals("+")) {
			System.out.println(num1 + num2); 
		}
		
		if (op.equals("-")) {
			System.out.println(num1-num2);
		}
		if (op.equals("*")) {
			System.out.println(num1*num2);
		}
		if (op.equals("/")) {
			System.out.println(num1/num2);
		}

		//Default:
			//System.out.println("Invalid Operation");
		
	}

}
