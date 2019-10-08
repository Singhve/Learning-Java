package Day5;

import java.util.Scanner;

public class NumberOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, a, s , as;
	    Scanner sc= new Scanner(System.in);
	 
	    System.out.println("Enter the number of integers to sort:");
	    num = sc.nextInt();
	 
	    int array[] = new int[num];//defines array "num"
	 
	    System.out.println("Enter " + num + " integers: ");
	 
	    for (a = 0; a < num; a++) 
	      array[a] = sc.nextInt();//a array
	 
	    for (a = 0; a < num; a++) {
	      for (s = 0; s < num - 1; s++) {
	        if (array[s] > array[s+1]) //flip sign for decending order
	        {
	           as = array[s];
	           array[s] = array[s+1];
	           array[s+1] = as;
	        }
	      }
	    }
	 
	    System.out.println("Sorted list of integers:");
	 
	    for (a = 0; a < num; a++) 
	         System.out.println(array[a]);
	}

}
