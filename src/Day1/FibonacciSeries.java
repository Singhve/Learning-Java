package Day1;

public class FibonacciSeries {
	public static void main(String args[]) {
		int a=0, b=1, c, i, count=15 ;
		System.out.print(a+ " "+b);
		
		for(i=2;i<count;++i)//++i=(i=i+1)
		{	
		c=a+b;
		System.out.print(" "+ c);
		a=b;
		b=c;
				
			
	}
		

}}
