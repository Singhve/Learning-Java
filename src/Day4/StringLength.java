package Day4;

import java.util.Scanner;

public class StringLength {
	public static void main(String args[])
	{
	Scanner E=new Scanner(System.in);
	System.out.println("Type something you want length for:");
	
	String e=new String();
	e=E.nextLine();
	
	int len=e.length();//does count spaces
	System.out.println(len);
	
	char result = e.charAt(3);//does not count spaces
    System.out.println(result);
	
	}
}