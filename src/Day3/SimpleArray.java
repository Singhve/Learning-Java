package Day3;

import java.util.Scanner;

public class SimpleArray {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			
		int a[]=new int[3];
		int i,j;
		System.out.println("Enter amout of arrays:");
		for (i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
			System.out.println(a[i]);
		}
			
		
	}
}


