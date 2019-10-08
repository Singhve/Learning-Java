package Day4;

import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Type a Phrase:");
		
		String e=s.nextLine();
		Scanner s1=new Scanner(System.in);
		
		System.out.println("What letter you want to split at: ");
		String e1=s.nextLine();
		
		for(String se: e.split(e1)){
		System.out.println(se);
		}
	}


}