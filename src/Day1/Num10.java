package Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10 {
	public static void main(String args[]){
		int n=41,r;  
		   int rev=0;
	
		   while(n>0) {  
			    r=n%10;  
			    n=n/10;
			    rev=rev*10+r;  
			      
			   }  
			  
			   System.out.println(rev);  
			    
		  
			 /* try {  
			   BufferedReader obc=new BufferedReader (new InputStreamReader(System.in));  
			   int n,r;  
			   int rev=0;  
			   System.out.println("Enter the number: ");  
			   n=Integer.parseInt(obc.readLine());  
			     
			   while(n>0) {  
			    r=n%10;  
			    rev=rev*10+r;  
			    n=n/10;  
			   }  
			  
			   System.out.println("The reverse number is "+rev+".");  
			    
			  } catch(IOException e) {  
			    System.out.println("Wrong number entered.");  
			  }  
*/
}
}
