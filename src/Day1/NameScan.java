package Day1;

import java.util.Scanner;

public class NameScan {
	public static void main(String args[]) {
		String n1, n2;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("What is you first name?");
		n1=s.nextLine();
		
		System.out.println("What is your last name?");
		n2=s.nextLine();
		
		System.out.println("Hello! Nice to meet you "+ n1 +" "+ n2+"!");
		
	}

}
